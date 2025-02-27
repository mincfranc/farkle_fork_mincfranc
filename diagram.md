graph TD;
    subgraph Project Setup and Structure
        README.md[Project's README.md] --> DocsFolder["Docs Folder"]
        DocsFolder --> GitHubPages[GitHub Pages Setup]
        GitHubPages --> ProjectOverview[Project Overview]
    end

    subgraph Android Project Structure
        StandardStructure["Standard Structure"]
        CleanArchitecture["Clean Architecture or MVVM"]
        PackageStructure["Package Structure"]
        DependencyManagement["Dependency Management"]
    end

    subgraph Dependency Management
        Gradle["Gradle Dependencies"]
        RetrofitVolley["Retrofit/Volley"]
        GsonMoshi["Gson/Moshi"]
        OkHttp["OkHttp"]
        SpringBootSecOAuth["Spring Boot Security & OAuth2"]
        DatabaseLibs["Database Libraries"]
    end

    subgraph Documentation (GitHub Pages)
        ProjectDescription["Project Description"]
        IntendedUsers["Intended Users & User Stories"]
        UMLClassDiagram["UML Class Diagram"]
        ERD["ER Diagram"]
        DDL["DDL SQL Code"]
    end

    subgraph Server-Side Implementation (Backend)
        EntityClasses["Entity Classes"]
        RepositoryInterfaces["Repository Interfaces"]
        OAuthResourceServer["OAuth2 Resource Server"]
        RESTControllers["REST Controllers & Services"]
    end

    subgraph Client-Side Implementation (Android App)
        OAuthClient["OAuth2 Client"]
        NetworkCommunication["Network Communication"]
    end

    subgraph Testing and Submission
        Testing["Testing"]
        Submission["Submission"]
    end

    classDef green fill:#9f6,stroke:#333,stroke-width:2px;
    classDef orange fill:#f96,stroke:#333,stroke-width:2px;
    classDef blue fill:#6cf,stroke:#333,stroke-width:2px;

    class Project Setup and Structure,Android Project Structure,Documentation (GitHub Pages),Server-Side Implementation (Backend),Client-Side Implementation (Android App),Testing and Submission green;
    class Dependency Management orange;
