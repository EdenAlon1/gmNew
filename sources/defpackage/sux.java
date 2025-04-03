package defpackage;

import com.google.android.apps.messaging.block.ui.list.BlockedParticipantsActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class sux extends cwpv {
    private boolean n = false;

    public sux() {
        y(new suw(this));
    }

    @Override // defpackage.cwqh, defpackage.cwqf
    protected final void B() {
        if (this.n) {
            return;
        }
        this.n = true;
        BlockedParticipantsActivity blockedParticipantsActivity = (BlockedParticipantsActivity) this;
        akgb akgbVar = (akgb) aX();
        blockedParticipantsActivity.t = (cqoh) akgbVar.b.cz.b();
        blockedParticipantsActivity.u = (cwqc) akgbVar.e.b();
        blockedParticipantsActivity.v = akgbVar.g;
        blockedParticipantsActivity.w = (bcqg) akgbVar.b.cZ.b();
        blockedParticipantsActivity.x = (crjx) akgbVar.b.a.r.b();
        blockedParticipantsActivity.y = akgbVar.h;
        akis akisVar = akgbVar.b;
        blockedParticipantsActivity.z = akisVar.b.nH;
        akkp akkpVar = akisVar.a;
        blockedParticipantsActivity.A = akkpVar.DA;
        blockedParticipantsActivity.B = akkpVar.ft;
        blockedParticipantsActivity.C = akisVar.cT;
        blockedParticipantsActivity.D = akgbVar.j;
        blockedParticipantsActivity.E = (elbx) akisVar.aJ.b();
        blockedParticipantsActivity.F = akgbVar.e;
    }
}
