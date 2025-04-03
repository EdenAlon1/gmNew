package defpackage;

import android.os.Message;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djxn extends djxb {
    final /* synthetic */ djxs a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public djxn(djxs djxsVar) {
        super(djxsVar);
        this.a = djxsVar;
    }

    @Override // defpackage.djyw, defpackage.dixy
    public final String a() {
        return "WaitingForOtpState";
    }

    @Override // defpackage.djxb, defpackage.dixy
    public final void b() {
        super.b();
        this.a.y(ezdc.WAITING_FOR_OTP_STAGE);
        long d = ((dkdw) this.a.M.b()).d(this.a.h);
        if (d != -1 && d < dkvj.a().longValue()) {
            n(this.a.al, ezez.RCS_PROVISIONING_RETRY_STATE);
            return;
        }
        long longValue = ((Long) dizg.o().a.Y.a()).longValue();
        ((dkdw) this.a.M.b()).y(this.a.h, dkvj.a().longValue() + longValue);
        this.a.N(djta.MSG_OTP_TIMEOUT, longValue);
    }

    @Override // defpackage.djxb, defpackage.dixy
    public final void c() {
        super.c();
        ((dkdw) this.a.M.b()).y(this.a.h, -1L);
    }

    @Override // defpackage.djxb
    public final djta f() {
        return djta.MSG_TRANSITION_TO_WAITING_FOR_OTP;
    }

    @Override // defpackage.djxb
    public final ezez g() {
        return ezez.RCS_PROVISIONING_WAITING_FOR_OTP_STATE;
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
        this.a.D("WaitingForOtpState", message);
        this.a.G();
        int ordinal = djxs.ak(message).ordinal();
        if (ordinal == 7) {
            this.a.ar(29);
            dkdw dkdwVar = (dkdw) this.a.M.b();
            djxs djxsVar = this.a;
            dkdwVar.x(djxsVar.h, djxs.o(message));
            if (this.a.R.m()) {
                this.a.w(djta.MSG_VERIFY_OTP, message.obj);
                djxs djxsVar2 = this.a;
                djxsVar2.R(djxsVar2.ao);
            } else {
                this.a.L(djta.MSG_VERIFY_OTP, message.obj);
                djxs djxsVar3 = this.a;
                djxsVar3.R(djxsVar3.ao);
            }
            return true;
        }
        if (ordinal != 27) {
            return super.o(message, djtaVar);
        }
        this.a.ar(30);
        final djxs djxsVar4 = this.a;
        String m = djxsVar4.m();
        djxsVar4.n.t(djxsVar4.m, new Supplier() { // from class: djvp
            @Override // java.util.function.Supplier
            public final Object get() {
                return djxs.this.j();
            }
        }, m, 2, 0, djxsVar4.l);
        this.a.z.e("Timed out waiting for OTP SMS", new Object[0]);
        djxs djxsVar5 = this.a;
        djxsVar5.n.l(djxsVar5.m, ezez.RCS_PROVISIONING_WAITING_FOR_OTP_STATE, djxsVar5.l, new djro(djxsVar5.h));
        this.a.aq(ezez.RCS_PROVISIONING_WAITING_FOR_OTP_STATE, 5);
        if (this.a.T()) {
            djxs djxsVar6 = this.a;
            djxsVar6.E.b(djxsVar6.h, ezck.SIM, djxsVar6.l, cmau.OTP_TIMEOUT);
        }
        djxs djxsVar7 = this.a;
        djxsVar7.R(djxsVar7.al);
        return true;
    }
}
