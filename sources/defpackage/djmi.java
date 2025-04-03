package defpackage;

import android.os.Message;
import android.telephony.ims.DelegateRegistrationState;
import android.telephony.ims.ImsException;
import android.telephony.ims.RcsUceAdapter;
import android.telephony.ims.SipDelegateConfiguration;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djmi extends djma {
    final /* synthetic */ djmm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public djmi(djmm djmmVar) {
        super(djmmVar);
        this.b = djmmVar;
    }

    private final void f() {
        djmm djmmVar = this.b;
        RcsUceAdapter.OnPublishStateChangedListener onPublishStateChangedListener = djmmVar.H;
        if (onPublishStateChangedListener != null) {
            try {
                djmmVar.A.removeOnPublishStateChangedListener(onPublishStateChangedListener);
                dkty.l(this.b.i, "Removed OnPublishCallback from AOSP.", new Object[0]);
            } catch (ImsException e) {
                dkty.j(e, this.b.i, "Failed to remove publishCallback from AOSP.", new Object[0]);
            }
            this.b.H = null;
        }
    }

    @Override // defpackage.diya, defpackage.dixy
    public final String a() {
        return "RegisteredState";
    }

    @Override // defpackage.djma, defpackage.diya, defpackage.dixy
    public final void b() {
        super.b();
        this.b.H();
        if (this.b.v != null && !djmm.P()) {
            this.b.v.h();
        }
        djmm djmmVar = this.b;
        String str = djmmVar.G;
        if (str == null) {
            str = "";
        }
        SipDelegateConfiguration sipDelegateConfiguration = djmmVar.E;
        sipDelegateConfiguration.getClass();
        djmmVar.w.e(djmmVar.K.a(sipDelegateConfiguration), str);
        if (djmm.P()) {
            try {
                djmm djmmVar2 = this.b;
                djmm djmmVar3 = this.b;
                djmmVar2.H = new djlx(djmmVar3);
                djmmVar3.A.addOnPublishStateChangedListener(djmmVar3.z, djmmVar3.H);
                dkty.l(this.b.i, "Registered OnPublishCallback in AOSP.", new Object[0]);
            } catch (ImsException e) {
                dkty.j(e, this.b.i, "Failed to register Publish callback. Retrying.", new Object[0]);
                djmm djmmVar4 = this.b;
                djmmVar4.w(djmmVar4.s);
            }
        }
    }

    @Override // defpackage.djma, defpackage.diya, defpackage.dixy
    public final void c() {
        f();
        if (!djmm.P()) {
            this.b.G(dilc.CONNECTIVITY_CHANGE);
        }
        super.c();
    }

    @Override // defpackage.djma, defpackage.diya, defpackage.dixy
    public final boolean e(Message message) {
        int i = message.what;
        if (i == 2) {
            this.b.M((SipDelegateConfiguration) message.obj);
            this.b.K((SipDelegateConfiguration) message.obj);
            return true;
        }
        if (i != 17) {
            if (i == 18) {
                this.b.J(message.arg1);
                return true;
            }
            switch (i) {
                case 4:
                    djmm djmmVar = this.b;
                    djmmVar.w(djmmVar.q);
                    return true;
                case 5:
                    this.b.L((DelegateRegistrationState) message.obj);
                    return true;
                case 6:
                    djmm djmmVar2 = this.b;
                    djmmVar2.w(djmmVar2.r);
                    return true;
                case 7:
                    this.b.E();
                    return true;
                case 8:
                    int i2 = message.arg1;
                    djkh djkhVar = this.b.v;
                    if (djkhVar != null) {
                        djkhVar.i(dilc.DISABLED);
                    }
                    this.b.C(i2);
                    return true;
                case 9:
                    djmm djmmVar3 = this.b;
                    djmmVar3.w(djmmVar3.p);
                    return true;
                case 10:
                    break;
                default:
                    return false;
            }
        }
        dkty.r(this.b.i, "[%s] Publish failed.", "RegisteredState");
        return true;
    }
}
