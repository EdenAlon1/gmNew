package defpackage;

import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protobuf.contrib.android.ProtoParsers;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eitv implements ljv, eivb {
    final /* synthetic */ eits a;
    private boolean b;
    private boolean c = false;
    private Bundle d;

    public eitv(eits eitsVar) {
        this.a = eitsVar;
    }

    @Override // defpackage.ljv
    public final void d(lkr lkrVar) {
        this.a.p();
    }

    @Override // defpackage.ljv
    public final void ff(lkr lkrVar) {
        this.a.j.c(this);
    }

    @Override // defpackage.eivb
    public final ListenableFuture g() {
        eits eitsVar = this.a;
        eitsVar.r = true;
        return (eitsVar.q || eitsVar.d.h() || this.a.d.g()) ? erqt.i(null) : this.a.j();
    }

    @Override // defpackage.ljv
    public final void gZ(lkr lkrVar) {
        engw engwVar;
        eits eitsVar = this.a;
        if (eitsVar.o == null) {
            eitsVar.o = eiwz.d().a();
        }
        if (eiuy.a(this.a.d.a()) && ((engwVar = ((eiww) this.a.o).c) == null || !engwVar.isEmpty())) {
            eits eitsVar2 = this.a;
            engw a = eitsVar2.i.a(((eiww) eitsVar2.o).c);
            IllegalStateException illegalStateException = new IllegalStateException("Requirement activity's AccountController should be set up with an empty list of account requirements. Did you forget to set the AccountController with Config.forRequirementActivity?".concat(a.isEmpty() ? "" : " Requirements: ".concat(String.valueOf(String.valueOf(a)))));
            if (!this.a.l) {
                throw illegalStateException;
            }
            ((enrr) ((enrr) ((enrr) eits.b.i()).g(illegalStateException)).h("com/google/apps/tiktok/account/api/controller/AccountControllerImpl$AccountControllerLifecycleObserver", "onCreate", (char) 1108, "AccountControllerImpl.java")).q("The requirement activity bit is set while the requirements are not overridden with an empty list. If the activity is not a requirement Activity, then it's likely the app is started by another malicious app which sets the requirement activity bit in the Intent");
        }
        Bundle a2 = this.a.t.U().d() ? this.a.t.U().a("tiktok_account_controller_saved_instance_state") : null;
        this.d = a2;
        boolean z = true;
        if (a2 != null && (this.a.k || !a2.getBoolean("tiktok_accounts_disabled"))) {
            z = false;
        }
        this.b = z;
        if (z) {
            eits eitsVar3 = this.a;
            eitsVar3.p = eits.c;
            eitsVar3.s = eitsVar3.h();
        } else {
            eits eitsVar4 = this.a;
            Bundle bundle = this.d;
            eiub eiubVar = eiub.a;
            eyfc eyfcVar = eyfc.a;
            eyib eyibVar = eyib.a;
            eitsVar4.p = (eiub) ProtoParsers.f(bundle, "state_latest_operation", eiubVar, eyfc.a);
            this.a.q = this.d.getBoolean("state_pending_op");
        }
        eits eitsVar5 = this.a;
        eitsVar5.g.k(eitsVar5.n);
        this.a.j.b(this);
    }

    @Override // defpackage.ljv
    public final void ha(lkr lkrVar) {
        if (this.c) {
            this.a.p();
            return;
        }
        this.c = true;
        if (this.b) {
            emxf.b(true ^ this.a.f.i(), "Should not have account before initial start.");
            eits eitsVar = this.a;
            eitsVar.s.getClass();
            eiub eiubVar = eitsVar.p;
            eiubVar.getClass();
            if (eiubVar.equals(eits.c)) {
                eits eitsVar2 = this.a;
                eitsVar2.o(((eiww) eitsVar2.o).b, eitsVar2.s, 0);
            }
            this.a.s = null;
        } else {
            eiwl eiwlVar = this.a.f;
            eisx.b(eiwlVar.g());
            eiwlVar.o(this.a.f.h());
            this.a.r = this.d.getBoolean("state_do_not_revalidate");
            this.a.p();
        }
        Bundle bundle = this.d;
        if (bundle != null && this.a.k && !bundle.getBoolean("tiktok_accounts_disabled")) {
            this.a.f.j();
        }
        this.d = null;
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void c(lkr lkrVar) {
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void f(lkr lkrVar) {
    }
}
