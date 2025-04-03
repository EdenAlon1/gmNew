package defpackage;

import java.text.MessageFormat;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fejh extends fdxm {
    private final feji a;

    public fejh(feji fejiVar, fevs fevsVar) {
        fejiVar.getClass();
        this.a = fejiVar;
        fevsVar.getClass();
    }

    public static Level c(int i) {
        int i2 = i - 1;
        return i2 != 1 ? (i2 == 2 || i2 == 3) ? Level.FINE : Level.FINEST : Level.FINER;
    }

    private final void d(int i) {
        if (i != 1) {
            synchronized (this.a.b) {
            }
        }
    }

    @Override // defpackage.fdxm
    public final void a(int i, String str) {
        Level c = c(i);
        if (feji.a.isLoggable(c)) {
            feji.a(this.a.c, c, str);
        }
        d(i);
    }

    @Override // defpackage.fdxm
    public final void b(int i, String str, Object... objArr) {
        Level c = c(i);
        d(i);
        a(i, feji.a.isLoggable(c) ? MessageFormat.format(str, objArr) : null);
    }
}
