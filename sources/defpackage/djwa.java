package defpackage;

import android.os.Message;
import android.text.TextUtils;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djwa extends djxb {
    final /* synthetic */ djxs a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public djwa(djxs djxsVar) {
        super(djxsVar);
        this.a = djxsVar;
    }

    @Override // defpackage.djyw, defpackage.dixy
    public final String a() {
        return "ConfiguredState";
    }

    @Override // defpackage.djxb, defpackage.dixy
    public final void b() {
        String l = ((dkdw) this.a.M.b()).l(this.a.h);
        super.b();
        ((dkdw) this.a.M.b()).p(this.a.h);
        ((dkdw) this.a.M.b()).n(this.a.h);
        djtc f = this.a.f();
        if (f.d()) {
            this.a.z.d("RCS disabled in ConfiguredState: ".concat(f.a()), new Object[0]);
            this.a.ar(47);
            n(this.a.ae, ezez.RCS_PROVISIONING_DISABLED_STATE);
            return;
        }
        djxs djxsVar = this.a;
        dkdv dkdvVar = djxsVar.v;
        djtp g = djxsVar.g();
        dkdvVar.k(ezdc.CONFIGURED_STAGE, djxsVar.l, true, djxsVar.h);
        if (g != null) {
            djxs djxsVar2 = this.a;
            final int h = djvk.h(g);
            final int e = g.e();
            final int d = g.d();
            dkdv dkdvVar2 = djxsVar2.v;
            Optional of = Optional.of(djxsVar2.h);
            if (!dkdvVar2.j(dkdvVar2.e(of))) {
                dkdvVar2.r(new dkdu() { // from class: dkcs
                    @Override // defpackage.dkdu
                    public final void a(ezch ezchVar) {
                        enhk enhkVar = dkdv.a;
                        ezchVar.copyOnWrite();
                        ezcq ezcqVar = (ezcq) ezchVar.instance;
                        ezcq ezcqVar2 = ezcq.a;
                        ezcqVar.p = h - 1;
                        ezcqVar.b |= 4096;
                        ezchVar.copyOnWrite();
                        ezcq ezcqVar3 = (ezcq) ezchVar.instance;
                        ezcqVar3.b |= 8192;
                        ezcqVar3.q = e;
                        ezchVar.copyOnWrite();
                        ezcq ezcqVar4 = (ezcq) ezchVar.instance;
                        ezcqVar4.b |= 16384;
                        ezcqVar4.r = d;
                    }
                }, dkdvVar2.e(of));
            }
        }
        djxs djxsVar3 = this.a;
        djxsVar3.n.o(djxsVar3.m, ezez.RCS_PROVISIONING_CONFIGURED_STATE, djvk.h(g), g.d(), djxsVar3.l, new djro(djxsVar3.h));
        if (g.R()) {
            djxs djxsVar4 = this.a;
            djxsVar4.s.b(g, djxsVar4.h);
            this.a.ar(31);
            this.a.z.d("Successfully provisioned. Invoke success", new Object[0]);
            djxs djxsVar5 = this.a;
            djxsVar5.n.p(djxsVar5.m, ezez.RCS_PROVISIONING_CONFIGURED_STATE, 9, djxsVar5.l, new djro(djxsVar5.h));
            final dkom dkomVar = new dkom();
            dkomVar.a = 30050;
            if (((Boolean) diyr.a().b.b.a()).booleanValue()) {
                String A = g.A();
                if (!TextUtils.isEmpty(A)) {
                    String str = g.n().mPublicIdentity;
                    if (!TextUtils.isEmpty(str)) {
                        dkomVar.c = A;
                        dkomVar.b = dkut.k(str, this.a.x);
                        dkomVar.d = this.a.r.e();
                    }
                }
            }
            dkomVar.e = g.i().chatbotDirectoryUrl;
            this.a.o.ifPresent(new Consumer() { // from class: djvy
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    ((dips) obj).a(dkom.this.a(), dkuj.PROVISIONING_ENGINE_STATE_MACHINE);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            this.a.K.ifPresent(new Consumer() { // from class: djvz
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    ((djtd) obj).o(1, djwa.this.a.h);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            if (this.a.l().booleanValue()) {
                djxs djxsVar6 = this.a;
                cmoi.a(djxsVar6.m, 2, djxsVar6.i);
            }
            dkgb.b();
            dkgb.a(this.a.m, 4);
        } else {
            if (!((dixo) this.a.V.b()).a() && ((diws) this.a.T.b()).a() && this.a.ab() && !g.Q() && g.e() == 0 && !dkvy.d(this.a.m)) {
                ((cmpv) this.a.U.b()).a(this.a.h);
            }
            this.a.z.d("Provisioned with disabled config (version <= 0). Invoke failure", new Object[0]);
            djxs djxsVar7 = this.a;
            djxsVar7.n.p(djxsVar7.m, ezez.RCS_PROVISIONING_CONFIGURED_STATE, 10, djxsVar7.l, new djro(djxsVar7.h));
            this.a.C();
            if (this.a.l().booleanValue()) {
                djxs djxsVar8 = this.a;
                cmoi.a(djxsVar8.m, 6, djxsVar8.i);
            }
            dkgb.b();
            dkgb.a(this.a.m, 2);
        }
        if (l == null) {
            djxs djxsVar9 = this.a;
            Optional i = djxsVar9.u.i(djxsVar9.h);
            if (i.isPresent() && ((djtp) i.get()).W()) {
                this.a.z.d("trigger MSG_REFRESH_CONFIG by Configuration resetClient", new Object[0]);
                this.a.K(djta.MSG_REFRESH_CONFIG);
            }
        }
        this.a.ap(true != g.R() ? 10 : 3);
        ((dkdw) this.a.M.b()).M(this.a.h);
    }

    @Override // defpackage.djxb
    public final djta f() {
        return djta.MSG_TRANSITION_TO_CONFIGURED;
    }

    @Override // defpackage.djxb
    public final ezez g() {
        return ezez.RCS_PROVISIONING_CONFIGURED_STATE;
    }

    @Override // defpackage.djxb
    public final boolean h() {
        return true;
    }

    @Override // defpackage.djxb
    public final boolean i() {
        djtp g = this.a.g();
        if (!g.Z()) {
            return false;
        }
        djxs djxsVar = this.a;
        ezez ezezVar = ezez.RCS_PROVISIONING_CONFIGURED_STATE;
        int h = djvk.h(g);
        int d = g.d();
        djxs djxsVar2 = this.a;
        djxsVar.n.o(djxsVar.m, ezezVar, h, d, djxsVar2.l, new djro(djxsVar2.h));
        this.a.O(this);
        return true;
    }

    @Override // defpackage.djxb
    public final boolean j() {
        return false;
    }

    @Override // defpackage.djyw
    public final boolean k(Message message, djta djtaVar) {
        this.a.D("ConfiguredState", message);
        if (djxs.ak(message).ordinal() != 11) {
            return super.o(message, djtaVar);
        }
        this.a.ao();
        this.a.Q(ezdc.CONFIGURED_STAGE);
        this.a.ar(48);
        djxs djxsVar = this.a;
        djxsVar.R(djxsVar.ad);
        return true;
    }
}
