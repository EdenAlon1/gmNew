package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nma implements njw {
    private final nlt a;
    private final long[] b;
    private final Map c;
    private final Map d;
    private final Map e;

    public nma(nlt nltVar, Map map, Map map2, Map map3) {
        this.a = nltVar;
        this.d = map2;
        this.e = map3;
        this.c = DesugarCollections.unmodifiableMap(map);
        TreeSet treeSet = new TreeSet();
        int i = 0;
        nltVar.d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        this.b = jArr;
    }

    @Override // defpackage.njw
    public final int a() {
        return this.b.length;
    }

    @Override // defpackage.njw
    public final int b(long j) {
        long[] jArr = this.b;
        int aj = lvf.aj(jArr, j, false);
        if (aj < jArr.length) {
            return aj;
        }
        return -1;
    }

    @Override // defpackage.njw
    public final long c(int i) {
        return this.b[i];
    }

    @Override // defpackage.njw
    public final List e(long j) {
        ArrayList arrayList = new ArrayList();
        nlt nltVar = this.a;
        nltVar.e(j, nltVar.h, arrayList);
        TreeMap treeMap = new TreeMap();
        nltVar.g(j, false, nltVar.h, treeMap);
        Map map = this.c;
        Map map2 = this.d;
        nltVar.f(j, map, map2, nltVar.h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Map map3 = this.e;
            Pair pair = (Pair) arrayList.get(i);
            String str = (String) map3.get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                nlx nlxVar = (nlx) map2.get(pair.first);
                lti.f(nlxVar);
                lsy lsyVar = new lsy();
                lsyVar.b = decodeByteArray;
                lsyVar.f = nlxVar.b;
                lsyVar.g = 0;
                lsyVar.c(nlxVar.c, 0);
                lsyVar.e = nlxVar.e;
                lsyVar.h = nlxVar.f;
                lsyVar.i = nlxVar.g;
                lsyVar.j = nlxVar.j;
                arrayList2.add(lsyVar.a());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            nlx nlxVar2 = (nlx) map2.get(entry.getKey());
            lti.f(nlxVar2);
            lsy lsyVar2 = (lsy) entry.getValue();
            CharSequence charSequence = lsyVar2.a;
            lti.f(charSequence);
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (nlr nlrVar : (nlr[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), nlr.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(nlrVar), spannableStringBuilder.getSpanEnd(nlrVar), (CharSequence) "");
            }
            int i2 = 0;
            while (i2 < spannableStringBuilder.length()) {
                int i3 = i2 + 1;
                if (spannableStringBuilder.charAt(i2) == ' ') {
                    int i4 = i3;
                    while (i4 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i4) == ' ') {
                        i4++;
                    }
                    int i5 = i4 - i3;
                    if (i5 > 0) {
                        spannableStringBuilder.delete(i2, i5 + i2);
                    }
                }
                i2 = i3;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            int i6 = 0;
            while (i6 < spannableStringBuilder.length() - 1) {
                int i7 = i6 + 1;
                if (spannableStringBuilder.charAt(i6) == '\n' && spannableStringBuilder.charAt(i7) == ' ') {
                    spannableStringBuilder.delete(i7, i6 + 2);
                }
                i6 = i7;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            int i8 = 0;
            while (i8 < spannableStringBuilder.length() - 1) {
                int i9 = i8 + 1;
                if (spannableStringBuilder.charAt(i8) == ' ' && spannableStringBuilder.charAt(i9) == '\n') {
                    spannableStringBuilder.delete(i8, i9);
                }
                i8 = i9;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            lsyVar2.c(nlxVar2.c, nlxVar2.d);
            lsyVar2.e = nlxVar2.e;
            lsyVar2.f = nlxVar2.b;
            lsyVar2.h = nlxVar2.f;
            lsyVar2.d(nlxVar2.i, nlxVar2.h);
            lsyVar2.j = nlxVar2.j;
            arrayList2.add(lsyVar2.a());
        }
        return arrayList2;
    }
}
