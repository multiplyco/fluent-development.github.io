(defn make-component [{:keys [img-src title description]}]
  [:div.component
   [:img {:src img-src}]
   [:div.title title]
   [:p description]])


[:html
 [:head]
 [:body
  [:h1 "Fluent."]
  [:h2 "Welcome to purpose."]

  ;; Top block
  [:div.content
   [:div.paragraph
    [:span.title "Manifesto."]
    "We believe that work is part of life — life should not be lived in breaks between work."]
   [:div.paragraph "Today’s technology makes it possible to do knowledge work, and soon almost all kinds of work, from most places on earth (and soon beyond). But most companies still think locally and narrowly about their “human resources”1, forcing many to work long hours in environments where focus and flow and unstress is not a priority."]
   [:div.footnote "[1] We believe that humans are not resources, and that with the aid of great processes and tools a person can do their best work from wherever they feel they can do their best work."]
   [:div.paragraph "We believe that humans are not resources, and that with the aid of great processes and tools a person can do their best work from wherever they feel they can do their best work."]
   [:div.footnote "[2] We believe that humans are not resources, and that with the aid of great processes and tools a person can do their best work from wherever they feel they can do their best work."]
   [:div.paragraph "Fluent aims to build the platform to facilitate this future workplace. It is a distributed, flexible, virtual workplace, tailor made for co-creation2, which helps connect the best people with the most meaningful projects irregardless of physical location, and takes care of the incidental complexity and overhead of running great projects with great outcomes."]
   [:div.footnote "[3] We believe that humans are not resources, and that with the aid of great processes and tools a person can do their best work from wherever they feel they can do their best work."]]

  ;; Middle block
  [:div.content
   [:div.paragraph
    [:span.title "Vision & Process."]
    "These are a few key parts of the Fluent Process and the Fluent vision."]
   [:ul
    [:li "Autonomy, Mastery, and Purpose (AMP3) over hierarchies, forced promotions, and working without caring."]
    [:li "Fixed appetite and variable scope over fixed scope and false delivery dates."]
    [:li "Clear, honest, sustainable commitments over \"move fast and break [both people and] things\"."]
    [:li "Minimizing and automating away overhead to focus on the essential complexities of a project over multitasking between workstuff and busystuff ad insaneum."]
    [:li "Meaningful projects over maximizing profits."]
    [:li "Long term thinking over short term panic."]]]

  ;; Bottom block
  [:div.content
   [:div.paragraph
    [:span.title "Inspiration. "]
    "Here are some things that inspire us:"]
   [:ul
    [:li "The Long Now Foundation & the Norrsken Foundation."]
    [:li "Shape Up & It doesn’t have to be crazy at work, by Basecamp."]
    [:li "The Byzantine Empire"]]]

  [:div.components
   (make-component
    {:img-src ""
     :title "AMP"
     :description "Autonomy Mastery and Purpose is the core of what the Fluent Way is all about. The platform acts as your own personal Shit Umbrella®."})
   (make-component
    {:img-src ""
     :title "Network"
     :description "Bla bla bla bla asjkfsd ksdf kasdjf ksadjf lorem ipsum hej hej yo man."})
   (make-component
    {:img-src ""
     :title "Marketplace"
     :description "Bla bla bla bla asjkfsd ksdf kasdjf ksadjf lorem ipsum hej hej yo man."})
   (make-component
    {:img-src ""
     :title "Process"
     :description "Bla bla bla bla asjkfsd ksdf kasdjf ksadjf lorem ipsum hej hej yo man."})]]]
