package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
class avkw extends emwd {
    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        eqwy eqwyVar = (eqwy) obj;
        int ordinal = eqwyVar.ordinal();
        if (ordinal == 0) {
            return awuc.UNKNOWN_STATUS;
        }
        if (ordinal == 1) {
            return awuc.OK;
        }
        if (ordinal == 2) {
            return awuc.PENDING;
        }
        if (ordinal == 3) {
            return awuc.FAILED_TRANSIENTLY;
        }
        if (ordinal == 4) {
            return awuc.FAILED_PERMANENTLY;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(eqwyVar.toString()));
    }

    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        awuc awucVar = (awuc) obj;
        int ordinal = awucVar.ordinal();
        if (ordinal == 0) {
            return eqwy.CHAT_API_UNKNOWN;
        }
        if (ordinal == 1) {
            return eqwy.CHAT_API_OK;
        }
        if (ordinal == 2) {
            return eqwy.CHAT_API_PENDING;
        }
        if (ordinal == 3) {
            return eqwy.CHAT_API_FAILED_TRANSIENTLY;
        }
        if (ordinal == 4) {
            return eqwy.CHAT_API_FAILED_PERMANENTLY;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(awucVar.toString()));
    }
}
