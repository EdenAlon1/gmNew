package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhgi {
    public String a;
    public String d;
    public final List f;
    public List g;
    public String h;
    public String b = "";
    public String c = "";
    public int e = -1;

    public fhgi() {
        ArrayList arrayList = new ArrayList();
        this.f = arrayList;
        arrayList.add("");
    }

    private final int d() {
        int i = this.e;
        if (i != -1) {
            return i;
        }
        char[] cArr = fhgk.a;
        String str = this.a;
        str.getClass();
        return fhgj.a(str);
    }

    public final fhgk a() {
        ArrayList arrayList;
        String str = this.a;
        if (str == null) {
            throw new IllegalStateException("scheme == null");
        }
        char[] cArr = fhgk.a;
        String c = fhgj.c(this.b, 0, 0, false, 7);
        String c2 = fhgj.c(this.c, 0, 0, false, 7);
        String str2 = this.d;
        if (str2 == null) {
            throw new IllegalStateException("host == null");
        }
        int d = d();
        List list = this.f;
        ArrayList arrayList2 = new ArrayList(ffdx.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(fhgj.c((String) it.next(), 0, 0, false, 7));
        }
        List<String> list2 = this.g;
        if (list2 != null) {
            ArrayList arrayList3 = new ArrayList(ffdx.n(list2, 10));
            for (String str3 : list2) {
                arrayList3.add(str3 != null ? fhgj.c(str3, 0, 0, true, 3) : null);
            }
            arrayList = arrayList3;
        } else {
            arrayList = null;
        }
        String str4 = this.h;
        return new fhgk(str, c, c2, str2, d, arrayList2, arrayList, str4 != null ? fhgj.c(str4, 0, 0, false, 7) : null, toString());
    }

    public final void b(String str) {
        List list;
        if (str != null) {
            char[] cArr = fhgk.a;
            list = fhgj.d(fhgj.e(str, 0, 0, " \"'<>#", true, false, true, false, 211));
        } else {
            list = null;
        }
        this.g = list;
    }

    /* JADX WARN: Code restructure failed: missing block: B:132:0x020b, code lost:
    
        if (r4 < 65536) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x006d, code lost:
    
        if (r7 != ':') goto L4;
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01e2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(defpackage.fhgk r25, java.lang.String r26) {
        /*
            Method dump skipped, instructions count: 927
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fhgi.c(fhgk, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x007f, code lost:
    
        if (r1 != defpackage.fhgj.a(r3)) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fhgi.toString():java.lang.String");
    }
}
