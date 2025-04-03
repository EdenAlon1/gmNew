package defpackage;

import com.google.android.libraries.notifications.platform.internal.room.GnpPerAccountRoomDatabase_Impl;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eaoa extends ote {
    final /* synthetic */ GnpPerAccountRoomDatabase_Impl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eaoa(GnpPerAccountRoomDatabase_Impl gnpPerAccountRoomDatabase_Impl) {
        super(1, "448fa2df507764c816e7bbb286fadc75", "d44e4be256518704d4e3ee4b6b089c9f");
        this.d = gnpPerAccountRoomDatabase_Impl;
    }

    @Override // defpackage.ote
    public final otd a(ouz ouzVar) {
        HashMap hashMap = new HashMap(17);
        hashMap.put("id", new owi("id", "INTEGER", true, 1, null, 1));
        hashMap.put("thread_id", new owi("thread_id", "TEXT", true, 0, null, 1));
        hashMap.put("read_state", new owi("read_state", "INTEGER", true, 0, null, 1));
        hashMap.put("deletion_status", new owi("deletion_status", "INTEGER", true, 0, null, 1));
        hashMap.put("count_behavior", new owi("count_behavior", "INTEGER", true, 0, null, 1));
        hashMap.put("system_tray_behavior", new owi("system_tray_behavior", "INTEGER", true, 0, null, 1));
        hashMap.put("last_updated_version", new owi("last_updated_version", "INTEGER", true, 0, null, 1));
        hashMap.put("last_notification_version", new owi("last_notification_version", "INTEGER", true, 0, null, 1));
        hashMap.put("creation_id", new owi("creation_id", "INTEGER", true, 0, null, 1));
        hashMap.put("payload_type", new owi("payload_type", "TEXT", false, 0, null, 1));
        hashMap.put("payload", new owi("payload", "BLOB", false, 0, null, 1));
        hashMap.put("insertion_time_ms", new owi("insertion_time_ms", "INTEGER", true, 0, null, 1));
        hashMap.put("storage_mode", new owi("storage_mode", "INTEGER", true, 0, null, 1));
        hashMap.put("opaque_backend_data", new owi("opaque_backend_data", "BLOB", true, 0, null, 1));
        hashMap.put("thread_type", new owi("thread_type", "INTEGER", true, 0, null, 1));
        hashMap.put("type_specific_data", new owi("type_specific_data", "BLOB", true, 0, null, 1));
        hashMap.put("external_experiment_ids", new owi("external_experiment_ids", "TEXT", true, 0, null, 1));
        owl owlVar = new owl("threads", hashMap, new HashSet(0), new HashSet(0));
        owl a = owg.a(ouzVar, "threads");
        return !owo.f(owlVar, a) ? new otd(false, a.O(a, owlVar, "threads(com.google.android.libraries.notifications.platform.internal.room.ChimeThreadEntity).\n Expected:\n")) : new otd(true, null);
    }

    @Override // defpackage.ote
    public final void b(ouz ouzVar) {
        oxe.a(ouzVar, "CREATE TABLE IF NOT EXISTS `threads` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `thread_id` TEXT NOT NULL, `read_state` INTEGER NOT NULL, `deletion_status` INTEGER NOT NULL, `count_behavior` INTEGER NOT NULL, `system_tray_behavior` INTEGER NOT NULL, `last_updated_version` INTEGER NOT NULL, `last_notification_version` INTEGER NOT NULL, `creation_id` INTEGER NOT NULL, `payload_type` TEXT, `payload` BLOB, `insertion_time_ms` INTEGER NOT NULL, `storage_mode` INTEGER NOT NULL, `opaque_backend_data` BLOB NOT NULL, `thread_type` INTEGER NOT NULL, `type_specific_data` BLOB NOT NULL, `external_experiment_ids` TEXT NOT NULL)");
        oxe.a(ouzVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        oxe.a(ouzVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '448fa2df507764c816e7bbb286fadc75')");
    }

    @Override // defpackage.ote
    public final void c(ouz ouzVar) {
        oxe.a(ouzVar, "DROP TABLE IF EXISTS `threads`");
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
