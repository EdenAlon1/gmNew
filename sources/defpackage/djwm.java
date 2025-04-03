package defpackage;

import android.os.Message;
import j$.util.Optional;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djwm extends djxb {
    final /* synthetic */ djxs a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public djwm(djxs djxsVar) {
        super(djxsVar);
        this.a = djxsVar;
    }

    private final void q(final boolean z) {
        djxs djxsVar = this.a;
        dkdv dkdvVar = djxsVar.v;
        Optional of = Optional.of(djxsVar.h);
        if (dkdvVar.j(dkdvVar.e(of))) {
            return;
        }
        dkdvVar.r(new dkdu() { // from class: dkcu
            @Override // defpackage.dkdu
            public final void a(ezch ezchVar) {
                enhk enhkVar = dkdv.a;
                ezcn ezcnVar = z ? ezcn.TRUE : ezcn.FALSE;
                ezchVar.copyOnWrite();
                ezcq ezcqVar = (ezcq) ezchVar.instance;
                ezcq ezcqVar2 = ezcq.a;
                ezcqVar.i = ezcnVar.d;
                ezcqVar.b |= 64;
            }
        }, dkdvVar.e(of));
    }

    @Override // defpackage.djyw, defpackage.dixy
    public final String a() {
        return "ReadyState";
    }

    @Override // defpackage.djxb, defpackage.dixy
    public final void b() {
        super.b();
        this.a.y(ezdc.READY_STAGE);
        if (this.a.g().O()) {
            djxs djxsVar = this.a;
            djxsVar.p.b(djxsVar.h);
            q(true);
            n(this.a.aq, ezez.RCS_PROVISIONING_REQUEST_WITH_TOKEN_STATE);
            return;
        }
        djxs djxsVar2 = this.a;
        int a = ewil.a(djxsVar2.Y.c(djxsVar2.h).G);
        if (a == 0) {
            a = 1;
        }
        if ((((Boolean) djai.t().a.av.a()).booleanValue() && a == 6) || (!djai.z() || !djai.ab() ? ((Boolean) djai.t().a.y.a()).booleanValue() : !(a != 4 && a != 5))) {
            if (this.a.ai()) {
                this.a.z.a("UPI GC enabled, always try provisioning with UPI", new Object[0]);
            } else {
                djxs djxsVar3 = this.a;
                int a2 = djxsVar3.u.a(djxsVar3.h);
                djxsVar3.z.a("UPI enabled, upiAttemptsCount = %d", Integer.valueOf(a2));
                if (a2 < 0 || a2 >= djai.d()) {
                    djxs djxsVar4 = this.a;
                    djxsVar4.u.w(djxsVar4.h, 0);
                } else {
                    djxs djxsVar5 = this.a;
                    djxsVar5.u.w(djxsVar5.h, a2 + 1);
                }
            }
            djxs djxsVar6 = this.a;
            djxsVar6.p.b(djxsVar6.h);
            q(false);
            n(this.a.ai, ezez.RCS_PROVISIONING_VERIFY_MSISDN_STATE);
            return;
        }
        q(false);
        djxs djxsVar7 = this.a;
        cmbc c = djxsVar7.u.c(djxsVar7.h);
        if ((1 & c.b) != 0 && !c.c.isEmpty() && (c.b & 8) != 0) {
            eyja eyjaVar = c.f;
            if (eyjaVar == null) {
                eyjaVar = eyja.a;
            }
            if (TimeUnit.SECONDS.toMillis(eyjaVar.b) + TimeUnit.MINUTES.toMillis(((Long) dizg.o().a.s.a()).longValue()) > dkvj.a().longValue()) {
                n(this.a.ao, ezez.RCS_PROVISIONING_VERIFY_OTP_STATE);
                return;
            }
        }
        djxs djxsVar8 = this.a;
        djxsVar8.p.b(djxsVar8.h);
        djxb h = this.a.h();
        n(h, h.g());
    }

    @Override // defpackage.djxb
    public final djta f() {
        return djta.MSG_TRANSITION_TO_READY;
    }

    @Override // defpackage.djxb
    public final ezez g() {
        return ezez.RCS_PROVISIONING_READY_STATE;
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
        return super.o(message, djtaVar);
    }
}
