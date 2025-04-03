package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class finv extends fiqt {
    private final fipt a = new fipt();
    private final List b = new ArrayList();

    @Override // defpackage.fiqw
    public final fipf b() {
        return this.a;
    }

    @Override // defpackage.fiqw
    public final fiqv c(fiqz fiqzVar) {
        finn finnVar = (finn) fiqzVar;
        if (finnVar.g >= 4) {
            return new fine(-1, finnVar.e + 4, false);
        }
        if (finnVar.h) {
            return new fine(finnVar.f, -1, false);
        }
        return null;
    }

    @Override // defpackage.fiqt, defpackage.fiqw
    public final void d(fiqr fiqrVar) {
        this.b.add(fiqrVar.a);
    }

    @Override // defpackage.fiqt, defpackage.fiqw
    public final void k() {
        int i;
        int size = this.b.size() - 1;
        while (true) {
            if (size >= 0) {
                CharSequence charSequence = (CharSequence) this.b.get(size);
                int length = charSequence.length();
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    char charAt = charSequence.charAt(i2);
                    if (charAt != ' ') {
                        switch (charAt) {
                            case '\t':
                            case '\n':
                            case 11:
                            case '\f':
                            case '\r':
                                break;
                            default:
                                if (i2 == -1) {
                                    break;
                                } else {
                                    break;
                                }
                        }
                    }
                    i2++;
                }
                size--;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (i = 0; i < size + 1; i++) {
            sb.append((CharSequence) this.b.get(i));
        }
    }
}
