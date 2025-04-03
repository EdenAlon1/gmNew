package defpackage;

import android.os.Message;
import android.telephony.ims.DelegateRegistrationState;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djmh extends djmj {
    final /* synthetic */ djmm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public djmh(djmm djmmVar) {
        super(djmmVar);
        this.b = djmmVar;
    }

    @Override // defpackage.djmj, defpackage.diya, defpackage.dixy
    public final String a() {
        return "ReceiveFeatureTagsState";
    }

    @Override // defpackage.djmj, defpackage.djma, defpackage.diya, defpackage.dixy
    public final boolean e(Message message) {
        if (message.what != 5) {
            return super.e(message);
        }
        this.b.L((DelegateRegistrationState) message.obj);
        this.b.D();
        return true;
    }
}
