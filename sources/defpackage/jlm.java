package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jlm implements CharSequence {
    public final List a;
    public final String b;
    public final List c;
    public final List d;

    public jlm(String str, List list) {
        this(true == list.isEmpty() ? null : list, str);
    }

    public final int a() {
        return this.b.length();
    }

    public final jlm b(jlm jlmVar) {
        jlj jljVar = new jlj(this);
        jljVar.e(jlmVar);
        return jljVar.b();
    }

    @Override // java.lang.CharSequence
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final jlm subSequence(int i, int i2) {
        if (i > i2) {
            jwo.b("start (" + i + ") should be less or equal to end (" + i2 + ')');
        }
        if (i == 0 && i2 == this.b.length()) {
            return this;
        }
        String substring = this.b.substring(i, i2);
        substring.getClass();
        List list = this.a;
        jlm jlmVar = jlp.a;
        if (i > i2) {
            jwo.b("start (" + i + ") should be less than or equal to end (" + i2 + ')');
        }
        ArrayList arrayList = null;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                jlk jlkVar = (jlk) list.get(i3);
                int i4 = jlkVar.b;
                if (jlp.b(i, i2, i4, jlkVar.c)) {
                    arrayList2.add(new jlk(jlkVar.a, Math.max(i, i4) - i, Math.min(i2, jlkVar.c) - i, jlkVar.d));
                }
            }
            if (true != arrayList2.isEmpty()) {
                arrayList = arrayList2;
            }
        }
        return new jlm(arrayList, substring);
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i) {
        return this.b.charAt(i);
    }

    public final List d() {
        List list = this.c;
        return list == null ? ffel.a : list;
    }

    public final List e(String str, int i, int i2) {
        List list = this.a;
        if (list == null) {
            return ffel.a;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            jlk jlkVar = (jlk) list.get(i3);
            if ((jlkVar.a instanceof jox) && ffkj.e(str, jlkVar.d) && jlp.b(i, i2, jlkVar.b, jlkVar.c)) {
                Object obj = jlkVar.a;
                obj.getClass();
                arrayList.add(new jlk(((jox) obj).a, jlkVar.b, jlkVar.c, jlkVar.d));
            }
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jlm)) {
            return false;
        }
        jlm jlmVar = (jlm) obj;
        return ffkj.e(this.b, jlmVar.b) && ffkj.e(this.a, jlmVar.a);
    }

    public final List f(int i) {
        List list = this.a;
        if (list == null) {
            return ffel.a;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            jlk jlkVar = (jlk) obj;
            if ((jlkVar.a instanceof jlw) && jlp.b(0, i, jlkVar.b, jlkVar.c)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        List list = this.a;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return a();
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.b;
    }

    public /* synthetic */ jlm(String str) {
        this(str, ffel.a);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ jlm(java.lang.String r2, java.util.List r3, int r4) {
        /*
            r1 = this;
            r4 = r4 & 2
            if (r4 == 0) goto L6
            ffel r3 = defpackage.ffel.a
        L6:
            jlm r4 = defpackage.jlp.a
            r4 = 1
            boolean r0 = r3.isEmpty()
            if (r4 != r0) goto L10
            r3 = 0
        L10:
            r1.<init>(r3, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jlm.<init>(java.lang.String, java.util.List, int):void");
    }

    public jlm(List list, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        this.a = list;
        this.b = str;
        if (list != null) {
            int size = list.size();
            arrayList = null;
            arrayList2 = null;
            for (int i = 0; i < size; i++) {
                jlk jlkVar = (jlk) list.get(i);
                Object obj = jlkVar.a;
                if (obj instanceof jou) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    jlkVar.getClass();
                    arrayList.add(jlkVar);
                } else if (obj instanceof jmk) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    jlkVar.getClass();
                    arrayList2.add(jlkVar);
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        this.c = arrayList;
        this.d = arrayList2;
        List ah = arrayList2 != null ? ffdx.ah(arrayList2, new jll()) : null;
        if (ah == null || ah.isEmpty()) {
            return;
        }
        cnv b = cmx.b(((jlk) ffdx.K(ah)).c);
        int size2 = ah.size();
        for (int i2 = 1; i2 < size2; i2++) {
            jlk jlkVar2 = (jlk) ah.get(i2);
            while (true) {
                if (b.b == 0) {
                    break;
                }
                int b2 = b.b();
                if (jlkVar2.b >= b2) {
                    b.c(b.b - 1);
                } else if (jlkVar2.c > b2) {
                    jwo.b("Paragraph overlap not allowed, end " + jlkVar2.c + " should be less than or equal to " + b2);
                }
            }
            b.e(jlkVar2.c);
        }
    }
}
