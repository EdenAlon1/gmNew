package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bpj implements bct {
    public final bpr a;
    private final bct b;
    private final bpq c;
    private final axu d;

    public bpj(bct bctVar, axu axuVar, bpf bpfVar) {
        this.b = bctVar;
        this.d = axuVar;
        bbb bbbVar = (bbb) bctVar;
        this.c = new bpq(bbbVar.b, bpfVar);
        this.a = new bpr(bbbVar.a);
    }

    @Override // defpackage.bct
    public final boolean H() {
        return false;
    }

    @Override // defpackage.bct
    public final /* synthetic */ boolean I() {
        return bcr.b(this);
    }

    @Override // defpackage.ata
    public final /* synthetic */ atc b() {
        throw null;
    }

    @Override // defpackage.bct, defpackage.ata
    public final /* synthetic */ ati c() {
        return bcr.a(this);
    }

    @Override // defpackage.bct
    public final /* synthetic */ bcf d() {
        return bci.a;
    }

    @Override // defpackage.bct
    public final bcm e() {
        return this.c;
    }

    @Override // defpackage.bct
    public final bcq f() {
        return this.a;
    }

    @Override // defpackage.bct
    public final bfl g() {
        return this.b.g();
    }

    @Override // defpackage.bct
    public final ListenableFuture h() {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // defpackage.bct
    public final void o(Collection collection) {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // defpackage.bct
    public final void s(Collection collection) {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // defpackage.axu
    public final void u(axv axvVar) {
        biw.b();
        this.d.u(axvVar);
    }

    @Override // defpackage.axu
    public final void v(axv axvVar) {
        biw.b();
        this.d.v(axvVar);
    }

    @Override // defpackage.axu
    public final void w(axv axvVar) {
        biw.b();
        this.d.w(axvVar);
    }

    @Override // defpackage.axu
    public final void x(axv axvVar) {
        biw.b();
        this.d.x(axvVar);
    }

    @Override // defpackage.bct
    public final /* synthetic */ void P() {
    }

    @Override // defpackage.bct
    public final /* synthetic */ void A(boolean z) {
    }

    @Override // defpackage.bct
    public final /* synthetic */ void B(bcf bcfVar) {
    }
}
