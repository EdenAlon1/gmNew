package defpackage;

import android.os.Bundle;
import android.os.Message;
import com.google.android.ims.provisioning.config.ServerMessage;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djxr extends djxb {
    final /* synthetic */ djxs a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public djxr(djxs djxsVar) {
        super(djxsVar);
        this.a = djxsVar;
    }

    private final void q() {
        djxs djxsVar = this.a;
        djtp f = djxsVar.u.f(djxsVar.h);
        f.ac();
        djxs djxsVar2 = this.a;
        djxsVar2.u.t(djxsVar2.h, f);
    }

    @Override // defpackage.djyw, defpackage.dixy
    public final String a() {
        return "WaitingForTermsAndConditionsState";
    }

    @Override // defpackage.djxb, defpackage.dixy
    public final void b() {
        super.b();
        this.a.y(ezdc.TERMS_AND_CONDITIONS_STAGE);
        djxs djxsVar = this.a;
        String str = djxsVar.l;
        djro djroVar = new djro(djxsVar.h);
        djxs djxsVar2 = this.a;
        djxsVar2.n.x(djxsVar2.m, 5, str, djroVar);
        djxs djxsVar3 = this.a;
        dkcp dkcpVar = djxsVar3.u;
        try {
            if (dkcpVar.b.k("configuration_terms_and_conditions_consent_".concat(String.valueOf(djxsVar3.h)), false, "RcsApplicationData")) {
                q();
                this.a.ar(17);
                n(this.a.as, ezez.RCS_PROVISIONING_CONFIGURED_STATE);
                return;
            }
        } catch (dksb e) {
            dkty.j(e, dkcp.a, "Error while retrieving consent for Configuration Terms and Conditions", new Object[0]);
            dkcpVar.F(4);
        }
        int k = ((cmfj) this.a.P.b()).k(new djro(this.a.h)) - 2;
        if (k == 1) {
            q();
            this.a.ar(17);
            n(this.a.as, ezez.RCS_PROVISIONING_CONFIGURED_STATE);
            return;
        }
        if (k == 2) {
            djxs djxsVar4 = this.a;
            if (djxsVar4.O) {
                ((cmgr) djxsVar4.N.b()).l(new djro(this.a.h), cmis.PER_SIM_TOGGLE_STATE_DISABLED);
                ((cmgr) this.a.N.b()).j();
            } else {
                ((cmgr) djxsVar4.N.b()).m(cmip.TOGGLE_STATE_USER_DISABLED);
            }
            this.a.K(djta.MSG_T_AND_C_REJECTED);
            return;
        }
        djtp g = this.a.g();
        if (g.q() != null) {
            ServerMessage q = g.q();
            diun diunVar = (diun) diuo.a.createBuilder();
            String str2 = q.mMessage;
            diunVar.copyOnWrite();
            diuo diuoVar = (diuo) diunVar.instance;
            str2.getClass();
            diuoVar.b = 1 | diuoVar.b;
            diuoVar.c = str2;
            String b = emxe.b(q.mTitle);
            diunVar.copyOnWrite();
            diuo diuoVar2 = (diuo) diunVar.instance;
            diuoVar2.b = 2 | diuoVar2.b;
            diuoVar2.d = b;
            boolean z = q.mHasAcceptButton;
            diunVar.copyOnWrite();
            diuo diuoVar3 = (diuo) diunVar.instance;
            diuoVar3.b = 4 | diuoVar3.b;
            diuoVar3.e = z;
            boolean z2 = q.mHasRejectButton;
            diunVar.copyOnWrite();
            diuo diuoVar4 = (diuo) diunVar.instance;
            diuoVar4.b |= 8;
            diuoVar4.f = z2;
            diuo diuoVar5 = (diuo) diunVar.build();
            Bundle bundle = new Bundle();
            bundle.putByteArray("com.google.android.ims.provisioning.enginge.provisioning_alert_server_message", diuoVar5.toByteArray());
            bundle.putString("com.google.android.ims.provisioning.sim.id.key", this.a.h);
            this.a.I();
            this.a.ar(16);
            djtb.c(this.a.m, 9, bundle);
            this.a.K.ifPresent(new Consumer() { // from class: djxq
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    ((djtd) obj).o(3, djxr.this.a.h);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
    }

    @Override // defpackage.djxb
    public final djta f() {
        return djta.MSG_TRANSITION_TO_WAITING_FOR_TOS;
    }

    @Override // defpackage.djxb
    public final ezez g() {
        return ezez.RCS_PROVISIONING_WAITING_FOR_TERMS_AND_CONDITIONS_STATE;
    }

    @Override // defpackage.djxb
    public final boolean h() {
        return true;
    }

    @Override // defpackage.djxb
    public final boolean j() {
        return false;
    }

    @Override // defpackage.djyw
    public final boolean k(Message message, djta djtaVar) {
        this.a.D("WaitingForTermsAndConditionsState", message);
        if (djxs.ak(message).ordinal() != 18) {
            return super.o(message, djtaVar);
        }
        djxs djxsVar = this.a;
        djxsVar.s.c(djxsVar.h);
        this.a.ar(37);
        this.a.C();
        this.a.z.d("T&Cs rejected. Invoke failure", new Object[0]);
        djxs djxsVar2 = this.a;
        djxsVar2.n.p(djxsVar2.m, ezez.RCS_PROVISIONING_WAITING_FOR_TERMS_AND_CONDITIONS_STATE, 10, djxsVar2.l, new djro(djxsVar2.h));
        djxs djxsVar3 = this.a;
        djxsVar3.R(djxsVar3.ae);
        return true;
    }
}
