package defpackage;

import com.google.android.apps.messaging.messagedetails.MessageDetailsActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ahse extends cwqd {
    private boolean n = false;

    public ahse() {
        y(new ahsd(this));
    }

    @Override // defpackage.cwqj, defpackage.cwqh, defpackage.cwqf
    protected final void B() {
        if (this.n) {
            return;
        }
        this.n = true;
        MessageDetailsActivity messageDetailsActivity = (MessageDetailsActivity) this;
        akgb akgbVar = (akgb) aX();
        messageDetailsActivity.t = (cqoh) akgbVar.b.cz.b();
        messageDetailsActivity.u = (cwqc) akgbVar.e.b();
        messageDetailsActivity.v = akgbVar.g;
        messageDetailsActivity.w = (bcqg) akgbVar.b.cZ.b();
        messageDetailsActivity.x = (crjx) akgbVar.b.a.r.b();
        messageDetailsActivity.y = akgbVar.h;
        akis akisVar = akgbVar.b;
        messageDetailsActivity.z = akisVar.b.nH;
        akkp akkpVar = akisVar.a;
        messageDetailsActivity.A = akkpVar.DA;
        messageDetailsActivity.B = akkpVar.ft;
        messageDetailsActivity.C = akisVar.cT;
        messageDetailsActivity.D = akgbVar.j;
        messageDetailsActivity.E = (elbx) akisVar.aJ.b();
        messageDetailsActivity.F = akgbVar.e;
        ((cwqd) messageDetailsActivity).H = akgbVar.c.bn;
        messageDetailsActivity.I = akgbVar.b.a.Sa;
        messageDetailsActivity.J = (eg) akgbVar.f.b();
    }
}
