package org.socc.molecave

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.transaction.Transactional
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository


@Entity
class Mole(id: Long, name: String) {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private var id: Long = id


    private var name: String = name

    override fun toString(): String {
        return String.format(
                "Mole[id=%d, name='%s']",
                id,
                name
        )
    }
}

interface MoleRepository : JpaRepository<Mole, Long> {

}
