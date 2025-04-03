package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cckz implements ccjf {
    public static final entd a = entd.c("BugleCms");
    public static final entd b = entd.c("BugleCmsCall");
    public static final cskc c = cskc.g("BugleCmsFolsom", "CmsKeyHandler");
    public final axld d;
    public final crty e;
    public final ffbr f;
    public final crvy g;
    public final errl h;
    public final errl i;
    private final axkm j;
    private final dtuu k;
    private final crwn l;

    public cckz(axld axldVar, axkm axkmVar, ffbr ffbrVar, crty crtyVar, crvy crvyVar, crwn crwnVar, dtuu dtuuVar, errl errlVar, errl errlVar2) {
        this.d = axldVar;
        this.j = axkmVar;
        this.e = crtyVar;
        this.k = dtuuVar;
        this.f = ffbrVar;
        this.g = crvyVar;
        this.l = crwnVar;
        this.h = errlVar;
        this.i = errlVar2;
    }

    @Override // defpackage.ccjf
    public final elfl a(engw engwVar, Optional optional) {
        return elfo.d(new UnsupportedOperationException());
    }

    @Override // defpackage.ccjf
    public final elfl b(String str, String str2, int i, boolean z) {
        emxf.b(!z, "processSingleItem get called from initial backup flow.");
        if (((Boolean) ((cfup) csgj.Z.get()).e()).booleanValue()) {
            if (i == 24) {
                throw new cckv();
            }
            if (i == 2) {
                throw new cckw();
            }
            if (i == 20 || i == 48) {
                return elfo.e(new cckf());
            }
            throw new ccky();
        }
        if (i == 20) {
            throw new ccku();
        }
        if (i == 24) {
            throw new cckv();
        }
        if (i == 48) {
            throw new cckt();
        }
        if (i == 2) {
            throw new cckw();
        }
        throw new ccky();
    }

    @Override // defpackage.ccjf
    public final boolean c(int i) {
        return (i & 16) == 16;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00b4, code lost:
    
        if (r13 == 3) goto L15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ccjf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.elfl d(final java.lang.String r12, final java.lang.String r13, final int r14) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cckz.d(java.lang.String, java.lang.String, int):elfl");
    }
}
