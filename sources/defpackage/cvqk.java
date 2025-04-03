package defpackage;

import com.google.android.apps.messaging.startchat.StartChatActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class cvqk extends cwqd {
    private boolean n = false;

    public cvqk() {
        y(new cvqj(this));
    }

    @Override // defpackage.cwqj, defpackage.cwqh, defpackage.cwqf
    protected final void B() {
        if (this.n) {
            return;
        }
        this.n = true;
        StartChatActivity startChatActivity = (StartChatActivity) this;
        akgb akgbVar = (akgb) aX();
        startChatActivity.t = (cqoh) akgbVar.b.cz.b();
        startChatActivity.u = (cwqc) akgbVar.e.b();
        startChatActivity.v = akgbVar.g;
        startChatActivity.w = (bcqg) akgbVar.b.cZ.b();
        startChatActivity.x = (crjx) akgbVar.b.a.r.b();
        startChatActivity.y = akgbVar.h;
        akis akisVar = akgbVar.b;
        startChatActivity.z = akisVar.b.nH;
        akkp akkpVar = akisVar.a;
        startChatActivity.A = akkpVar.DA;
        startChatActivity.B = akkpVar.ft;
        startChatActivity.C = akisVar.cT;
        startChatActivity.D = akgbVar.j;
        startChatActivity.E = (elbx) akisVar.aJ.b();
        startChatActivity.F = akgbVar.e;
        ((cwqd) startChatActivity).H = akgbVar.c.bn;
        startChatActivity.I = akgbVar.b.a.Sa;
        startChatActivity.J = (eg) akgbVar.f.b();
    }
}
