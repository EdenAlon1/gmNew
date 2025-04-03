package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etru {
    public final int a;
    private final etfu b;

    public etru(etfu etfuVar, int i) {
        this.b = etfuVar;
        this.a = i;
    }

    public final String toString() {
        return String.format("(status=%s, keyId=%s)", this.b, Integer.valueOf(this.a));
    }
}
