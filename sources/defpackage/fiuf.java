package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fiuf implements fiuq, fiuo {
    private final firf a;
    private final int b;
    private final boolean c;

    public fiuf(firf firfVar, int i, boolean z) {
        this.a = firfVar;
        this.b = i;
        this.c = z;
    }

    @Override // defpackage.fiuo
    public final int a() {
        return this.c ? 4 : 2;
    }

    @Override // defpackage.fiuq
    public final int b() {
        return 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x003b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0038 A[SYNTHETIC] */
    @Override // defpackage.fiuo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int c(defpackage.fiuk r12, java.lang.CharSequence r13, int r14) {
        /*
            Method dump skipped, instructions count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fiuf.c(fiuk, java.lang.CharSequence, int):int");
    }

    @Override // defpackage.fiuq
    public final void d(Appendable appendable, long j, firb firbVar, int i, firk firkVar, Locale locale) {
        int i2;
        try {
            int a = this.a.a(firbVar).a(j);
            if (a < 0) {
                a = -a;
            }
            i2 = a % 100;
        } catch (RuntimeException unused) {
            i2 = -1;
        }
        if (i2 >= 0) {
            fium.b(appendable, i2, 2);
        } else {
            appendable.append((char) 65533);
            appendable.append((char) 65533);
        }
    }
}
