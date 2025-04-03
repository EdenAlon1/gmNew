package defpackage;

import android.database.sqlite.SQLiteDatabase;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crmr {
    private static final cskc a = cskc.g("Bugle", "MemoryReclaimerImpl");
    private final ffbr b;
    private final ffbr c;

    public crmr(ffbr ffbrVar, ffbr ffbrVar2) {
        this.b = ffbrVar;
        this.c = ffbrVar2;
    }

    public final void a(int i, int i2) {
        a.q("Reclaiming memory");
        Iterator it = ((Set) this.b.b()).iterator();
        while (it.hasNext()) {
            ((cskg) it.next()).l(i);
        }
        int releaseMemory = SQLiteDatabase.releaseMemory();
        a.q("MemoryReclaimerImpl.reclaimMemory:SQLiteDatabase.releaseMemory freed " + releaseMemory + " bytes");
        if (i2 == 1) {
            System.gc();
        } else if (i2 == 2) {
            ((akzt) this.c.b()).e("Bugle.App.OnTrimMemory.Count", i);
        }
    }
}
