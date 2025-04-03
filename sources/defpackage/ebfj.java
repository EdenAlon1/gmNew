package defpackage;

import com.google.android.libraries.onegoogle.accountmenu.cards.db.CardsDatabase_Impl;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ebfj extends ote {
    final /* synthetic */ CardsDatabase_Impl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ebfj(CardsDatabase_Impl cardsDatabase_Impl) {
        super(4, "cf66d89d29f160a56452e1ec819be807", "c5e7d25a0e7030289897dda2ecd46001");
        this.d = cardsDatabase_Impl;
    }

    @Override // defpackage.ote
    public final otd a(ouz ouzVar) {
        HashMap hashMap = new HashMap(4);
        hashMap.put("accountIdentifier", new owi("accountIdentifier", "TEXT", true, 1, null, 1));
        hashMap.put("storageState", new owi("storageState", "TEXT", true, 0, null, 1));
        hashMap.put("lastDecorationConsumedTime", new owi("lastDecorationConsumedTime", "INTEGER", true, 0, null, 1));
        hashMap.put("totalTimesConsumed", new owi("totalTimesConsumed", "INTEGER", true, 0, null, 1));
        owl owlVar = new owl("StorageCardDecorationState", hashMap, new HashSet(0), new HashSet(0));
        owl a = owg.a(ouzVar, "StorageCardDecorationState");
        if (!owo.f(owlVar, a)) {
            return new otd(false, a.O(a, owlVar, "StorageCardDecorationState(com.google.android.libraries.onegoogle.accountmenu.cards.db.StorageCardDecorationState).\n Expected:\n"));
        }
        HashMap hashMap2 = new HashMap(4);
        hashMap2.put("accountIdentifier", new owi("accountIdentifier", "TEXT", true, 1, null, 1));
        hashMap2.put("backupSyncState", new owi("backupSyncState", "TEXT", true, 0, null, 1));
        hashMap2.put("lastDecorationConsumedTime", new owi("lastDecorationConsumedTime", "INTEGER", true, 0, null, 1));
        hashMap2.put("totalTimesConsumed", new owi("totalTimesConsumed", "INTEGER", true, 0, null, 1));
        owl owlVar2 = new owl("BackupSyncCardDecorationState", hashMap2, new HashSet(0), new HashSet(0));
        owl a2 = owg.a(ouzVar, "BackupSyncCardDecorationState");
        return !owo.f(owlVar2, a2) ? new otd(false, a.O(a2, owlVar2, "BackupSyncCardDecorationState(com.google.android.libraries.onegoogle.accountmenu.cards.db.BackupSyncCardDecorationState).\n Expected:\n")) : new otd(true, null);
    }

    @Override // defpackage.ote
    public final void b(ouz ouzVar) {
        oxe.a(ouzVar, "CREATE TABLE IF NOT EXISTS `StorageCardDecorationState` (`accountIdentifier` TEXT NOT NULL, `storageState` TEXT NOT NULL, `lastDecorationConsumedTime` INTEGER NOT NULL, `totalTimesConsumed` INTEGER NOT NULL, PRIMARY KEY(`accountIdentifier`))");
        oxe.a(ouzVar, "CREATE TABLE IF NOT EXISTS `BackupSyncCardDecorationState` (`accountIdentifier` TEXT NOT NULL, `backupSyncState` TEXT NOT NULL, `lastDecorationConsumedTime` INTEGER NOT NULL, `totalTimesConsumed` INTEGER NOT NULL, PRIMARY KEY(`accountIdentifier`))");
        oxe.a(ouzVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        oxe.a(ouzVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'cf66d89d29f160a56452e1ec819be807')");
    }

    @Override // defpackage.ote
    public final void c(ouz ouzVar) {
        oxe.a(ouzVar, "DROP TABLE IF EXISTS `StorageCardDecorationState`");
        oxe.a(ouzVar, "DROP TABLE IF EXISTS `BackupSyncCardDecorationState`");
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
