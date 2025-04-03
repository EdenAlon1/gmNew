package defpackage;

import android.content.Intent;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.cloudstore.accounts.FiAccountActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tcr implements eivv {
    public final FiAccountActivity a;
    public final ejhd b;
    public final eito c;
    public final axdf d;
    public final dcxh e;
    public final asin f;
    private final arep i;
    public int h = 2;
    public boolean g = false;

    public tcr(FiAccountActivity fiAccountActivity, ejhd ejhdVar, eito eitoVar, dcxh dcxhVar, asin asinVar, axdf axdfVar, arep arepVar) {
        this.a = fiAccountActivity;
        this.b = ejhdVar;
        this.c = eitoVar;
        this.d = axdfVar;
        this.e = dcxhVar;
        this.f = asinVar;
        this.i = arepVar;
        eiwy e = eiwz.e(fiAccountActivity);
        if (asinVar.a()) {
            ((eiwv) e).a = engw.r(tcy.class);
        }
        eitoVar.g(e.a());
        eitoVar.e(this);
    }

    @Override // defpackage.eivv
    public final void aa(eivt eivtVar) {
        boolean booleanExtra = this.a.getIntent().getBooleanExtra("RCS_IS_ON", false);
        if (this.f.a() && (!booleanExtra || this.i.a())) {
            eisx a = eivtVar.a();
            int i = this.h;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            Intent b = tcn.b(this.a);
            if (((Boolean) csgj.a.e()).booleanValue()) {
                b.putExtra("entry_point", i2);
            }
            eiuy.c(b, a);
            eldl.p(this.a, b);
            this.a.finish();
            return;
        }
        eisx a2 = eivtVar.a();
        int i3 = this.h;
        int i4 = i3 - 1;
        if (i3 == 0) {
            throw null;
        }
        enru enruVar = tgk.a;
        eyga a3 = eyga.a(i4);
        tgd tgdVar = new tgd();
        fbae.e(tgdVar);
        ekky.b(tgdVar, a2);
        ekku.a(tgdVar, a3);
        cg cgVar = new cg(this.a.a());
        cgVar.E(R.id.fragment_container, tgdVar);
        cgVar.c();
    }

    @Override // defpackage.eivv
    public final void ac(eiup eiupVar) {
        boolean z = false;
        if (this.f.a() && (eiupVar.getCause() instanceof tcx)) {
            z = true;
        }
        if (!(eiupVar instanceof eiuw) && !(eiupVar instanceof eiuv) && !z) {
            throw new IllegalStateException("Unexpected account selection error", eiupVar);
        }
        int i = this.h;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        enru enruVar = tgk.a;
        eyga a = eyga.a(i2);
        tgd tgdVar = new tgd();
        fbae.e(tgdVar);
        ekky.c(tgdVar, -1);
        ekku.a(tgdVar, a);
        cg cgVar = new cg(this.a.a());
        cgVar.E(R.id.fragment_container, tgdVar);
        cgVar.c();
        if (z) {
            Throwable cause = eiupVar.getCause();
            cause.getClass();
            tcx tcxVar = (tcx) cause;
            tgk H = tgdVar.H();
            int i3 = tcxVar.b;
            Throwable th = tcxVar.a;
            if (i3 == 0) {
                throw null;
            }
            if (i3 == 2) {
                H.b();
            } else if (i3 == 3) {
                H.c(th);
            }
        }
    }

    @Override // defpackage.eivv
    public final /* synthetic */ void ab() {
    }

    @Override // defpackage.eivv
    public final /* synthetic */ void d() {
    }
}
