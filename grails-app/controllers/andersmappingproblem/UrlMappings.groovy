package andersmappingproblem

class UrlMappings {

    static mappings = {
//        "/$controller/$action?/$id?(.$format)?"{
//            constraints {
                // apply constraints here
//            }
//        }

        get "/books/$id"(controller:"book", action:"show")
        get "/books/$id/edit"(controller:"book", action:"edit")

        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
