package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import defpackage.eiue;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eiuf implements ljv, eivb {
    final /* synthetic */ eiue a;
    private boolean b = false;

    public eiuf(eiue eiueVar) {
        this.a = eiueVar;
    }

    @Override // defpackage.ljv
    public final void d(lkr lkrVar) {
        this.a.p();
    }

    @Override // defpackage.ljv
    public final void ff(lkr lkrVar) {
        this.a.j.c(this);
        eiuh eiuhVar = this.a.p.d;
        eiuhVar.b = emxc.j(Boolean.valueOf(eiuhVar.c));
        eiuhVar.a = null;
        eiuhVar.d = 3;
    }

    @Override // defpackage.eivb
    public final ListenableFuture g() {
        eiue eiueVar = this.a;
        eiue.a aVar = eiueVar.p;
        aVar.c = true;
        return (aVar.b || eiueVar.d.g() || this.a.d.f()) ? erqt.i(null) : this.a.j();
    }

    @Override // defpackage.ljv
    public final void gZ(lkr lkrVar) {
        engw engwVar;
        eiue eiueVar = this.a;
        eiueVar.p = (eiue.a) new lmw(eiueVar.r).a(eiue.a.class);
        eiue eiueVar2 = this.a;
        eiueVar2.p.d.c = eiueVar2.k;
        if (eiueVar2.o == null) {
            eiueVar2.o = eiwz.d().a();
        }
        if (eiuy.a(this.a.d.a()) && ((engwVar = ((eiww) this.a.o).c) == null || !engwVar.isEmpty())) {
            eiue eiueVar3 = this.a;
            engw a = eiueVar3.i.a(((eiww) eiueVar3.o).c);
            IllegalStateException illegalStateException = new IllegalStateException("Requirement activity's AccountController should be set up with an empty list of account requirements. Did you forget to set the AccountController with Config.forRequirementActivity?".concat(a.isEmpty() ? "" : " Requirements: ".concat(String.valueOf(String.valueOf(a)))));
            if (!this.a.l) {
                throw illegalStateException;
            }
            ((enrr) ((enrr) ((enrr) eiue.b.i()).g(illegalStateException)).h("com/google/apps/tiktok/account/api/controller/AccountControllerViewModelBacked$AccountControllerLifecycleObserver", "onCreate", (char) 1096, "AccountControllerViewModelBacked.java")).q("The requirement activity bit is set while the requirements are not overridden with an empty list. If the activity is not a requirement Activity, then it's likely the app is started by another malicious app which sets the requirement activity bit in the Intent");
        }
        if (this.a.p.d.a()) {
            eiue eiueVar4 = this.a;
            eiueVar4.p.a = eiue.c;
            eiueVar4.q = eiueVar4.h();
        }
        eiue eiueVar5 = this.a;
        eiueVar5.g.k(eiueVar5.n);
        this.a.j.b(this);
    }

    @Override // defpackage.ljv
    public final void ha(lkr lkrVar) {
        if (this.b) {
            this.a.p();
            return;
        }
        this.b = true;
        if (this.a.p.d.a()) {
            emxf.b(true ^ this.a.f.i(), "Should not have account before initial start.");
            eiue eiueVar = this.a;
            eiueVar.q.getClass();
            eiub eiubVar = eiueVar.p.a;
            eiubVar.getClass();
            if (eiubVar.equals(eiue.c)) {
                eiue eiueVar2 = this.a;
                eiueVar2.o(((eiww) eiueVar2.o).b, eiueVar2.q, 0);
            }
            this.a.q = null;
        } else {
            eiwl eiwlVar = this.a.f;
            eisx.b(eiwlVar.g());
            eiwlVar.o(this.a.f.h());
            this.a.p();
        }
        if (!this.a.p.d.b.g() || ((Boolean) this.a.p.d.b.c()).booleanValue()) {
            return;
        }
        eiue eiueVar3 = this.a;
        if (eiueVar3.k) {
            eiueVar3.f.j();
        }
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void c(lkr lkrVar) {
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void f(lkr lkrVar) {
    }
}
