package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emdi {
    public static final List a(List list, int i) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!ffpc.J(((sda) obj).c())) {
                arrayList.add(obj);
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            sda sdaVar = (sda) obj2;
            if (hashSet.add(new ffcf(Integer.valueOf(sdaVar.b()), sdaVar.c()))) {
                arrayList2.add(obj2);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj3 : arrayList2) {
            Integer valueOf = Integer.valueOf(((sda) obj3).b());
            Object obj4 = linkedHashMap.get(valueOf);
            if (obj4 == null) {
                obj4 = new ArrayList();
                linkedHashMap.put(valueOf, obj4);
            }
            ((List) obj4).add(obj3);
        }
        Collection values = linkedHashMap.values();
        ArrayList arrayList3 = new ArrayList(ffdx.n(values, 10));
        Iterator it = values.iterator();
        while (it.hasNext()) {
            arrayList3.add(d((List) it.next(), new ffji() { // from class: emdh
                @Override // defpackage.ffji
                public final Object invoke(Object obj5) {
                    sda sdaVar2 = (sda) obj5;
                    sdaVar2.getClass();
                    return sdaVar2.c();
                }
            }, i));
        }
        return ffdx.o(arrayList3);
    }

    public static final esgx b(int i) {
        switch (i) {
            case 0:
                return esgx.TONE_UNSPECIFIED;
            case 1:
                return esgx.TONE_FORMAL;
            case 2:
                return esgx.TONE_CONCISE;
            case 3:
                return esgx.TONE_SHAKESPEARE;
            case 4:
                return esgx.TONE_CHILL;
            case 5:
                return esgx.TONE_REPHRASE;
            case 6:
                return esgx.TONE_RHYMES;
            case 7:
                return esgx.TONE_EXCITED;
            default:
                return esgx.UNRECOGNIZED;
        }
    }

    public static final List c(List list, int i) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!ffpc.J(((sdm) obj).c())) {
                arrayList.add(obj);
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (hashSet.add(((sdm) obj2).c())) {
                arrayList2.add(obj2);
            }
        }
        return d(arrayList2, new ffji() { // from class: emdg
            @Override // defpackage.ffji
            public final Object invoke(Object obj3) {
                sdm sdmVar = (sdm) obj3;
                sdmVar.getClass();
                return sdmVar.c();
            }
        }, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0146, code lost:
    
        if (r14 > r30) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0153 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x016d A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final java.util.List d(java.util.List r28, defpackage.ffji r29, int r30) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.emdi.d(java.util.List, ffji, int):java.util.List");
    }
}
