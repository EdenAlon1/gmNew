package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public enum ccbz implements eyge {
    UNSPECIFIED(0),
    CONVERSATION_RCS_MSISDN_BACKFILL_TASK(1),
    RCS_ID_AND_IS_HIDDEN_MISSING_BACKFILL_TASK(2),
    MESSAGE_REACTIONS_MISSING_BACKFILL_TASK(3);

    public final int e;

    ccbz(int i) {
        this.e = i;
    }

    public static ccbz b(int i) {
        if (i == 0) {
            return UNSPECIFIED;
        }
        if (i == 1) {
            return CONVERSATION_RCS_MSISDN_BACKFILL_TASK;
        }
        if (i == 2) {
            return RCS_ID_AND_IS_HIDDEN_MISSING_BACKFILL_TASK;
        }
        if (i != 3) {
            return null;
        }
        return MESSAGE_REACTIONS_MISSING_BACKFILL_TASK;
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
