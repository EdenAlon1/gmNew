package com.google.knowledge.hobbes.chat.tflite.reranker;

import defpackage.a;
import defpackage.emls;
import defpackage.engw;
import defpackage.enqv;
import defpackage.excz;
import defpackage.exdb;
import defpackage.exdd;
import defpackage.exde;
import defpackage.exdf;
import defpackage.exdg;
import defpackage.exdh;
import defpackage.exdi;
import defpackage.exdu;
import defpackage.fbrg;
import defpackage.fbri;
import defpackage.fbwy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class TfLiteReranker implements exdb {
    long a;
    private final int b;

    public TfLiteReranker(long j, int i) {
        this.a = j;
        this.b = i;
    }

    public static native long createFromUri(String str);

    private static String e(exde exdeVar) {
        return emls.a(exdeVar.a);
    }

    private native void internalClose(long j);

    private native Map<String, List<Float>> runGraph(long j, List<List<Float>> list, List<List<Integer>> list2, List<List<Integer>> list3, List<List<String>> list4, List<Integer> list5, List<String> list6, List<Integer> list7, List<Integer> list8);

    @Override // defpackage.exdb
    public final synchronized exdi a(exdf exdfVar, boolean z, int i, float f, int i2) {
        if (exdfVar.a.isEmpty()) {
            return new exdi(new ArrayList());
        }
        List c = c(exdfVar);
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        for (int i4 = 0; i4 < exdfVar.a.size(); i4++) {
            arrayList.add(new exdh((exde) exdfVar.a.get(i4), ((Float) c.get(i4)).floatValue()));
        }
        if (z) {
            Collections.sort(arrayList, new exdu());
        }
        exdi exdiVar = new exdi(arrayList);
        int i5 = i - 1;
        if (i5 == 0) {
            return exdiVar;
        }
        if (i5 == 1) {
            if ((z ? ((exdh) arrayList.get(0)).b : ((Float) Collections.max(c)).floatValue()) <= f) {
                arrayList = new ArrayList();
            }
            return new exdi(arrayList);
        }
        if (i5 == 2) {
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            while (i3 < size) {
                exdh exdhVar = (exdh) arrayList.get(i3);
                if (exdhVar.b > f) {
                    arrayList2.add(exdhVar);
                }
                i3++;
            }
            return new exdi(arrayList2);
        }
        if (i2 == 0 || i2 > this.b) {
            throw new IllegalArgumentException("targetImpressionSize is " + i2 + " but should be at least 1 and at most " + this.b);
        }
        ArrayList arrayList3 = new ArrayList();
        while (i3 < i2) {
            arrayList3.add(((exdh) arrayList.get(i3)).a);
            i3++;
        }
        exdd exddVar = new exdd(arrayList3);
        float b = b(new exdf(exddVar, exdfVar.c));
        exdg exdgVar = new exdg(exddVar, b);
        ArrayList arrayList4 = new ArrayList();
        if (b > f) {
            arrayList4.add(exdgVar);
        }
        return new exdi(arrayList, arrayList4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized float b(exdf exdfVar) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        ArrayList arrayList7;
        ArrayList arrayList8;
        if (exdfVar.b.size() != 1) {
            throw new IllegalArgumentException("rerankerInput.impressions has size" + exdfVar.b.size() + " but should contain 1 impression.");
        }
        exdd exddVar = (exdd) exdfVar.b.get(0);
        int size = exddVar.a.size();
        int i = this.b;
        if (size > i || size == 0) {
            throw new IllegalArgumentException(a.r(i, size, "Candidate impression had ", " suggestions, but the minimum is 1 and the maximum is "));
        }
        arrayList = new ArrayList();
        arrayList2 = new ArrayList();
        arrayList3 = new ArrayList();
        arrayList4 = new ArrayList();
        arrayList5 = new ArrayList();
        arrayList5.add(Integer.valueOf(size));
        ArrayList arrayList9 = new ArrayList();
        ArrayList arrayList10 = new ArrayList();
        ArrayList arrayList11 = new ArrayList();
        ArrayList arrayList12 = new ArrayList();
        for (exde exdeVar : exddVar.a) {
            fbwy fbwyVar = exdeVar.a.e;
            if (fbwyVar == null) {
                fbwyVar = fbwy.b;
            }
            arrayList9.add(Float.valueOf(fbwyVar.f));
            fbwy fbwyVar2 = exdeVar.a.e;
            if (fbwyVar2 == null) {
                fbwyVar2 = fbwy.b;
            }
            fbri b = fbri.b(fbwyVar2.l);
            if (b == null) {
                b = fbri.UNRECOGNIZED;
            }
            arrayList10.add(Integer.valueOf(b.a()));
            fbwy fbwyVar3 = exdeVar.a.e;
            if (fbwyVar3 == null) {
                fbwyVar3 = fbwy.b;
            }
            fbrg b2 = fbrg.b(fbwyVar3.g);
            if (b2 == null) {
                b2 = fbrg.UNRECOGNIZED;
            }
            arrayList11.add(Integer.valueOf(b2.a()));
            arrayList12.add(e(exdeVar));
        }
        int size2 = exddVar.a.size();
        for (int i2 = 0; i2 < this.b - size2; i2++) {
            arrayList9.add(Float.valueOf(0.0f));
            arrayList10.add(0);
            arrayList11.add(0);
            arrayList12.add("");
        }
        arrayList.add(arrayList9);
        arrayList2.add(arrayList10);
        arrayList3.add(arrayList11);
        arrayList4.add(arrayList12);
        arrayList6 = new ArrayList();
        arrayList7 = new ArrayList();
        arrayList8 = new ArrayList();
        enqv it = ((engw) exdfVar.c).iterator();
        while (it.hasNext()) {
            excz exczVar = (excz) it.next();
            arrayList6.add(exczVar.a);
            arrayList7.add(Integer.valueOf(exczVar.b));
            arrayList8.add(Integer.valueOf((int) exczVar.c));
        }
        return runGraph(this.a, arrayList, arrayList2, arrayList3, arrayList4, arrayList5, arrayList6, arrayList7, arrayList8).get("output_probabilities").get(0).floatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized List c(exdf exdfVar) {
        Throwable th;
        try {
            try {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                for (exde exdeVar : exdfVar.a) {
                    try {
                        ArrayList arrayList6 = new ArrayList();
                        ArrayList arrayList7 = new ArrayList();
                        ArrayList arrayList8 = new ArrayList();
                        ArrayList arrayList9 = new ArrayList();
                        fbwy fbwyVar = exdeVar.a.e;
                        if (fbwyVar == null) {
                            fbwyVar = fbwy.b;
                        }
                        arrayList6.add(Float.valueOf(fbwyVar.f));
                        fbwy fbwyVar2 = exdeVar.a.e;
                        if (fbwyVar2 == null) {
                            fbwyVar2 = fbwy.b;
                        }
                        fbri b = fbri.b(fbwyVar2.l);
                        if (b == null) {
                            b = fbri.UNRECOGNIZED;
                        }
                        arrayList7.add(Integer.valueOf(b.a()));
                        fbwy fbwyVar3 = exdeVar.a.e;
                        if (fbwyVar3 == null) {
                            fbwyVar3 = fbwy.b;
                        }
                        fbrg b2 = fbrg.b(fbwyVar3.g);
                        if (b2 == null) {
                            b2 = fbrg.UNRECOGNIZED;
                        }
                        arrayList8.add(Integer.valueOf(b2.a()));
                        arrayList9.add(e(exdeVar));
                        for (int i = 0; i < this.b - 1; i++) {
                            arrayList6.add(Float.valueOf(0.0f));
                            arrayList7.add(0);
                            arrayList8.add(0);
                            arrayList9.add("");
                        }
                        arrayList.add(arrayList6);
                        arrayList2.add(arrayList7);
                        arrayList3.add(arrayList8);
                        arrayList4.add(arrayList9);
                        arrayList5.add(1);
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                ArrayList arrayList10 = new ArrayList();
                ArrayList arrayList11 = new ArrayList();
                ArrayList arrayList12 = new ArrayList();
                enqv it = ((engw) exdfVar.c).iterator();
                while (it.hasNext()) {
                    excz exczVar = (excz) it.next();
                    arrayList10.add(exczVar.a);
                    arrayList11.add(Integer.valueOf(exczVar.b));
                    arrayList12.add(Integer.valueOf((int) exczVar.c));
                }
                return runGraph(this.a, arrayList, arrayList2, arrayList3, arrayList4, arrayList5, arrayList10, arrayList11, arrayList12).get("output_probabilities");
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    final synchronized void d() {
        internalClose(this.a);
        this.a = 0L;
    }

    protected final void finalize() {
        d();
    }
}
