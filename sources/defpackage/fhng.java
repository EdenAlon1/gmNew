package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhng {
    private final void b(long j, fhmt fhmtVar, int i, List list, int i2, int i3, List list2) {
        int i4;
        long j2;
        List list3;
        int i5;
        int i6 = i;
        int i7 = i2;
        List list4 = list2;
        if (i7 >= i3) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        for (int i8 = i7; i8 < i3; i8++) {
            if (((fhmx) list.get(i8)).b() < i6) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }
        fhmx fhmxVar = (fhmx) list.get(i2);
        fhmx fhmxVar2 = (fhmx) list.get(i3 - 1);
        if (i6 == fhmxVar.b()) {
            int intValue = ((Number) list4.get(i7)).intValue();
            i7++;
            i4 = intValue;
            fhmxVar = (fhmx) list.get(i7);
        } else {
            i4 = -1;
        }
        int i9 = i7 + 1;
        long j3 = 2;
        if (fhmxVar.a(i6) == fhmxVar2.a(i6)) {
            int min = Math.min(fhmxVar.b(), fhmxVar2.b());
            int i10 = 0;
            int i11 = i6;
            while (true) {
                if (i11 >= min) {
                    j2 = j3;
                    break;
                }
                j2 = j3;
                if (fhmxVar.a(i11) != fhmxVar2.a(i11)) {
                    break;
                }
                i10++;
                i11++;
                j3 = j2;
            }
            long c = j + c(fhmtVar) + j2;
            long j4 = i10;
            fhmtVar.Q(-i10);
            fhmtVar.Q(i4);
            int i12 = i6 + i10;
            while (i6 < i12) {
                fhmtVar.Q(fhmxVar.a(i6) & 255);
                i6++;
            }
            if (i9 == i3) {
                if (i12 != ((fhmx) list.get(i7)).b()) {
                    throw new IllegalStateException("Check failed.");
                }
                fhmtVar.Q(((Number) list4.get(i7)).intValue());
                return;
            } else {
                long j5 = c + j4 + 1;
                fhmt fhmtVar2 = new fhmt();
                fhmtVar.Q(-((int) (c(fhmtVar2) + j5)));
                b(j5, fhmtVar2, i12, list, i7, i3, list4);
                fhmtVar.N(fhmtVar2);
                return;
            }
        }
        int i13 = 1;
        while (i9 < i3) {
            if (((fhmx) list.get(i9 - 1)).a(i6) != ((fhmx) list.get(i9)).a(i6)) {
                i13++;
            }
            i9++;
        }
        long c2 = j + c(fhmtVar) + 2;
        int i14 = i13 + i13;
        fhmtVar.Q(i13);
        fhmtVar.Q(i4);
        for (int i15 = i7; i15 < i3; i15++) {
            byte a = ((fhmx) list.get(i15)).a(i6);
            if (i15 == i7 || a != ((fhmx) list.get(i15 - 1)).a(i6)) {
                fhmtVar.Q(a & 255);
            }
        }
        fhmt fhmtVar3 = new fhmt();
        int i16 = i7;
        while (i16 < i3) {
            int i17 = i6 + 1;
            byte a2 = ((fhmx) list.get(i16)).a(i6);
            int i18 = i16 + 1;
            int i19 = i18;
            while (true) {
                if (i19 >= i3) {
                    i19 = i3;
                    break;
                } else if (a2 != ((fhmx) list.get(i19)).a(i6)) {
                    break;
                } else {
                    i19++;
                }
            }
            if (i18 == i19 && i17 == ((fhmx) list.get(i16)).b()) {
                fhmtVar.Q(((Number) list4.get(i16)).intValue());
                list3 = list4;
                i5 = i19;
            } else {
                long j6 = i14 + c2;
                fhmtVar.Q(-((int) (j6 + c(fhmtVar3))));
                list3 = list4;
                i5 = i19;
                b(j6, fhmtVar3, i17, list, i16, i5, list3);
            }
            i16 = i5;
            list4 = list3;
        }
        fhmtVar.N(fhmtVar3);
    }

    private static final long c(fhmt fhmtVar) {
        return fhmtVar.b / 4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a8, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.fhnh a(defpackage.fhmx... r11) {
        /*
            r10 = this;
            java.util.List r5 = defpackage.ffdo.M(r11)
            defpackage.ffdx.p(r5)
            int r0 = r5.size()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>(r0)
            r9 = 0
            r1 = r9
        L12:
            if (r1 >= r0) goto L1f
            r2 = -1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r8.add(r2)
            int r1 = r1 + 1
            goto L12
        L1f:
            int r0 = r11.length
            r1 = r9
            r2 = r1
        L22:
            if (r1 >= r0) goto L37
            r3 = r11[r1]
            int r4 = r2 + 1
            int r3 = defpackage.ffdx.m(r5, r3)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r8.set(r3, r2)
            int r1 = r1 + 1
            r2 = r4
            goto L22
        L37:
            java.lang.Object r0 = r5.get(r9)
            fhmx r0 = (defpackage.fhmx) r0
            int r0 = r0.b()
            if (r0 <= 0) goto Ldd
            r0 = r9
        L44:
            int r1 = r5.size()
            if (r0 >= r1) goto Laa
            java.lang.Object r1 = r5.get(r0)
            fhmx r1 = (defpackage.fhmx) r1
            int r2 = r0 + 1
            r3 = r2
        L53:
            int r4 = r5.size()
            if (r3 >= r4) goto La8
            java.lang.Object r4 = r5.get(r3)
            fhmx r4 = (defpackage.fhmx) r4
            boolean r6 = r4.i(r1)
            if (r6 == 0) goto La8
            int r6 = r4.b()
            int r7 = r1.b()
            if (r6 == r7) goto L95
            java.lang.Object r4 = r8.get(r3)
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            java.lang.Object r6 = r8.get(r0)
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            if (r4 <= r6) goto L92
            r5.remove(r3)
            java.lang.Object r4 = r8.remove(r3)
            java.lang.Number r4 = (java.lang.Number) r4
            r4.intValue()
            goto L53
        L92:
            int r3 = r3 + 1
            goto L53
        L95:
            java.util.Objects.toString(r4)
            java.lang.String r11 = java.lang.String.valueOf(r4)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "duplicate option: "
            java.lang.String r11 = r1.concat(r11)
            r0.<init>(r11)
            throw r0
        La8:
            r0 = r2
            goto L44
        Laa:
            fhmt r3 = new fhmt
            r3.<init>()
            r6 = 0
            int r7 = r5.size()
            r1 = 0
            r4 = 0
            r0 = r10
            r0.b(r1, r3, r4, r5, r6, r7, r8)
            long r0 = c(r3)
            int r0 = (int) r0
            int[] r1 = new int[r0]
        Lc2:
            if (r9 >= r0) goto Lcd
            int r2 = r3.f()
            r1[r9] = r2
            int r9 = r9 + 1
            goto Lc2
        Lcd:
            int r0 = r11.length
            fhnh r2 = new fhnh
            java.lang.Object[] r11 = java.util.Arrays.copyOf(r11, r0)
            r11.getClass()
            fhmx[] r11 = (defpackage.fhmx[]) r11
            r2.<init>(r11, r1)
            return r2
        Ldd:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "the empty byte string is not a supported option"
            r11.<init>(r0)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fhng.a(fhmx[]):fhnh");
    }
}
