package hvkproducao.com.br.contact

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

//  o adapter gerencia toda a lista
class ContactAdapter : RecyclerView.Adapter<ContactAdapter.ContactAdapterViewHolder>(){

    private val list: MutableList<Contact> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactAdapterViewHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.contact_item,parent,false)
        return ContactAdapterViewHolder(view)
    }
   // esta classe gerencia a cada passagem de item na lista
    override fun onBindViewHolder(holder: ContactAdapterViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }

    // passa uma lista de uma classe externa para dentro do adapter
    fun updateList(list: List<Contact>){
        this.list.clear()
        this.list.addAll(list)
        notifyDataSetChanged() // notifica o adapter informando que foi modificado na renderização
    }


    // esta classe gerencia cada item na lista
    class ContactAdapterViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        private val tvName: TextView = itemView.findViewById(R.id.tv_name)
        private val tvPhone: TextView = itemView.findViewById(R.id.tv_phone)
        private val ivPhotograph: ImageView= itemView.findViewById(R.id.iv_photograph)

        // esse metodo é que vai popular os dados
        fun bind(contact: Contact){
            tvName.text = contact.name
            tvPhone.text = contact.phone
        }

    }
}
