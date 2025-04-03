package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djyb implements dksm {
    private final djwi a;

    public djyb(djwi djwiVar) {
        this.a = djwiVar;
    }

    @Override // defpackage.dksm
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        cmbc cmbcVar = (cmbc) obj;
        if (cmbcVar != null) {
            djwk djwkVar = this.a.a;
            djxs djxsVar = djwkVar.a;
            int i = cmbcVar.d;
            int i2 = djxsVar.i;
            if (i == i2 || (djxsVar.ab() && djwkVar.a.I.s(i, i2))) {
                djwkVar.a.L(djta.MSG_RECEIVED_OTP, cmbcVar.c);
                return;
            }
            String str = (String) djwkVar.a.I.g(cmbcVar.d, false).map(new Function() { // from class: djwj
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj2) {
                    return djrn.a((djrm) obj2).a;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).orElse("");
            if (djwkVar.a.h.isEmpty()) {
                ensk j = djxs.e.j();
                j.Y(ente.a, "BugleRcsProvisioning");
                ((enrr) ((enrr) j).h("com/google/android/ims/provisioning/engine/ProvisioningEngineStateMachine$InProgressState", "storeManuallyEnteredMsisdnAndOtpForOtherSim", 2238, "ProvisioningEngineStateMachine.java")).q("PESM: No SimId found for subId of the provisioning OTP when storing manually entered MSISDN.");
            } else {
                djxs djxsVar2 = djwkVar.a;
                String n = djxsVar2.u.n(djxsVar2.h);
                if (n == null) {
                    n = "";
                }
                dkcp dkcpVar = djxsVar2.u;
                try {
                    dkcpVar.b.j("manual_msisdn_entered_phone_number_for_sim_".concat(String.valueOf(str)), n, "bugle");
                } catch (dksb e) {
                    dkty.j(e, dkcp.a, "Error while storing manually entered MSISDN from Bugle's ContentProvider", new Object[0]);
                }
                ((dkdw) dkcpVar.d.b()).v(str, n);
                djwkVar.a.u.s(str, cmbcVar);
            }
            djxs djxsVar3 = djwkVar.a;
            dkcp dkcpVar2 = djxsVar3.u;
            String str2 = djxsVar3.h;
            try {
                dkcpVar2.b.j("manual_msisdn_entered_phone_number_for_sim_".concat(String.valueOf(str2)), "", "bugle");
            } catch (dksb e2) {
                dkcpVar2.F(6);
                dkty.j(e2, dkcp.a, "Error while clearing manually entered MSISDN from Bugle's ContentProvider", new Object[0]);
            }
            ((dkdw) dkcpVar2.d.b()).v(str2, "");
            djxs djxsVar4 = djwkVar.a;
            djxsVar4.u.s(djxsVar4.h, cmbc.a);
        }
    }
}
