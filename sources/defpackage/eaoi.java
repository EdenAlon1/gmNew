package defpackage;

import com.google.android.libraries.notifications.platform.internal.room.GnpRoomDatabase_Impl;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eaoi extends ote {
    final /* synthetic */ GnpRoomDatabase_Impl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eaoi(GnpRoomDatabase_Impl gnpRoomDatabase_Impl) {
        super(8, "bf62dbc920b36c8a13d8e11e933636e9", "85cc9b331002775d21add9c2665e440c");
        this.d = gnpRoomDatabase_Impl;
    }

    @Override // defpackage.ote
    public final otd a(ouz ouzVar) {
        HashMap hashMap = new HashMap(16);
        hashMap.put("id", new owi("id", "INTEGER", true, 1, null, 1));
        hashMap.put("account_specific_id", new owi("account_specific_id", "TEXT", false, 0, null, 1));
        hashMap.put("account_type", new owi("account_type", "INTEGER", false, 0, null, 1));
        hashMap.put("obfuscated_gaia_id", new owi("obfuscated_gaia_id", "TEXT", false, 0, null, 1));
        hashMap.put("actual_account_name", new owi("actual_account_name", "TEXT", false, 0, null, 1));
        hashMap.put("actual_account_oid", new owi("actual_account_oid", "TEXT", false, 0, null, 1));
        hashMap.put("registration_status", new owi("registration_status", "INTEGER", true, 0, null, 1));
        hashMap.put("registration_id", new owi("registration_id", "TEXT", false, 0, null, 1));
        hashMap.put("sync_sources", new owi("sync_sources", "TEXT", false, 0, null, 1));
        hashMap.put("representative_target_id", new owi("representative_target_id", "TEXT", false, 0, null, 1));
        hashMap.put("sync_version", new owi("sync_version", "INTEGER", true, 0, "0", 1));
        hashMap.put("last_registration_time_ms", new owi("last_registration_time_ms", "INTEGER", true, 0, "0", 1));
        hashMap.put("last_registration_request_hash", new owi("last_registration_request_hash", "INTEGER", true, 0, "0", 1));
        hashMap.put("first_registration_version", new owi("first_registration_version", "INTEGER", true, 0, "0", 1));
        hashMap.put("internal_target_id", new owi("internal_target_id", "TEXT", false, 0, null, 1));
        hashMap.put("fitbit_decoded_id", new owi("fitbit_decoded_id", "INTEGER", true, 0, "0", 1));
        owl owlVar = new owl("gnp_accounts", hashMap, new HashSet(0), new HashSet(0));
        owl a = owg.a(ouzVar, "gnp_accounts");
        return !owo.f(owlVar, a) ? new otd(false, a.O(a, owlVar, "gnp_accounts(com.google.android.libraries.notifications.platform.data.entities.GnpAccount).\n Expected:\n")) : new otd(true, null);
    }

    @Override // defpackage.ote
    public final void b(ouz ouzVar) {
        oxe.a(ouzVar, "CREATE TABLE IF NOT EXISTS `gnp_accounts` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `account_specific_id` TEXT, `account_type` INTEGER, `obfuscated_gaia_id` TEXT, `actual_account_name` TEXT, `actual_account_oid` TEXT, `registration_status` INTEGER NOT NULL, `registration_id` TEXT, `sync_sources` TEXT, `representative_target_id` TEXT, `sync_version` INTEGER NOT NULL DEFAULT 0, `last_registration_time_ms` INTEGER NOT NULL DEFAULT 0, `last_registration_request_hash` INTEGER NOT NULL DEFAULT 0, `first_registration_version` INTEGER NOT NULL DEFAULT 0, `internal_target_id` TEXT, `fitbit_decoded_id` INTEGER NOT NULL DEFAULT 0)");
        oxe.a(ouzVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        oxe.a(ouzVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'bf62dbc920b36c8a13d8e11e933636e9')");
    }

    @Override // defpackage.ote
    public final void c(ouz ouzVar) {
        oxe.a(ouzVar, "DROP TABLE IF EXISTS `gnp_accounts`");
    }

    @Override // defpackage.ote
    public final void d(ouz ouzVar) {
        this.d.u(ouzVar);
    }

    @Override // defpackage.ote
    public final void e(ouz ouzVar) {
        ovo.a(ouzVar);
    }

    @Override // defpackage.ote
    public final void f() {
    }

    @Override // defpackage.ote
    public final void g() {
    }
}
