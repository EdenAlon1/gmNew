package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum epdz implements eyge {
    UNKNOWN(0),
    FI_MULTI_DEVICE(1),
    BACKUP_AND_RESTORE(2),
    MULTI_DEVICE(3);

    public final int e;

    epdz(int i) {
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
