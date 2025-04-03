package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum epac implements eyge {
    UNKNOWN_PREKEY_STATE(0),
    SUFFICIENT_PREKEYS(1),
    LOW_PREKEYS(2);

    public final int d;

    epac(int i) {
        this.d = i;
    }

    @Override // defpackage.eyge
    public final int a() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.d);
    }
}
