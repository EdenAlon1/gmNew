package defpackage;

import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmsl {
    private final csvl a;

    public cmsl(csvm csvmVar) {
        csvo csvoVar = (csvo) csvmVar.a.b();
        csvoVar.getClass();
        this.a = new csvl(csvoVar);
    }

    public final Level a() {
        csvl csvlVar = this.a;
        csvlVar.a();
        return !csvlVar.b.get() ? csvl.a : (Level) csvlVar.c.get();
    }

    public final boolean b() {
        csvl csvlVar = this.a;
        csvlVar.a();
        return csvlVar.b.get();
    }
}
