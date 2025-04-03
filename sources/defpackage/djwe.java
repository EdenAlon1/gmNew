package defpackage;

import android.os.Message;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djwe extends djxb {
    final /* synthetic */ djxs a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public djwe(djxs djxsVar) {
        super(djxsVar);
        this.a = djxsVar;
    }

    @Override // defpackage.djyw, defpackage.dixy
    public final String a() {
        return "EnabledState";
    }

    @Override // defpackage.djxb, defpackage.dixy
    public final void b() {
        super.b();
        djxs djxsVar = this.a;
        djxsVar.l = ((dkdw) djxsVar.M.b()).k(this.a.h);
        djxs djxsVar2 = this.a;
        djxsVar2.z.b = djxsVar2.l;
        djxs djxsVar3 = this.a;
        if (djxsVar3.l == null) {
            djxsVar3.ao();
        }
        this.a.K.ifPresent(new Consumer() { // from class: djwd
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ((djtd) obj).n(djwe.this.a.l);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        djxs djxsVar4 = this.a;
        djtc f = djxsVar4.f();
        final String str = djxsVar4.l;
        final Optional of = Optional.of(djxsVar4.h);
        dkty.c("updateProvisioningAttemptMetadata, provisioningSessionId=%s", str);
        final dkdv dkdvVar = djxsVar4.v;
        if (!dkdvVar.j(dkdvVar.e(of))) {
            dkdvVar.s(new emwl() { // from class: dkdk
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    return dkdv.this.d((ezdn) obj, str, of);
                }
            }, of);
        }
        this.a.y(ezdc.ENABLED_STAGE);
        djxs djxsVar5 = this.a;
        djxsVar5.v.l(f, Optional.of(djxsVar5.h));
        djxs djxsVar6 = this.a;
        final int b = ((dkdw) djxsVar6.M.b()).b(this.a.h);
        djxs djxsVar7 = this.a;
        dkdv dkdvVar2 = djxsVar6.v;
        Optional of2 = Optional.of(djxsVar7.h);
        if (!dkdvVar2.j(dkdvVar2.e(of2))) {
            dkdvVar2.r(new dkdu() { // from class: dkcx
                @Override // defpackage.dkdu
                public final void a(ezch ezchVar) {
                    enhk enhkVar = dkdv.a;
                    ezchVar.copyOnWrite();
                    ezcq ezcqVar = (ezcq) ezchVar.instance;
                    ezcq ezcqVar2 = ezcq.a;
                    ezcqVar.b |= 65536;
                    ezcqVar.t = b;
                }
            }, dkdvVar2.e(of2));
        }
        djxs djxsVar8 = this.a;
        dkdv dkdvVar3 = djxsVar8.v;
        final eqws eqwsVar = djxsVar8.W;
        Optional of3 = Optional.of(djxsVar8.h);
        if (!dkdvVar3.j(dkdvVar3.e(of3))) {
            dkdvVar3.r(new dkdu() { // from class: dkct
                @Override // defpackage.dkdu
                public final void a(ezch ezchVar) {
                    enhk enhkVar = dkdv.a;
                    ezchVar.copyOnWrite();
                    ezcq ezcqVar = (ezcq) ezchVar.instance;
                    ezcq ezcqVar2 = ezcq.a;
                    ezcqVar.A = eqws.this.aa;
                    ezcqVar.b |= 16777216;
                }
            }, dkdvVar3.e(of3));
        }
        boolean e = f.e();
        djxs djxsVar9 = this.a;
        if (!djxsVar9.O) {
            String str2 = djxsVar9.I.a().c;
            boolean z = e && str2.equals(this.a.h);
            if (!z) {
                djxs djxsVar10 = this.a;
                djxsVar10.z.e("Can't proceed with provisioning. Trying to provision simId: %s. Current default call simId: %s. Is RCS enabled: %s", dktx.SIM_ID.c(djxsVar10.h), dktx.SIM_ID.c(str2), Boolean.valueOf(e));
            }
            e = z;
        }
        if (e) {
            if (djai.V()) {
                djtp g = this.a.g();
                int max = Math.max(g.e(), 0);
                if (max != g.b()) {
                    this.a.z.a("set rcs state %d", Integer.valueOf(max));
                    g.F(max);
                    djxs djxsVar11 = this.a;
                    djxsVar11.u.t(djxsVar11.h, g);
                }
            }
            n(this.a.af, ezez.RCS_PROVISIONING_CHECK_PRECONDITIONS_STATE);
        } else {
            n(this.a.ae, ezez.RCS_PROVISIONING_DISABLED_STATE);
        }
        dkgb.b();
        dkgb.a(this.a.m, 3);
    }

    @Override // defpackage.djxb
    public final djta f() {
        return djta.MSG_TRANSITION_TO_ENABLED;
    }

    @Override // defpackage.djxb
    public final ezez g() {
        return ezez.RCS_PROVISIONING_ENABLED_STATE;
    }

    @Override // defpackage.djxb
    public final boolean h() {
        return true;
    }

    @Override // defpackage.djxb
    public final boolean j() {
        return true;
    }

    @Override // defpackage.djyw
    public final boolean k(Message message, djta djtaVar) {
        this.a.D("EnabledState", message);
        return super.o(message, djtaVar);
    }
}
