
;; Site blocks
;; ##################################
(def manifesto
  [:div#manifesto.block.columns-2
   [:p.paragraph
    [:span.inline-title "Manifesto."]
    "We believe that work is part of life &mdash; life should not be lived in breaks between work."]

   [:p.paragraph
    "Today’s technology makes it possible to do knowledge work, and soon almost all kinds of work, from " [:a {:href "https://www.starlink.com/"} "practically anywhere"] ". But many companies still think locally and narrowly about their \"human resources\"" [:sup "1"] ", forcing people to work long hours in environments where focus and flow and unstress is not a priority."]

   [:p.footnote
    "[1] Our choice of words to replace the generic and loathed “human resource” and “consultant”, for all the important roles in a project, can be found " [:a {:href "#roles"} "below"] ". The most critical role in our mind is the " [:strong "Builder"] " &mdash; a person whose primary responsibility is to create and build new things."]

   [:p.paragraph
    "We believe that humans are not resources, and that with the aid of great processes and tools a person can do their best work from wherever they feel they can do their best work."]

   [:p.paragraph
    "Fluent aims to build the platform to facilitate this future workplace. It is a distributed, flexible, virtual workplace, tailor made for co-creation" [:sup "2"] ", which helps connect the best people with the most meaningful projects irregardless of physical location, and takes care of the incidental complexity and overhead of running great projects with great outcomes."]

   [:p.footnote
    "[2] Co-creation is when people get together with the primary purpose to make something larger than themselves, to join in a collaboration of creation and stand on the shoulders of giants. Cf with global themes like the " [:a {:href "https://makezine.com"} "Maker movement"] ", and the " [:a {:href "https://burningman.org"} "Burning Man conference"] " in Nevada."]])

(def vision-process
  [:div#culture-process.block.columns-2
   [:p.paragraph
    [:span.inline-title "Culture & Process."]
    "These are a few key parts of the Fluent Culture and our Process."]
   [:ul.paragraph
    [:li [:strong "Autonomy, Mastery, and Purpose (" [:a {:href "#amp"} "AMP"] "" [:sup 3] ")"] " over hierarchies, forced promotions, and working without caring."]
    [:li [:strong "Fixed appetite and variable scope"] " over fixed scope and false delivery dates."]
    [:li [:strong "Clear, honest, sustainable commitments"] " over " [:em "\"move fast and break [both people and] things\""] "."]
    [:li [:strong "Minimizing and automating away overhead to focus on the essential complexities of a project"] " over multitasking between workstuff and busystuff ad insaneum."]
    [:li [:strong "Meaningful projects"] " over maximizing profits."]
    [:li [:strong "Long term thinking"] " over short term panic."]]
   [:p.footnote
    "[3] See the wonderful " [:a {:href "https://www.youtube.com/watch?v=A3oIiH7BLmg"} "illustrated companion"] " to Daniel Pink’s talk about " [:strong "Autonomy Mastery Purpose"] ", made by " [:a {:href "https://www.thersa.org"} "the RSA"] "."]])

(def inspiration
  [:div#inspiration.block.columns-2
   [:p.paragraph
    [:span.inline-title "Inspiration."]
    "Here are some things that inspire us:"]
   [:ul.paragraph
    [:li "The " [:a {:href "http://longnow.org"} "Long Now Foundation"] " & the " [:a {:href "https://www.norrskenhouse.org"} "Norrsken Foundation"] "."]
    [:li [:a {:href "https://basecamp.com/shapeup"} "Shape Up"] " & " [:a {:href "https://basecamp.com/books/calm"} "It doesn’t have to be crazy at work"] " by Basecamp."]
    [:li [:a {:href "https://medium.com/red-planet-labs/why-fully-distributed-is-by-far-the-best-way-to-run-a-software-team-d99abfc0c700"} "Why fully distributed is by far the best way to run a software team"] " by Red Planet Labs."]
    [:li [:a {:href "https://www.youtube.com/playlist?list=PLND1JCRq8Vuh3f0P5qjrSdb5eC1ZfZwWJ"} "Awakening from the meaning crisis"] " by John Vervaeke."]
    [:li [:a {:href "https://www.brainpickings.org/2013/05/09/daniel-pink-drive-rsa-motivation/"} "Drive: The surprising truth about what motivates us"] " by Daniel Pink."]]])

(defn make-component [{:keys [id title description]
                       :img/keys [src]}]
  [:div.component {:id (name id)}
   (into
    [:div.component-inner
     [:img {:src src}]
     [:h3 title]]
    description)])

(def amp
  [:div#amp.block.component-grid
   (make-component
    {:id :amp
     :img/src "images/amp.svg"
     :title "Autonomy. Mastery. Purpose."
     :description
     [[:p "It is the core of what the Fluent Way is all about. Originated by Daniel Pink in his book " [:em "Drive"] ", " [:strong [:a {:href "https://www.youtube.com/watch?v=A3oIiH7BLmg"} "AMP"]] " defines our core set of values at Fluent. It crystalises three critical things that motivate us humans to do our best work: the desire for freedom, the striving for constant learning and improvement, and a sense of meaning in whatever we do."]
      [:p "When all three values are met, at least in some way, this can result in the rarified state of " [:a {:href "https://en.wikipedia.org/wiki/Flow_(psychology)"} "flow"] " – that optimum state of creativity, problem solving, and an overall sense of well-being and meaning in the world."]]})])

(defn component-title [title]
  [:div.component-title
   [:h2.inline-title title]])

(def platform
  [:div#platform
   (component-title "Platform")
   [:div#platform-components.block.component-grid
    (make-component
     {:id :network
      :img/src "images/network.svg"
      :title "Network"
      :description
      [[:p "Today companies often hire too much, too sloppily, and too nearby. The Fluent Network is a global & strongly linked graph of the best people, connected through truly meaningful and honest recommendations. This is how we can help to build your own " [:strong "virtual team"] " in both a fraction of the time and at a lower total cost."]
       [:p "When you invite someone you trust to the network, you put your reputation behind that recommendation. But in exchange for that gift you gain significant network and platform benefits, including referral fees and a stronger status in the community as a Connector."]]})
    (make-component
     {:id :marketplace
      :img/src "images/marketplace.svg"
      :title "Marketplace"
      :description
      [[:p "As a " [:a {:href "https://www.nfx.com/post/10-years-about-market-networks"} "market network"] ", we strive to provide the staging grounds for the full journey from " [:strong "raw idea"] " to finished product – including all the steps in between, even providing micro funding if necessary. Think of a it as a \"Kickstarter for projects\"."]]})
    (make-component
     {:id :process
      :img/src "images/process.svg"
      :title "Process"
      :description
      [[:p "The Fluent Process is our roadmap from start to finish that makes sure a project outcome has the best chance of success. It starts with the first Raw Idea Workshops with the Client, moves on to Shaping, and then Building where it all comes together."]
       [:p "And with our platform support for " [:strong "Contracts & Escrow"] " &mdash; guaranteed payment for delivered and accepted work &mdash; the boring and time-consuming overhead busywork that plagues most teams (and particularly individual freelancers) is optimised away."]]})]])

(def roles
  [:div#roles
   (component-title "Roles")
   [:div#roles-components.block.component-grid
    (make-component
     {:id :builder
      :img/src "images/builder.svg"
      :title "Builder"
      :description
      [[:p "People are not “resources”, and the word “consultant” is too broad and faceless. We call the people who actually build things the " [:strong "Builders"] ". This is not a mere rewording, but a philosophical statement that puts emphasis on creation (and co-creation) – the stuff of action in the world."]
       [:p "In our dictionary, Builders can be any and all of the following professions: coder, designer, architect, product manager, growth hacker, copywriters, and more – anyone where the primary mode of work is creation."]
       [:p "If there is one group of VIPs that the Fluent Platform really aims to super-serve, it is the Builders. We can be superstars at discovering and defining what we should build, but without the people putting the chisel to the stone, or the fingers to the keyboard, nothing concrete will impact the world."]]})
    (make-component
     {:id :amplifier
      :img/src "images/amplifier.svg"
      :title "Amplifier"
      :description
      [[:p "If there is one role that we consider both key and unique to Fluent, it is the " [:strong "Amplifier&trade;"] ". Think of it as a Key Account Manager 2.0, or an entrepreneur-PM-sales unicorn type of personality, who together with the Shaper are the key components in getting a project off the ground."]
       [:p "On the Fluent Platform, the Amplifier is the person who acts as a bridge between the Builders and the Clients – protecting the former from “bad money” and unnecessary interference (to let them focus on their work), and equally important protecting the latter against bad results. With our " [:strong "Fluent Mediation&trade; process"] ", we can help deal with disputes in the best way possible."]]})
    (make-component
     {:id :shaper
      :img/src "images/shaper.svg"
      :title "Shaper"
      :description
      [[:p "The other key role in Fluent is the Shaper. This person works tightly with the Amplifier and the Client during the earliest phase of each project, to define what should be built and how."]
       [:p "During the " [:strong "Shaping phase"] ", we also start to get an idea of the technical and other requirements, and can start to look for the best Builders to help make this hypothesis into reaily."]]})
    (make-component
     {:id :connector
      :img/src "images/connector.svg"
      :title "Connector"
      :description
      [[:p "Think of the Connector as a combination of talent scout, recruiter, mentor, and knower of technical stuff. This role is the key to help evaluating a project’s need for people, and then setting out to discover them."]
       [:p "Availability is one of the trickiest parts of the job – you don’t just need the best people, with the right skills, and highly motivated to join a project; you also need them at the right time. The Fluent Platform helps with this by introducing " [:strong "Availability Schedules"] " for each member of the Network. A project can set a desired date range for when it could start the Build phase, and our search algorithm will help match that plan against people who actually have the time to do the work."]]})
    (make-component
     {:id :client
      :img/src "images/client.svg"
      :title "Client"
      :description
      [[:p "As key participants in the Fluent Platform, clients share our values and believe AMP is the best way to generate both great results and happy teams that can produce great long-term value in a sustainable way."]
       [:p "Clients come to Fluent to access the best Builders, and to get more work done with less friction and higher quality. Their know-how about their own industries and businesses is a great source of learning for everyone in the network."]
       [:p "Great clients bring vision and meaning to their projects, leveraging the world-class talent in the Fluent Network to change the world bit by bit, fulfilling both individual aims and the common goals we all share."]]})]])

(def join
  [:div#join.block
   (component-title "Join now")
   [:div#join-inner
    [:input#join-grunka {:placeholder "Sign up to get started today 🙏🏻"}]]])

;; Site structure
;; ##################################
[:html
 [:head
  [:title "Fluent: The global market network for professional co-creation"]
  [:meta {:charset "utf-8"}]
  [:meta {:name    "viewport"
          :content "width=device-width, initial-scale=1.0"}]
  [:meta {:name "description"
          :content "Fluent is a global market network for professional co-creation, with a platform that helps builders and clients come together to make the best projects possible while minimising boring overhead busywork. Welcome to AMP – autonomy, mastery, and purpose."}]
  [:meta {:name "og:title"
          :content "The global market network for professional co-creation – Fluent"}]
  [:meta {:name "og:url"
          :content "https://fluent.to"}]
  [:meta {:name "og:description"
          :content "Fluent is a global market network for professional co-creation, with a platform that helps builders and clients come together to make the best projects possible while minimising boring overhead busywork. Welcome to AMP – autonomy, mastery, and purpose."}]
  [:meta {:name "og:image"
          :content "https://fluent.to/images/fluent-logo-512px.png"}]
  [:meta {:name "twitter:card"
          :content "summary"}]
  [:meta {:name "twitter:image"
          :content "https://fluent.to/images/fluent-logo-512px.png"}]
  [:meta {:name "twitter:site"
          :content "@FluentNetwork"}]
  [:meta {:name "twitter:title"
          :content "The global market network for professional co-creation – Fluent"}]
  [:meta {:name "twitter:description"
          :content "Fluent is a global market network for professional co-creation, with a platform that helps builders and clients come together to make the best projects possible while minimising boring overhead busywork. Welcome to AMP – autonomy, mastery, and purpose."}]
  [:link {:rel "stylesheet" :type "text/css" :href "main.css"}]
  [:link {:rel "canonical" :href "https://fluent.to/"}]
  [:link {:rel "shortcut icon" :href "/favicon.ico"}]
  [:link {:rel "icon" :type "image/png" :sizes "96x96" :href "/favicon-96x96.ico"}]
  [:link {:rel "apple-touch-icon" :sizes "180x180" :href "/images/apple-icon-180x180.png"}]]
 [:body
  [:div#content-container
   [:div#menu
    [:a {:href "#"} [:img {:src "images/fluent-logo.svg"}]]
    [:ul
     [:li.menu-item [:a {:href "#manifesto"} "Manifesto"]]
     [:li.menu-item [:a {:href "#culture-process"} "Culture & Process"]]
     [:li.menu-item [:a {:href "#platform"} "Platform"]]]
    [:a.button {:href "https://airtable.com/shrIqZyY1ayFGxeXl"} "Join now"]]
   [:div#hero
    [:h1 "Fluent"]
    [:h2 "Welcome to autonomy, mastery, and purpose."]
    [:div.image]]
   manifesto
   vision-process
   inspiration
   [:hr]
   amp
   [:hr]
   platform
   [:hr]
   roles]
   ;;[:hr]]
   ;;join]
  [:footer.block
   "@ 2019-2020 Fluent Development AB, c/o " [:a {:href "https://www.norrskenhouse.org"} "Norrsken House"] " in Stockholm. "
   [:a {:href ""} "Terms of use & cookie policy."]]]]
