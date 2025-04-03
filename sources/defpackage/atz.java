package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atz {
    public static final atz a;
    public final float b;
    public final ksr c;
    public final ksr d;

    static {
        aty atyVar = new aty();
        atyVar.a = 1.0f;
        Float valueOf = Float.valueOf(0.0f);
        atyVar.b = new ksr(valueOf, valueOf);
        Float valueOf2 = Float.valueOf(1.0f);
        atyVar.c = new ksr(valueOf2, valueOf2);
        a = new atz(atyVar.a, atyVar.b, atyVar.c);
    }

    public atz(float f, ksr ksrVar, ksr ksrVar2) {
        this.b = f;
        this.c = ksrVar;
        this.d = ksrVar2;
    }
}
