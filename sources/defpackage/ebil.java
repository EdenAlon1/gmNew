package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.ComplianceOptions;
import com.google.android.gms.inappreach.internal.IInAppReachService;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ebil extends ebij {
    private final dgqq h;
    private final dgqr i;
    private final emxc j;
    private String k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ebil(Context context, eave eaveVar, emxc emxcVar) {
        super(eaveVar);
        dgsh dgshVar = new dgsh(context);
        this.h = dgshVar;
        this.j = emxcVar;
        this.i = new dgqr() { // from class: ebik
            /* JADX WARN: Removed duplicated region for block: B:24:0x0235  */
            /* JADX WARN: Removed duplicated region for block: B:27:0x0238 A[SYNTHETIC] */
            @Override // defpackage.dgqr
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void a(java.util.Map r24) {
                /*
                    Method dump skipped, instructions count: 628
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.ebik.a(java.util.Map):void");
            }
        };
    }

    @Override // defpackage.lld
    protected final void h() {
        final dgsh dgshVar = (dgsh) this.h;
        dgrm.b.b(this.i, new emwl() { // from class: dgrf
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                final dgqr dgqrVar = (dgqr) obj;
                dgrl dgrlVar = dgrm.a;
                final dgsh dgshVar2 = dgsh.this;
                dftp f = dgshVar2.f(dgrlVar, "accountHealthListener");
                final dgri dgriVar = new dgri(f);
                dfuf dfufVar = new dfuf() { // from class: dgqv
                    @Override // defpackage.dfuf
                    public final void a(Object obj2, Object obj3) {
                        dgsf dgsfVar = (dgsf) obj2;
                        dgrl dgrlVar2 = dgrm.a;
                        dgrk dgrkVar = new dgrk((dhri) obj3);
                        Context context = dgsfVar.c;
                        ComplianceOptions complianceOptions = new ComplianceOptions(-1, -1, 0, true);
                        ((IInAppReachService) dgsfVar.w()).registerAccountHealthAlertsListener(dgrkVar, dgsh.this.c.getPackageName(), dgriVar, new ApiMetadata(complianceOptions));
                    }
                };
                dfuf dfufVar2 = new dfuf() { // from class: dgqy
                    @Override // defpackage.dfuf
                    public final void a(Object obj2, Object obj3) {
                        dgsf dgsfVar = (dgsf) obj2;
                        dgrl dgrlVar2 = dgrm.a;
                        dgrj dgrjVar = new dgrj((dhri) obj3);
                        Context context = dgsfVar.c;
                        ((IInAppReachService) dgsfVar.w()).unregisterAccountHealthAlertsListener(dgrjVar, dgsh.this.c.getPackageName(), new ApiMetadata(new ComplianceOptions(-1, -1, 0, true)));
                    }
                };
                dfud dfudVar = new dfud();
                dfudVar.c = f;
                dfudVar.d = new Feature[]{dgqa.a};
                dfudVar.a = dfufVar;
                dfudVar.b = dfufVar2;
                dfudVar.e = 28001;
                dhre j = dgshVar2.j(dfudVar.a());
                j.t(new dhqv() { // from class: dgqz
                    @Override // defpackage.dhqv
                    public final void d(Exception exc) {
                        dgrm.b.c(dgqr.this, new emwl() { // from class: dgre
                            @Override // defpackage.emwl
                            public final Object apply(Object obj2) {
                                dgrl dgrlVar2 = dgrm.a;
                                return dhrt.c(true);
                            }
                        });
                    }
                });
                j.r(new dhqp() { // from class: dgra
                    @Override // defpackage.dhqp
                    public final void a() {
                        dgrm.b.c(dgqr.this, new emwl() { // from class: dgrb
                            @Override // defpackage.emwl
                            public final Object apply(Object obj2) {
                                dgrl dgrlVar2 = dgrm.a;
                                return dhrt.c(true);
                            }
                        });
                    }
                });
                return j;
            }
        });
        dfun dfunVar = new dfun();
        dfunVar.b = new Feature[]{dgqa.a};
        dfunVar.a = new dfuf() { // from class: dgqx
            @Override // defpackage.dfuf
            public final void a(Object obj, Object obj2) {
                dgsf dgsfVar = (dgsf) obj;
                dgrl dgrlVar = dgrm.a;
                dgrk dgrkVar = new dgrk((dhri) obj2);
                Context context = dgsfVar.c;
                ((IInAppReachService) dgsfVar.w()).refreshAccountHealthAlerts(dgrkVar, new ApiMetadata(new ComplianceOptions(-1, -1, 0, true)));
            }
        };
        dfunVar.c = 28003;
        ((dfra) this.h).i(dfunVar.a());
        final String str = this.k;
        if (str != null) {
            Object obj = this.h;
            dfun dfunVar2 = new dfun();
            dfunVar2.b = new Feature[]{dgqa.a};
            dfunVar2.a = new dfuf() { // from class: dgrd
                @Override // defpackage.dfuf
                public final void a(Object obj2, Object obj3) {
                    dgsf dgsfVar = (dgsf) obj2;
                    dgrl dgrlVar = dgrm.a;
                    dgrk dgrkVar = new dgrk((dhri) obj3);
                    Context context = dgsfVar.c;
                    ComplianceOptions complianceOptions = new ComplianceOptions(-1, -1, 0, true);
                    ((IInAppReachService) dgsfVar.w()).fetchLatestThreads(dgrkVar, str, new ApiMetadata(complianceOptions));
                }
            };
            dfunVar2.c = 28006;
            ((dfra) obj).i(dfunVar2.a());
            this.k = null;
        }
    }

    @Override // defpackage.lld
    protected final void i() {
        dgqq dgqqVar = this.h;
        final dgsh dgshVar = (dgsh) dgqqVar;
        dgrm.b.c(this.i, new emwl() { // from class: dgrc
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return dgsh.this.k(dftq.a(dgrm.a, "accountHealthListener"), 28002);
            }
        });
    }

    @Override // defpackage.ebij
    public final void s(final String str, dgqp dgqpVar) {
        final String str2 = dgqpVar.b;
        dgrl dgrlVar = dgrm.a;
        dfun dfunVar = new dfun();
        dfunVar.b = new Feature[]{dgqa.a};
        dfunVar.a = new dfuf() { // from class: dgrg
            @Override // defpackage.dfuf
            public final void a(Object obj, Object obj2) {
                dgsf dgsfVar = (dgsf) obj;
                dgrl dgrlVar2 = dgrm.a;
                dgrk dgrkVar = new dgrk((dhri) obj2);
                Context context = dgsfVar.c;
                ComplianceOptions complianceOptions = new ComplianceOptions(-1, -1, 0, true);
                ((IInAppReachService) dgsfVar.w()).markAlertAsSeen(dgrkVar, str, str2, new ApiMetadata(complianceOptions));
            }
        };
        dfunVar.c = 28004;
        ((dfra) this.h).i(dfunVar.a());
    }

    @Override // defpackage.ebij
    protected final void t(eayf eayfVar, View view, boolean z) {
        ewon ewonVar = (ewon) ewop.a.createBuilder();
        int i = ewom.SECURITY_RECENT_SECURITY_EVENTS_SCREEN.qw;
        ewonVar.copyOnWrite();
        ewop ewopVar = (ewop) ewonVar.instance;
        ewopVar.b |= 1;
        ewopVar.c = i;
        ewonVar.a(enhk.q("rfn", eayfVar.c(), "rfnc", eayfVar.d(), "security-event-id", eayfVar.e(), "sa", String.valueOf(z), "ve", String.valueOf(ebip.a(z)), "origin", "8"));
        ewop ewopVar2 = (ewop) ewonVar.build();
        String b = eayfVar.b();
        this.k = b;
        eayn.b(view, b, ewopVar2);
    }
}
