package defpackage;

import androidx.car.app.model.Alert;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvhf implements emva {
    private final dvgs a;
    private final dvcp b;

    public dvhf(dvgs dvgsVar, dvcp dvcpVar) {
        this.a = dvgsVar;
        this.b = dvcpVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.emva
    public final /* bridge */ /* synthetic */ boolean b(Object obj, Object obj2) {
        eygr eygrVar;
        dvgm dvgmVar;
        int i;
        int i2;
        int i3;
        dvgs dvgsVar;
        Iterator it;
        evwq evwqVar = (evwq) obj;
        dvgm dvgmVar2 = (dvgm) obj2;
        int i4 = 1;
        int i5 = 0;
        if (evwqVar == null) {
            this.b.k(dvgmVar2.a(), true, new enpx(eycp.TARGETING_FAILED_REASON_NULL_INPUT_TERM_OR_CONTEXT));
            return false;
        }
        eygr eygrVar2 = evwqVar.b;
        if (eygrVar2.isEmpty()) {
            this.b.k(dvgmVar2.a(), false, enpd.a);
            return true;
        }
        HashSet hashSet = new HashSet();
        int i6 = 0;
        while (i6 < eygrVar2.size()) {
            dvgs dvgsVar2 = this.a;
            evwm evwmVar = (evwm) eygrVar2.get(i6);
            if (evwmVar != null) {
                for (evwp evwpVar : evwmVar.b) {
                    int i7 = evwpVar.c;
                    int a = evwo.a(i7);
                    if (a == 0) {
                        throw null;
                    }
                    int i8 = a - 1;
                    if (i8 == 0) {
                        eygrVar = eygrVar2;
                        dvgmVar = dvgmVar2;
                        dvgs dvgsVar3 = ((dvhe) dvgsVar2).a;
                        if (evwpVar != null) {
                            evxa evxaVar = i7 == 2 ? (evxa) evwpVar.d : evxa.a;
                            int i9 = evxaVar.d;
                            int i10 = evxaVar.e;
                            int i11 = i10 == 0 ? Alert.DURATION_SHOW_INDEFINITELY : i10;
                            Iterator it2 = evxaVar.c.iterator();
                            int i12 = 0;
                            while (it2.hasNext()) {
                                evwt evwtVar = (evwt) it2.next();
                                int i13 = evwtVar.b;
                                int a2 = evws.a(i13);
                                int i14 = a2 - 1;
                                if (a2 == 0) {
                                    throw null;
                                }
                                if (i14 == 0) {
                                    dvgsVar = dvgsVar3;
                                    it = it2;
                                    evwj a3 = dvgy.a(i13 == 1 ? (evwj) evwtVar.c : evwj.a);
                                    if (dvgmVar.c().containsKey(a3)) {
                                        i12 += ((Integer) dvgmVar.c().get(a3)).intValue();
                                    }
                                } else if (i14 != 1) {
                                    dvgsVar = dvgsVar3;
                                    it = it2;
                                } else {
                                    enqu listIterator = dvgmVar.e().entrySet().listIterator();
                                    while (listIterator.hasNext()) {
                                        Map.Entry entry = (Map.Entry) listIterator.next();
                                        ewan ewanVar = (ewan) entry.getKey();
                                        dvgs dvgsVar4 = dvgsVar3;
                                        Iterator it3 = it2;
                                        ewan ewanVar2 = evwtVar.b == 2 ? (ewan) evwtVar.c : ewan.a;
                                        ewal b = ewal.b(ewanVar.d);
                                        if (b == null) {
                                            b = ewal.UNKNOWN;
                                        }
                                        int i15 = i12;
                                        ewal b2 = ewal.b(ewanVar2.d);
                                        if (b2 == null) {
                                            b2 = ewal.UNKNOWN;
                                        }
                                        if (b == b2 && (ewanVar2.c.size() == 0 || dvgy.b(ewanVar.c, ewanVar2))) {
                                            i12 = i15 + ((Integer) entry.getValue()).intValue();
                                            it2 = it3;
                                            dvgsVar3 = dvgsVar4;
                                        } else {
                                            it2 = it3;
                                            dvgsVar3 = dvgsVar4;
                                            i12 = i15;
                                        }
                                    }
                                }
                                it2 = it;
                                dvgsVar3 = dvgsVar;
                            }
                            dvgs dvgsVar5 = dvgsVar3;
                            if ((i9 <= i12 && i12 < i11) == evwpVar.e) {
                                ((dvgx) dvgsVar5).a.c(dvgmVar.a(), "%s", String.format(Locale.US, "Invalid count. \ncount: %d \nmin inclusive: %d\nmax exclusive: %d \nshould negate: %s", Integer.valueOf(i12), Integer.valueOf(i9), Integer.valueOf(i11), Boolean.valueOf(evwpVar.e)));
                                hashSet.add(eycp.TARGETING_FAILED_REASON_EVENT_COUNT_NOT_IN_RANGE);
                            } else {
                                eygrVar2 = eygrVar;
                                dvgmVar2 = dvgmVar;
                                i4 = 1;
                                i5 = 0;
                            }
                        } else {
                            hashSet.add(eycp.TARGETING_FAILED_REASON_NULL_INPUT_TERM_OR_CONTEXT);
                        }
                        i = 1;
                    } else if (i8 != i4) {
                        if (i8 != 3) {
                            hashSet.add(eycp.TARGETING_FAILED_REASON_UNKNOWN_TARGETING_CLAUSE_TYPE);
                        } else {
                            dvgs dvgsVar6 = ((dvhe) dvgsVar2).c;
                            if (evwpVar != null) {
                                evsn b3 = evsn.b((i7 == 5 ? (evwb) evwpVar.d : evwb.a).c);
                                if (b3 == null) {
                                    b3 = evsn.ANDROID_PERMISSION_TYPE_UNSPECIFIED;
                                }
                                b3.getClass();
                                if (b3 == evsn.ANDROID_POST_NOTIFICATIONS) {
                                    dvhd dvhdVar = (dvhd) dvgsVar6;
                                    if (!easb.e(dvhdVar.c)) {
                                        dvhdVar.b.c(dvgmVar2.a(), "Filtered as notifications permission is only needed on Android T+", new Object[i5]);
                                        dvhd.a.o().q("Filtered as notifications permission is only needed on Android T+");
                                        hashSet.add(eycp.TARGETING_FAILED_REASON_INCOMPATIBLE_ANDROID_OR_APP_SDK);
                                    }
                                }
                                String a4 = dvdm.a(b3);
                                dvhd dvhdVar2 = (dvhd) dvgsVar6;
                                if (easb.a(dvhdVar2.c, a4)) {
                                    dvhdVar2.b.c(dvgmVar2.a(), "Filtered as user already has permission.", new Object[i5]);
                                    dvhd.a.o().q("Filtered as user already has permission.");
                                    hashSet.add(eycp.TARGETING_FAILED_REASON_PERMISSION_ALREADY_GRANTED);
                                } else if ((evwpVar.c == 5 ? (evwb) evwpVar.d : evwb.a).d <= 0) {
                                    continue;
                                } else {
                                    Integer num = (Integer) dvgmVar2.d().get(a4);
                                    if ((num != null ? num.intValue() : i5) < (evwpVar.c == 5 ? (evwb) evwpVar.d : evwb.a).d) {
                                        dvhdVar2.b.c(dvgmVar2.a(), "Filtered as the request count lower bound was not reached.", new Object[i5]);
                                        dvhd.a.o().q("Filtered as the request count lower bound was not reached.");
                                        hashSet.add(eycp.TARGETING_FAILED_REASON_REQUEST_COUNT_BOUND_NOT_MET);
                                    }
                                }
                            } else {
                                hashSet.add(eycp.TARGETING_FAILED_REASON_NULL_INPUT_TERM_OR_CONTEXT);
                            }
                        }
                        eygrVar = eygrVar2;
                        dvgmVar = dvgmVar2;
                        i = i4;
                    } else {
                        dvgs dvgsVar7 = ((dvhe) dvgsVar2).b;
                        if (evwpVar != null) {
                            evwh evwhVar = i7 == 3 ? (evwh) evwpVar.d : evwh.a;
                            if (dvgmVar2.b().containsKey(evwhVar.e)) {
                                dvuu dvuuVar = (dvuu) dvgmVar2.b().get(evwhVar.e);
                                if (dvuuVar.b() - 1 != i4) {
                                    ((dvgq) dvgsVar7).b.c(dvgmVar2.a(), "Unknown app state kind", new Object[i5]);
                                    hashSet.add(eycp.TARGETING_FAILED_REASON_UNKNOWN_APP_STATE_KIND);
                                } else if (evwhVar.c == 2) {
                                    evyg evygVar = (evyg) evwhVar.d;
                                    int i16 = evygVar.c;
                                    int i17 = evygVar.d;
                                    if (i17 == 0) {
                                        i17 = Alert.DURATION_SHOW_INDEFINITELY;
                                    }
                                    int a5 = dvuuVar.a();
                                    if (i16 > a5 || a5 >= i17) {
                                        i2 = i4;
                                        i3 = i5;
                                    } else {
                                        i2 = i4;
                                        i3 = i5;
                                        i5 = i2;
                                    }
                                    int i18 = i5 != evwpVar.e ? i2 : i3;
                                    if (i18 == 0) {
                                        Locale locale = Locale.US;
                                        eygrVar = eygrVar2;
                                        String str = evwhVar.e;
                                        Integer valueOf = Integer.valueOf(a5);
                                        Integer valueOf2 = Integer.valueOf(i16);
                                        Integer valueOf3 = Integer.valueOf(i17);
                                        Boolean valueOf4 = Boolean.valueOf(evwpVar.e);
                                        Object[] objArr = new Object[5];
                                        objArr[i3] = str;
                                        objArr[i2] = valueOf;
                                        objArr[2] = valueOf2;
                                        objArr[3] = valueOf3;
                                        objArr[4] = valueOf4;
                                        dvgmVar = dvgmVar2;
                                        String format = String.format(locale, "Invalid app state %s (integer). \nvalue: %d \nmin inclusive: %d\nmax exclusive: %d \nshould negate: %s", objArr);
                                        dvdy dvdyVar = ((dvgq) dvgsVar7).b;
                                        dvdp a6 = dvgmVar.a();
                                        Object[] objArr2 = new Object[i2];
                                        objArr2[i3] = format;
                                        dvdyVar.c(a6, "%s", objArr2);
                                        hashSet.add(eycp.TARGETING_FAILED_REASON_APP_STATE_COUNT_NOT_IN_RANGE);
                                    } else {
                                        eygrVar = eygrVar2;
                                        dvgmVar = dvgmVar2;
                                    }
                                    ((ensz) dvgq.a.o().h("com/google/android/libraries/internal/growth/growthkit/internal/predicates/impl/AppStateTargetingTermPredicate", "apply", 90, "AppStateTargetingTermPredicate.java")).L("Passed app state validation %s (integer). \nvalue: %d \nmin inclusive: %d\nmax exclusive: %d \nshould negate: %s", evwhVar.e, Integer.valueOf(a5), Integer.valueOf(i16), Integer.valueOf(i17), Boolean.valueOf(evwpVar.e));
                                    if (i18 != 0) {
                                        i5 = i3;
                                        eygrVar2 = eygrVar;
                                        dvgmVar2 = dvgmVar;
                                        i4 = 1;
                                    }
                                } else {
                                    eygrVar = eygrVar2;
                                    dvgmVar = dvgmVar2;
                                    ((dvgq) dvgsVar7).b.c(dvgmVar.a(), "Integer app state does not have satisfied_range", new Object[i5]);
                                    hashSet.add(eycp.TARGETING_FAILED_REASON_MISSING_APP_STATE_SATISFIED_RANGE);
                                }
                            } else {
                                dvdy dvdyVar2 = ((dvgq) dvgsVar7).b;
                                dvdp a7 = dvgmVar2.a();
                                String str2 = evwhVar.e;
                                Object[] objArr3 = new Object[i4];
                                objArr3[i5] = str2;
                                dvdyVar2.c(a7, "Missing required app state [%s]", objArr3);
                                hashSet.add(eycp.TARGETING_FAILED_REASON_MISSING_APP_STATE);
                            }
                            eygrVar = eygrVar2;
                            dvgmVar = dvgmVar2;
                            i = i4;
                        } else {
                            eygrVar = eygrVar2;
                            dvgmVar = dvgmVar2;
                            hashSet.add(eycp.TARGETING_FAILED_REASON_NULL_INPUT_TERM_OR_CONTEXT);
                        }
                        i = 1;
                    }
                }
                this.b.k(dvgmVar2.a(), false, enpd.a);
                return true;
            }
            eygrVar = eygrVar2;
            dvgmVar = dvgmVar2;
            i = i4;
            hashSet.add(eycp.TARGETING_FAILED_REASON_NULL_INPUT_TERM_OR_CONTEXT);
            i6++;
            i4 = i;
            eygrVar2 = eygrVar;
            dvgmVar2 = dvgmVar;
            i5 = 0;
        }
        this.b.k(dvgmVar2.a(), i4, enip.o(hashSet));
        return false;
    }
}
