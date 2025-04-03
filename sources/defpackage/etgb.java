package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etgb {
    private final etzq a;

    private etgb(etzq etzqVar) {
        this.a = etzqVar;
    }

    public static etgb b(etga etgaVar) {
        return new etgb((etzq) etgaVar.a.toBuilder());
    }

    public final synchronized etga a() {
        return etga.b((etzt) this.a.build());
    }
}
