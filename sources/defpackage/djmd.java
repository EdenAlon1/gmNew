package defpackage;

import android.os.Message;
import android.telephony.ims.DelegateRegistrationState;
import android.telephony.ims.SipDelegateConfiguration;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djmd extends djma {
    final /* synthetic */ djmm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public djmd(djmm djmmVar) {
        super(djmmVar);
        this.b = djmmVar;
    }

    @Override // defpackage.diya, defpackage.dixy
    public final String a() {
        return "InactiveState";
    }

    @Override // defpackage.djma, defpackage.diya, defpackage.dixy
    public final void b() {
        super.b();
        dkty.d(this.b.i, "Delegate is deregistered.", new Object[0]);
    }

    @Override // defpackage.djma, defpackage.diya, defpackage.dixy
    public final boolean e(Message message) {
        int i = message.what;
        if (i == 2) {
            this.b.M((SipDelegateConfiguration) message.obj);
            this.b.K((SipDelegateConfiguration) message.obj);
            return true;
        }
        if (i == 8) {
            this.b.C(message.arg1);
            return true;
        }
        if (i == 4) {
            djmm djmmVar = this.b;
            djmmVar.w(djmmVar.q);
            return true;
        }
        if (i != 5) {
            return false;
        }
        this.b.L((DelegateRegistrationState) message.obj);
        djmm djmmVar2 = this.b;
        djmmVar2.w(djmmVar2.o);
        return true;
    }
}
