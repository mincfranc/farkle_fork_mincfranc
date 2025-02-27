```mermaid
flowchart TD;
    subgraph ProjectSetup
        README["Project's README.md"] --> Docs["Docs Folder"]
        Docs --> GitHubPages["GitHub Pages Setup"]
        GitHubPages --> ProjectOverview["Project Overview"]
    end

    subgraph AndroidStructure
        StandardStructure["Standard Structure"]
        CleanArch["Clean Architecture"]
        PackageStructure["Package Structure"]
        DependencyMgmt["Dependency Management"]
    end

    subgraph DependencyMgmt
        Gradle["Gradle"]
        Retrofit["Retrofit"]
        Gson["Gson"]
        OkHttp["OkHttp"]
        SpringOAuth["Spring OAuth"]
        DB["Database Libs"]
    end

    subgraph Documentation
        ProjectDesc["Project Description"]
        Users["User Stories"]
        UML["UML Diagram"]
        ERD["ER Diagram"]
        DDL["DDL SQL"]
    end

    subgraph ServerSide
        Entity["Entity Classes"]
        Repo["Repositories"]
        OAuthServer["OAuth Server"]
        REST["REST APIs"]
    end

    subgraph ClientSide
        OAuthClient["OAuth Client"]
        Network["Network"]
    end

    subgraph Testing
        UnitTests["Unit Tests"]
        IntegrationTests["Integration Tests"]
        ManualTesting["Manual Testing"]
    end

    subgraph Submission
        CleanRepo["Clean Repository"]
        DocsInRepo["Docs in Repo"]
        Instructions["README Instructions"]
        GitControl["Git Version Control"]
    end

    classDef green fill:#9f6,stroke:#333,stroke-width:2px;
    classDef orange fill:#f96,stroke:#333,stroke-width:2px;
    classDef blue fill:#6cf,stroke:#333,stroke-width:2px;

    class ProjectSetup,AndroidStructure,Documentation,ServerSide,ClientSide,Testing,Submission green;
    class DependencyMgmt orange;
