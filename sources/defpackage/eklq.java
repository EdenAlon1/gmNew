package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eklq {
    public final ekln a;

    private eklq(ekln eklnVar) {
        this.a = eklnVar;
    }

    public static eklq a(lkr lkrVar, lmy lmyVar) {
        ekln eklnVar = (ekln) new lmw(lmyVar.S(), new eklp()).a(ekln.class);
        emxf.m(eklnVar.a.put(lkrVar, new cmj()) == null, "A single instance of a LifecycleOwner was observed twice. Please report this occurrence using go/tiktok-bug.");
        lkrVar.P().c(eklnVar);
        if (!eklnVar.b) {
            eklnVar.b = true;
            eklnVar.c = lkrVar;
        }
        return new eklq(eklnVar);
    }

    public final Object b(int i, lkr lkrVar, ekll ekllVar, eklk eklkVar) {
        return this.a.k(i, lkrVar, ekllVar, eklkVar);
    }
}
