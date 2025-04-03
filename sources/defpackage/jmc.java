package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jmc implements jmi {
    public final jlm a;
    public final List b;
    public final List d;
    public final ffbz c = ffca.b(3, new jmb(this));
    private final ffbz e = ffca.b(3, new jma(this));

    public jmc(jlm jlmVar, jpo jpoVar, List list, jzn jznVar, jse jseVar) {
        String str;
        jlk jlkVar;
        int i;
        int i2;
        jlm jlmVar2 = jlmVar;
        jpo jpoVar2 = jpoVar;
        this.a = jlmVar2;
        this.b = list;
        jmk jmkVar = jpoVar2.c;
        jlm jlmVar3 = jlp.a;
        List list2 = jlmVar2.d;
        List ah = list2 != null ? ffdx.ah(list2, new jln()) : ffel.a;
        ArrayList arrayList = new ArrayList();
        ffdn ffdnVar = new ffdn();
        int size = ah.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            jlk jlkVar2 = (jlk) ah.get(i4);
            jlk a = jlk.a(jlkVar2, jmkVar.a((jmk) jlkVar2.a), 0, 14);
            while (true) {
                i2 = a.b;
                if (i3 >= i2 || ffdnVar.isEmpty()) {
                    break;
                }
                jlk jlkVar3 = (jlk) ffdnVar.e();
                int i5 = a.b;
                int i6 = jlkVar3.c;
                if (i5 < i6) {
                    arrayList.add(new jlk(jlkVar3.a, i3, i5));
                    i3 = a.b;
                } else {
                    arrayList.add(new jlk(jlkVar3.a, i3, i6));
                    i3 = jlkVar3.c;
                    while (!ffdnVar.isEmpty() && i3 == ((jlk) ffdnVar.e()).c) {
                        ffdnVar.removeLast();
                    }
                }
            }
            if (i3 < i2) {
                arrayList.add(new jlk(jmkVar, i3, i2));
                i3 = a.b;
            }
            jlk jlkVar4 = (jlk) ffdnVar.f();
            if (jlkVar4 != null) {
                int i7 = jlkVar4.b;
                if (i7 == a.b && jlkVar4.c == a.c) {
                    ffdnVar.removeLast();
                    ffdnVar.add(new jlk(((jmk) jlkVar4.a).a((jmk) a.a), a.b, a.c));
                } else {
                    int i8 = jlkVar4.c;
                    if (i7 == i8) {
                        arrayList.add(new jlk(jlkVar4.a, i7, i8));
                        ffdnVar.removeLast();
                        ffdnVar.add(new jlk(a.a, a.b, a.c));
                    } else {
                        if (i8 < a.c) {
                            throw new IllegalArgumentException();
                        }
                        ffdnVar.add(new jlk(((jmk) jlkVar4.a).a((jmk) a.a), a.b, a.c));
                    }
                }
            } else {
                ffdnVar.add(new jlk(a.a, a.b, a.c));
            }
        }
        while (i3 <= jlmVar2.b.length() && !ffdnVar.isEmpty()) {
            jlk jlkVar5 = (jlk) ffdnVar.e();
            arrayList.add(new jlk(jlkVar5.a, i3, jlkVar5.c));
            i3 = jlkVar5.c;
            while (!ffdnVar.isEmpty() && i3 == ((jlk) ffdnVar.e()).c) {
                ffdnVar.removeLast();
            }
        }
        if (i3 < jlmVar2.b.length()) {
            arrayList.add(new jlk(jmkVar, i3, jlmVar2.b.length()));
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new jlk(jmkVar, 0, 0));
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        int i9 = 0;
        while (i9 < size2) {
            jlk jlkVar6 = (jlk) arrayList.get(i9);
            int i10 = jlkVar6.b;
            int i11 = jlkVar6.c;
            if (i10 != i11) {
                str = jlmVar2.b.substring(i10, i11);
                str.getClass();
            } else {
                str = "";
            }
            List a2 = jlp.a(jlmVar2, i10, i11, jlo.a);
            jlm jlmVar4 = new jlm(str, a2 == null ? ffel.a : a2);
            jmk jmkVar2 = (jmk) jlkVar6.a;
            if (jyl.b(jmkVar2.b, Integer.MIN_VALUE)) {
                jlkVar = jlkVar6;
                jmkVar2 = new jmk(jmkVar2.a, jmkVar.b, jmkVar2.c, jmkVar2.d, jmkVar2.e, jmkVar2.f, jmkVar2.g, jmkVar2.h, jmkVar2.i);
            } else {
                jlkVar = jlkVar6;
            }
            String str2 = jlmVar4.b;
            jpo jpoVar3 = new jpo(jpoVar2.b, jpoVar2.c.a(jmkVar2));
            List list3 = jlmVar4.a;
            List list4 = list3 == null ? ffel.a : list3;
            List list5 = this.b;
            int i12 = jlkVar.b;
            int i13 = jlkVar.c;
            ArrayList arrayList3 = new ArrayList(list5.size());
            int size3 = list5.size();
            int i14 = 0;
            while (i14 < size3) {
                int i15 = i14;
                jlk jlkVar7 = (jlk) list5.get(i14);
                jmk jmkVar3 = jmkVar;
                int i16 = jlkVar7.b;
                ArrayList arrayList4 = arrayList;
                int i17 = jlkVar7.c;
                if (jlp.b(i12, i13, i16, i17)) {
                    if (i12 > i16 || i17 > i13) {
                        jwo.b("placeholder can not overlap with paragraph.");
                    }
                    i = size2;
                    arrayList3.add(new jlk(jlkVar7.a, jlkVar7.b - i12, jlkVar7.c - i12));
                } else {
                    i = size2;
                }
                i14 = i15 + 1;
                jmkVar = jmkVar3;
                arrayList = arrayList4;
                size2 = i;
            }
            arrayList2.add(new jmh(new jwx(str2, jpoVar3, list4, arrayList3, jseVar, jznVar), jlkVar.b, jlkVar.c));
            i9++;
            jlmVar2 = jlmVar;
            jpoVar2 = jpoVar;
            jmkVar = jmkVar;
        }
        this.d = arrayList2;
    }

    @Override // defpackage.jmi
    public final float a() {
        return ((Number) this.e.a()).floatValue();
    }

    @Override // defpackage.jmi
    public final float b() {
        throw null;
    }

    @Override // defpackage.jmi
    public final boolean c() {
        List list = this.d;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((jmh) list.get(i)).a.c()) {
                return true;
            }
        }
        return false;
    }
}
