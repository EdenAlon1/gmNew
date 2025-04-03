package defpackage;

import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class envl extends envg {
    public envl(entl entlVar, ents entsVar) {
        super(entlVar, entsVar);
        setThrown((Throwable) this.a.b(enrz.a));
        getMessage();
    }

    public envl(RuntimeException runtimeException, entl entlVar, ents entsVar) {
        super(entlVar, entsVar);
        setLevel(entlVar.m().intValue() < Level.WARNING.intValue() ? Level.WARNING : entlVar.m());
        setThrown(runtimeException);
        StringBuilder sb = new StringBuilder("LOGGING ERROR: ");
        sb.append(runtimeException.getMessage());
        sb.append('\n');
        envg.a(entlVar, sb);
        setMessage(sb.toString());
    }
}
