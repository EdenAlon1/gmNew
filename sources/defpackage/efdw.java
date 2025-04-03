package defpackage;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efdw implements efbi {
    private boolean a = false;

    static {
        new AtomicInteger();
    }

    @Override // defpackage.efbi
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final File a(efbh efbhVar) {
        if (this.a) {
            if (efbhVar.b()) {
                throw new efcy("Short circuit would skip transforms.");
            }
            return efbhVar.b.d(efbhVar.f);
        }
        efcw efcwVar = new efcw(new efdy().a(efbhVar));
        try {
            Closeable closeable = efcwVar.a;
            if (!(closeable instanceof efch)) {
                throw new IOException("Not convertible and fallback to pipe is disabled.");
            }
            File c = ((efch) closeable).c();
            efcwVar.close();
            return c;
        } catch (Throwable th) {
            try {
                efcwVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void c() {
        this.a = true;
    }
}
