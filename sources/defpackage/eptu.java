package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum eptu implements eyge {
    UNKNOWN_COMPOSE_SCREEN_MODE(0),
    COLLAPSED(1),
    EXPANDED(2),
    FULL_SCREEN(3);

    public final int e;

    eptu(int i) {
        this.e = i;
    }

    @Override // defpackage.eyge
    public final int a() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.e);
    }
}
