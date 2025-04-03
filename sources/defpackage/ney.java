package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ney implements nco {
    private final luv a = new luv(4);
    private final ndp b = new ndp(-1, -1, "image/heif");

    private final boolean h(ncp ncpVar, int i) {
        this.a.G(4);
        ncpVar.i(this.a.a, 0, 4);
        return this.a.r() == ((long) i);
    }

    @Override // defpackage.nco
    public final int a(ncp ncpVar, ndk ndkVar) {
        return this.b.a(ncpVar, ndkVar);
    }

    @Override // defpackage.nco
    public final void c(ncr ncrVar) {
        this.b.c(ncrVar);
    }

    @Override // defpackage.nco
    public final void e(long j, long j2) {
        this.b.e(j, j2);
    }

    @Override // defpackage.nco
    public final boolean f(ncp ncpVar) {
        ncpVar.g(4);
        return h(ncpVar, 1718909296) && h(ncpVar, 1751476579);
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
