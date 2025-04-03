package defpackage;

import android.os.Message;
import android.telephony.ims.SipDelegateConnection;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djml extends djma {
    final /* synthetic */ djmm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public djml(djmm djmmVar) {
        super(djmmVar);
        this.b = djmmVar;
    }

    private final void f(SipDelegateConnection sipDelegateConnection) {
        if (sipDelegateConnection != null) {
            this.b.y.destroySipDelegate(sipDelegateConnection, 2);
        }
    }

    @Override // defpackage.diya, defpackage.dixy
    public final String a() {
        return "TerminatedState";
    }

    @Override // defpackage.djma, defpackage.diya, defpackage.dixy
    public final void b() {
        super.b();
        f(this.b.D);
        this.b.x.c();
    }

    @Override // defpackage.djma, defpackage.diya, defpackage.dixy
    public final boolean e(Message message) {
        if (message.what != 1) {
            return false;
        }
        dkty.r(this.b.i, "Race condition detected: connection created after transitioning to terminated.", new Object[0]);
        f((SipDelegateConnection) message.obj);
        return true;
    }
}
