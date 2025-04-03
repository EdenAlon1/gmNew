package defpackage;

import android.os.Message;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djxj extends djxb {
    final /* synthetic */ djxs a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public djxj(djxs djxsVar) {
        super(djxsVar);
        this.a = djxsVar;
    }

    @Override // defpackage.djyw, defpackage.dixy
    public final String a() {
        return "WaitingForGoogleTosState";
    }

    @Override // defpackage.djxb, defpackage.dixy
    public final void b() {
        super.b();
        this.a.y(ezdc.GOOGLE_TOS_STAGE);
        if (this.a.u.C()) {
            this.a.K(djta.MSG_GOOGLE_TOS_ACCEPTED);
            return;
        }
        djxs djxsVar = this.a;
        djxsVar.n.x(djxsVar.m, 3, djxsVar.l, new djro(djxsVar.h));
        this.a.ar(6);
        this.a.I();
        djtb.c(this.a.m, 5, null);
        this.a.K.ifPresent(new Consumer() { // from class: djxi
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ((djtd) obj).o(3, djxj.this.a.h);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    @Override // defpackage.djxb
    public final djta f() {
        return djta.MSG_TRANSITION_TO_WAITING_FOR_GOOGLE_TOS;
    }

    @Override // defpackage.djxb
    public final ezez g() {
        return ezez.RCS_PROVISIONING_WAITING_FOR_GOOGLE_TOS_STATE;
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
        this.a.D("WaitingForGoogleTosState", message);
        if (djxs.ak(message).ordinal() != 16) {
            return super.o(message, djtaVar);
        }
        if (!this.a.u.C()) {
            this.a.I();
            djtb.c(this.a.m, 5, null);
            return true;
        }
        this.a.ar(7);
        if (!djai.I()) {
            djxs djxsVar = this.a;
            djxsVar.R(djxsVar.ag);
            return true;
        }
        if (!this.a.aC.d() && djai.C()) {
            this.a.u();
        }
        djxs djxsVar2 = this.a;
        djxsVar2.R(djxsVar2.ay);
        return true;
    }
}
