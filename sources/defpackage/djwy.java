package defpackage;

import android.os.Message;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import j$.time.Duration;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djwy extends djxb {
    final /* synthetic */ djxs a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public djwy(djxs djxsVar) {
        super(djxsVar);
        this.a = djxsVar;
    }

    private final void q() {
        this.a.K(djta.MSG_SET_CONSENT_COMPLETE);
    }

    @Override // defpackage.djyw, defpackage.dixy
    public final String a() {
        return "SetGoogleToSConsentState";
    }

    @Override // defpackage.djxb, defpackage.dixy
    public final void b() {
        super.b();
        this.a.y(ezdc.SET_GOOGLE_TOS_CONSENT_STAGE);
        this.a.ar(27);
        djxs djxsVar = this.a;
        final clxt a = djxsVar.aC.a();
        elfl.g(djxsVar.A.f((djxsVar.ag() && djxsVar.aj() && djxsVar.J.a().equals(cmem.RCS_DEFAULT_ON_CONSENT_STATE_UNSPECIFIED)) ? ezes.RCS_DEFAULT_ON_OOB_CONSENT : this.a.aj() ? ezes.LEGAL_FYI_SEEN : ezes.GOOGLE_TOS_UI)).h(new emwl() { // from class: djwv
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                djwy.this.a.L(djta.MSG_SET_CONSENT_API_SUCCESS, new djul(a, (String) obj));
                return null;
            }
        }, this.a.w).e(Exception.class, new emwl() { // from class: djww
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                clxt clxtVar = a;
                Exception exc = (Exception) obj;
                djwy djwyVar = djwy.this;
                djwyVar.a.z.f(exc, "googleToSConsentApi.setConsent %s failed", clxtVar);
                djwyVar.a.L(djta.MSG_SET_CONSENT_API_ERROR, exc);
                return null;
            }
        }, erpp.a);
    }

    @Override // defpackage.djxb
    public final djta f() {
        return djta.MSG_TRANSITION_TO_SET_GOOGLE_TOS_CONSENT;
    }

    @Override // defpackage.djxb
    public final ezez g() {
        return ezez.RCS_PROVISIONING_SET_GOOGLE_TOS_CONSENT_STATE;
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
        this.a.D("SetGoogleToSConsentState", message);
        int ordinal = djxs.ak(message).ordinal();
        if (ordinal == 8) {
            this.a.ar(49);
            if (djai.P()) {
                djxs djxsVar = this.a;
                djxsVar.R(djxsVar.al);
            } else {
                q();
            }
        } else {
            if (ordinal == 34) {
                this.a.av(BasePaymentResult.ERROR_REQUEST_FAILED);
                if (emyj.a(((djum) message.obj).b())) {
                    this.a.z.e("Token from setConsent API is empty", new Object[0]);
                    if (djai.P()) {
                        djxs djxsVar2 = this.a;
                        djxsVar2.R(djxsVar2.al);
                        return true;
                    }
                }
                q();
                return true;
            }
            if (ordinal != 35) {
                return super.o(message, djtaVar);
            }
            this.a.ar(53);
            if (this.a.ah() && this.a.ag() && (message.obj instanceof dfqu)) {
                dfqu dfquVar = (dfqu) message.obj;
                if (dfquVar != null && dfquVar.a.f == 34506) {
                    this.a.I();
                    this.a.K.ifPresent(new Consumer() { // from class: djwx
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void o(Object obj) {
                            ((djtd) obj).o(3, djwy.this.a.h);
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                }
            } else if (djai.P()) {
                djxs djxsVar3 = this.a;
                djxsVar3.R(djxsVar3.al);
            } else {
                q();
            }
        }
        return true;
    }

    @Override // defpackage.djxb
    public final Duration l() {
        return djun.i;
    }
}
