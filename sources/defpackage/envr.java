package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class envr extends envu {
    public static final envu a = new envr();

    private envr() {
    }

    @Override // defpackage.envu
    public final envs a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // defpackage.ents
    public final int b() {
        return 0;
    }

    @Override // defpackage.ents
    public final Object d(ensn ensnVar) {
        enxb.a(!ensnVar.b, "metadata key must be single valued");
        return null;
    }

    @Override // defpackage.envu
    public final envu f(envu envuVar) {
        return envuVar;
    }
}
