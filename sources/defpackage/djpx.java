package defpackage;

import android.os.Message;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djpx extends djop {
    final /* synthetic */ djqf b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public djpx(djqf djqfVar) {
        super(djqfVar);
        this.b = djqfVar;
    }

    @Override // defpackage.diya, defpackage.dixy
    public final String a() {
        return "SimRemovedState";
    }

    @Override // defpackage.djop, defpackage.diya, defpackage.dixy
    public final void b() {
        super.b();
        if (this.b.V.getAndSet(false)) {
            this.b.q(16);
        }
    }

    @Override // defpackage.djop, defpackage.diya, defpackage.dixy
    public final boolean e(Message message) {
        int i = message.what;
        if (i != 7) {
            if (i != 8) {
                if (i != 16) {
                    return super.e(message);
                }
                djqf djqfVar = this.b;
                djqfVar.w(djqfVar.Y);
                return true;
            }
            dilc dilcVar = (dilc) message.obj;
            this.b.N(dilcVar);
            if (dilcVar.equals(dilc.FCM_TICKLE_KEEP_ALIVE)) {
                dkty.d(this.b.m, "Ignore FCM Tickle.", new Object[0]);
            } else {
                djqf djqfVar2 = this.b;
                djqfVar2.w(djqfVar2.W);
            }
        } else if (this.b.D.equals(dilc.FCM_TICKLE_KEEP_ALIVE)) {
            dkty.d(this.b.m, "Ignore FCM Tickle.", new Object[0]);
        } else {
            djqf djqfVar3 = this.b;
            djqfVar3.w(djqfVar3.X);
        }
        return true;
    }
}
