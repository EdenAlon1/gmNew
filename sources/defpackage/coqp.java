package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class coqp implements cora {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/simstatetracker/SharedPreferencesSimStateStore");
    private final dkpp b;
    private final ffbr c;

    public coqp(dkpp dkppVar, ffbr ffbrVar) {
        dkppVar.getClass();
        ffbrVar.getClass();
        this.b = dkppVar;
        this.c = ffbrVar;
    }

    private final String p(cosz coszVar, cors corsVar) {
        String str;
        return (coszVar == null || (str = coszVar.c) == null) ? q(b(corsVar)) : str;
    }

    private static final String q(cosz coszVar) {
        String str;
        if (coszVar != null && (str = coszVar.c) != null) {
            return str;
        }
        ((enrr) a.j().h("com/google/android/apps/messaging/shared/simstatetracker/SharedPreferencesSimStateStore", "getSimIdOrEmpty", 50, "SharedPreferencesSimStateStore.kt")).q("SharedPreferencesSimStateStore: can't get simId for null SimSubscriptionInfo when setting PhoneDefaults.");
        return "";
    }

    @Override // defpackage.cora
    public final cost a() {
        coss cossVar = (coss) cost.a.createBuilder();
        cossVar.getClass();
        cosu.b(q(this.b.d()), cossVar);
        cosu.e(q(this.b.e()), cossVar);
        cosu.c(q(this.b.c()), cossVar);
        cosu.d(q(this.b.d()), cossVar);
        return cosu.a(cossVar);
    }

    @Override // defpackage.cora
    public final cosz b(cors corsVar) {
        corsVar.getClass();
        int ordinal = corsVar.ordinal();
        if (ordinal == 0) {
            return this.b.d();
        }
        if (ordinal == 1) {
            return this.b.e();
        }
        if (ordinal == 2) {
            return this.b.c();
        }
        throw new ffcd();
    }

    @Override // defpackage.cora
    public final cosz c(djrm djrmVar) {
        djrmVar.getClass();
        cosz f = this.b.f(djrn.a(djrmVar).a);
        if (f == null) {
            ((enrr) a.j().h("com/google/android/apps/messaging/shared/simstatetracker/SharedPreferencesSimStateStore", "getSimSubscriptionInfoSync", 62, "SharedPreferencesSimStateStore.kt")).q("SharedPreferencesSimStateStore: No sim subscription info found for RCS provisioning id");
        }
        return f;
    }

    @Override // defpackage.cora
    public final cosz d(int i) {
        cosz u = dkpp.u(this.b.o(a.h(i, "sim_subscription_info_sub_id_")));
        if (u == null) {
            ((enrr) a.j().h("com/google/android/apps/messaging/shared/simstatetracker/SharedPreferencesSimStateStore", "getSimSubscriptionInfoSync-0jkzt_0", 76, "SharedPreferencesSimStateStore.kt")).r("SharedPreferencesSimStateStore: No sim subscription info found for subscription id: %s", i);
        }
        return u;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Iterable, java.lang.Object] */
    @Override // defpackage.cora
    public final Set e() {
        ?? d = this.b.q.d();
        d.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = d.iterator();
        while (it.hasNext()) {
            cosz f = this.b.f((String) it.next());
            if (f == null) {
                ((enrr) a.j().h("com/google/android/apps/messaging/shared/simstatetracker/SharedPreferencesSimStateStore", "getActiveSimSubscriptionInfosSync", 102, "SharedPreferencesSimStateStore.kt")).q("SharedPreferencesSimStateStore: No sim subscription info found for active sim id");
            }
            if (f != null) {
                arrayList.add(f);
            }
        }
        return ffdx.ar(arrayList);
    }

    @Override // defpackage.cora
    public final Object f(cosr cosrVar) {
        this.b.s("sim_loggable_guid_".concat(String.valueOf(cosrVar.c)), cosrVar.d);
        return ffcu.a;
    }

    @Override // defpackage.cora
    public final Object g() {
        return e();
    }

    @Override // defpackage.cora
    public final Object h(cors corsVar) {
        return b(corsVar);
    }

    @Override // defpackage.cora
    public final Object i(String str) {
        String o = this.b.o("sim_loggable_guid_".concat(str));
        if (true == o.isEmpty()) {
            o = null;
        }
        if (o != null) {
            return o;
        }
        ((enrr) a.j().h("com/google/android/apps/messaging/shared/simstatetracker/SharedPreferencesSimStateStore", "getLoggableGuidSync", 114, "SharedPreferencesSimStateStore.kt")).q("SharedPreferencesSimStateStore: No loggable guid found for sim id");
        return null;
    }

    @Override // defpackage.cora
    public final Object j() {
        return a();
    }

    @Override // defpackage.cora
    public final Object k(djrm djrmVar) {
        return c(djrmVar);
    }

    @Override // defpackage.cora
    public final Object l(int i) {
        return d(i);
    }

    @Override // defpackage.cora
    public final Object m(cost costVar) {
        costVar.getClass();
        cosz f = this.b.f(costVar.c);
        cosz f2 = this.b.f(costVar.d);
        cosz f3 = this.b.f(costVar.e);
        if (f != null) {
            dkpp dkppVar = this.b;
            dkppVar.n.e(dkpp.v(f));
        }
        if (f2 != null) {
            dkpp dkppVar2 = this.b;
            dkppVar2.o.e(dkpp.v(f2));
        }
        if (f3 != null) {
            dkpp dkppVar3 = this.b;
            dkppVar3.p.e(dkpp.v(f3));
        }
        coss cossVar = (coss) cost.a.createBuilder();
        cossVar.getClass();
        cosu.b(p(f, cors.a), cossVar);
        cosu.e(p(f2, cors.b), cossVar);
        cosu.c(p(f3, cors.c), cossVar);
        cosu.d(p(f, cors.a), cossVar);
        return cosu.a(cossVar);
    }

    @Override // defpackage.cora
    public final Object n(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            this.b.r((cosz) it.next());
        }
        dkpp dkppVar = this.b;
        ArrayList arrayList = new ArrayList(ffdx.n(set, 10));
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            arrayList.add(((cosz) it2.next()).c);
        }
        dkppVar.q(ffdx.ar(arrayList));
        return ffcu.a;
    }

    @Override // defpackage.cora
    public final Object o(Set set, boolean z, eraj erajVar) {
        erajVar.getClass();
        if (z) {
            cosk coskVar = (cosk) this.c.b();
            erai eraiVar = (erai) erak.a.createBuilder();
            eraiVar.getClass();
            eraiVar.copyOnWrite();
            erak erakVar = (erak) eraiVar.instance;
            erakVar.c = erajVar.a();
            erakVar.b |= 1;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                cosz coszVar = (cosz) it.next();
                eqsc eqscVar = (eqsc) eqsd.a.createBuilder();
                eqscVar.getClass();
                int i = coszVar.d;
                eqscVar.copyOnWrite();
                eqsd eqsdVar = (eqsd) eqscVar.instance;
                eqsdVar.b |= 1;
                eqsdVar.c = i;
                int i2 = coszVar.e;
                eqscVar.copyOnWrite();
                eqsd eqsdVar2 = (eqsd) eqscVar.instance;
                eqsdVar2.b |= 2;
                eqsdVar2.d = i2;
                String str = coszVar.h;
                str.getClass();
                eqscVar.copyOnWrite();
                eqsd eqsdVar3 = (eqsd) eqscVar.instance;
                eqsdVar3.b |= 4;
                eqsdVar3.e = str;
                String str2 = coszVar.j;
                str2.getClass();
                String ad = ffpc.ad(str2, 5);
                eqscVar.copyOnWrite();
                eqsd eqsdVar4 = (eqsd) eqscVar.instance;
                eqsdVar4.b |= 16;
                eqsdVar4.f = ad;
                String str3 = coszVar.k;
                str3.getClass();
                eqscVar.copyOnWrite();
                eqsd eqsdVar5 = (eqsd) eqscVar.instance;
                eqsdVar5.b |= 32;
                eqsdVar5.g = str3;
                String str4 = coszVar.l;
                str4.getClass();
                eqscVar.copyOnWrite();
                eqsd eqsdVar6 = (eqsd) eqscVar.instance;
                eqsdVar6.b |= 64;
                eqsdVar6.h = str4;
                int i3 = coszVar.m;
                eqscVar.copyOnWrite();
                eqsd eqsdVar7 = (eqsd) eqscVar.instance;
                eqsdVar7.b |= 128;
                eqsdVar7.i = i3;
                boolean z2 = coszVar.o;
                eqscVar.copyOnWrite();
                eqsd eqsdVar8 = (eqsd) eqscVar.instance;
                eqsdVar8.b |= 256;
                eqsdVar8.j = z2;
                String str5 = coszVar.p;
                str5.getClass();
                String ad2 = ffpc.ad(str5, 5);
                eqscVar.copyOnWrite();
                eqsd eqsdVar9 = (eqsd) eqscVar.instance;
                eqsdVar9.b |= 512;
                eqsdVar9.k = ad2;
                String str6 = coszVar.r;
                str6.getClass();
                eqscVar.copyOnWrite();
                eqsd eqsdVar10 = (eqsd) eqscVar.instance;
                eqsdVar10.b |= 1024;
                eqsdVar10.l = str6;
                String str7 = coszVar.s;
                str7.getClass();
                eqscVar.copyOnWrite();
                eqsd eqsdVar11 = (eqsd) eqscVar.instance;
                eqsdVar11.b |= 2048;
                eqsdVar11.m = str7;
                String str8 = coszVar.t;
                str8.getClass();
                eqscVar.copyOnWrite();
                eqsd eqsdVar12 = (eqsd) eqscVar.instance;
                eqsdVar12.b |= 4096;
                eqsdVar12.n = str8;
                String str9 = coszVar.u;
                str9.getClass();
                eqscVar.copyOnWrite();
                eqsd eqsdVar13 = (eqsd) eqscVar.instance;
                eqsdVar13.b |= 8192;
                eqsdVar13.o = str9;
                eyfy build = eqscVar.build();
                build.getClass();
                eqsd eqsdVar14 = (eqsd) build;
                eraiVar.copyOnWrite();
                erak erakVar2 = (erak) eraiVar.instance;
                eygr eygrVar = erakVar2.d;
                if (!eygrVar.c()) {
                    erakVar2.d = eyfy.mutableCopy(eygrVar);
                }
                erakVar2.d.add(eqsdVar14);
            }
            erad eradVar = (erad) erae.a.createBuilder();
            eradVar.getClass();
            eraf.b(8, eradVar);
            erak erakVar3 = (erak) eraiVar.build();
            erakVar3.getClass();
            eradVar.copyOnWrite();
            erae eraeVar = (erae) eradVar.instance;
            eraeVar.f = erakVar3;
            eraeVar.b |= 256;
            erae a2 = eraf.a(eradVar);
            eolu eoluVar = (eolu) eolv.a.createBuilder();
            eolt eoltVar = eolt.SIM_STATE_TRACKER_EVENT;
            eoluVar.copyOnWrite();
            eolv eolvVar = (eolv) eoluVar.instance;
            eolvVar.j = eoltVar.dk;
            eolvVar.b |= 1;
            eoluVar.copyOnWrite();
            eolv eolvVar2 = (eolv) eoluVar.instance;
            eolvVar2.bI = a2;
            eolvVar2.g |= 8192;
            ((akyb) coskVar.a.b()).a().h(eoluVar, alal.LOG_SPEC_SIM_SUBSCRIPTION_INFOS_UPDATE_EVENT);
        }
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            this.b.r((cosz) it2.next());
        }
        dkpp dkppVar = this.b;
        ArrayList arrayList = new ArrayList(ffdx.n(set, 10));
        Iterator it3 = set.iterator();
        while (it3.hasNext()) {
            arrayList.add(((cosz) it3.next()).c);
        }
        dkppVar.q(ffdx.ar(arrayList));
        return ffcu.a;
    }
}
