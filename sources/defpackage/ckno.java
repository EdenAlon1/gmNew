package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class ckno extends emwd {
    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        ephd ephdVar = (ephd) obj;
        int ordinal = ephdVar.ordinal();
        if (ordinal == 0) {
            return claz.UNKNOWN_PARSE_ERROR;
        }
        if (ordinal == 1) {
            return claz.NO_RECIPIENT_IDS_FOR_THREAD_ID;
        }
        if (ordinal == 2) {
            return claz.MULTIPLE_RECIPIENT_IDS_RETURNED;
        }
        if (ordinal == 3) {
            return claz.MULTIPLE_RECIPIENTS_PARSED;
        }
        if (ordinal == 4) {
            return claz.INVALID_RECIPIENT_ADDRESS_FORMAT;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(ephdVar.toString()));
    }

    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        claz clazVar = (claz) obj;
        int ordinal = clazVar.ordinal();
        if (ordinal == 0) {
            return ephd.UNKNOWN_RCS_GROUP_TELEPHONY_DATA_FAILURE_REASON;
        }
        if (ordinal == 1) {
            return ephd.NO_RECIPIENT_IDS_FOR_THREAD_ID;
        }
        if (ordinal == 2) {
            return ephd.MULTIPLE_RECIPIENT_IDS_RETURNED;
        }
        if (ordinal == 3) {
            return ephd.MULTIPLE_RECIPIENTS_PARSED;
        }
        if (ordinal == 4) {
            return ephd.INVALID_RECIPIENT_ADDRESS_FORMAT;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(clazVar.toString()));
    }
}
