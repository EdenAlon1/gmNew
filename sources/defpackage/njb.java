package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class njb implements nco {
    private ncr a;
    private nji b;
    private boolean c;

    private final boolean h(ncp ncpVar) {
        njd njdVar = new njd();
        if (njdVar.b(ncpVar, true) && (njdVar.a & 2) == 2) {
            int min = Math.min(njdVar.e, 8);
            luv luvVar = new luv(min);
            ncpVar.i(luvVar.a, 0, min);
            i(luvVar);
            if (luvVar.b() >= 5 && luvVar.j() == 127 && luvVar.r() == 1179402563) {
                this.b = new nja();
            } else {
                i(luvVar);
                try {
                    if (nea.d(1, luvVar, true)) {
                        this.b = new njk();
                    }
                } catch (lrg unused) {
                }
                i(luvVar);
                if (njf.d(luvVar, njf.a)) {
                    this.b = new njf();
                }
            }
            return true;
        }
        return false;
    }

    private static void i(luv luvVar) {
        luvVar.K(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0160 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0161  */
    @Override // defpackage.nco
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(defpackage.ncp r19, defpackage.ndk r20) {
        /*
            Method dump skipped, instructions count: 371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.njb.a(ncp, ndk):int");
    }

    @Override // defpackage.nco
    public final void c(ncr ncrVar) {
        this.a = ncrVar;
    }

    @Override // defpackage.nco
    public final void e(long j, long j2) {
        nji njiVar = this.b;
        if (njiVar != null) {
            njc njcVar = njiVar.b;
            njcVar.a.a();
            njcVar.b.G(0);
            njcVar.c = -1;
            njcVar.d = false;
            if (j == 0) {
                njiVar.b(!njiVar.m);
                return;
            }
            if (njiVar.i != 0) {
                njiVar.f = njiVar.f(j2);
                nje njeVar = njiVar.e;
                int i = lvf.a;
                njeVar.c(njiVar.f);
                njiVar.i = 2;
            }
        }
    }

    @Override // defpackage.nco
    public final boolean f(ncp ncpVar) {
        try {
            return h(ncpVar);
        } catch (lrg unused) {
            return false;
        }
    }

    @Override // defpackage.nco
    public final /* synthetic */ List x() {
        int i = engw.d;
        return enou.a;
    }

    @Override // defpackage.nco
    public final void d() {
    }

    @Override // defpackage.nco
    public final /* synthetic */ void g() {
    }
}
