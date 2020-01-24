package com.example.moviemvvm.data.repository

enum class Status{
    RUNNING,
    SUCCESS,
    FAILED
}
class NetwordSate(val status: Status, val msg:String) {

    companion object{
        val LOADED:NetwordSate
        val LOADING:NetwordSate
        val ERROR: NetwordSate
        
        init {
            LOADED = NetwordSate(Status.SUCCESS,"Success")
            LOADING = NetwordSate(Status.RUNNING,"RUNNING")
            ERROR = NetwordSate(Status.FAILED,"Something went wrong")
        }
    }

}