package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class njt {
    /* JADX WARN: Removed duplicated region for block: B:16:0x005c A[LOOP:0: B:14:0x0056->B:16:0x005c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(defpackage.njw r12, defpackage.nki r13, defpackage.lts r14) {
        /*
            long r0 = r13.b
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r5 = 0
            if (r4 != 0) goto Le
            r4 = r5
            goto L26
        Le:
            int r4 = r12.b(r0)
            r6 = -1
            if (r4 != r6) goto L19
            int r4 = r12.a()
        L19:
            if (r4 <= 0) goto L26
            int r6 = r4 + (-1)
            long r7 = r12.c(r6)
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 != 0) goto L26
            r4 = r6
        L26:
            long r0 = r13.b
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L54
            int r0 = r12.a()
            if (r4 >= r0) goto L54
            long r0 = r13.b
            java.util.List r7 = r12.e(r0)
            long r0 = r12.c(r4)
            boolean r2 = r7.isEmpty()
            if (r2 != 0) goto L54
            long r8 = r13.b
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 >= 0) goto L54
            long r10 = r0 - r8
            njp r6 = new njp
            r6.<init>(r7, r8, r10)
            r14.a(r6)
            r0 = 1
            goto L55
        L54:
            r0 = r5
        L55:
            r1 = r4
        L56:
            int r2 = r12.a()
            if (r1 >= r2) goto L62
            b(r12, r1, r14)
            int r1 = r1 + 1
            goto L56
        L62:
            boolean r1 = r13.c
            if (r1 == 0) goto L8e
            if (r0 == 0) goto L6a
            int r4 = r4 + (-1)
        L6a:
            if (r5 >= r4) goto L72
            b(r12, r5, r14)
            int r5 = r5 + 1
            goto L6a
        L72:
            if (r0 == 0) goto L8e
            long r0 = r13.b
            njp r5 = new njp
            java.util.List r6 = r12.e(r0)
            long r7 = r12.c(r4)
            long r0 = r13.b
            long r12 = r12.c(r4)
            long r9 = r0 - r12
            r5.<init>(r6, r7, r9)
            r14.a(r5)
        L8e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.njt.a(njw, nki, lts):void");
    }

    private static void b(njw njwVar, int i, lts ltsVar) {
        long c = njwVar.c(i);
        List e = njwVar.e(c);
        if (e.isEmpty()) {
            return;
        }
        if (i == njwVar.a() - 1) {
            throw new IllegalStateException();
        }
        long c2 = njwVar.c(i + 1) - njwVar.c(i);
        if (c2 > 0) {
            ltsVar.a(new njp(e, c, c2));
        }
    }
}
