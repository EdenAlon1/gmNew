package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejcw {
    public final ejcn a;
    public final errl b;

    public ejcw(ejcn ejcnVar, errl errlVar) {
        this.a = ejcnVar;
        this.b = errlVar;
    }

    public static eixn a(ejec ejecVar) {
        eisx b = eisx.b(ejecVar.c);
        eixz eixzVar = ejecVar.d;
        if (eixzVar == null) {
            eixzVar = eixz.a;
        }
        int a = eizc.a(ejecVar.e);
        if (a == 0) {
            a = 1;
        }
        return new eizi(b, eixzVar, a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static ejec b(ejdx ejdxVar, eisx eisxVar) {
        try {
            int a = eisxVar.a();
            eyhm eyhmVar = ejdxVar.d;
            Integer valueOf = Integer.valueOf(a);
            if (eyhmVar.containsKey(valueOf)) {
                return (ejec) eyhmVar.get(valueOf);
            }
            throw new IllegalArgumentException();
        } catch (IllegalArgumentException e) {
            throw new eizq(e);
        }
    }
}
