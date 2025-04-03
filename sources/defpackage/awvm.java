package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public enum awvm implements eyge {
    CAUSE_UNSPECIFIED(0),
    CAUSE_ONLY_SELF_IN_GROUP(1),
    CAUSE_GROUP_NOT_FOUND(2);

    public final int d;

    awvm(int i) {
        this.d = i;
    }

    public static awvm b(int i) {
        if (i == 0) {
            return CAUSE_UNSPECIFIED;
        }
        if (i == 1) {
            return CAUSE_ONLY_SELF_IN_GROUP;
        }
        if (i != 2) {
            return null;
        }
        return CAUSE_GROUP_NOT_FOUND;
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
