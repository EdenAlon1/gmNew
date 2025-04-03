package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum aeuk implements eyge {
    UNASSIGNED(0),
    PHOTOS_LINK(1),
    STANDARD(2);

    public final int d;

    aeuk(int i) {
        this.d = i;
    }

    public static aeuk b(int i) {
        if (i == 0) {
            return UNASSIGNED;
        }
        if (i == 1) {
            return PHOTOS_LINK;
        }
        if (i != 2) {
            return null;
        }
        return STANDARD;
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
