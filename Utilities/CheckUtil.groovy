/**
 * README
 *
 * Name: CheckUtil
 * Description: Common checks
 * Date                         Changed By                         Description
 * 20250623                     d.decosterd@hetic3.fr     		creation
 */
public class CheckUtil extends ExtendM3Utility {
	/**
	 * On vérifie que la division existe.
	 */
	public boolean checkConoExist(DatabaseAPI database, int cono) {
		DBAction query = database.table("CMNCMP").index("00").build()
		DBContainer container = query.getContainer()
		container.set("JICONO", cono)

		return query.read(container)
	}

	/**
	 * On vérifie que la société existe.
	 */
	public boolean checkDiviExist(DatabaseAPI database, int cono, String divi) {
		DBAction query = database.table("CMNDIV").index("00").build()
		DBContainer container = query.getContainer()
		container.set("CCCONO", cono)
		container.set("CCDIVI", divi)

		return query.read(container)
	}

	/**
	 * On vérifie que le dépôt existe.
	 */
	public boolean checkWarehouseExist(DatabaseAPI database, int cono, String whlo) {
		DBAction query = database.table("MITWHL").index("00").build()
		DBContainer container = query.getContainer()
		container.set("MWCONO", cono)
		container.set("MWWHLO", whlo)

		return query.read(container)
	}

	/**
	 * On vérifie que l'établissement existe.
	 */
	public boolean checkFacilityExist(DatabaseAPI database, int cono, String faci) {
		DBAction query = database.table("CFACIL").index("00").build()
		DBContainer container = query.getContainer()
		container.set("CFCONO", cono)
		container.set("CFFACI", faci)

		return query.read(container)
	}

	/**
	 * On vérifie que le SCHN existe.
	 */
	public boolean checkSCHNExist(DatabaseAPI database, Integer cono, Long schn) {
		DBAction query = database.table("MSCHMA").index("00").build()
		DBContainer container = query.getContainer()
		container.set("HSCONO", cono)
		container.set("HSSCHN", schn)
		return query.read(container)
	}

	/**
	 * On vérifie que le PLGR existe.
	 */
	public boolean checkPLGRExist(DatabaseAPI database, Integer cono, String faci, String plgr) {
		DBAction query = database.table("MPDWCT").index("00").build()
		DBContainer container = query.getContainer()
		container.set("PPCONO", cono)
		container.set("PPFACI", faci)
		container.set("PPPLGR", plgr)
		return query.read(container)
	}

	/**
	 * On vérifie que l'article existe.
	 */
	public boolean checkITNOExist(DatabaseAPI database, Integer cono, String itno) {
		DBAction query = database.table("MITMAS").index("00").build()
		DBContainer container = query.getContainer()
		container.set("MMCONO", cono)
		container.set("MMITNO", itno)
		return query.read(container)
	}

	/**
	 * On vérifie que le PUNO existe.
	 */
	public boolean checkPUNOExist(DatabaseAPI database, Integer cono, String puno) {
		DBAction query = database.table("MPHEAD").index("00").build()
		DBContainer container = query.getContainer()
		container.set("IACONO", cono)
		container.set("IAPUNO", puno)
		return query.read(container)
	}
}