package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum eypd implements eyge {
    GELLER_SNAPSHOT_REASON_UNSPECIFIED(0),
    CREATE_REQUEST(1);

    public final int c;

    eypd(int i) {
        this.c = i;
    }

    @Override // defpackage.eyge
    public final int a() {
        return this.c;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.c);
    }
}
