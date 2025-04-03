package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zrt implements zrq {
    public final Optional a;
    private final ztc b;
    private final aasc c;
    private final aast d;
    private final zrx e;
    private final aapt f;
    private final aaqt g;

    public zrt(ztc ztcVar, aasc aascVar, aast aastVar, aaqt aaqtVar, Optional optional, zrx zrxVar, aapt aaptVar, ffsk ffskVar) {
        zrxVar.getClass();
        aaptVar.getClass();
        ffskVar.getClass();
        this.b = ztcVar;
        this.c = aascVar;
        this.d = aastVar;
        this.g = aaqtVar;
        this.a = optional;
        this.e = zrxVar;
        this.f = aaptVar;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, zqz] */
    @Override // defpackage.zrq
    public final zqz a(final zst zstVar) {
        zqz zqzVar;
        ekzz f = eleg.f("MessageUiAdapterImpl#createUiData");
        try {
            zrx zrxVar = this.e;
            ffji ffjiVar = new ffji() { // from class: zrr
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    zrm zrmVar;
                    final ffsk ffskVar = (ffsk) obj;
                    ffskVar.getClass();
                    final zst zstVar2 = zstVar;
                    alxr a = zstVar2.a.a();
                    ekzz f2 = eleg.f("MessageUiAdapterImpl#createNewUiData");
                    try {
                        boolean z = zstVar2.m;
                        final zrt zrtVar = zrt.this;
                        if (z) {
                            MessageId b = zstVar2.a.a().b();
                            zsr.a(a);
                            zrn zrnVar = new zrn(b, new ffix() { // from class: zrs
                                @Override // defpackage.ffix
                                public final Object invoke() {
                                    zrt zrtVar2 = zrt.this;
                                    ffsk ffskVar2 = ffskVar;
                                    zst zstVar3 = zstVar2;
                                    ekzz f3 = eleg.f("MessageUiAdapterImpl#createNewUiData#lazy");
                                    try {
                                        axrc b2 = zrtVar2.b(ffskVar2, zstVar3);
                                        ffig.a(f3, null);
                                        return b2;
                                    } finally {
                                    }
                                }
                            });
                            zrz zrzVar = (zrz) fflm.b(zrtVar.a);
                            zrmVar = zrnVar;
                            if (zrzVar != null) {
                                zrzVar.a(zrnVar);
                                zrmVar = zrnVar;
                            }
                        } else {
                            ekzz f3 = eleg.f("MessageUiAdapterImpl#createNewUiData#eager");
                            try {
                                zrm zrmVar2 = new zrm(a.b(), Long.valueOf(zsr.a(a)), zrtVar.b(ffskVar, zstVar2));
                                ffig.a(f3, null);
                                zrmVar = zrmVar2;
                            } finally {
                            }
                        }
                        ffig.a(f2, null);
                        return zrmVar;
                    } finally {
                    }
                }
            };
            MessageId b = zstVar.a.a().b();
            zrxVar.e.add(b);
            zru zruVar = (zru) zrxVar.d.get(b);
            if (zruVar == null || !zruVar.a.equals(zstVar)) {
                zrxVar.b.c.incrementAndGet();
                if (zruVar == null) {
                    ((enrr) zrx.a.g().h("com/google/android/apps/messaging/conversation2/messagelist/message/MessageUiDataCache", "getOrCreate", 74, "MessageUiDataCache.kt")).t("Cache miss. id = %s", b.a());
                } else {
                    ((enrr) zrx.a.g().h("com/google/android/apps/messaging/conversation2/messagelist/message/MessageUiDataCache", "getOrCreate", 76, "MessageUiDataCache.kt")).t("Cache hit, but different arguments. id = %s", b.a());
                }
                ffhd ffhdVar = zrxVar.c;
                ffsk b2 = ffsl.b(ffhdVar.plus(new ffvf(ffui.c(ffhdVar))));
                ((enrr) zrx.a.g().h("com/google/android/apps/messaging/conversation2/messagelist/message/MessageUiDataCache", "getOrCreate", 84, "MessageUiDataCache.kt")).t("Creating message scope. id = %s", b.a());
                ?? invoke = ffjiVar.invoke(b2);
                zrxVar.d.put(b, new zru(zstVar, invoke, b2));
                zqzVar = invoke;
            } else {
                ((enrr) zrx.a.e().h("com/google/android/apps/messaging/conversation2/messagelist/message/MessageUiDataCache", "getOrCreate", 68, "MessageUiDataCache.kt")).t("Cache hit. id = %s", b.a());
                zrxVar.b.b.incrementAndGet();
                zqzVar = zruVar.b;
            }
            ffig.a(f, null);
            return zqzVar;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ffig.a(f, th);
                throw th2;
            }
        }
    }

    public final axrc b(ffsk ffskVar, zst zstVar) {
        axrc axqdVar;
        dmcg dmcgVar;
        dmcg a;
        final Object doqcVar;
        alxr a2 = zstVar.a.a();
        appj g = a2.g();
        if (g instanceof appy) {
            final aasc aascVar = this.c;
            final aaqy aaqyVar = new aaqy(a2.b(), (appy) g, zstVar.a);
            engw a3 = aaqyVar.b.a();
            if (((enou) a3).c > 1) {
                String a4 = aaqyVar.a.a();
                a4.getClass();
                ArrayList arrayList = new ArrayList(ffdx.n(a3, 10));
                enqv it = a3.iterator();
                while (it.hasNext()) {
                    appx appxVar = (appx) it.next();
                    appxVar.getClass();
                    arrayList.add(aascVar.a(appxVar));
                }
                doqcVar = new doqb(a4, arrayList);
            } else {
                String a5 = aaqyVar.a.a();
                a5.getClass();
                Object T = ffdx.T(a3);
                T.getClass();
                doqcVar = new doqc(a5, aascVar.a((appx) T));
            }
            return new axqd(new ffix() { // from class: aaqz
                @Override // defpackage.ffix
                public final Object invoke() {
                    aalu aaluVar = aascVar.i;
                    aaqy aaqyVar2 = aaqy.this;
                    zvp zvpVar = aaqyVar2.c;
                    return new aaqu(aaqyVar2.a, (doqd) doqcVar, (dnvr) aaluVar.c(zvpVar, false, false).b());
                }
            });
        }
        if (g instanceof apqa) {
            aast aastVar = this.d;
            aasf aasfVar = new aasf(a2.b(), (apqa) g);
            return axrg.b(new aasm(aastVar.h, aasfVar, aastVar), new aase(aasfVar.a, null, new ffix() { // from class: aasi
                @Override // defpackage.ffix
                public final Object invoke() {
                    return ffcu.a;
                }
            }, new ffix() { // from class: aasj
                @Override // defpackage.ffix
                public final Object invoke() {
                    return ffcu.a;
                }
            }));
        }
        if (!(g instanceof appo)) {
            if (g instanceof apnq) {
                final aapt aaptVar = this.f;
                final aapn aapnVar = new aapn(a2.b(), ((apnq) g).a);
                return new axqd(new ffix() { // from class: aapp
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        dmiy dmiyVar;
                        dmiy dmiyVar2;
                        aapn aapnVar2 = aapnVar;
                        int i = aapnVar2.b;
                        aapt aaptVar2 = aapt.this;
                        switch (i - 1) {
                            case 0:
                                String string = aaptVar2.a.getString(R.string.demo_card_title);
                                string.getClass();
                                dmiw dmiwVar = new dmiw(string);
                                String string2 = aaptVar2.a.getString(R.string.demo_card_line_1);
                                string2.getClass();
                                dmiyVar = new dmiy(dmiwVar, ffdx.b(new dnhh(string2, (dmzz) null, (List) null, false, 30)), false, null, 28);
                                break;
                            case 1:
                                String string3 = aaptVar2.a.getString(R.string.real_card_title);
                                string3.getClass();
                                dmiw dmiwVar2 = new dmiw(string3);
                                String string4 = aaptVar2.a.getString(R.string.real_card_line_1);
                                string4.getClass();
                                String string5 = aaptVar2.a.getString(R.string.real_card_line_2);
                                string5.getClass();
                                String string6 = aaptVar2.a.getString(R.string.real_card_line_3);
                                string6.getClass();
                                dmiyVar2 = new dmiy(dmiwVar2, ffdx.g(new dnhh(string4, dmzz.aS, (List) null, false, 28), new dnhh(string5, dmzz.dU, (List) null, false, 28), new dnhh(string6, dmzz.bY, (List) null, false, 28)), false, null, 28);
                                dmiyVar = dmiyVar2;
                                break;
                            case 2:
                                String string7 = aaptVar2.a.getString(R.string.real_card_end_success_title);
                                string7.getClass();
                                dmiw dmiwVar3 = new dmiw(string7);
                                String string8 = aaptVar2.a.getString(R.string.end_emergency_success_dont_need_help_card_line_1, aaptVar2.b);
                                string8.getClass();
                                String string9 = aaptVar2.a.getString(R.string.end_emergency_success_dont_need_help_card_line_2, aaptVar2.b, aaptVar2.a(aaptVar2.c));
                                string9.getClass();
                                Context context = aaptVar2.a;
                                String str = aaptVar2.b;
                                dmzz dmzzVar = dmzz.R;
                                String string10 = context.getString(R.string.end_emergency_success_dont_need_help_card_line_2, str, aaptVar2.c);
                                string10.getClass();
                                String string11 = aaptVar2.a.getString(R.string.end_emergency_success_dont_need_help_card_line_3);
                                string11.getClass();
                                dmiyVar2 = new dmiy(dmiwVar3, ffdx.g(new dnhh(string8, dmzz.aS, (List) null, false, 28), new dnhh(string9, dmzzVar, aaptVar2.b(string10), false, 20), new dnhh(string11, dmzz.dC, (List) null, false, 28)), false, null, 28);
                                dmiyVar = dmiyVar2;
                                break;
                            case 3:
                                String string12 = aaptVar2.a.getString(R.string.real_card_end_success_title);
                                string12.getClass();
                                dmiw dmiwVar4 = new dmiw(string12);
                                String string13 = aaptVar2.a.getString(R.string.end_emergency_success_still_need_help_card_line_1);
                                string13.getClass();
                                String string14 = aaptVar2.a.getString(R.string.end_emergency_success_still_need_help_card_line_2, aaptVar2.b, aaptVar2.a(aaptVar2.c));
                                string14.getClass();
                                Context context2 = aaptVar2.a;
                                String str2 = aaptVar2.b;
                                dmzz dmzzVar2 = dmzz.R;
                                String string15 = context2.getString(R.string.end_emergency_success_still_need_help_card_line_2, str2, aaptVar2.c);
                                string15.getClass();
                                String string16 = aaptVar2.a.getString(R.string.end_emergency_success_still_need_help_card_line_3);
                                string16.getClass();
                                dmiyVar = new dmiy(dmiwVar4, ffdx.g(new dnhh(string13, dmzz.aS, (List) null, false, 28), new dnhh(string14, dmzzVar2, aaptVar2.b(string15), false, 20), new dnhh(string16, dmzz.o, (List) null, false, 28)), false, null, 28);
                                break;
                            case 4:
                                String string17 = aaptVar2.a.getString(R.string.real_card_end_failure_title);
                                string17.getClass();
                                dmiw dmiwVar5 = new dmiw(string17);
                                String string18 = aaptVar2.a.getString(R.string.end_emergency_failure_dont_need_help_card_line_1, aaptVar2.b, aaptVar2.a(aaptVar2.c));
                                string18.getClass();
                                Context context3 = aaptVar2.a;
                                String str3 = aaptVar2.b;
                                dmzz dmzzVar3 = dmzz.eB;
                                String string19 = context3.getString(R.string.end_emergency_failure_dont_need_help_card_line_1, str3, aaptVar2.c);
                                string19.getClass();
                                String string20 = aaptVar2.a.getString(R.string.end_emergency_failure_dont_need_help_card_line_2, aaptVar2.b);
                                string20.getClass();
                                String string21 = aaptVar2.a.getString(R.string.end_emergency_failure_dont_need_help_card_line_3);
                                string21.getClass();
                                dmiyVar = new dmiy(dmiwVar5, ffdx.g(new dnhh(string18, dmzzVar3, aaptVar2.b(string19), true, 4), new dnhh(string20, dmzz.aa, (List) null, true, 12), new dnhh(string21, dmzz.o, (List) null, true, 12)), true, null, 24);
                                break;
                            case 5:
                                String string22 = aaptVar2.a.getString(R.string.real_card_end_failure_title);
                                string22.getClass();
                                dmiw dmiwVar6 = new dmiw(string22);
                                String string23 = aaptVar2.a.getString(R.string.end_emergency_failure_still_need_help_card_line_1);
                                string23.getClass();
                                String string24 = aaptVar2.a.getString(R.string.end_emergency_failure_still_need_help_card_line_2, aaptVar2.b, aaptVar2.a(aaptVar2.c));
                                string24.getClass();
                                Context context4 = aaptVar2.a;
                                String str4 = aaptVar2.b;
                                dmzz dmzzVar4 = dmzz.R;
                                String string25 = context4.getString(R.string.end_emergency_failure_still_need_help_card_line_2, str4, aaptVar2.c);
                                string25.getClass();
                                String string26 = aaptVar2.a.getString(R.string.end_emergency_failure_still_need_help_card_line_3);
                                string26.getClass();
                                dmiyVar = new dmiy(dmiwVar6, ffdx.g(new dnhh(string23, dmzz.aS, (List) null, true, 12), new dnhh(string24, dmzzVar4, aaptVar2.b(string25), true, 4), new dnhh(string26, dmzz.o, (List) null, true, 12)), true, null, 24);
                                break;
                            case 6:
                                String string27 = aaptVar2.a.getString(R.string.real_card_end_unexpectedly_title);
                                string27.getClass();
                                dmiw dmiwVar7 = new dmiw(string27);
                                String string28 = aaptVar2.a.getString(R.string.end_emergency_unexpected_card_line_1);
                                string28.getClass();
                                String string29 = aaptVar2.a.getString(R.string.end_emergency_unexpected_card_line_2, aaptVar2.b, aaptVar2.a(aaptVar2.c));
                                string29.getClass();
                                Context context5 = aaptVar2.a;
                                String str5 = aaptVar2.b;
                                dmzz dmzzVar5 = dmzz.R;
                                String string30 = context5.getString(R.string.end_emergency_unexpected_card_line_2, str5, aaptVar2.c);
                                string30.getClass();
                                String string31 = aaptVar2.a.getString(R.string.end_emergency_unexpected_card_line_3);
                                string31.getClass();
                                dmiyVar = new dmiy(dmiwVar7, ffdx.g(new dnhh(string28, dmzz.aS, (List) null, true, 12), new dnhh(string29, dmzzVar5, aaptVar2.b(string30), true, 4), new dnhh(string31, dmzz.o, (List) null, true, 12)), true, null, 24);
                                break;
                            default:
                                String string32 = aaptVar2.a.getString(R.string.satellite_emergency_card_line_1);
                                string32.getClass();
                                String string33 = aaptVar2.a.getString(R.string.satellite_emergency_card_line_2);
                                string33.getClass();
                                List g2 = ffdx.g(new dnhh(string32, dmzz.o, (List) null, false, 28), new dnhh(string33, dmzz.dU, (List) null, false, 28));
                                String string34 = aaptVar2.a.getString(R.string.more_about_satellite_button);
                                string34.getClass();
                                dmiyVar2 = new dmiy(null, g2, false, new dmiq(string34, new aaps(aaptVar2.d)), 12);
                                dmiyVar = dmiyVar2;
                                break;
                        }
                        return new aapu(dmiyVar, aapnVar2.a);
                    }
                });
            }
            if (!(g instanceof aapx)) {
                return this.b.a(ffskVar, zstVar);
            }
            final aapz aapzVar = new aapz(a2.b());
            return new axqd(new ffix() { // from class: aaqa
                @Override // defpackage.ffix
                public final Object invoke() {
                    return new aaqb(aapz.this.a);
                }
            });
        }
        aaqt aaqtVar = this.g;
        aaqi aaqiVar = new aaqi(zstVar.a, zstVar.b, zstVar.c, zstVar.d, zstVar.e);
        alxr a6 = aaqiVar.a.a();
        final appo appoVar = (appo) a6.g();
        dnor b = zsr.b(a6);
        String a7 = aaqtVar.a.a(a6);
        axrc b2 = axrg.b(ffyy.a(new aaqo(aaqtVar.e.a())), true);
        fflb fflbVar = new fflb();
        engw a8 = appoVar.a();
        ArrayList arrayList2 = new ArrayList(ffdx.n(a8, 10));
        enqv it2 = a8.iterator();
        while (it2.hasNext()) {
            apmq apmqVar = (apmq) it2.next();
            aaaq aaaqVar = aaqtVar.b;
            dnor dnorVar = b;
            apmqVar.getClass();
            arrayList2.add(aaaqVar.a(ffskVar, new aaap(a6, apmqVar, aaqiVar.d.a, aaqiVar.e, aaqiVar.b, aaqiVar.c, dnorVar, a7)));
            b = dnorVar;
        }
        alxr alxrVar = a6;
        dnor dnorVar2 = b;
        int i = 0;
        fflbVar.a = arrayList2.toArray(new axrc[0]);
        String c = appoVar.c();
        if (c != null && c.length() > 0) {
            fflbVar.a = ffdo.h((Object[]) fflbVar.a, aaqtVar.b.a(ffskVar, new aaap(alxrVar, new appw() { // from class: aaqk
                @Override // defpackage.appw
                public final /* synthetic */ engw a() {
                    int i2 = engw.d;
                    return enou.a;
                }

                @Override // defpackage.appw, defpackage.appj
                public final /* synthetic */ String b() {
                    return "text/plain";
                }

                @Override // defpackage.appw
                public final String c() {
                    return appo.this.c();
                }
            }, aaqiVar.d.a, aaqiVar.e, aaqiVar.b, aaqiVar.c, dnorVar2, a7)));
        }
        aaql aaqlVar = new aaql(null, fflbVar, alxrVar, aaqtVar, aaqiVar, dnorVar2);
        int i2 = fgau.a;
        fgen fgenVar = new fgen(aaqlVar, b2);
        boolean booleanValue = ((Boolean) ((axre) b2).a).booleanValue();
        Object[] objArr = (Object[]) fflbVar.a;
        axrc[] axrcVarArr = (axrc[]) Arrays.copyOf(objArr, objArr.length);
        int length = axrcVarArr.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                axqdVar = new axqd(new aaqp(axrcVarArr, alxrVar, aaqtVar, aaqiVar, dnorVar2, booleanValue));
                break;
            }
            axrc axrcVar = axrcVarArr[i3];
            if (axrcVar == null || (axrcVar instanceof axqd)) {
                i3++;
                booleanValue = booleanValue;
                alxrVar = alxrVar;
            } else {
                axrc[] axrcVarArr2 = (axrc[]) ffdo.J(axrcVarArr).toArray(new axrc[0]);
                alxr alxrVar2 = alxrVar;
                boolean z = booleanValue;
                aaqs aaqsVar = new aaqs((ffxx[]) Arrays.copyOf(axrcVarArr2, axrcVarArr2.length), axrcVarArr, alxrVar2, aaqtVar, aaqiVar, dnorVar2, z);
                int length2 = axrcVarArr.length;
                ArrayList arrayList3 = new ArrayList(length2);
                for (int i4 = 0; i4 < length2; i4++) {
                    axrc axrcVar2 = axrcVarArr[i4];
                    arrayList3.add(axrcVar2 != null ? axrcVar2.b() : null);
                }
                dnoq[] dnoqVarArr = (dnoq[]) arrayList3.toArray(new dnoq[0]);
                MessageId b3 = alxrVar2.b();
                List J = ffdo.J(dnoqVarArr);
                ArrayList arrayList4 = new ArrayList(ffdx.n(J, 10));
                for (Object obj : J) {
                    int i5 = i + 1;
                    if (i < 0) {
                        ffdx.l();
                    }
                    dnoq dnoqVar = (dnoq) obj;
                    String a9 = b3.a();
                    a9.getClass();
                    if (i == J.size() - 1) {
                        a = aaqtVar.c.a(alxrVar2, new dmci(null), null);
                        dmcgVar = a;
                    } else {
                        dmcgVar = null;
                    }
                    dmzz dmzzVar = alxrVar2.v() ? dmzz.bZ : dmzz.ca;
                    List list = J;
                    zvp zvpVar = aaqiVar.a;
                    List b4 = ffdx.b(dmzzVar);
                    dnry a10 = aaqj.a(zvpVar, i, list.size());
                    Object b5 = aaqtVar.d.b();
                    b5.getClass();
                    dnor dnorVar3 = dnorVar2;
                    dnorVar2 = dnorVar3;
                    arrayList4.add(new zsn(new dnsh(a9, b4, dnorVar3, a10, dmcgVar, new dnsg(((Boolean) b5).booleanValue(), aaqtVar.f.a(), aaqtVar.g.a(), aaqtVar.h.a(), 15), 1610579868), dnoqVar, alxrVar2, z));
                    J = list;
                    i = i5;
                }
                axqdVar = axrg.b(aaqsVar, new aaqe(arrayList4, b3, zsr.a(alxrVar2)));
            }
        }
        return axrg.b(fgenVar, axqdVar.b());
    }
}
