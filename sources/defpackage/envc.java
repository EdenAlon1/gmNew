package defpackage;

import android.util.Log;
import java.util.Set;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class envc extends enuq {
    private final Level a;
    private final boolean b;
    private final Set c;
    private final entz d;
    private final int e;

    public envc(String str, int i, Level level, boolean z, Set set, entz entzVar) {
        super(str);
        this.e = 2;
        this.a = level;
        this.b = z;
        this.c = set;
        this.d = entzVar;
    }

    @Override // defpackage.ento
    public final void b(entl entlVar) {
        String str = (String) entlVar.i().d(ente.a);
        if (str == null) {
            str = d();
        }
        if (str == null) {
            str = entlVar.e().b();
            int indexOf = str.indexOf(36, str.lastIndexOf(46));
            if (indexOf >= 0) {
                str = str.substring(0, indexOf);
            }
        }
        String b = enuw.b(str);
        Level m = entlVar.m();
        if (!this.b) {
            int a = enuw.a(m);
            if (!Log.isLoggable(b, a) && !Log.isLoggable("all", a)) {
                return;
            }
        }
        envd.e(entlVar, b, 2, this.a, this.c, this.d);
    }

    @Override // defpackage.ento
    public final boolean c(Level level) {
        return true;
    }
}
