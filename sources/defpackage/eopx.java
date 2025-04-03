package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum eopx implements eyge {
    UNKNOWN_EVENT_TYPE(0),
    DISMISS(1),
    SHOWN(2);

    public final int d;

    eopx(int i) {
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
