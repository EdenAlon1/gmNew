package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eaod extends ovj {
    public eaod() {
        super(3, 4);
    }

    @Override // defpackage.ovj
    public final void b(ouz ouzVar) {
        oxe.a(ouzVar, "ALTER TABLE `gnp_accounts` ADD COLUMN `sync_version` INTEGER NOT NULL DEFAULT 0");
        oxe.a(ouzVar, "ALTER TABLE `gnp_accounts` ADD COLUMN `last_registration_time_ms` INTEGER NOT NULL DEFAULT 0");
        oxe.a(ouzVar, "ALTER TABLE `gnp_accounts` ADD COLUMN `last_registration_request_hash` INTEGER NOT NULL DEFAULT 0");
        oxe.a(ouzVar, "ALTER TABLE `gnp_accounts` ADD COLUMN `first_registration_version` INTEGER NOT NULL DEFAULT 0");
    }
}
