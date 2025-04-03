package defpackage;

import com.google.android.apps.messaging.ui.appsettings.SimMessagesActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class cwwn extends cwpv {
    private boolean n = false;

    public cwwn() {
        y(new cwwm(this));
    }

    @Override // defpackage.cwqh, defpackage.cwqf
    protected final void B() {
        if (this.n) {
            return;
        }
        this.n = true;
        SimMessagesActivity simMessagesActivity = (SimMessagesActivity) this;
        akgb akgbVar = (akgb) aX();
        simMessagesActivity.t = (cqoh) akgbVar.b.cz.b();
        simMessagesActivity.u = (cwqc) akgbVar.e.b();
        simMessagesActivity.v = akgbVar.g;
        simMessagesActivity.w = (bcqg) akgbVar.b.cZ.b();
        simMessagesActivity.x = (crjx) akgbVar.b.a.r.b();
        simMessagesActivity.y = akgbVar.h;
        akis akisVar = akgbVar.b;
        simMessagesActivity.z = akisVar.b.nH;
        akkp akkpVar = akisVar.a;
        simMessagesActivity.A = akkpVar.DA;
        simMessagesActivity.B = akkpVar.ft;
        simMessagesActivity.C = akisVar.cT;
        simMessagesActivity.D = akgbVar.j;
        simMessagesActivity.E = (elbx) akisVar.aJ.b();
        simMessagesActivity.F = akgbVar.e;
    }
}
