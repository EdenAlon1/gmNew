package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum exqn implements eyge {
    CHANNEL_GROUP_STATE_UNKNOWN(0),
    ALLOWED(1),
    BANNED(2);

    public final int d;

    exqn(int i) {
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
