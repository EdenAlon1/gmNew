package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class evob extends evlf {
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0057, code lost:
    
        r11.f = r11.k();
     */
    @Override // defpackage.evlf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object a(defpackage.evpl r11) {
        /*
            r10 = this;
            java.lang.String r0 = "Expected a long but was "
            int r1 = r11.t()
            r2 = 0
            r3 = 9
            if (r1 != r3) goto Lf
            r11.p()
            return r2
        Lf:
            int r1 = r11.c     // Catch: java.lang.NumberFormatException -> Lc2
            if (r1 != 0) goto L17
            int r1 = r11.b()     // Catch: java.lang.NumberFormatException -> Lc2
        L17:
            r4 = 15
            r5 = 0
            if (r1 != r4) goto L2e
            r11.c = r5     // Catch: java.lang.NumberFormatException -> Lc2
            int[] r0 = r11.h     // Catch: java.lang.NumberFormatException -> Lc2
            int r1 = r11.g     // Catch: java.lang.NumberFormatException -> Lc2
            int r1 = r1 + (-1)
            r2 = r0[r1]     // Catch: java.lang.NumberFormatException -> Lc2
            int r2 = r2 + 1
            r0[r1] = r2     // Catch: java.lang.NumberFormatException -> Lc2
            long r0 = r11.d     // Catch: java.lang.NumberFormatException -> Lc2
            goto La2
        L2e:
            r4 = 16
            if (r1 != r4) goto L43
            char[] r1 = r11.a     // Catch: java.lang.NumberFormatException -> Lc2
            java.lang.String r3 = new java.lang.String     // Catch: java.lang.NumberFormatException -> Lc2
            int r4 = r11.b     // Catch: java.lang.NumberFormatException -> Lc2
            int r6 = r11.e     // Catch: java.lang.NumberFormatException -> Lc2
            r3.<init>(r1, r4, r6)     // Catch: java.lang.NumberFormatException -> Lc2
            r11.f = r3     // Catch: java.lang.NumberFormatException -> Lc2
            int r4 = r4 + r6
            r11.b = r4     // Catch: java.lang.NumberFormatException -> Lc2
            goto L81
        L43:
            r4 = 10
            r6 = 8
            if (r1 == r6) goto L55
            if (r1 == r3) goto L55
            if (r1 != r4) goto L4e
            goto L55
        L4e:
            java.lang.String r0 = "a long"
            java.lang.IllegalStateException r11 = r11.d(r0)     // Catch: java.lang.NumberFormatException -> Lc2
            throw r11     // Catch: java.lang.NumberFormatException -> Lc2
        L55:
            if (r1 != r4) goto L5e
            java.lang.String r1 = r11.k()     // Catch: java.lang.NumberFormatException -> Lc2
            r11.f = r1     // Catch: java.lang.NumberFormatException -> Lc2
            goto L6b
        L5e:
            if (r1 != r6) goto L63
            r1 = 39
            goto L65
        L63:
            r1 = 34
        L65:
            java.lang.String r1 = r11.i(r1)     // Catch: java.lang.NumberFormatException -> Lc2
            r11.f = r1     // Catch: java.lang.NumberFormatException -> Lc2
        L6b:
            java.lang.String r1 = r11.f     // Catch: java.lang.NumberFormatException -> L81
            long r3 = java.lang.Long.parseLong(r1)     // Catch: java.lang.NumberFormatException -> L81
            r11.c = r5     // Catch: java.lang.NumberFormatException -> L81
            int[] r1 = r11.h     // Catch: java.lang.NumberFormatException -> L81
            int r6 = r11.g     // Catch: java.lang.NumberFormatException -> L81
            int r6 = r6 + (-1)
            r7 = r1[r6]     // Catch: java.lang.NumberFormatException -> L81
            int r7 = r7 + 1
            r1[r6] = r7     // Catch: java.lang.NumberFormatException -> L81
            r0 = r3
            goto La2
        L81:
            r1 = 11
            r11.c = r1     // Catch: java.lang.NumberFormatException -> Lc2
            java.lang.String r1 = r11.f     // Catch: java.lang.NumberFormatException -> Lc2
            double r3 = java.lang.Double.parseDouble(r1)     // Catch: java.lang.NumberFormatException -> Lc2
            long r6 = (long) r3     // Catch: java.lang.NumberFormatException -> Lc2
            double r8 = (double) r6     // Catch: java.lang.NumberFormatException -> Lc2
            int r1 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r1 != 0) goto La7
            r11.f = r2     // Catch: java.lang.NumberFormatException -> Lc2
            r11.c = r5     // Catch: java.lang.NumberFormatException -> Lc2
            int[] r0 = r11.h     // Catch: java.lang.NumberFormatException -> Lc2
            int r11 = r11.g     // Catch: java.lang.NumberFormatException -> Lc2
            int r11 = r11 + (-1)
            r1 = r0[r11]     // Catch: java.lang.NumberFormatException -> Lc2
            int r1 = r1 + 1
            r0[r11] = r1     // Catch: java.lang.NumberFormatException -> Lc2
            r0 = r6
        La2:
            java.lang.Long r11 = java.lang.Long.valueOf(r0)     // Catch: java.lang.NumberFormatException -> Lc2
            return r11
        La7:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException     // Catch: java.lang.NumberFormatException -> Lc2
            java.lang.String r2 = r11.f     // Catch: java.lang.NumberFormatException -> Lc2
            java.lang.String r11 = r11.g()     // Catch: java.lang.NumberFormatException -> Lc2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> Lc2
            r3.<init>(r0)     // Catch: java.lang.NumberFormatException -> Lc2
            r3.append(r2)     // Catch: java.lang.NumberFormatException -> Lc2
            r3.append(r11)     // Catch: java.lang.NumberFormatException -> Lc2
            java.lang.String r11 = r3.toString()     // Catch: java.lang.NumberFormatException -> Lc2
            r1.<init>(r11)     // Catch: java.lang.NumberFormatException -> Lc2
            throw r1     // Catch: java.lang.NumberFormatException -> Lc2
        Lc2:
            r11 = move-exception
            evlb r0 = new evlb
            r0.<init>(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.evob.a(evpl):java.lang.Object");
    }

    @Override // defpackage.evlf
    public final /* bridge */ /* synthetic */ void b(evpn evpnVar, Object obj) {
        Number number = (Number) obj;
        if (number == null) {
            evpnVar.j();
        } else {
            evpnVar.k(number.longValue());
        }
    }
}
