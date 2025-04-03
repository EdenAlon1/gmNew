package defpackage;

import android.content.Context;
import androidx.car.app.hardware.info.EnergyProfile;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dztl {
    static final int a = (int) fdql.a.get().f();
    public static final /* synthetic */ int b = 0;

    static dzvv a(dzja dzjaVar, Context context, fbmp fbmpVar, String str, dzhn dzhnVar) {
        Object dztuVar;
        engr engrVar = new engr();
        for (fbmx fbmxVar : fbmpVar.b) {
            int i = fbmxVar.d;
            int i2 = i != 0 ? i != 1 ? i != 2 ? 0 : 4 : 3 : 2;
            if (i2 == 0) {
                i2 = 1;
            }
            int i3 = i2 - 2;
            if (i3 == 1) {
                fbmr fbmrVar = fbmxVar.b == 101 ? (fbmr) fbmxVar.c : fbmr.a;
                engr engrVar2 = new engr();
                Iterator<E> it = fbmrVar.b.iterator();
                while (it.hasNext()) {
                    engrVar2.h(b(dzjaVar, context, (fbmz) it.next(), str, dzhnVar));
                }
                dzuy dzuyVar = new dzuy();
                dzuyVar.b(engrVar2.g());
                dztuVar = new dztu(dzuyVar.a());
            } else {
                if (i3 != 2) {
                    throw new dzdt(a.h(i, "Got unknown UI component: "), 222);
                }
                dztuVar = new dztv(b(dzjaVar, context, fbmxVar.b == 102 ? (fbmz) fbmxVar.c : fbmz.a, str, dzhnVar));
            }
            engrVar.h(dztuVar);
        }
        int i4 = dzvv.c;
        dzus dzusVar = new dzus();
        dzusVar.b(engrVar.g());
        int i5 = fbmpVar.c;
        if (i5 > 0) {
            dzusVar.c(i5);
        }
        return dzusVar.a();
    }

    static dzwi b(dzja dzjaVar, Context context, fbmz fbmzVar, final String str, dzhn dzhnVar) {
        dzwe g = dzwi.g();
        g.e(fbmzVar.e);
        g.f(fbmzVar.f);
        g.d(fbmzVar.g);
        g.c(fbmzVar.h);
        g.g(fbmzVar.i);
        int i = fbmzVar.d;
        int b2 = fbka.b(i);
        if (b2 == 0) {
            b2 = 1;
        }
        switch (b2 - 2) {
            case 1:
                g.n(dzeu.a(dzjaVar, context, fbmzVar.b == 101 ? (fbnn) fbmzVar.c : fbnn.a, str, dzhnVar));
                return g.a();
            case 2:
            default:
                int b3 = fbka.b(i);
                throw new dzdt("Got unknown UI element: " + fbka.a(b3 != 0 ? b3 : 1), 223);
            case 3:
                fbmv fbmvVar = fbmzVar.b == 103 ? (fbmv) fbmzVar.c : fbmv.a;
                dzuw dzuwVar = new dzuw();
                dzuwVar.c(fbmvVar.c);
                faul faulVar = fbmvVar.d;
                if (faulVar == null) {
                    faulVar = faul.a;
                }
                dzuwVar.b(dzds.a(faulVar));
                faul faulVar2 = fbmvVar.e;
                if (faulVar2 == null) {
                    faulVar2 = faul.a;
                }
                dzuwVar.d(dzds.a(faulVar2));
                g.o(dzuwVar.a());
                return g.a();
            case 4:
                fbmd fbmdVar = fbmzVar.b == 104 ? (fbmd) fbmzVar.c : fbmd.a;
                if ((fbmdVar.b & 2) == 0) {
                    throw new dzdt("Got invalid image proto.", 228);
                }
                dzvk g2 = dzvl.g();
                dzsm dzsmVar = new dzsm();
                fbks fbksVar = fbmdVar.c;
                if (fbksVar == null) {
                    fbksVar = fbks.a;
                }
                fceo fceoVar = fbksVar.b;
                if (fceoVar == null) {
                    fceoVar = fceo.a;
                }
                dzsmVar.b(fceoVar.b);
                fbks fbksVar2 = fbmdVar.c;
                if (fbksVar2 == null) {
                    fbksVar2 = fbks.a;
                }
                fceo fceoVar2 = fbksVar2.b;
                if (fceoVar2 == null) {
                    fceoVar2 = fceo.a;
                }
                eyga eygaVar = fceoVar2.d;
                if (eygaVar == null) {
                    eygaVar = eyga.a;
                }
                dzsmVar.c(eygaVar.b);
                ((dzuo) g2).a = dzsmVar.a();
                fbks fbksVar3 = fbmdVar.c;
                if (fbksVar3 == null) {
                    fbksVar3 = fbks.a;
                }
                dzvk f = g2.f(fbksVar3.c.I());
                f.e(fbmdVar.d);
                f.c(fbmdVar.e);
                f.d(fbmdVar.f);
                g.k(f.b());
                return g.a();
            case 5:
                fbmn fbmnVar = fbmzVar.b == 105 ? (fbmn) fbmzVar.c : fbmn.a;
                String str2 = dzre.d;
                dznv dznvVar = new dznv();
                if (fbmnVar.c == 2) {
                    dznvVar.c(fbmnVar.d);
                }
                dznvVar.d(fbmnVar.c);
                dznvVar.b(dyhx.b(fbmnVar.b, new emwl() { // from class: dzth
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        fbml fbmlVar = (fbml) obj;
                        int i2 = dztl.b;
                        dzrc i3 = dzrd.i();
                        fbii fbiiVar = fbmlVar.j;
                        if (fbiiVar == null) {
                            fbiiVar = fbii.a;
                        }
                        if (fbiiVar.isInitialized()) {
                            fbii fbiiVar2 = fbmlVar.j;
                            if (fbiiVar2 == null) {
                                fbiiVar2 = fbii.a;
                            }
                            i3.f(dzeb.a(fbiiVar2));
                        }
                        if (!fbmlVar.d.isEmpty()) {
                            i3.b(fbmlVar.d);
                        }
                        fbhu fbhuVar = fbmlVar.e;
                        if (fbhuVar == null) {
                            fbhuVar = fbhu.a;
                        }
                        String str3 = str;
                        emxc b4 = dzdr.b(fbhuVar, emxc.j(str3), emxc.j(str3));
                        if (!b4.g()) {
                            return emux.a;
                        }
                        i3.g(fbmlVar.c);
                        ((dznx) i3).a = (dzjn) b4.c();
                        faul faulVar3 = fbmlVar.f;
                        if (faulVar3 == null) {
                            faulVar3 = faul.a;
                        }
                        i3.h(dzds.a(faulVar3));
                        faul faulVar4 = fbmlVar.g;
                        if (faulVar4 == null) {
                            faulVar4 = faul.a;
                        }
                        i3.c(dzds.a(faulVar4));
                        faul faulVar5 = fbmlVar.h;
                        if (faulVar5 == null) {
                            faulVar5 = faul.a;
                        }
                        i3.d(dzds.a(faulVar5));
                        i3.e(fbmlVar.i);
                        return emxc.j(i3.a());
                    }
                }));
                g.m(dznvVar.a());
                return g.a();
            case 6:
                fbmb fbmbVar = fbmzVar.b == 106 ? (fbmb) fbmzVar.c : fbmb.a;
                dzum dzumVar = new dzum();
                faul faulVar3 = fbmbVar.c;
                if (faulVar3 == null) {
                    faulVar3 = faul.a;
                }
                dzumVar.b(dzds.a(faulVar3));
                dzumVar.c(fbmbVar.d);
                g.j(dzumVar.a());
                return g.a();
            case 7:
                fblz fblzVar = fbmzVar.b == 107 ? (fblz) fbmzVar.c : fblz.a;
                dzui dzuiVar = new dzui();
                dzuiVar.b(dyhx.c(fblzVar.b, new emwl() { // from class: dztf
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        fbnb fbnbVar = (fbnb) obj;
                        int i2 = dztl.b;
                        dzuk dzukVar = new dzuk();
                        dzukVar.c(fbnbVar.d.I());
                        dzukVar.b(fbnbVar.c);
                        fbhu fbhuVar = fbnbVar.e;
                        if (fbhuVar == null) {
                            fbhuVar = fbhu.a;
                        }
                        String str3 = str;
                        dzukVar.b = (dzjn) dzdr.b(fbhuVar, emxc.j(str3), emxc.j(str3)).c();
                        fbii fbiiVar = fbnbVar.f;
                        if (fbiiVar == null) {
                            fbiiVar = fbii.a;
                        }
                        dzukVar.a = dzeb.a(fbiiVar);
                        return dzukVar.a();
                    }
                }));
                g.i(dzuiVar.a());
                return g.a();
            case 8:
                g.h();
                return g.a();
            case 9:
                if (!fdql.n()) {
                    throw new dzdt("Media Element not supported, please enable direct-download flag.", 229);
                }
                fbmj fbmjVar = fbmzVar.b == 109 ? (fbmj) fbmzVar.c : fbmj.a;
                if ((fbmjVar.b & 1) == 0) {
                    throw new dzdt("Got invalid media proto.", 229);
                }
                fbku fbkuVar = fbmjVar.c;
                if (fbkuVar == null) {
                    fbkuVar = fbku.a;
                }
                if (fbkuVar.b == 11) {
                    fbku fbkuVar2 = fbmjVar.c;
                    if (fbkuVar2 == null) {
                        fbkuVar2 = fbku.a;
                    }
                    if (!(fbkuVar2.b == 11 ? (String) fbkuVar2.c : "").isEmpty()) {
                        dzvm g3 = dzvn.g();
                        fbku fbkuVar3 = fbmjVar.c;
                        if (fbkuVar3 == null) {
                            fbkuVar3 = fbku.a;
                        }
                        String str3 = fbkuVar3.b == 11 ? (String) fbkuVar3.c : "";
                        String str4 = dzvq.a;
                        ((dzuq) g3).a = dztp.a(str3);
                        fbku fbkuVar4 = fbmjVar.c;
                        if (fbkuVar4 == null) {
                            fbkuVar4 = fbku.a;
                        }
                        dzvm f2 = g3.f(fbkuVar4.d.I());
                        f2.e(fbmjVar.d);
                        f2.c(fbmjVar.e);
                        f2.d(fbmjVar.f);
                        g.l(f2.b());
                        return g.a();
                    }
                }
                throw new dzdt("URL must not be empty.", 229);
        }
    }

    static fbmz c(dzwi dzwiVar) {
        fbmy fbmyVar = (fbmy) fbmz.a.createBuilder();
        int c = dzwiVar.c();
        fbmyVar.copyOnWrite();
        ((fbmz) fbmyVar.instance).e = c;
        int d = dzwiVar.d();
        fbmyVar.copyOnWrite();
        ((fbmz) fbmyVar.instance).f = d;
        int b2 = dzwiVar.b();
        fbmyVar.copyOnWrite();
        ((fbmz) fbmyVar.instance).g = b2;
        int a2 = dzwiVar.a();
        fbmyVar.copyOnWrite();
        ((fbmz) fbmyVar.instance).h = a2;
        boolean f = dzwiVar.f();
        fbmyVar.copyOnWrite();
        ((fbmz) fbmyVar.instance).i = f;
        int ordinal = dzwiVar.h().ordinal();
        if (ordinal == 0) {
            fbmyVar.copyOnWrite();
            ((fbmz) fbmyVar.instance).d = fbka.a(3);
            fbnn b3 = dzeu.b(dzwiVar.e().g());
            fbmyVar.copyOnWrite();
            fbmz fbmzVar = (fbmz) fbmyVar.instance;
            b3.getClass();
            fbmzVar.c = b3;
            fbmzVar.b = EnergyProfile.EVCONNECTOR_TYPE_OTHER;
            return (fbmz) fbmyVar.build();
        }
        if (ordinal == 2) {
            fbmyVar.copyOnWrite();
            ((fbmz) fbmyVar.instance).d = fbka.a(5);
            dzvz h = dzwiVar.e().h();
            fbmu fbmuVar = (fbmu) fbmv.a.createBuilder();
            dzux dzuxVar = (dzux) h;
            String str = dzuxVar.a;
            fbmuVar.copyOnWrite();
            ((fbmv) fbmuVar.instance).c = str;
            faul b4 = dzds.b(dzuxVar.b);
            fbmuVar.copyOnWrite();
            fbmv fbmvVar = (fbmv) fbmuVar.instance;
            b4.getClass();
            fbmvVar.d = b4;
            fbmvVar.b |= 1;
            faul b5 = dzds.b(dzuxVar.c);
            fbmuVar.copyOnWrite();
            fbmv fbmvVar2 = (fbmv) fbmuVar.instance;
            b5.getClass();
            fbmvVar2.e = b5;
            fbmvVar2.b |= 2;
            fbmv fbmvVar3 = (fbmv) fbmuVar.build();
            fbmyVar.copyOnWrite();
            fbmz fbmzVar2 = (fbmz) fbmyVar.instance;
            fbmvVar3.getClass();
            fbmzVar2.c = fbmvVar3;
            fbmzVar2.b = 103;
            return (fbmz) fbmyVar.build();
        }
        if (ordinal == 3) {
            fbmyVar.copyOnWrite();
            ((fbmz) fbmyVar.instance).d = fbka.a(7);
            dzre f2 = dzwiVar.e().f();
            fbmm fbmmVar = (fbmm) fbmn.a.createBuilder();
            dznw dznwVar = (dznw) f2;
            int i = dznwVar.b;
            if (i == 1) {
                fbmmVar.copyOnWrite();
                ((fbmn) fbmmVar.instance).c = fbjy.a(3);
            } else {
                if (i != 2) {
                    throw new IllegalArgumentException(a.f(i, "Got unknown buttons orientation integer: ", "."));
                }
                fbmmVar.copyOnWrite();
                ((fbmn) fbmmVar.instance).c = fbjy.a(4);
            }
            engw c2 = dyhx.c(dznwVar.a, new emwl() { // from class: dztk
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    dzrd dzrdVar = (dzrd) obj;
                    final fbmk fbmkVar = (fbmk) fbml.a.createBuilder();
                    dyht.b(dzrdVar.f(), new ksp() { // from class: dzeg
                        @Override // defpackage.ksp
                        public final void accept(Object obj2) {
                            fbii b6 = dzeb.b((dzqb) obj2);
                            fbmk fbmkVar2 = fbmk.this;
                            fbmkVar2.copyOnWrite();
                            fbml fbmlVar = (fbml) fbmkVar2.instance;
                            fbml fbmlVar2 = fbml.a;
                            b6.getClass();
                            fbmlVar.j = b6;
                            fbmlVar.b |= 32;
                        }
                    });
                    emxc e = dzrdVar.e();
                    fbmkVar.getClass();
                    dyht.b(e, new ksp() { // from class: dzeh
                        @Override // defpackage.ksp
                        public final void accept(Object obj2) {
                            fbmk fbmkVar2 = fbmk.this;
                            String str2 = (String) obj2;
                            fbmkVar2.copyOnWrite();
                            fbml fbmlVar = (fbml) fbmkVar2.instance;
                            fbml fbmlVar2 = fbml.a;
                            str2.getClass();
                            fbmlVar.d = str2;
                        }
                    });
                    String g = dzrdVar.g();
                    fbmkVar.copyOnWrite();
                    ((fbml) fbmkVar.instance).c = g;
                    fbhu a3 = dzdr.a(dzrdVar.d());
                    fbmkVar.copyOnWrite();
                    fbml fbmlVar = (fbml) fbmkVar.instance;
                    a3.getClass();
                    fbmlVar.e = a3;
                    fbmlVar.b |= 1;
                    faul b6 = dzds.b(dzrdVar.c());
                    fbmkVar.copyOnWrite();
                    fbml fbmlVar2 = (fbml) fbmkVar.instance;
                    b6.getClass();
                    fbmlVar2.f = b6;
                    fbmlVar2.b |= 2;
                    faul b7 = dzds.b(dzrdVar.a());
                    fbmkVar.copyOnWrite();
                    fbml fbmlVar3 = (fbml) fbmkVar.instance;
                    b7.getClass();
                    fbmlVar3.g = b7;
                    fbmlVar3.b |= 4;
                    faul b8 = dzds.b(dzrdVar.b());
                    fbmkVar.copyOnWrite();
                    fbml fbmlVar4 = (fbml) fbmkVar.instance;
                    b8.getClass();
                    fbmlVar4.h = b8;
                    fbmlVar4.b |= 16;
                    boolean h2 = dzrdVar.h();
                    fbmkVar.copyOnWrite();
                    ((fbml) fbmkVar.instance).i = h2;
                    return (fbml) fbmkVar.build();
                }
            });
            fbmmVar.copyOnWrite();
            fbmn fbmnVar = (fbmn) fbmmVar.instance;
            eygr eygrVar = fbmnVar.b;
            if (!eygrVar.c()) {
                fbmnVar.b = eyfy.mutableCopy(eygrVar);
            }
            eydl.addAll(c2, fbmnVar.b);
            fbmn fbmnVar2 = (fbmn) fbmmVar.build();
            fbmyVar.copyOnWrite();
            fbmz fbmzVar3 = (fbmz) fbmyVar.instance;
            fbmnVar2.getClass();
            fbmzVar3.c = fbmnVar2;
            fbmzVar3.b = 105;
            return (fbmz) fbmyVar.build();
        }
        if (ordinal == 4) {
            fbmyVar.copyOnWrite();
            ((fbmz) fbmyVar.instance).d = fbka.a(8);
            dzvj c3 = dzwiVar.e().c();
            fbma fbmaVar = (fbma) fbmb.a.createBuilder();
            dzun dzunVar = (dzun) c3;
            faul b6 = dzds.b(dzunVar.a);
            fbmaVar.copyOnWrite();
            fbmb fbmbVar = (fbmb) fbmaVar.instance;
            b6.getClass();
            fbmbVar.c = b6;
            fbmbVar.b |= 1;
            float f3 = dzunVar.b;
            fbmaVar.copyOnWrite();
            ((fbmb) fbmaVar.instance).d = f3;
            fbmb fbmbVar2 = (fbmb) fbmaVar.build();
            fbmyVar.copyOnWrite();
            fbmz fbmzVar4 = (fbmz) fbmyVar.instance;
            fbmbVar2.getClass();
            fbmzVar4.c = fbmbVar2;
            fbmzVar4.b = 106;
            return (fbmz) fbmyVar.build();
        }
        if (ordinal == 5) {
            fbmyVar.copyOnWrite();
            ((fbmz) fbmyVar.instance).d = fbka.a(9);
            dzvh b7 = dzwiVar.e().b();
            fbly fblyVar = (fbly) fblz.a.createBuilder();
            engw c4 = dyhx.c(((dzuj) b7).a, new emwl() { // from class: dzti
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    dzvg dzvgVar = (dzvg) obj;
                    int i2 = dztl.b;
                    fbna fbnaVar = (fbna) fbnb.a.createBuilder();
                    fbhu a3 = dzdr.a(dzvgVar.a());
                    fbnaVar.copyOnWrite();
                    fbnb fbnbVar = (fbnb) fbnaVar.instance;
                    a3.getClass();
                    fbnbVar.e = a3;
                    fbnbVar.b |= 1;
                    eyee x = eyee.x(dzvgVar.d());
                    fbnaVar.copyOnWrite();
                    ((fbnb) fbnaVar.instance).d = x;
                    String c5 = dzvgVar.c();
                    fbnaVar.copyOnWrite();
                    ((fbnb) fbnaVar.instance).c = c5;
                    fbii b8 = dzeb.b(dzvgVar.b());
                    fbnaVar.copyOnWrite();
                    fbnb fbnbVar2 = (fbnb) fbnaVar.instance;
                    b8.getClass();
                    fbnbVar2.f = b8;
                    fbnbVar2.b |= 2;
                    return (fbnb) fbnaVar.build();
                }
            });
            fblyVar.copyOnWrite();
            fblz fblzVar = (fblz) fblyVar.instance;
            eygr eygrVar2 = fblzVar.b;
            if (!eygrVar2.c()) {
                fblzVar.b = eyfy.mutableCopy(eygrVar2);
            }
            eydl.addAll(c4, fblzVar.b);
            fblz fblzVar2 = (fblz) fblyVar.build();
            fbmyVar.copyOnWrite();
            fbmz fbmzVar5 = (fbmz) fbmyVar.instance;
            fblzVar2.getClass();
            fbmzVar5.c = fblzVar2;
            fbmzVar5.b = 107;
            return (fbmz) fbmyVar.build();
        }
        if (ordinal == 7) {
            fbmyVar.copyOnWrite();
            ((fbmz) fbmyVar.instance).d = fbka.a(10);
            return (fbmz) fbmyVar.build();
        }
        if (ordinal != 8) {
            throw new IllegalArgumentException("Got unknown ui element model type: ".concat(String.valueOf(String.valueOf(dzwiVar.h()))));
        }
        if (!fdql.n()) {
            throw new IllegalArgumentException("Media Element not supported; Please enable direct-download flag.");
        }
        fbmyVar.copyOnWrite();
        ((fbmz) fbmyVar.instance).d = fbka.a(11);
        dzvn e = dzwiVar.e().e();
        fbmi fbmiVar = (fbmi) fbmj.a.createBuilder();
        dzvq dzvqVar = ((dzur) e).a;
        fbkt fbktVar = (fbkt) fbku.a.createBuilder();
        int ordinal2 = dzvqVar.b().ordinal();
        if (ordinal2 == 0) {
            throw new IllegalArgumentException("Media ID is not yet supported: ".concat(String.valueOf(String.valueOf(dzvqVar.b()))));
        }
        if (ordinal2 == 1) {
            String c5 = dzvqVar.c();
            fbktVar.copyOnWrite();
            fbku fbkuVar = (fbku) fbktVar.instance;
            fbkuVar.b = 11;
            fbkuVar.c = c5;
        }
        fbku fbkuVar2 = (fbku) fbktVar.build();
        fbmiVar.copyOnWrite();
        fbmj fbmjVar = (fbmj) fbmiVar.instance;
        fbkuVar2.getClass();
        fbmjVar.c = fbkuVar2;
        fbmjVar.b |= 1;
        int i2 = a;
        fbmiVar.copyOnWrite();
        ((fbmj) fbmiVar.instance).e = i2;
        fbmj fbmjVar2 = (fbmj) fbmiVar.build();
        fbmyVar.copyOnWrite();
        fbmz fbmzVar6 = (fbmz) fbmyVar.instance;
        fbmjVar2.getClass();
        fbmzVar6.c = fbmjVar2;
        fbmzVar6.b = 109;
        return (fbmz) fbmyVar.build();
    }
}
