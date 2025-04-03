package defpackage;

import com.google.android.apps.messaging.conversation.settings.InfoAndOptionsActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class wah extends vzf {
    private boolean n = false;

    public wah() {
        y(new wag(this));
    }

    @Override // defpackage.wad, defpackage.cwqj, defpackage.cwqh, defpackage.cwqf
    protected final void B() {
        if (this.n) {
            return;
        }
        this.n = true;
        InfoAndOptionsActivity infoAndOptionsActivity = (InfoAndOptionsActivity) this;
        akgb akgbVar = (akgb) aX();
        infoAndOptionsActivity.t = (cqoh) akgbVar.b.cz.b();
        infoAndOptionsActivity.u = (cwqc) akgbVar.e.b();
        infoAndOptionsActivity.v = akgbVar.g;
        infoAndOptionsActivity.w = (bcqg) akgbVar.b.cZ.b();
        infoAndOptionsActivity.x = (crjx) akgbVar.b.a.r.b();
        infoAndOptionsActivity.y = akgbVar.h;
        akis akisVar = akgbVar.b;
        infoAndOptionsActivity.z = akisVar.b.nH;
        akkp akkpVar = akisVar.a;
        infoAndOptionsActivity.A = akkpVar.DA;
        infoAndOptionsActivity.B = akkpVar.ft;
        infoAndOptionsActivity.C = akisVar.cT;
        infoAndOptionsActivity.D = akgbVar.j;
        infoAndOptionsActivity.E = (elbx) akisVar.aJ.b();
        infoAndOptionsActivity.F = akgbVar.e;
        ((cwqd) infoAndOptionsActivity).H = akgbVar.c.bn;
        infoAndOptionsActivity.I = akgbVar.b.a.Sa;
        infoAndOptionsActivity.J = (eg) akgbVar.f.b();
    }
}
