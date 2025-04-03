package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum eovo implements eyge {
    UNKNOWN(0),
    VERIFIED(1),
    UNVERIFIED(2),
    NA(3),
    NOT_YET_VERIFIED(4),
    NOT_VERIFIABLE(5);

    public final int g;

    eovo(int i) {
        this.g = i;
    }

    @Override // defpackage.eyge
    public final int a() {
        return this.g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.g);
    }
}
