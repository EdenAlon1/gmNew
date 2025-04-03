package defpackage;

import android.content.Context;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.ComplianceOptions;
import com.google.android.gms.inappreach.internal.IInAppReachService;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ebhl implements ljv {
    final /* synthetic */ ebhn a;

    public ebhl(ebhn ebhnVar) {
        this.a = ebhnVar;
    }

    @Override // defpackage.ljv
    public final void f(lkr lkrVar) {
        ebhn ebhnVar = this.a;
        dgqq dgqqVar = ebhnVar.c;
        final dgsh dgshVar = (dgsh) dgqqVar;
        dgsc.b.c(ebhnVar.b, new emwl() { // from class: dgrq
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return dgsh.this.k(dftq.a(dgsc.a, "accountMessagesListener"), 28008);
            }
        });
    }

    @Override // defpackage.ljv
    public final void ha(lkr lkrVar) {
        ebhn ebhnVar = this.a;
        final dgsh dgshVar = (dgsh) ebhnVar.c;
        dgsc.b.b(ebhnVar.b, new emwl() { // from class: dgrt
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                final dgqs dgqsVar = (dgqs) obj;
                dgsb dgsbVar = dgsc.a;
                final dgsh dgshVar2 = dgsh.this;
                dftp f = dgshVar2.f(dgsbVar, "accountMessagesListener");
                final dgry dgryVar = new dgry(f);
                dfuf dfufVar = new dfuf() { // from class: dgru
                    @Override // defpackage.dfuf
                    public final void a(Object obj2, Object obj3) {
                        dgsf dgsfVar = (dgsf) obj2;
                        dgsb dgsbVar2 = dgsc.a;
                        dgsa dgsaVar = new dgsa((dhri) obj3);
                        Context context = dgsfVar.c;
                        ComplianceOptions complianceOptions = new ComplianceOptions(-1, -1, 0, true);
                        ((IInAppReachService) dgsfVar.w()).registerAccountMessagesListener(dgsaVar, dgsh.this.c.getPackageName(), dgryVar, new ApiMetadata(complianceOptions));
                    }
                };
                dfuf dfufVar2 = new dfuf() { // from class: dgrv
                    @Override // defpackage.dfuf
                    public final void a(Object obj2, Object obj3) {
                        dgsf dgsfVar = (dgsf) obj2;
                        dgsb dgsbVar2 = dgsc.a;
                        dgrz dgrzVar = new dgrz((dhri) obj3);
                        Context context = dgsfVar.c;
                        ((IInAppReachService) dgsfVar.w()).unregisterAccountMessagesListener(dgrzVar, dgsh.this.c.getPackageName(), new ApiMetadata(new ComplianceOptions(-1, -1, 0, true)));
                    }
                };
                dfud dfudVar = new dfud();
                dfudVar.c = f;
                dfudVar.d = new Feature[]{dgqa.b};
                dfudVar.a = dfufVar;
                dfudVar.b = dfufVar2;
                dfudVar.e = 28007;
                dhre j = dgshVar2.j(dfudVar.a());
                j.t(new dhqv() { // from class: dgrw
                    @Override // defpackage.dhqv
                    public final void d(Exception exc) {
                        dgsc.b.c(dgqs.this, new emwl() { // from class: dgro
                            @Override // defpackage.emwl
                            public final Object apply(Object obj2) {
                                dgsb dgsbVar2 = dgsc.a;
                                return dhrt.c(true);
                            }
                        });
                    }
                });
                j.r(new dhqp() { // from class: dgrn
                    @Override // defpackage.dhqp
                    public final void a() {
                        dgsc.b.c(dgqs.this, new emwl() { // from class: dgrr
                            @Override // defpackage.emwl
                            public final Object apply(Object obj2) {
                                dgsb dgsbVar2 = dgsc.a;
                                return dhrt.c(true);
                            }
                        });
                    }
                });
                return j;
            }
        });
        ebhn ebhnVar2 = this.a;
        if (ebhnVar2.k != null) {
            dgqq dgqqVar = ebhnVar2.c;
            dgqt dgqtVar = (dgqt) dgqu.a.createBuilder();
            String str = this.a.k;
            dgqtVar.copyOnWrite();
            dgqu dgquVar = (dgqu) dgqtVar.instance;
            str.getClass();
            dgquVar.c = str;
            ewpc ewpcVar = (ewpc) ewpe.a.createBuilder();
            ewpcVar.copyOnWrite();
            ewpe ewpeVar = (ewpe) ewpcVar.instance;
            ewpeVar.c = 6;
            ewpeVar.b |= 1;
            dgqtVar.copyOnWrite();
            dgqu dgquVar2 = (dgqu) dgqtVar.instance;
            ewpe ewpeVar2 = (ewpe) ewpcVar.build();
            ewpeVar2.getClass();
            dgquVar2.d = ewpeVar2;
            dgquVar2.b |= 1;
            ebhn ebhnVar3 = this.a;
            dgqtVar.copyOnWrite();
            dgqu dgquVar3 = (dgqu) dgqtVar.instance;
            String str2 = ebhnVar3.e;
            str2.getClass();
            dgquVar3.b |= 2;
            dgquVar3.e = str2;
            dgsc.a((dgqu) dgqtVar.build(), (dgsh) dgqqVar);
            this.a.k = null;
        }
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void c(lkr lkrVar) {
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void d(lkr lkrVar) {
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void ff(lkr lkrVar) {
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void gZ(lkr lkrVar) {
    }
}
