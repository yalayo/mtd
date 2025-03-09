(ns app.html.index)

(defn index-page []
  [:div
   {:class "bg-white"}
   [:div
    {:class "relative isolate px-6 pt-14 lg:px-8"}
    [:div
     {:class
      "absolute inset-x-0 -top-40 -z-10 transform-gpu overflow-hidden blur-3xl sm:-top-80",
      :aria-hidden "true"}
     [:div
      {:class
       "relative left-[calc(50%-11rem)] aspect-1155/678 w-[36.125rem] -translate-x-1/2 rotate-[30deg] bg-linear-to-tr from-[#ff80b5] to-[#9089fc] opacity-30 sm:left-[calc(50%-30rem)] sm:w-[72.1875rem]",
       :style
       "clip-path: polygon(74.1% 44.1%, 100% 61.6%, 97.5% 26.9%, 85.5% 0.1%, 80.7% 2%, 72.5% 32.5%, 60.2% 62.4%, 52.4% 68.1%, 47.5% 58.3%, 45.2% 34.5%, 27.5% 76.7%, 0.1% 64.9%, 17.9% 100%, 27.6% 76.8%, 76.1% 97.7%, 74.1% 44.1%)"}]]
    [:div
     {:class "mx-auto max-w-2xl py-32 sm:py-16 lg:py-24"}
     [:div
      {:class "text-center"}
      [:h1
       {:class
        "text-5xl font-semibold tracking-tight text-balance text-gray-900 sm:text-7xl"}
       "Tell us what would you be interested in"]
      [:p
       {:class
        "mt-8 text-lg font-medium text-pretty text-gray-500 sm:text-xl/8"}
       "In order to get moving fast select what you need and we&#39;ll get in touch."]
      [:div
       {:class "mt-6 flex max-w-md gap-x-4"}
       [:label {:for "email-address", :class "sr-only"} "Email address"]
       [:input
        {:id "email-address",
         :name "email",
         :type "email",
         :autocomplete "email",
         :required "",
         :class
         "min-w-0 flex-auto rounded-md bg-white px-3.5 py-2 text-base text-gray-900 border border-gray-300 placeholder:text-gray-500 focus:border-indigo-500 focus:ring-2 focus:ring-indigo-500 sm:text-sm",
         :placeholder "Enter your email"}]
       [:button
        {:type "submit",
         :class "flex-none rounded-md bg-indigo-500 px-3.5 py-2.5 text-sm font-semibold text-white shadow-xs hover:bg-indigo-400 focus-visible:outline-2 focus-visible:outline-offset-2 focus-visible:outline-indigo-500"}
        "Send"]]]]
    [:div
     {:class
      "absolute inset-x-0 top-[calc(100%-13rem)] -z-10 transform-gpu overflow-hidden blur-3xl sm:top-[calc(100%-30rem)]",
      :aria-hidden "true"}
     [:div
      {:class
       "relative left-[calc(50%+3rem)] aspect-1155/678 w-[36.125rem] -translate-x-1/2 bg-linear-to-tr from-[#ff80b5] to-[#9089fc] opacity-30 sm:left-[calc(50%+36rem)] sm:w-[72.1875rem]",
       :style
       "clip-path: polygon(74.1% 44.1%, 100% 61.6%, 97.5% 26.9%, 85.5% 0.1%, 80.7% 2%, 72.5% 32.5%, 60.2% 62.4%, 52.4% 68.1%, 47.5% 58.3%, 45.2% 34.5%, 27.5% 76.7%, 0.1% 64.9%, 17.9% 100%, 27.6% 76.8%, 76.1% 97.7%, 74.1% 44.1%)"}]]]])