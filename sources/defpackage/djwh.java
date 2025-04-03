package defpackage;

import android.os.Message;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djwh extends djxb {
    final /* synthetic */ djxs a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public djwh(djxs djxsVar) {
        super(djxsVar);
        this.a = djxsVar;
    }

    private final void q() {
        this.a.K(djta.MSG_GET_CONSENT_COMPLETE);
    }

    @Override // defpackage.djyw, defpackage.dixy
    public final String a() {
        return "GetGoogleToSConsentState";
    }

    @Override // defpackage.djxb, defpackage.dixy
    public final void b() {
        super.b();
        this.a.y(ezdc.GET_GOOGLE_TOS_CONSENT_STAGE);
        this.a.ar(27);
        elfl.g(this.a.A.b()).h(new emwl() { // from class: djwf
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                djwh.this.a.L(djta.MSG_GET_CONSENT_API_SUCCESS, (djum) obj);
                return null;
            }
        }, this.a.w).e(Exception.class, new emwl() { // from class: djwg
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                Exception exc = (Exception) obj;
                djwh djwhVar = djwh.this;
                djwhVar.a.z.f(exc, "googleToSConsentApi.getConsent failed", new Object[0]);
                djwhVar.a.L(djta.MSG_GET_CONSENT_API_ERROR, exc);
                return null;
            }
        }, erpp.a);
    }

    @Override // defpackage.djxb
    public final djta f() {
        return djta.MSG_TRANSITION_TO_GET_GOOGLE_TOS_CONSENT;
    }

    @Override // defpackage.djxb
    public final ezez g() {
        return ezez.RCS_PROVISIONING_GET_GOOGLE_TOS_CONSENT_STATE;
    }

    @Override // defpackage.djxb
    public final boolean h() {
        return true;
    }

    @Override // defpackage.djxb
    public final boolean i() {
        return false;
    }

    @Override // defpackage.djxb
    public final boolean j() {
        return true;
    }

    @Override // defpackage.djyw
    public final boolean k(Message message, djta djtaVar) {
        this.a.D("GetGoogleToSConsentState", message);
        int ordinal = djxs.ak(message).ordinal();
        if (ordinal == 8) {
            this.a.ar(49);
            if (!djai.P()) {
                q();
                return true;
            }
            djxs djxsVar = this.a;
            djxsVar.R(djxsVar.al);
            return true;
        }
        if (ordinal != 36) {
            if (ordinal != 37) {
                return super.o(message, djtaVar);
            }
            this.a.ar(53);
            if (!djai.P()) {
                q();
                return true;
            }
            djxs djxsVar2 = this.a;
            djxsVar2.R(djxsVar2.al);
            return true;
        }
        this.a.av(BasePaymentResult.ERROR_REQUEST_FAILED);
        djum djumVar = (djum) message.obj;
        if (djumVar.a() == clxt.GOOGLE_TOS_CONSENTED) {
            this.a.ar(51);
            if (!emyj.a(djumVar.b())) {
                djxs djxsVar3 = this.a;
                djxsVar3.u.p(djumVar.b());
                q();
                return true;
            }
            this.a.ar(50);
            this.a.z.e("Token from getConsent API is empty", new Object[0]);
            if (!djai.P()) {
                q();
                return true;
            }
            djxs djxsVar4 = this.a;
            djxsVar4.R(djxsVar4.al);
            return true;
        }
        this.a.ar(52);
        this.a.z.e("getConsent API returns no consent.", new Object[0]);
        this.a.aC.b();
        if (this.a.ag()) {
            this.a.J.b();
            this.a.z.e("Request for RCS Default On reprompt", new Object[0]);
            djtb.c(this.a.m, 25, null);
            djxs djxsVar5 = this.a;
            djxsVar5.R(djxsVar5.aA);
            return true;
        }
        if (((Boolean) djai.t().a.u.a()).booleanValue()) {
            this.a.z.e("Request for reprompt.", new Object[0]);
            djtb.c(this.a.m, 22, null);
        }
        djxs djxsVar6 = this.a;
        djxsVar6.R(djxsVar6.au);
        return true;
    }

    @Override // defpackage.djxb
    public final Duration l() {
        return djun.i;
    }
}
