package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public enum faup {
    UTC_OFFSET,
    TIME_ZONE,
    TIMEOFFSET_NOT_SET;

    public static faup a(int i) {
        if (i == 0) {
            return TIMEOFFSET_NOT_SET;
        }
        if (i == 8) {
            return UTC_OFFSET;
        }
        if (i != 9) {
            return null;
        }
        return TIME_ZONE;
    }
}
