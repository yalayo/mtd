# provider config
terraform {
  cloud {
    organization = "rondon-sarnik"

    workspaces {
      name = "mtd-app"
    }
  }

  required_providers {
    cloudflare = {
      source  = "cloudflare/cloudflare"
      version = "~> 5.1.0"
    }
  }
}

variable "cloudflare_api_token" {
  default = ""
}

provider "cloudflare" {
  api_token = var.cloudflare_api_token
}

resource "cloudflare_workers_script" "score_backend" {
  account_id  = "4180cebb0f75e57d434f27a622da70f0"
  script_name = "mtd-app"
  compatibility_date = "2024-01-01"
  content     = file("main.js")
  content_type = "javascript+module"
  bindings = [{
    name = "DB"
    type = "d1"
    id = cloudflare_d1_database.db.id
  }]
  depends_on = [
    cloudflare_d1_database.db
  ]
}