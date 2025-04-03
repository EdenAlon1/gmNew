package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gpa {
    public static final hik a = new hgq(hla.a, got.a);

    public static final hvi a(hvi hviVar, idh idhVar, long j, der derVar, float f) {
        idh idhVar2;
        hvi hviVar2;
        if (f > 0.0f) {
            idhVar2 = idhVar;
            hviVar2 = icf.b(hvi.e, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f, 0.0f, 0L, idhVar2, false, 0, 124895);
        } else {
            idhVar2 = idhVar;
            hviVar2 = hvi.e;
        }
        return hxo.a(dee.a(hviVar.a(hviVar2).a(derVar != null ? dek.b(hvi.e, derVar, idhVar2) : hvi.e), j, idhVar2), idhVar2);
    }

    public static final void c(hvi hviVar, idh idhVar, long j, long j2, float f, float f2, der derVar, ffjm ffjmVar, hfd hfdVar, int i) {
        if ((i & 1) != 0) {
            hviVar = hvi.e;
        }
        if ((i & 2) != 0) {
            idhVar = idb.a;
        }
        if ((i & 4) != 0) {
            j = gft.a(hfdVar).p;
        }
        if ((i & 8) != 0) {
            j2 = fyc.d(j, hfdVar);
        }
        if ((i & 16) != 0) {
            f = 0.0f;
        }
        if ((i & 32) != 0) {
            f2 = 0.0f;
        }
        if ((i & 64) != 0) {
            derVar = null;
        }
        hik hikVar = a;
        float f3 = f + ((jzq) hfdVar.e(hikVar)).a;
        hfz.b(new hil[]{fzc.a.c(new ibw(j2)), hikVar.c(new jzq(f3))}, hpx.d(-70914509, new gow(hviVar, idhVar, j, f3, derVar, f2, ffjmVar), hfdVar), hfdVar, 56);
    }

    public static final void d(boolean z, ffix ffixVar, hvi hviVar, boolean z2, idh idhVar, long j, float f, der derVar, dwn dwnVar, ffjm ffjmVar, hfd hfdVar, int i) {
        hfm hfmVar;
        hvi hviVar2 = (i & 4) != 0 ? hvi.e : hviVar;
        boolean z3 = (!((i & 8) == 0)) | z2;
        idh idhVar2 = (i & 16) != 0 ? idb.a : idhVar;
        long j2 = (i & 32) != 0 ? gft.a(hfdVar).p : j;
        long d = (i & 64) != 0 ? fyc.d(j2, hfdVar) : 0L;
        float f2 = (i & 256) != 0 ? 0.0f : f;
        der derVar2 = (i & 512) != 0 ? null : derVar;
        dwn dwnVar2 = (i & 1024) == 0 ? dwnVar : null;
        if (dwnVar2 == null) {
            hfdVar.v(-544079183);
            hfmVar = (hfm) hfdVar;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                R = new dwn();
                hfmVar.ad(R);
            }
            dwnVar2 = (dwn) R;
        } else {
            hfdVar.v(-1680119578);
            hfmVar = (hfm) hfdVar;
        }
        hfmVar.Z();
        hik hikVar = a;
        float f3 = ((jzq) hfdVar.e(hikVar)).a + 0.0f;
        hfz.b(new hil[]{fzc.a.c(new ibw(d)), hikVar.c(new jzq(f3))}, hpx.d(-1164547968, new goy(hviVar2, idhVar2, j2, f3, derVar2, z, dwnVar2, z3, ffixVar, f2, ffjmVar), hfdVar), hfdVar, 56);
    }

    public static final void e(ffix ffixVar, hvi hviVar, boolean z, idh idhVar, long j, long j2, float f, der derVar, dwn dwnVar, ffjm ffjmVar, hfd hfdVar, int i) {
        hvi hviVar2 = (i & 2) != 0 ? hvi.e : hviVar;
        boolean z2 = (!((i & 4) == 0)) | z;
        idh idhVar2 = (i & 8) != 0 ? idb.a : idhVar;
        long j3 = (i & 16) != 0 ? gft.a(hfdVar).p : j;
        long d = (i & 32) != 0 ? fyc.d(j3, hfdVar) : j2;
        float f2 = (i & 128) != 0 ? 0.0f : f;
        der derVar2 = (i & 256) != 0 ? null : derVar;
        dwn dwnVar2 = (i & 512) == 0 ? dwnVar : null;
        if (dwnVar2 == null) {
            hfdVar.v(-549915119);
            Object f3 = hfdVar.f();
            if (f3 == hfc.a) {
                f3 = new dwn();
                hfdVar.y(f3);
            }
            dwnVar2 = (dwn) f3;
        } else {
            hfdVar.v(-1680307834);
        }
        hfdVar.o();
        hik hikVar = a;
        float f4 = ((jzq) hfdVar.e(hikVar)).a + 0.0f;
        hfz.b(new hil[]{fzc.a.c(new ibw(d)), hikVar.c(new jzq(f4))}, hpx.d(1279702876, new gox(hviVar2, idhVar2, j3, f4, derVar2, dwnVar2, z2, ffixVar, f2, ffjmVar), hfdVar), hfdVar, 56);
    }
}
