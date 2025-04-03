package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum abxo {
    DIGIT(0),
    URL(1),
    EMAIL(2);

    public final int d;

    abxo(int i) {
        this.d = i;
    }

    public static abxo a(int i) {
        for (abxo abxoVar : values()) {
            if (abxoVar.d == i) {
                return abxoVar;
            }
        }
        throw new IllegalArgumentException();
    }
}
