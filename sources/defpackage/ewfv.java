package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum ewfv implements eyge {
    TYPE_UNKNOWN(0),
    TYPE_RULE(1),
    TYPE_MODEL(2),
    TYPE_PRIVATE_HASH_SET(3),
    TYPE_BLM_BLOCK_LIST(4),
    UNRECOGNIZED(-1);

    private final int h;

    ewfv(int i) {
        this.h = i;
    }

    public static ewfv b(int i) {
        if (i == 0) {
            return TYPE_UNKNOWN;
        }
        if (i == 1) {
            return TYPE_RULE;
        }
        if (i == 2) {
            return TYPE_MODEL;
        }
        if (i == 3) {
            return TYPE_PRIVATE_HASH_SET;
        }
        if (i != 4) {
            return null;
        }
        return TYPE_BLM_BLOCK_LIST;
    }

    @Override // defpackage.eyge
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.h;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
