package com.google.android.libraries.messaging.lighter;

import android.content.Context;
import com.google.android.libraries.messaging.lighter.Lighter;
import defpackage.cgjf;
import defpackage.cgjg;
import defpackage.cgjh;
import defpackage.cgji;
import defpackage.cgjj;
import defpackage.dygx;
import defpackage.dygy;
import defpackage.dygz;
import defpackage.dyhl;
import defpackage.dyhr;
import defpackage.dyia;
import defpackage.dyij;
import defpackage.dyik;
import defpackage.dyil;
import defpackage.dyim;
import defpackage.dyis;
import defpackage.dyiu;
import defpackage.dyix;
import defpackage.dyiz;
import defpackage.dyjf;
import defpackage.dykl;
import defpackage.dykr;
import defpackage.dyle;
import defpackage.dylf;
import defpackage.dylh;
import defpackage.dyol;
import defpackage.dyom;
import defpackage.dyon;
import defpackage.dypg;
import defpackage.dypj;
import defpackage.dypr;
import defpackage.dypu;
import defpackage.dyqz;
import defpackage.dyra;
import defpackage.dytg;
import defpackage.dyth;
import defpackage.dyti;
import defpackage.dyxd;
import defpackage.dyxi;
import defpackage.dyyt;
import defpackage.dzci;
import defpackage.dzcm;
import defpackage.dzdc;
import defpackage.dzdd;
import defpackage.dzdk;
import defpackage.dzdo;
import defpackage.dzdp;
import defpackage.dzdv;
import defpackage.dzhn;
import defpackage.dzwz;
import defpackage.ecwj;
import defpackage.emux;
import defpackage.emwl;
import defpackage.emxc;
import defpackage.engw;
import defpackage.enou;
import defpackage.erny;
import defpackage.erpp;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class Lighter implements dygx {
    private static Lighter c;
    public final Context a;
    public final dyim b;
    private final dyjf d;
    private final dzci e;
    private final dyyt f;
    private final dyis g;
    private final dyil h;
    private final dyij i;
    private final dyiu j;
    private final Map k;
    private final dyqz l;
    private final dyik m;
    private final dyiz n;
    private final dzwz o;
    private final dygz optionalLighterPackageInitializer;
    private final dylh p;
    private final dyom q;
    private final dyti r;
    private final dypu s;

    private Lighter(cgjf cgjfVar, Context context, cgjg cgjgVar, cgjh cgjhVar, cgji cgjiVar, cgjj cgjjVar, emxc emxcVar, dygz dygzVar, emxc emxcVar2, emxc emxcVar3, Map map) {
        dyol dyolVar;
        dypg dypgVar;
        dypj dypjVar;
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.d = dyjf.c();
        ecwj.f(applicationContext);
        dyti dytiVar = new dyti(new dyra(applicationContext));
        this.r = dytiVar;
        dytg dytgVar = new dytg(applicationContext, dytiVar);
        this.o = dytgVar;
        if (dyhl.a == null) {
            dyhl.a = new dyhl(map);
        }
        dyyt a = dyyt.a(applicationContext);
        this.f = a;
        dyqz dyqzVar = new dyqz(applicationContext, a, emxcVar3, emxcVar);
        this.l = dyqzVar;
        HashMap hashMap = new HashMap();
        this.k = hashMap;
        dyxd.a();
        dzci dzciVar = new dzci(applicationContext, cgjfVar, new dyxi());
        this.e = dzciVar;
        dzdo dzdoVar = new dzdo(applicationContext, dzciVar, dyjf.c());
        dzdk dzdkVar = new dzdk(dzciVar, applicationContext, hashMap);
        dzdd dzddVar = new dzdd(dzciVar, applicationContext);
        dzdc dzdcVar = new dzdc(dzciVar);
        dzdp dzdpVar = new dzdp(dzciVar);
        dyia.b();
        dypg dypgVar2 = new dypg(hashMap, dzdoVar, dytgVar, cgjgVar, cgjiVar, a, cgjjVar);
        dyol dyolVar2 = new dyol(applicationContext, dzdkVar, dyqzVar, new dylf(dyqzVar), hashMap, a);
        dyle dyleVar = new dyle(applicationContext, dyqzVar, dzddVar, a);
        dypr dyprVar = new dypr(dzdkVar, dyqzVar);
        dykl dyklVar = new dykl(dyqzVar, dzdcVar, new dyth(applicationContext));
        int i = dyon.a;
        dyia.b();
        dyyt.a(applicationContext);
        dylh dylhVar = new dylh();
        dypj dypjVar2 = new dypj(dyqzVar, a, dyolVar2);
        dzciVar.e = dypgVar2;
        dzciVar.g = cgjhVar;
        dzcm dzcmVar = new dzcm(dzciVar, applicationContext, a, hashMap);
        if (dykr.a == null) {
            dypgVar = dypgVar2;
            dyolVar = dyolVar2;
            dypjVar = dypjVar2;
            dykr.a = new dykr(dyqzVar, dzcmVar, dyklVar, dyolVar, a, cgjjVar);
        } else {
            dyolVar = dyolVar2;
            dypgVar = dypgVar2;
            dypjVar = dypjVar2;
        }
        dyhr.a("LitBstrpCntrl", "Initializing BootstrapController Instance");
        dykr dykrVar = dykr.a;
        if (dykrVar == null) {
            dyhr.c("LitBstrpCntrl", "No instance available, call initialize first.");
            throw new IllegalArgumentException("No instance available, please call initialize first.");
        }
        this.m = dykrVar;
        dypgVar.h = dykrVar;
        dypgVar.e = dyolVar;
        dyolVar.n = dyleVar;
        dyolVar.o = dyklVar;
        dyolVar.p = dyprVar;
        this.g = dypgVar;
        this.b = dyolVar;
        this.h = dyleVar;
        this.i = dyklVar;
        this.p = dylhVar;
        this.q = new dyom();
        this.j = dyprVar;
        this.s = new dypu(dzdpVar);
        this.n = dypjVar;
        this.optionalLighterPackageInitializer = dygzVar;
        engw engwVar = dygzVar.a;
        int i2 = ((enou) engwVar).c;
        for (int i3 = 0; i3 < i2; i3++) {
            dygy dygyVar = (dygy) engwVar.get(i3);
            for (dzdv dzdvVar : dygyVar.b(this.e, this.l, this.a)) {
                this.k.put(dzdvVar.b(), dzdvVar);
            }
            this.d.b(dygyVar.a());
        }
        erny.f(this.g.a(), new emwl() { // from class: dygw
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                String str;
                engw engwVar2 = (engw) obj;
                dyhw.b();
                dfqt dfqtVar = dhkk.a;
                Lighter lighter = Lighter.this;
                Context context2 = lighter.a;
                new dhlf(context2).c(dyjs.a(context2), dyjo.a(context2).b, new String[]{"LIGHTER_ANDROID"}, null).s(new dhqs() { // from class: dyjt
                    @Override // defpackage.dhqs
                    public final void a(dhre dhreVar) {
                        if (dhreVar.m()) {
                            dyhr.e("PhenotypeApiImplV12", "Phenotype registration succeeded");
                        } else {
                            dyhr.c("PhenotypeApiImplV12", "Phenotype registration failed");
                        }
                    }
                });
                Iterator<E> it = engwVar2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        str = "";
                        break;
                    }
                    dzja dzjaVar = (dzja) it.next();
                    if (dzpf.EMAIL.equals(((dzim) dzjaVar.c().f()).c)) {
                        str = ((dzim) dzjaVar.c().f()).a;
                        break;
                    }
                }
                dyhr.a("PhenotypeApiImplV12", "Retrieve experiment configurations");
                new dyju(new dhlf(context2), dyjs.a(context2)).e(str, 3);
                lighter.b.c(engwVar2);
                return null;
            }
        }, erpp.a);
    }

    public static synchronized Lighter j(cgjf cgjfVar, Context context, cgjg cgjgVar, cgjh cgjhVar, cgji cgjiVar, cgjj cgjjVar, dyix dyixVar, dygz dygzVar, Map map) {
        Lighter m;
        synchronized (Lighter.class) {
            emxc j = emxc.j(dyixVar);
            emux emuxVar = emux.a;
            m = m(cgjfVar, context, cgjgVar, cgjhVar, cgjiVar, cgjjVar, j, dygzVar, emuxVar, emuxVar, emuxVar, map);
        }
        return m;
    }

    private static synchronized Lighter m(cgjf cgjfVar, Context context, cgjg cgjgVar, cgjh cgjhVar, cgji cgjiVar, cgjj cgjjVar, emxc emxcVar, dygz dygzVar, emxc emxcVar2, emxc emxcVar3, emxc emxcVar4, Map map) {
        synchronized (Lighter.class) {
            Lighter lighter = c;
            if (lighter == null) {
                Lighter lighter2 = new Lighter(cgjfVar, context, cgjgVar, cgjhVar, cgjiVar, cgjjVar, emxcVar, dygzVar, emxcVar2, emxcVar3, map);
                c = lighter2;
                if (lighter2.optionalLighterPackageInitializer != null) {
                    return lighter2;
                }
                lighter = lighter2;
            }
            return lighter;
        }
    }

    @Override // defpackage.dygx
    public final dyij a() {
        return this.i;
    }

    @Override // defpackage.dygx
    public final dyil b() {
        return this.h;
    }

    @Override // defpackage.dygx
    public final dyim c() {
        return this.b;
    }

    @Override // defpackage.dygx
    public final dyis d() {
        return this.g;
    }

    @Override // defpackage.dygx
    public final dyiu e() {
        return this.j;
    }

    @Override // defpackage.dygx
    public final dyiz f() {
        return this.n;
    }

    protected final void finalize() {
        erny.f(this.g.a(), new emwl() { // from class: dygv
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                dyhr.a("Lighter", "finalizing");
                Lighter.this.b.f((engw) obj);
                return null;
            }
        }, erpp.a);
    }

    @Override // defpackage.dygx
    public final dzhn g() {
        return this.f;
    }

    @Override // defpackage.dygx
    public final dylh h() {
        return this.p;
    }

    @Override // defpackage.dygx
    public final dyom i() {
        return this.q;
    }

    @Override // defpackage.dygx
    public final dypu l() {
        return this.s;
    }

    @Override // defpackage.dygx
    public final void k() {
    }
}
