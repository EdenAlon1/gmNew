package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fiue implements fiuq, fiuo {
    private final String a;
    private final String b;
    private final boolean c;
    private final int d;

    public fiue(String str, String str2, boolean z, int i) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = i;
    }

    private static final int e(CharSequence charSequence, int i, int i2) {
        int i3 = 0;
        for (int min = Math.min(charSequence.length() - i, i2); min > 0; min--) {
            char charAt = charSequence.charAt(i + i3);
            if (charAt < '0' || charAt > '9') {
                break;
            }
            i3++;
        }
        return i3;
    }

    @Override // defpackage.fiuo
    public final int a() {
        return b();
    }

    @Override // defpackage.fiuq
    public final int b() {
        int i = true != this.c ? 6 : 7;
        String str = this.a;
        return (str == null || str.length() <= i) ? i : str.length();
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b5, code lost:
    
        if (r0 == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00e9, code lost:
    
        if (r0 == false) goto L42;
     */
    @Override // defpackage.fiuo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int c(defpackage.fiuk r12, java.lang.CharSequence r13, int r14) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fiue.c(fiuk, java.lang.CharSequence, int):int");
    }

    @Override // defpackage.fiuq
    public final void d(Appendable appendable, long j, firb firbVar, int i, firk firkVar, Locale locale) {
        int i2;
        int i3;
        if (firkVar == null) {
            return;
        }
        if (i == 0) {
            String str = this.a;
            if (str != null) {
                appendable.append(str);
                return;
            }
            i = 0;
        }
        if (i >= 0) {
            appendable.append('+');
        } else {
            appendable.append('-');
            i = -i;
        }
        int i4 = i / 3600000;
        fium.b(appendable, i4, 2);
        int i5 = i - (i4 * 3600000);
        int i6 = i5 != 0 ? i5 : 0;
        if (this.c) {
            appendable.append(':');
        }
        int i7 = i6 / 60000;
        fium.b(appendable, i7, 2);
        if (this.d == 2 || (i2 = i6 - (i7 * 60000)) == 0) {
            return;
        }
        int i8 = i2 / 1000;
        if (this.c) {
            appendable.append(':');
        }
        fium.b(appendable, i8, 2);
        if (this.d == 3 || (i3 = i2 - (i8 * 1000)) == 0) {
            return;
        }
        if (this.c) {
            appendable.append('.');
        }
        fium.b(appendable, i3, 3);
    }
}
