package defpackage;

import android.os.Parcel;
import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fegf extends fegj {
    public final boolean a;
    private Status h;
    private febo i;

    public fegf(fefu fefuVar, fdxd fdxdVar, int i, boolean z) {
        super(fefuVar, fdxdVar, i);
        this.a = z;
    }

    @Override // defpackage.fegj
    protected final void a(Status status) {
        ((feju) this.g).a(status, fejt.PROCESSED, new febo());
    }

    @Override // defpackage.fegj
    protected final void b() {
        this.f.e();
        this.f.m();
        m(fegh.CLOSED);
        ((feju) this.g).a(this.h, fejt.PROCESSED, this.i);
        o();
    }

    @Override // defpackage.fegj
    public final void c(int i, Parcel parcel) {
        febo a = fegn.a(parcel, this.c);
        this.f.d();
        ((feju) this.g).c(a);
    }

    @Override // defpackage.fegj
    public final void d(int i, Parcel parcel) {
        this.h = feho.b(i, parcel);
        this.i = fegn.a(parcel, this.c);
    }

    @Override // defpackage.fegj
    public final boolean e() {
        return this.a;
    }
}
