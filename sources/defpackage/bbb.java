package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bbb implements bct {
    public final bba a;
    public final bay b;
    private final bct c;

    public bbb(bct bctVar, bba bbaVar) {
        this.c = bctVar;
        this.a = bbaVar;
        this.b = new bay(bctVar.e(), bbaVar.b.b());
    }

    @Override // defpackage.bct
    public final void A(boolean z) {
        this.c.A(z);
    }

    @Override // defpackage.bct
    public final void B(bcf bcfVar) {
        this.c.B(bcfVar);
    }

    @Override // defpackage.bct
    public final boolean H() {
        return this.c.H();
    }

    @Override // defpackage.bct
    public final boolean I() {
        return this.c.I();
    }

    @Override // defpackage.bct
    public final void P() {
        this.c.P();
    }

    @Override // defpackage.ata
    public final atc b() {
        throw null;
    }

    @Override // defpackage.bct, defpackage.ata
    public final ati c() {
        return this.a;
    }

    @Override // defpackage.bct
    public final bcf d() {
        return this.c.d();
    }

    @Override // defpackage.bct
    public final bcm e() {
        return this.b;
    }

    @Override // defpackage.bct
    public final bcq f() {
        return this.a;
    }

    @Override // defpackage.bct
    public final bfl g() {
        return this.c.g();
    }

    @Override // defpackage.bct
    public final ListenableFuture h() {
        return this.c.h();
    }

    @Override // defpackage.bct
    public final void o(Collection collection) {
        this.c.o(collection);
    }

    @Override // defpackage.bct
    public final void s(Collection collection) {
        this.c.s(collection);
    }

    @Override // defpackage.axu
    public final void u(axv axvVar) {
        this.c.u(axvVar);
    }

    @Override // defpackage.axu
    public final void v(axv axvVar) {
        this.c.v(axvVar);
    }

    @Override // defpackage.axu
    public final void w(axv axvVar) {
        this.c.w(axvVar);
    }

    @Override // defpackage.axu
    public final void x(axv axvVar) {
        this.c.x(axvVar);
    }
}
