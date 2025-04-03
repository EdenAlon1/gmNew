package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhnz {
    public static final byte[] a = fhny.b("0123456789abcdef");

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0054, code lost:
    
        r1 = r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006b A[LOOP:1: B:11:0x002a->B:22:0x006b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0064 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int a(defpackage.fhmt r16, defpackage.fhnh r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 163
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fhnz.a(fhmt, fhnh, boolean):int");
    }

    public static final String b(fhmt fhmtVar, long j) {
        if (j > 0) {
            long j2 = (-1) + j;
            if (fhmtVar.c(j2) == 13) {
                String n = fhmtVar.n(j2);
                fhmtVar.C(2L);
                return n;
            }
        }
        String n2 = fhmtVar.n(j);
        fhmtVar.C(1L);
        return n2;
    }

    public static final boolean c(fhnq fhnqVar, int i, byte[] bArr, int i2) {
        fhnqVar.getClass();
        bArr.getClass();
        byte[] bArr2 = fhnqVar.a;
        int i3 = fhnqVar.c;
        for (int i4 = 1; i4 < i2; i4++) {
            if (i == i3) {
                fhnqVar = fhnqVar.f;
                fhnqVar.getClass();
                byte[] bArr3 = fhnqVar.a;
                int i5 = fhnqVar.b;
                i3 = fhnqVar.c;
                bArr2 = bArr3;
                i = i5;
            }
            if (bArr2[i] != bArr[i4]) {
                return false;
            }
            i++;
        }
        return true;
    }
}
