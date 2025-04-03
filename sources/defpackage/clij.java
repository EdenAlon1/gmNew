package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
class clij extends emwd {
    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        awxj awxjVar = (awxj) obj;
        int ordinal = awxjVar.ordinal();
        if (ordinal == 1) {
            return eigj.POSITIVE_DELIVERY;
        }
        if (ordinal == 2) {
            return eigj.DISPLAY;
        }
        if (ordinal == 3) {
            return eigj.NEGATIVE_DELIVERY;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(awxjVar.toString()));
    }

    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        eigj eigjVar = (eigj) obj;
        int ordinal = eigjVar.ordinal();
        if (ordinal == 0) {
            return awxj.POSITIVE_DELIVERY;
        }
        if (ordinal == 1) {
            return awxj.DISPLAY;
        }
        if (ordinal == 2) {
            return awxj.NEGATIVE_DELIVERY;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(eigjVar.toString()));
    }
}
