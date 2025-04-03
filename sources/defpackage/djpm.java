package defpackage;

import android.os.Message;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djpm extends djop {
    final /* synthetic */ djqf b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public djpm(djqf djqfVar) {
        super(djqfVar);
        this.b = djqfVar;
    }

    @Override // defpackage.diya, defpackage.dixy
    public final String a() {
        return "ReconfigurationRequiredState";
    }

    @Override // defpackage.djop, defpackage.diya, defpackage.dixy
    public final boolean e(Message message) {
        int i = message.what;
        if (i != 4) {
            if (i == 17) {
                this.b.N(dilc.SIM_REMOVED);
                djqf djqfVar = this.b;
                djqfVar.w(djqfVar.aj);
            } else {
                if (i != 7) {
                    if (i != 8) {
                        return super.e(message);
                    }
                    this.b.N(message.obj);
                    djqf djqfVar2 = this.b;
                    djqfVar2.w(djqfVar2.W);
                    return true;
                }
                if (!((Boolean) djqf.g.a()).booleanValue() || this.b.G.a() <= 0) {
                    djqf djqfVar3 = this.b;
                    djqfVar3.w(djqfVar3.X);
                } else {
                    dkty.d(this.b.m, "Wait for backoff timer before starting registration.", new Object[0]);
                    djqf djqfVar4 = this.b;
                    djqfVar4.w(djqfVar4.ak);
                }
            }
        }
        return true;
    }
}
