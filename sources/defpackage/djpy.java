package defpackage;

import android.os.Message;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djpy extends djop {
    final /* synthetic */ djqf b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public djpy(djqf djqfVar) {
        super(djqfVar);
        this.b = djqfVar;
    }

    @Override // defpackage.diya, defpackage.dixy
    public final String a() {
        return "StoppedState";
    }

    @Override // defpackage.djop, defpackage.diya, defpackage.dixy
    public final boolean e(Message message) {
        if (message.what != 7) {
            return super.e(message);
        }
        djqf djqfVar = this.b;
        if (djqfVar.D == dilc.FCM_TICKLE_KEEP_ALIVE) {
            djqfVar.w(djqfVar.X);
            return true;
        }
        if (!((Boolean) djqf.g.a()).booleanValue() || this.b.G.a() <= 0) {
            djqf djqfVar2 = this.b;
            djqfVar2.w(djqfVar2.X);
        } else {
            dkty.d(this.b.m, "Wait for backoff timer before starting registration.", new Object[0]);
            djqf djqfVar3 = this.b;
            djqfVar3.w(djqfVar3.ak);
        }
        return true;
    }
}
