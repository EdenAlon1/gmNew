package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
class easd extends emwd {
    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        exsi exsiVar = (exsi) obj;
        int ordinal = exsiVar.ordinal();
        if (ordinal == 0) {
            return exvb.APP_BLOCK_STATE_UNKNOWN;
        }
        if (ordinal == 1) {
            return exvb.ALLOWED;
        }
        if (ordinal == 2) {
            return exvb.BANNED;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(exsiVar.toString()));
    }

    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        exvb exvbVar = (exvb) obj;
        int ordinal = exvbVar.ordinal();
        if (ordinal == 0) {
            return exsi.APP_BLOCK_STATE_UNKNOWN;
        }
        if (ordinal == 1) {
            return exsi.ALLOWED;
        }
        if (ordinal == 2) {
            return exsi.BANNED;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(exvbVar.toString()));
    }
}
