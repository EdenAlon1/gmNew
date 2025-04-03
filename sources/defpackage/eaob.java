package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eaob extends ovj {
    public eaob() {
        super(1, 2);
    }

    @Override // defpackage.ovj
    public final void b(ouz ouzVar) {
        oxe.a(ouzVar, "CREATE TABLE IF NOT EXISTS `_new_gnp_accounts` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `account_specific_id` TEXT, `account_type` INTEGER, `obfuscated_gaia_id` TEXT, `registration_status` INTEGER NOT NULL, `registration_id` TEXT, `sync_sources` TEXT)");
        oxe.a(ouzVar, "INSERT INTO `_new_gnp_accounts` (`id`,`account_specific_id`,`obfuscated_gaia_id`,`registration_status`,`registration_id`,`sync_sources`) SELECT `id`,`account_name`,`obfuscated_gaia_id`,`registration_status`,`registration_id`,`sync_sources` FROM `gnp_accounts`");
        oxe.a(ouzVar, "DROP TABLE `gnp_accounts`");
        oxe.a(ouzVar, "ALTER TABLE `_new_gnp_accounts` RENAME TO `gnp_accounts`");
        ouzVar.a.g("UPDATE gnp_accounts SET account_type = 1");
    }
}
