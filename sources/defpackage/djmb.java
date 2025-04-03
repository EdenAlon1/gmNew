package defpackage;

import android.os.Message;
import android.telephony.ims.SipDelegateConnection;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djmb extends djma {
    final /* synthetic */ djmm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public djmb(djmm djmmVar) {
        super(djmmVar);
        this.b = djmmVar;
    }

    @Override // defpackage.diya, defpackage.dixy
    public final String a() {
        return "ConnectingState";
    }

    @Override // defpackage.djma, defpackage.diya, defpackage.dixy
    public final void b() {
        super.b();
        this.b.B();
    }

    @Override // defpackage.djma, defpackage.diya, defpackage.dixy
    public final boolean e(Message message) {
        int i = message.what;
        if (i == 1) {
            this.b.D = (SipDelegateConnection) message.obj;
            djmm djmmVar = this.b;
            djmmVar.w(djmmVar.n);
            return true;
        }
        if (i == 4) {
            djmm djmmVar2 = this.b;
            djmmVar2.w(djmmVar2.q);
            return true;
        }
        if (i == 8) {
            this.b.C(message.arg1);
            return true;
        }
        if (i != 16) {
            return false;
        }
        dkty.l(this.b.i, "StateConnecting: Timeout for registration, going to retry", new Object[0]);
        djmm djmmVar3 = this.b;
        djmmVar3.w(djmmVar3.s);
        return true;
    }
}
