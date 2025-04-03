package defpackage;

import android.content.Context;
import com.google.android.gms.common.Feature;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crpn implements croi {
    public static final cskc a = cskc.g("BugleCms", "GmsKeyRetrievalClientImpl");
    public final Context b;
    public final dfpi c;
    public final dfhm d;
    private final ffhd e;

    public crpn(Context context, ffhd ffhdVar, dfpi dfpiVar, croj crojVar) {
        this.b = context;
        this.e = ffhdVar;
        this.c = dfpiVar;
        dfgo dfgoVar = new dfgo();
        dfgoVar.a = crojVar.d;
        dfwv.o(dfgoVar.a, "A valid security domain is required.");
        dfgp dfgpVar = new dfgp(dfgoVar);
        dfqt dfqtVar = dfgn.c;
        this.d = new dfhm(context, dfgpVar);
    }

    @Override // defpackage.croi
    public final elfl a(String str) {
        str.getClass();
        dfun dfunVar = new dfun();
        dfunVar.a = new dfhf(str);
        dfunVar.b = new Feature[]{dfiu.a};
        dfunVar.c = 1581;
        dhre i = this.d.i(dfunVar.a());
        final ffji ffjiVar = new ffji() { // from class: crpg
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                crpn.a.p("getKeyMaterial Succeeded.");
                return ffcu.a;
            }
        };
        i.a(new dhqy() { // from class: crpi
            @Override // defpackage.dhqy
            public final void e(Object obj) {
                ffji.this.invoke(obj);
            }
        });
        i.t(new dhqv() { // from class: crpj
            @Override // defpackage.dhqv
            public final void d(Exception exc) {
                csjb e = crpn.a.e();
                e.I("getKeyMaterial Failed.");
                e.s(exc);
            }
        });
        elfl g = elfl.g(duin.a(i));
        g.getClass();
        return g;
    }

    @Override // defpackage.croi
    public final elfl b(final String str) {
        str.getClass();
        dfun dfunVar = new dfun();
        dfunVar.a = new dfhd(str);
        dfunVar.b = new Feature[]{dfiu.a};
        dfunVar.c = 1580;
        dhre i = this.d.i(dfunVar.a());
        final ffji ffjiVar = new ffji() { // from class: croq
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                int intValue = ((Integer) obj).intValue();
                csjb c = crpn.a.c();
                c.I("getSyncStatus Succeeded.");
                c.y("syncStatus", intValue);
                c.r();
                return ffcu.a;
            }
        };
        i.a(new dhqy() { // from class: cror
            @Override // defpackage.dhqy
            public final void e(Object obj) {
                ffji.this.invoke(obj);
            }
        });
        i.t(new dhqv() { // from class: cros
            @Override // defpackage.dhqv
            public final void d(Exception exc) {
                if (ffkj.e(str, "FAKE ACCOUNT")) {
                    crpn.a.p("getSyncStatus Failed with the fake account workaround.");
                    return;
                }
                csjb e = crpn.a.e();
                e.I("getSyncStatus Failed.");
                e.s(exc);
            }
        });
        elfl g = elfl.g(duin.a(i));
        g.getClass();
        return g;
    }

    @Override // defpackage.croi
    public final elfl c(String str) {
        str.getClass();
        dfun dfunVar = new dfun();
        dfunVar.a = new dfgy(str);
        dfunVar.b = new Feature[]{dfiu.f};
        dfunVar.c = 1661;
        dhre i = this.d.i(dfunVar.a());
        final ffji ffjiVar = new ffji() { // from class: crph
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                crpn.a.p("listSecurityDomainMembers Succeeded.");
                return ffcu.a;
            }
        };
        i.a(new dhqy() { // from class: crpk
            @Override // defpackage.dhqy
            public final void e(Object obj) {
                ffji.this.invoke(obj);
            }
        });
        i.t(new dhqv() { // from class: crpl
            @Override // defpackage.dhqv
            public final void d(Exception exc) {
                csjb e = crpn.a.e();
                e.I("listSecurityDomainMembers Failed.");
                e.s(exc);
            }
        });
        elfl g = elfl.g(duin.a(i));
        g.getClass();
        return g;
    }

    @Override // defpackage.croi
    public final elfl d(String str) {
        str.getClass();
        dfun dfunVar = new dfun();
        dfunVar.a = new dfgw(str);
        dfunVar.b = new Feature[]{dfiu.f};
        dfunVar.c = 1658;
        dhre i = this.d.i(dfunVar.a());
        final ffji ffjiVar = new ffji() { // from class: crpd
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                crpn.a.p("resetSecurityDomain Succeeded.");
                return ffcu.a;
            }
        };
        i.a(new dhqy() { // from class: crpe
            @Override // defpackage.dhqy
            public final void e(Object obj) {
                ffji.this.invoke(obj);
            }
        });
        i.t(new dhqv() { // from class: crpf
            @Override // defpackage.dhqv
            public final void d(Exception exc) {
                csjb e = crpn.a.e();
                e.I("resetSecurityDomain Failed.");
                e.s(exc);
            }
        });
        elfl g = elfl.g(duin.a(i));
        g.getClass();
        return g;
    }

    @Override // defpackage.croi
    public final elfl e(String str, final boolean z) {
        str.getClass();
        dfun dfunVar = new dfun();
        dfunVar.a = new dfhb(str, z);
        dfunVar.b = new Feature[]{dfiu.a};
        dfunVar.c = 1579;
        dhre i = this.d.i(dfunVar.a());
        final ffji ffjiVar = new ffji() { // from class: crom
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                csjb c = crpn.a.c();
                c.I("setConsent Succeeded.");
                c.B("consent", z);
                c.r();
                return ffcu.a;
            }
        };
        i.a(new dhqy() { // from class: cron
            @Override // defpackage.dhqy
            public final void e(Object obj) {
                ffji.this.invoke(obj);
            }
        });
        i.t(new dhqv() { // from class: croo
            @Override // defpackage.dhqv
            public final void d(Exception exc) {
                csjb e = crpn.a.e();
                e.I("setConsent Failed.");
                e.s(exc);
            }
        });
        elfl g = elfl.g(duin.a(i));
        g.getClass();
        return g;
    }

    @Override // defpackage.croi
    public final Object f(ffgu ffguVar) {
        return ffra.a(ekxi.a(this.e), new crpm(null, this), ffguVar);
    }
}
