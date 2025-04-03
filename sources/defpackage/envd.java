package defpackage;

import android.util.Log;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class envd extends enuq {
    public static final Set a;
    public static final entz b;
    public static final envb c;
    private final String d;
    private final Level e;
    private final Set f;
    private final entz g;
    private final int h;

    static {
        Set unmodifiableSet = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(enrz.a, ente.a, entf.a)));
        a = unmodifiableSet;
        entz a2 = enuc.a(unmodifiableSet);
        b = a2;
        c = new envb(2, Level.ALL, false, unmodifiableSet, a2);
    }

    public envd(String str, int i, Level level, Set set, entz entzVar) {
        super(str);
        this.d = enuw.b(str);
        this.h = 2;
        this.e = level;
        this.f = set;
        this.g = entzVar;
    }

    public static void e(entl entlVar, String str, int i, Level level, Set set, entz entzVar) {
        String sb;
        Boolean bool = (Boolean) entlVar.i().d(entf.a);
        if (bool == null || !bool.booleanValue()) {
            enuj g = enuj.g(Cenum.f(), entlVar.i());
            boolean z = entlVar.m().intValue() < level.intValue();
            if (z || enuo.b(entlVar, g, set)) {
                StringBuilder sb2 = new StringBuilder();
                if (entn.a(2, entlVar.e(), sb2)) {
                    sb2.append(" ");
                }
                if (!z || entlVar.j() == null) {
                    entg.c(entlVar, sb2);
                    enuo.c(g, entzVar, sb2);
                } else {
                    sb2.append("(REDACTED) ");
                    sb2.append(entlVar.j().b);
                }
                sb = sb2.toString();
            } else {
                sb = enuo.a(entlVar);
            }
            Throwable th = (Throwable) entlVar.i().d(enrz.a);
            int a2 = enuw.a(entlVar.m());
            if (a2 == 2) {
                Log.v(str, sb, th);
                return;
            }
            if (a2 == 3) {
                Log.d(str, sb, th);
                return;
            }
            if (a2 == 4) {
                Log.i(str, sb, th);
            } else if (a2 != 5) {
                Log.e(str, sb, th);
            } else {
                Log.w(str, sb, th);
            }
        }
    }

    @Override // defpackage.ento
    public final void b(entl entlVar) {
        e(entlVar, this.d, 2, this.e, this.f, this.g);
    }

    @Override // defpackage.ento
    public final boolean c(Level level) {
        String str = this.d;
        int a2 = enuw.a(level);
        return Log.isLoggable(str, a2) || Log.isLoggable("all", a2);
    }
}
