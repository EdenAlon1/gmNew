package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum eoys implements eyge {
    UNKNOWN_STATUS(0),
    BINDING_STARTED(1),
    FIRST_DATA_RECEIVED(2),
    ON_COMPLETE(3),
    ON_ERROR(4);

    public final int f;

    eoys(int i) {
        this.f = i;
    }

    @Override // defpackage.eyge
    public final int a() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f);
    }
}
