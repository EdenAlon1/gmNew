package defpackage;

import com.google.android.apps.messaging.multishare.MultiShareActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ahtq extends cwqd {
    private boolean n = false;

    public ahtq() {
        y(new ahtp(this));
    }

    @Override // defpackage.cwqj, defpackage.cwqh, defpackage.cwqf
    protected final void B() {
        if (this.n) {
            return;
        }
        this.n = true;
        MultiShareActivity multiShareActivity = (MultiShareActivity) this;
        akgb akgbVar = (akgb) aX();
        multiShareActivity.t = (cqoh) akgbVar.b.cz.b();
        multiShareActivity.u = (cwqc) akgbVar.e.b();
        multiShareActivity.v = akgbVar.g;
        multiShareActivity.w = (bcqg) akgbVar.b.cZ.b();
        multiShareActivity.x = (crjx) akgbVar.b.a.r.b();
        multiShareActivity.y = akgbVar.h;
        akis akisVar = akgbVar.b;
        multiShareActivity.z = akisVar.b.nH;
        akkp akkpVar = akisVar.a;
        multiShareActivity.A = akkpVar.DA;
        multiShareActivity.B = akkpVar.ft;
        multiShareActivity.C = akisVar.cT;
        multiShareActivity.D = akgbVar.j;
        multiShareActivity.E = (elbx) akisVar.aJ.b();
        multiShareActivity.F = akgbVar.e;
        ((cwqd) multiShareActivity).H = akgbVar.c.bn;
        multiShareActivity.I = akgbVar.b.a.Sa;
        multiShareActivity.J = (eg) akgbVar.f.b();
    }
}
