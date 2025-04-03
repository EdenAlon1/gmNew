package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum eqej implements eyge {
    COMPOSE_TYPE_UNSPECIFIED(0),
    TEXT(1),
    AUDIO(2),
    VIDEO(3);

    public final int e;

    eqej(int i) {
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
