package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iyf extends iyb {
    public static iyf b;

    private final boolean e(int i) {
        if (i <= 0 || a().charAt(i - 1) == '\n') {
            return false;
        }
        return i == a().length() || a().charAt(i) == '\n';
    }

    private final boolean f(int i) {
        if (a().charAt(i) != '\n') {
            return i == 0 || a().charAt(i + (-1)) == '\n';
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0029, code lost:
    
        r1 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
    
        if (r1 >= r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0031, code lost:
    
        if (e(r1) != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0033, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003a, code lost:
    
        return b(r4, r1);
     */
    @Override // defpackage.iyg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int[] c(int r4) {
        /*
            r3 = this;
            java.lang.String r0 = r3.a()
            int r0 = r0.length()
            if (r0 > 0) goto Lb
            goto L3b
        Lb:
            if (r4 >= r0) goto L3b
            if (r4 >= 0) goto L10
            r4 = 0
        L10:
            if (r4 >= r0) goto L27
            java.lang.String r1 = r3.a()
            char r1 = r1.charAt(r4)
            r2 = 10
            if (r1 != r2) goto L27
            boolean r1 = r3.f(r4)
            if (r1 != 0) goto L27
            int r4 = r4 + 1
            goto L10
        L27:
            if (r4 >= r0) goto L3b
            int r1 = r4 + 1
        L2b:
            if (r1 >= r0) goto L36
            boolean r2 = r3.e(r1)
            if (r2 != 0) goto L36
            int r1 = r1 + 1
            goto L2b
        L36:
            int[] r4 = r3.b(r4, r1)
            return r4
        L3b:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iyf.c(int):int[]");
    }

    @Override // defpackage.iyg
    public final int[] d(int i) {
        int length = a().length();
        if (length <= 0 || i <= 0) {
            return null;
        }
        if (i > length) {
            i = length;
        }
        while (i > 0) {
            int i2 = i - 1;
            if (a().charAt(i2) != '\n' || e(i)) {
                break;
            }
            i = i2;
        }
        if (i <= 0) {
            return null;
        }
        int i3 = i - 1;
        while (i3 > 0 && !f(i3)) {
            i3--;
        }
        return b(i3, i);
    }
}
