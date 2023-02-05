package com.example.recyclerviewpractise.model

// This is the repository class.
class RecyclerRepository {
    companion object {
        private var infoArrayList : ArrayList<InfoModel> = ArrayList<InfoModel>()
        fun getInfo() : ArrayList<InfoModel> {
            infoArrayList.add(InfoModel("fa", 26))
            infoArrayList.add(InfoModel("RFa", 25))
            infoArrayList.add(InfoModel("LFA", 24))
            infoArrayList.add(InfoModel("FAA", 22))
            infoArrayList.add(InfoModel("TFA", 20))
            infoArrayList.add(InfoModel("NOF", 18))
            infoArrayList.add(InfoModel("POP", 24))
            infoArrayList.add(InfoModel("DDA", 28))

            return infoArrayList
        }
    }
}