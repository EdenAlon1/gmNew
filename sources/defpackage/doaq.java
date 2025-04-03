package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class doaq {
    public static final hvi a(hvi hviVar, ibw ibwVar, ibw ibwVar2, boolean z) {
        hvi a;
        hviVar.getClass();
        a = hviVar.a(new hvb("com.google.android.libraries.communications.ux.components.placeholder.defaultPlaceholder", ibwVar, ibwVar2, new doaf(ibwVar2, ibwVar, z)));
        return a;
    }

    public static final icr b(ifr ifrVar, idh idhVar, long j, doae doaeVar, float f, icr icrVar, kah kahVar, iar iarVar) {
        icr icrVar2 = null;
        if (idhVar == idb.a) {
            ifrVar.r(j, 0L, (r20 & 4) != 0 ? ifq.c(ifrVar.b(), 0L) : 0L, (r20 & 8) != 0 ? 1.0f : 0.0f, (r20 & 16) != 0 ? ifu.a : null, (r20 & 32) != 0 ? null : null, (r20 & 64) != 0 ? 3 : 0);
            ifq.i(ifrVar, doaeVar.c(f, ifrVar.b()), 0L, 0L, doaeVar.a(f), null, 0, 118);
            return null;
        }
        if (iar.e(ifrVar.b(), iarVar) && ifrVar.q() == kahVar) {
            icrVar2 = icrVar;
        }
        if (icrVar2 == null) {
            icrVar2 = idhVar.a(ifrVar.b(), ifrVar.q(), ifrVar);
        }
        ics.b(ifrVar, icrVar2, j);
        ics.a(ifrVar, icrVar2, doaeVar.c(f, ifrVar.b()), doaeVar.a(f));
        return icrVar2;
    }

    public static final /* synthetic */ doae c(long j, hfd hfdVar) {
        hfdVar.v(-830956014);
        ffbz ffbzVar = doad.a;
        cyz cyzVar = (cyz) doad.b.a();
        cyzVar.getClass();
        doar doarVar = new doar(j, cyzVar);
        hfdVar.o();
        return doarVar;
    }

    public static /* synthetic */ hvi d(hvi hviVar, ibw ibwVar, int i) {
        if (1 == (i & 1)) {
            ibwVar = null;
        }
        return a(hviVar, ibwVar, null, false);
    }
}
