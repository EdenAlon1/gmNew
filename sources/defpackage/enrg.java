package defpackage;

import defpackage.ensk;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class enrg<API extends ensk<API>> {
    public final ento b;

    protected enrg(ento entoVar) {
        entoVar.getClass();
        this.b = entoVar;
    }

    public static void l(String str, entl entlVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").format(new Date(TimeUnit.NANOSECONDS.toMillis(entlVar.d()))));
        sb.append(": logging error [");
        entn.a(1, entlVar.e(), sb);
        sb.append("]: ");
        sb.append(str);
        System.err.println(sb);
        System.err.flush();
    }

    public abstract ensk a(Level level);

    public final ensk d() {
        return a(Level.CONFIG);
    }

    public final ensk e() {
        return a(Level.FINE);
    }

    public final ensk f() {
        return a(Level.FINER);
    }

    public final ensk g() {
        return a(Level.FINEST);
    }

    public final ensk h() {
        return a(Level.INFO);
    }

    public final ensk i() {
        return a(Level.SEVERE);
    }

    public final ensk j() {
        return a(Level.WARNING);
    }

    protected final String k() {
        return this.b.d();
    }

    protected final boolean m(Level level) {
        return this.b.c(level);
    }
}
