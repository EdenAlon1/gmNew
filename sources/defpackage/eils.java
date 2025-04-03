package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
class eils extends emwd {
    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        eigj eigjVar = (eigj) obj;
        int ordinal = eigjVar.ordinal();
        if (ordinal == 0) {
            return cloc.DISPOSITION_NOTIFICATION_TYPE_POSITIVE_DELIVERY;
        }
        if (ordinal == 1) {
            return cloc.DISPOSITION_NOTIFICATION_TYPE_DISPLAY;
        }
        if (ordinal == 2) {
            return cloc.DISPOSITION_NOTIFICATION_TYPE_NEGATIVE_DELIVERY;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(eigjVar.toString()));
    }

    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        cloc clocVar = (cloc) obj;
        int ordinal = clocVar.ordinal();
        if (ordinal == 1) {
            return eigj.POSITIVE_DELIVERY;
        }
        if (ordinal == 2) {
            return eigj.DISPLAY;
        }
        if (ordinal == 3) {
            return eigj.NEGATIVE_DELIVERY;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(clocVar.toString()));
    }
}
