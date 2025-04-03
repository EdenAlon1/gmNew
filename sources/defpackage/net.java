package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class net implements nco {
    private ncr f;
    private boolean h;
    private long i;
    private int j;
    private int k;
    private int l;
    private long m;
    private boolean n;
    private nes o;
    private nex p;
    private final luv a = new luv(4);
    private final luv b = new luv(9);
    private final luv c = new luv(11);
    private final luv d = new luv();
    private final neu e = new neu();
    private int g = 1;

    private final luv h(ncp ncpVar) {
        if (this.l > this.d.c()) {
            luv luvVar = this.d;
            int c = luvVar.c();
            luvVar.I(new byte[Math.max(c + c, this.l)], 0);
        } else {
            this.d.K(0);
        }
        this.d.J(this.l);
        ncpVar.j(this.d.a, 0, this.l);
        return this.d;
    }

    private final void i() {
        if (this.n) {
            return;
        }
        this.f.w(new ndm(-9223372036854775807L));
        this.n = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0009 A[SYNTHETIC] */
    @Override // defpackage.nco
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(defpackage.ncp r17, defpackage.ndk r18) {
        /*
            Method dump skipped, instructions count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.net.a(ncp, ndk):int");
    }

    @Override // defpackage.nco
    public final void c(ncr ncrVar) {
        this.f = ncrVar;
    }

    @Override // defpackage.nco
    public final void e(long j, long j2) {
        if (j == 0) {
            this.g = 1;
            this.h = false;
        } else {
            this.g = 3;
        }
        this.j = 0;
    }

    @Override // defpackage.nco
    public final boolean f(ncp ncpVar) {
        ncpVar.i(this.a.a, 0, 3);
        this.a.K(0);
        if (this.a.l() != 4607062) {
            return false;
        }
        ncpVar.i(this.a.a, 0, 2);
        this.a.K(0);
        if ((this.a.n() & 250) != 0) {
            return false;
        }
        ncpVar.i(this.a.a, 0, 4);
        this.a.K(0);
        int e = this.a.e();
        ncpVar.k();
        ncpVar.g(e);
        ncpVar.i(this.a.a, 0, 4);
        this.a.K(0);
        return this.a.e() == 0;
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
