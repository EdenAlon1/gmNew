package defpackage;

import android.util.Log;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eklz extends enuq {
    private final evic a;

    public eklz(String str, evic evicVar) {
        super(str);
        this.a = evicVar;
    }

    @Override // defpackage.ento
    public final void b(entl entlVar) {
        this.a.b(entlVar);
    }

    @Override // defpackage.ento
    public final boolean c(Level level) {
        return this.a.c(level);
    }

    @Override // defpackage.enuq, defpackage.ento
    public final void g(RuntimeException runtimeException, entl entlVar) {
        Log.e("TikTokClientLogging", "Internal logging error", runtimeException);
    }
}
