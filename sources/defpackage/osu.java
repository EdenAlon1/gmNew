package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class osu extends oxj {
    final /* synthetic */ osw a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public osu(osw oswVar, int i) {
        super(i);
        this.a = oswVar;
    }

    @Override // defpackage.oxj
    public final void a(oxi oxiVar) {
        ouz ouzVar = new ouz(oxiVar);
        ovi a = ouzVar.a("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z = false;
            if (a.j()) {
                if (a.b(0) == 0) {
                    z = true;
                }
            }
            osw oswVar = this.a;
            ffit.a(a, null);
            oswVar.b.b(ouzVar);
            if (!z) {
                otd a2 = oswVar.b.a(ouzVar);
                if (!a2.a) {
                    throw new IllegalStateException("Pre-packaged database has an invalid schema: ".concat(String.valueOf(a2.b)));
                }
            }
            oswVar.b(ouzVar);
            oswVar.b.f();
            for (osz oszVar : oswVar.c) {
            }
        } finally {
        }
    }

    @Override // defpackage.oxj
    public final void b(oxi oxiVar, int i, int i2) {
        d(oxiVar, i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d2 A[LOOP:0: B:24:0x00cc->B:26:0x00d2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007a  */
    @Override // defpackage.oxj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(defpackage.oxi r10) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.osu.c(oxi):void");
    }

    @Override // defpackage.oxj
    public final void d(oxi oxiVar, int i, int i2) {
        ouz ouzVar = new ouz(oxiVar);
        osw oswVar = this.a;
        List a = ovz.a(oswVar.a.d, i, i2);
        if (a == null) {
            if (ovz.b(oswVar.a, i, i2)) {
                throw new IllegalStateException(a.x(i2, i, "A migration from ", " to ", " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* functions."));
            }
            oswVar.b.c(ouzVar);
            for (osz oszVar : oswVar.c) {
            }
            oswVar.b.b(ouzVar);
            return;
        }
        oswVar.b.e(ouzVar);
        Iterator it = a.iterator();
        while (it.hasNext()) {
            ((ovj) it.next()).b(ouzVar);
        }
        otd a2 = oswVar.b.a(ouzVar);
        if (!a2.a) {
            throw new IllegalStateException("Migration didn't properly handle: ".concat(String.valueOf(a2.b)));
        }
        oswVar.b.g();
        oswVar.b(ouzVar);
    }
}
