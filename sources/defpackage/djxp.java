package defpackage;

import android.os.Message;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djxp extends djxb {
    final /* synthetic */ djxs a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public djxp(djxs djxsVar) {
        super(djxsVar);
        this.a = djxsVar;
    }

    @Override // defpackage.djyw, defpackage.dixy
    public final String a() {
        return "WaitingForRcsDefaultOnState";
    }

    @Override // defpackage.djxb, defpackage.dixy
    public final void b() {
        super.b();
        this.a.y(ezdc.RCS_DEFAULT_ON_STAGE);
        if (this.a.J.a().equals(cmem.LEGAL_FYI_SEEN)) {
            n(this.a.ay, ezez.RCS_PROVISIONING_SET_GOOGLE_TOS_CONSENT_STATE);
            return;
        }
        if (!dkvy.d(this.a.m)) {
            djxs djxsVar = this.a;
            djxsVar.n.x(djxsVar.m, 6, djxsVar.l, new djro(djxsVar.h));
            this.a.ar(59);
            djtb.c(this.a.m, 24, null);
            if (this.a.ah() && this.a.J.a().equals(cmem.RCS_DEFAULT_ON_CONSENT_STATE_UNSPECIFIED)) {
                this.a.ar(62);
                n(this.a.ay, ezez.RCS_PROVISIONING_SET_GOOGLE_TOS_CONSENT_STATE);
                return;
            } else {
                this.a.I();
                this.a.K.ifPresent(new Consumer() { // from class: djxo
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        ((djtd) obj).o(3, djxp.this.a.h);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                return;
            }
        }
        this.a.z.d("Skipping legal FYI for Wear device", new Object[0]);
        dkcp dkcpVar = this.a.u;
        cmep cmepVar = (cmep) dkcpVar.e().toBuilder();
        cmem cmemVar = cmem.LEGAL_FYI_SEEN;
        cmepVar.copyOnWrite();
        ((cmeq) cmepVar.instance).h = cmemVar.a();
        eyja b = eykj.b(this.a.L.f());
        cmepVar.copyOnWrite();
        cmeq cmeqVar = (cmeq) cmepVar.instance;
        b.getClass();
        cmeqVar.f = b;
        cmeqVar.b |= 1;
        dkcpVar.v((cmeq) cmepVar.build());
        n(this.a.ay, ezez.RCS_PROVISIONING_SET_GOOGLE_TOS_CONSENT_STATE);
    }

    @Override // defpackage.djxb
    public final djta f() {
        return djta.MSG_TRANSITION_TO_WAITING_FOR_RCS_DEFAULT_ON;
    }

    @Override // defpackage.djxb
    public final ezez g() {
        return ezez.RCS_PROVISIONING_WAITING_FOR_RCS_DEFAULT_ON_STATE;
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
        return false;
    }

    @Override // defpackage.djyw
    public final boolean k(Message message, djta djtaVar) {
        return super.o(message, djtaVar);
    }
}
