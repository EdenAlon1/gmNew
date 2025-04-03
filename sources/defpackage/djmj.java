package defpackage;

import android.os.Message;
import android.telephony.ims.DelegateRegistrationState;
import android.telephony.ims.SipDelegateConfiguration;

/* compiled from: PG */
/* loaded from: classes4.dex */
class djmj extends djma {
    final /* synthetic */ djmm c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public djmj(djmm djmmVar) {
        super(djmmVar);
        this.c = djmmVar;
    }

    @Override // defpackage.diya, defpackage.dixy
    public String a() {
        return "RegisteringState";
    }

    @Override // defpackage.djma, defpackage.diya, defpackage.dixy
    public boolean e(Message message) {
        int i = message.what;
        if (i == 2) {
            SipDelegateConfiguration sipDelegateConfiguration = (SipDelegateConfiguration) message.obj;
            dkty.l(this.c.i, "applying configuration in state:%s with version %d", "RegisteringState", Long.valueOf(sipDelegateConfiguration.getVersion()));
            this.c.M(sipDelegateConfiguration);
            this.c.K(sipDelegateConfiguration);
            djmm djmmVar = this.c;
            djmmVar.w(djmmVar.l);
            return true;
        }
        if (i == 16) {
            dkty.l(this.c.i, "StateRegistering: Timeout for registration, going to retry", new Object[0]);
            djmm djmmVar2 = this.c;
            djmmVar2.w(djmmVar2.s);
            return true;
        }
        if (i == 4) {
            djmm djmmVar3 = this.c;
            djmmVar3.w(djmmVar3.q);
            return true;
        }
        if (i == 5) {
            this.c.L((DelegateRegistrationState) message.obj);
            djmm djmmVar4 = this.c;
            djmmVar4.w(djmmVar4.m);
            return true;
        }
        if (i == 7) {
            this.c.E();
            return true;
        }
        if (i != 8) {
            return super.e(message);
        }
        this.c.C(message.arg1);
        return true;
    }
}
