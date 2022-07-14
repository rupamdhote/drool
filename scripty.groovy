job('example-2') {
    scm {
        git {
            remote {
                name('origin')
                url('https://github.com/rupamdhote/drool.git')
            }            
        }
    }
}