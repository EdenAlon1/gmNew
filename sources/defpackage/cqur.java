package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public enum cqur implements eyge {
    FILE(0),
    THUMBNAIL(1);

    public final int c;

    cqur(int i) {
        this.c = i;
    }

    public static cqur b(int i) {
        if (i == 0) {
            return FILE;
        }
        if (i != 1) {
            return null;
        }
        return THUMBNAIL;
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
