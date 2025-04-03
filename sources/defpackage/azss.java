package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class azss implements emyl {
    final /* synthetic */ cosz a;
    final /* synthetic */ djrj b;

    public azss(cosz coszVar, djrj djrjVar) {
        this.a = coszVar;
        this.b = djrjVar;
    }

    @Override // defpackage.emyl
    public final /* bridge */ /* synthetic */ Object get() {
        entd entdVar = azst.a;
        cosz coszVar = this.a;
        int i = coszVar.d;
        String str = coszVar.n;
        str.getClass();
        aztp aztpVar = (aztp) ffdx.U(azsh.a(i, str));
        if ((aztpVar != null ? aztpVar.e() : null) == null) {
            ensz enszVar = (ensz) azst.a.j();
            enszVar.Y(csux.t, Integer.valueOf(this.a.d));
            enszVar.Y(csux.u, this.a.n);
            enszVar.q("No Subscription record found matching the given subId and iccId");
            return false;
        }
        String[] strArr = azoi.a;
        azof azofVar = new azof();
        azofVar.ap("MyIdentityTablesOperations#updateVerifiedAddress");
        azofVar.f(new azsr(aztpVar, this.a));
        azofVar.d(this.b.a);
        int intValue = azoi.c().intValue();
        int intValue2 = azoi.c().intValue();
        if (intValue2 < 60320) {
            dtub.w("is_verified", intValue2);
        }
        if (intValue >= 60320) {
            azofVar.a.put("is_verified", (Boolean) true);
        }
        int e = azofVar.b().e();
        if (e > 0) {
            ensz enszVar2 = (ensz) azst.a.h();
            enszVar2.Y(csux.aa, this.a.c);
            enszVar2.Y(csux.E, this.b.a);
            enszVar2.q("Updated MyIdentity with verified address");
        }
        final azsu e2 = aztpVar.e();
        e2.getClass();
        final String str2 = this.a.c;
        str2.getClass();
        azof azofVar2 = new azof();
        azofVar2.ap("MyIdentityTablesOperations#removeProvisioningIds");
        azofVar2.f(new Function() { // from class: azsf
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                azoh azohVar = (azoh) obj;
                azohVar.aq(new dtrt("my_identities.token", 2, azsv.b(azsu.this)));
                azohVar.b(str2);
                return azohVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        azofVar2.a.putNull("provisioning_id");
        azofVar2.b().e();
        return Boolean.valueOf(e > 0);
    }
}
