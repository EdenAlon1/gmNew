package defpackage;

import android.os.Message;
import j$.util.Optional;
import java.net.MalformedURLException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djwl extends djxb {
    final /* synthetic */ djxs a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public djwl(djxs djxsVar) {
        super(djxsVar);
        this.a = djxsVar;
    }

    private final void q() {
        boolean booleanValue;
        String str;
        if (djai.z() && djai.ab()) {
            djxs djxsVar = this.a;
            booleanValue = djxsVar.Y.c(djxsVar.h).L;
        } else {
            booleanValue = ((Boolean) dimn.E().o().a()).booleanValue();
        }
        try {
            str = this.a.q();
        } catch (MalformedURLException e) {
            this.a.z.f(e, "failed to get ACS URL for ProvisioningSuccessData", new Object[0]);
            str = "";
            booleanValue = false;
        }
        cmbd cmbdVar = (cmbd) cmbe.a.createBuilder();
        cmbdVar.copyOnWrite();
        cmbe cmbeVar = (cmbe) cmbdVar.instance;
        cmbeVar.b |= 1;
        cmbeVar.c = booleanValue;
        cmbdVar.copyOnWrite();
        cmbe cmbeVar2 = (cmbe) cmbdVar.instance;
        str.getClass();
        cmbeVar2.b |= 2;
        cmbeVar2.d = str;
        djxs djxsVar2 = this.a;
        cmbdVar.copyOnWrite();
        cmbe cmbeVar3 = (cmbe) cmbdVar.instance;
        String str2 = djxsVar2.j;
        str2.getClass();
        cmbeVar3.b |= 4;
        cmbeVar3.e = str2;
        djxs djxsVar3 = this.a;
        cmbdVar.copyOnWrite();
        cmbe cmbeVar4 = (cmbe) cmbdVar.instance;
        String str3 = djxsVar3.h;
        str3.getClass();
        cmbeVar4.b |= 8;
        cmbeVar4.f = str3;
        cmbe cmbeVar5 = (cmbe) cmbdVar.build();
        djxs djxsVar4 = this.a;
        try {
            djxsVar4.u.b.o(dksa.g("provisioning_success_data_for_sim_", djxsVar4.h), cmbeVar5);
        } catch (dksb e2) {
            dkty.j(e2, dkcp.a, "Error while putting provisioningSuccessData into Bugle storage for SIM", new Object[0]);
        }
        djxs djxsVar5 = this.a;
        try {
            djxsVar5.u.b.o(dksa.g("provisioning_success_data_for_imsi_", djxsVar5.j), cmbeVar5);
        } catch (dksb e3) {
            dkty.j(e3, dkcp.a, "Error while putting provisioningSuccessData into Bugle storage for IMSI", new Object[0]);
        }
    }

    @Override // defpackage.djyw, defpackage.dixy
    public final String a() {
        return "ProcessConfigurationState";
    }

    @Override // defpackage.djxb, defpackage.dixy
    public final void b() {
        super.b();
        this.a.y(ezdc.PROCESS_CONFIGURATION_STAGE);
    }

    @Override // defpackage.djxb
    public final djta f() {
        return djta.MSG_TRANSITION_TO_PROCESS_CONFIGURATION;
    }

    @Override // defpackage.djxb
    public final ezez g() {
        return ezez.RCS_PROVISIONING_PROCESS_CONFIGURATION_STATE;
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
        this.a.D("ProcessConfigurationState", message);
        if (djxs.ak(message).ordinal() != 12) {
            return super.o(message, djtaVar);
        }
        djtp djtpVar = (djtp) message.obj;
        try {
            djxs djxsVar = this.a;
            String f = djxsVar.r.f();
            int i = djxsVar.h.isEmpty() ? 2 : f.isEmpty() ? 3 : djxsVar.h.equals(f) ? 4 : 5;
            Optional of = Optional.of(djxsVar.h);
            dkdv dkdvVar = djxsVar.v;
            if (!dkdvVar.j(dkdvVar.e(of))) {
                long longValue = dkvj.a().longValue();
                ezcx ezcxVar = (ezcx) ezcy.a.createBuilder();
                ezcxVar.copyOnWrite();
                ezcy ezcyVar = (ezcy) ezcxVar.instance;
                ezcyVar.c = i - 1;
                ezcyVar.b |= 1;
                ezcy ezcyVar2 = (ezcy) ezcxVar.build();
                final ezcw ezcwVar = (ezcw) ezcz.a.createBuilder();
                ezcwVar.copyOnWrite();
                ezcz ezczVar = (ezcz) ezcwVar.instance;
                ezczVar.c = 25;
                ezczVar.b |= 1;
                ezcwVar.copyOnWrite();
                ezcz ezczVar2 = (ezcz) ezcwVar.instance;
                ezczVar2.b = 2 | ezczVar2.b;
                ezczVar2.d = longValue;
                ezcwVar.copyOnWrite();
                ezcz ezczVar3 = (ezcz) ezcwVar.instance;
                ezcyVar2.getClass();
                ezczVar3.f = ezcyVar2;
                ezczVar3.b |= 8;
                dkdvVar.s(new emwl() { // from class: dkdm
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        enhk enhkVar = dkdv.a;
                        return dkdv.b((ezdn) obj, (ezcz) ezcw.this.build());
                    }
                }, of);
            }
            djxs djxsVar2 = this.a;
            djtp a = djxsVar2.s.a(djtpVar, ezez.RCS_PROVISIONING_PROCESS_CONFIGURATION_STATE, djxsVar2.l, djxsVar2.n, djxsVar2.h);
            q();
            if (this.a.s.f(djtpVar, a)) {
                this.a.I();
                djxs djxsVar3 = this.a;
                djxsVar3.R(djxsVar3.av);
            } else {
                if (((dixo) this.a.V.b()).a() && ((diws) this.a.T.b()).a() && this.a.ab() && !a.Q() && a.e() == 0 && !dkvy.d(this.a.m)) {
                    ((cmpv) this.a.U.b()).a(this.a.h);
                }
                djxs djxsVar4 = this.a;
                djxsVar4.R(djxsVar4.as);
            }
            return true;
        } catch (dksb e) {
            this.a.v.o(43);
            this.a.z.f(e, "persistConfigFile by RcsUserId fail, abort the provisioning and transition to retryState", new Object[0]);
            djxs djxsVar5 = this.a;
            djxsVar5.R(djxsVar5.al);
            return true;
        }
    }
}
