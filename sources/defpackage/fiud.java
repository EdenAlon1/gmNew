package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fiud implements fiuq, fiuo {
    private final int a;

    public fiud(int i) {
        this.a = i;
    }

    @Override // defpackage.fiuo
    public final int a() {
        return this.a == 1 ? 4 : 20;
    }

    @Override // defpackage.fiuq
    public final int b() {
        return this.a == 1 ? 4 : 20;
    }

    @Override // defpackage.fiuo
    public final int c(fiuk fiukVar, CharSequence charSequence, int i) {
        Map map = firh.a;
        String str = null;
        for (String str2 : map.keySet()) {
            if (fiuh.c(charSequence, i, str2) && (str == null || str2.length() > str.length())) {
                str = str2;
            }
        }
        if (str == null) {
            return ~i;
        }
        fiukVar.f((firk) map.get(str));
        return i + str.length();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007f  */
    @Override // defpackage.fiuq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(java.lang.Appendable r4, long r5, defpackage.firb r7, int r8, defpackage.firk r9, java.util.Locale r10) {
        /*
            r3 = this;
            if (r9 != 0) goto L6
            java.lang.String r5 = ""
            goto L89
        L6:
            long r7 = (long) r8
            long r5 = r5 - r7
            int r7 = r3.a
            r8 = 0
            if (r7 == 0) goto L4b
            if (r10 != 0) goto L13
            java.util.Locale r10 = java.util.Locale.getDefault()
        L13:
            java.lang.String r7 = r9.g(r5)
            if (r7 != 0) goto L1d
            java.lang.String r5 = r9.c
            goto L89
        L1d:
            fiuy r0 = defpackage.firk.d
            boolean r1 = r0 instanceof defpackage.fiuy
            r2 = 0
            if (r1 == 0) goto L34
            java.lang.String r7 = r9.c
            boolean r1 = r9.l(r5)
            java.lang.String[] r7 = r0.b(r10, r7, r1)
            if (r7 != 0) goto L31
            goto L3c
        L31:
            r7 = r7[r2]
            goto L40
        L34:
            java.lang.String r1 = r9.c
            java.lang.String[] r7 = r0.a(r10, r1, r7)
            if (r7 != 0) goto L3e
        L3c:
            r7 = r8
            goto L40
        L3e:
            r7 = r7[r2]
        L40:
            if (r7 != 0) goto L88
            int r5 = r9.a(r5)
            java.lang.String r5 = defpackage.firk.h(r5)
            goto L89
        L4b:
            if (r10 != 0) goto L51
            java.util.Locale r10 = java.util.Locale.getDefault()
        L51:
            java.lang.String r7 = r9.g(r5)
            if (r7 != 0) goto L5a
            java.lang.String r5 = r9.c
            goto L89
        L5a:
            fiuy r0 = defpackage.firk.d
            boolean r1 = r0 instanceof defpackage.fiuy
            r2 = 1
            if (r1 == 0) goto L71
            java.lang.String r7 = r9.c
            boolean r1 = r9.l(r5)
            java.lang.String[] r7 = r0.b(r10, r7, r1)
            if (r7 != 0) goto L6e
            goto L79
        L6e:
            r7 = r7[r2]
            goto L7d
        L71:
            java.lang.String r1 = r9.c
            java.lang.String[] r7 = r0.a(r10, r1, r7)
            if (r7 != 0) goto L7b
        L79:
            r7 = r8
            goto L7d
        L7b:
            r7 = r7[r2]
        L7d:
            if (r7 != 0) goto L88
            int r5 = r9.a(r5)
            java.lang.String r5 = defpackage.firk.h(r5)
            goto L89
        L88:
            r5 = r7
        L89:
            r4.append(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fiud.d(java.lang.Appendable, long, firb, int, firk, java.util.Locale):void");
    }
}
