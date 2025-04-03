package defpackage;

import com.google.android.apps.messaging.cloudstore.accounts.FiAccountActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class tdb extends aktz {
    private boolean K = false;

    public tdb() {
        y(new tda(this));
    }

    @Override // defpackage.akug, defpackage.cwqj, defpackage.cwqh, defpackage.cwqf
    protected final void B() {
        if (this.K) {
            return;
        }
        this.K = true;
        FiAccountActivity fiAccountActivity = (FiAccountActivity) this;
        akgb akgbVar = (akgb) aX();
        fiAccountActivity.t = (cqoh) akgbVar.b.cz.b();
        fiAccountActivity.u = (cwqc) akgbVar.e.b();
        fiAccountActivity.v = akgbVar.g;
        fiAccountActivity.w = (bcqg) akgbVar.b.cZ.b();
        fiAccountActivity.x = (crjx) akgbVar.b.a.r.b();
        fiAccountActivity.y = akgbVar.h;
        akis akisVar = akgbVar.b;
        fiAccountActivity.z = akisVar.b.nH;
        akkp akkpVar = akisVar.a;
        fiAccountActivity.A = akkpVar.DA;
        fiAccountActivity.B = akkpVar.ft;
        fiAccountActivity.C = akisVar.cT;
        fiAccountActivity.D = akgbVar.j;
        fiAccountActivity.E = (elbx) akisVar.aJ.b();
        fiAccountActivity.F = akgbVar.e;
        ((cwqd) fiAccountActivity).H = akgbVar.c.bn;
        fiAccountActivity.I = akgbVar.b.a.Sa;
        fiAccountActivity.J = (eg) akgbVar.f.b();
        ((aktz) fiAccountActivity).n = akgbVar.b.a.RR;
    }
}
