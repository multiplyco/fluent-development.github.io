
;; Site blocks
;; ##################################
(def manifesto
  [:div#manifesto.block.columns-2
   [:p.paragraph
    [:span.inline-title "Manifesto."]
    "We believe that work is part of life — life should not be lived in breaks between work."]

   [:p.paragraph
    "Today’s technology makes it possible to do knowledge work, and soon almost all kinds of work, from most places on earth (and soon beyond). But most companies still think locally and narrowly about their \"human resources\"" [:sup "1"] ", forcing many to work long hours in environments where focus and flow and unstress is not a priority."]

   [:p.footnote
    "[1] We believe that humans are not resources, and that with the aid of great processes and tools a person can do their best work from wherever they feel they can do their best work."]

   [:p.paragraph
    "We believe that humans are not resources, and that with the aid of great processes and tools a person can do their best work from wherever they feel they can do their best work."]

   [:p.footnote
    "[2] We believe that humans are not resources, and that with the aid of great processes and tools a person can do their best work from wherever they feel they can do their best work."]

   [:p.paragraph
    "Fluent aims to build the platform to facilitate this future workplace. It is a distributed, flexible, virtual workplace, tailor made for co-creation" [:sup "2"] ", which helps connect the best people with the most meaningful projects irregardless of physical location, and takes care of the incidental complexity and overhead of running great projects with great outcomes."]])


(def vision-process
  [:div#vision-process.block.columns-2
   [:p.paragraph
    [:span.inline-title "Vision & Process."]
    "These are a few key parts of the Fluent Process and the Fluent vision."]
   [:ul.paragraph
    [:li "Autonomy, Mastery, and Purpose (AMP" [:sup 3] ") over hierarchies, forced promotions, and working without caring."]
    [:li "Fixed appetite and variable scope over fixed scope and false delivery dates."]
    [:li "Clear, honest, sustainable commitments over \"move fast and break [both people and] things\"."]
    [:li "Minimizing and automating away overhead to focus on the essential complexities of a project over multitasking between workstuff and busystuff ad insaneum."]
    [:li "Meaningful projects over maximizing profits."]
    [:li "Long term thinking over short term panic."]]
   [:p.footnote
    "[3] We believe that humans are not resources, and that with the aid of great processes and tools a person can do their best work from wherever they feel they can do their best work."]])

(def inspiration
  [:div#inspiration.block.columns-2
   [:p.paragraph
    [:span.inline-title "Inspiration."]
    "Here are some things that inspire us:"]
   [:ul.paragraph
    [:li "The Long Now Foundation & the Norrsken Foundation."]
    [:li "Shape Up & It doesn’t have to be crazy at work, by Basecamp."]
    [:li "The Byzantine Empire"]]])


(defn make-component [{:keys [id title description]
                       :img/keys [src]}]
  [:div.component {:id (name id)}
   [:img {:src src}]
   [:h3 title]
   (map #(vector :p %) description)])

(def amp
  [:div#culture.block.component-grid
   (make-component
    {:id :amp
     :img/src "amp.svg"
     :title "Autonomy. Mastery. Purpose."
     :description
     ["Autonomy Mastery and Purpose is the core of what the Fluent Way is all about. The platform acts as your own personal Shit Umbrella®."]})])


(defn component-title [title]
  [:div.component-title
   [:h2.inline-title title]])

(def platform
  [:div
   (component-title "Platform")
   [:div#platform.block.component-grid
    (make-component
     {:id :network
      :img/src "network.svg"
      :title "Network"
      :description
      ["Today companies often hire too much, too sloppily, and too nearby. The Fluent Network is a global & strongly linked graph of the best people, connected through truly meaningful recommendations. This is how we can help to build your own Virtual Team in a fraction of the time and cost. When you invite someone you trust you put your reputation on the line, but you also gain platform benefits including referral fees and a stronger status in the community as a Connector."]})
    (make-component
     {:id :marketplace
      :img/src "marketplace.svg"
      :title "Marketplace"
      :description
      ["As a Market Network, we strive to provide the staging grounds for the full journey from raw idea to finished product – including all the steps in between, including micro-funding if necessary. Think of a Kickstarter for projects."]})
    (make-component
     {:id :process
      :img/src "process.svg"
      :title "Process"
      :description
      ["The Fluent Process is our roadmap from start to finish that makes sure a project outcome has the best chance of success. It starts with the first Raw Idea Workshops with the Client, moves on to Shaping, and then Building where it all comes together."
       "And with our platform support for Contracts & Escrow (guaranteed payment for delivered and accepted work), the boring and time-consuming overhead busywork that plagues most teams (and particularly individual freelancers) is optimised away."]})]])



(def roles
  [:div
   (component-title "Roles")
   [:div#roles.block.component-grid
    (make-component
     {:id :builder
      :img/src "builder.svg"
      :title "Builder"
      :description
      ["People are not “resources”, and the word “consultant” is too broad and faceless. We call the people who actually build stuff the Builders. This is not merely a rewording, but a philosophical statement that puts emphasis on creation (and co-creation) – the stuff of action in the world."
       "In our dictionary, Builders can be any and all of the following professions: coder, designer, architect, product manager, growth hacker, copywriters, and more – anyone where the primary mode of work is creation."
       "If there is one group of VIPs that the Fluent Platform really aims to super-serve, it is the Builders. We can be superstars at discovering and defining what we should build, but without the people putting the chisel to the stone, or the fingers to the keyboard, nothing concrete will impact the world."]})
    (make-component
     {:id :amplifier
      :img/src "amplifier.svg"
      :title "Amplifier"
      :description
      ["People are not “resources”, and the word “consultant” is too broad and faceless. We call the people who actually build stuff the Builders. This is not merely a rewording, but a philosophical statement that puts emphasis on creation (and co-creation) – the stuff of action in the world."]})
    (make-component
     {:id :shaper
      :img/src "shaper.svg"
      :title "Shaper"
      :description
      ["People are not “resources”, and the word “consultant” is too broad and faceless. We call the people who actually build stuff the Builders. This is not merely a rewording, but a philosophical statement that puts emphasis on creation (and co-creation) – the stuff of action in the world."]})
    (make-component
     {:id :connector
      :img/src "connector.svg"
      :title "Connector"
      :description
      ["People are not “resources”, and the word “consultant” is too broad and faceless. We call the people who actually build stuff the Builders. This is not merely a rewording, but a philosophical statement that puts emphasis on creation (and co-creation) – the stuff of action in the world."]})
    (make-component
     {:id :client
      :img/src "client.svg"
      :title "Client"
      :description
      ["People are not “resources”, and the word “consultant” is too broad and faceless. We call the people who actually build stuff the Builders. This is not merely a rewording, but a philosophical statement that puts emphasis on creation (and co-creation) – the stuff of action in the world."]})]])


(def join
  [:div#join.block
   (component-title "Join now")
   [:div#join-inner
    [:input#join-grunka {:placeholder "Sign up to get started 🙏🏻"}]]])


;; Site structure
;; ##################################
[:html
 [:head
  [:title "Fluent"]
  [:meta {:charset "utf-8"}]
  [:meta {:name    "viewport"
          :content "width=device-width, initial-scale=1.0"}]
  [:link {:rel "stylesheet" :type "text/css" :href "main.css"}]]
 [:body
  [:div#content-container
   [:div#menu
    [:img {:src "fl.svg"}]
    [:ul
     [:li.menu-item [:a {:href "#manifesto"} "Manifesto"]]
     [:li.menu-item [:a {:href "#vision-process"} "Vision & Process"]]
     [:li.menu-item [:a {:href "#culture"} "Culture"]]]
    [:button "Join now"]]
   [:div#hero
    [:h1 "Fluent."]
    [:h2 "Welcome to purpose."]
    [:div.image]]
   manifesto
   vision-process
   inspiration
   [:hr]
   amp
   [:hr]
   platform
   [:hr]
   roles
   [:hr]
   join]
  [:footer.block "@ 2019-2020 Fluent Development AB, c/o Norrsken House, Stockholm. Terms of use & cookie policy."]]]
