package defpackage;

import android.os.Message;
import android.telephony.ims.SipDelegateConfiguration;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djmg extends djmj {
    final /* synthetic */ djmm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public djmg(djmm djmmVar) {
        super(djmmVar);
        this.b = djmmVar;
    }

    @Override // defpackage.djmj, defpackage.diya, defpackage.dixy
    public final String a() {
        return "ReceiveConfigurationState";
    }

    @Override // defpackage.djmj, defpackage.djma, defpackage.diya, defpackage.dixy
    public final boolean e(Message message) {
        if (message.what != 2) {
            return super.e(message);
        }
        SipDelegateConfiguration sipDelegateConfiguration = (SipDelegateConfiguration) message.obj;
        dkty.l(this.b.i, "applying configuration in state:%s with version %d", "ReceiveConfigurationState", Long.valueOf(sipDelegateConfiguration.getVersion()));
        this.b.M(sipDelegateConfiguration);
        this.b.K(sipDelegateConfiguration);
        this.b.D();
        return true;
    }
}
