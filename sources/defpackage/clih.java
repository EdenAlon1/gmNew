package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
class clih extends emwd {
    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        eigo eigoVar = (eigo) obj;
        int ordinal = eigoVar.ordinal();
        if (ordinal == 0) {
            return awxx.UNKNOWN_MESSAGE_PRIORITY;
        }
        if (ordinal == 1) {
            return awxx.HIGH;
        }
        if (ordinal == 2) {
            return awxx.NORMAL;
        }
        if (ordinal == 3) {
            return awxx.LOW;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(eigoVar.toString()));
    }

    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        awxx awxxVar = (awxx) obj;
        int ordinal = awxxVar.ordinal();
        if (ordinal == 0) {
            return eigo.UNKNOWN_MESSAGE_PRIORITY;
        }
        if (ordinal == 1) {
            return eigo.HIGH;
        }
        if (ordinal == 2) {
            return eigo.NORMAL;
        }
        if (ordinal == 3) {
            return eigo.LOW;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(awxxVar.toString()));
    }
}
