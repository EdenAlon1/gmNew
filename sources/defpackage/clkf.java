package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
class clkf extends emwd {
    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        awxj awxjVar = (awxj) obj;
        int ordinal = awxjVar.ordinal();
        if (ordinal == 0) {
            return cloc.DISPOSITION_NOTIFICATION_TYPE_UNKNOWN;
        }
        if (ordinal == 1) {
            return cloc.DISPOSITION_NOTIFICATION_TYPE_POSITIVE_DELIVERY;
        }
        if (ordinal == 2) {
            return cloc.DISPOSITION_NOTIFICATION_TYPE_DISPLAY;
        }
        if (ordinal == 3) {
            return cloc.DISPOSITION_NOTIFICATION_TYPE_NEGATIVE_DELIVERY;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(awxjVar.toString()));
    }

    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        cloc clocVar = (cloc) obj;
        int ordinal = clocVar.ordinal();
        if (ordinal == 0) {
            return awxj.UNKNOWN_REQUESTED_REPORT;
        }
        if (ordinal == 1) {
            return awxj.POSITIVE_DELIVERY;
        }
        if (ordinal == 2) {
            return awxj.DISPLAY;
        }
        if (ordinal == 3) {
            return awxj.NEGATIVE_DELIVERY;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(clocVar.toString()));
    }
}
