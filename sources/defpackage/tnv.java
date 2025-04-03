package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class tnv extends emwd {
    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        eszw eszwVar = (eszw) obj;
        int ordinal = eszwVar.ordinal();
        if (ordinal == 0) {
            return esjx.NOT_SET;
        }
        if (ordinal == 1) {
            return esjx.DISABLED;
        }
        if (ordinal == 2) {
            return esjx.ENABLED;
        }
        if (ordinal == 3) {
            return esjx.ENABLING;
        }
        if (ordinal == 4) {
            return esjx.UNRECOGNIZED;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(eszwVar.toString()));
    }

    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        esjx esjxVar = (esjx) obj;
        int ordinal = esjxVar.ordinal();
        if (ordinal == 0) {
            return eszw.MULTI_DEVICE_STATE_UNSPECIFIED;
        }
        if (ordinal == 1) {
            return eszw.DISABLED;
        }
        if (ordinal == 2) {
            return eszw.ENABLED;
        }
        if (ordinal == 3) {
            return eszw.ENABLING;
        }
        if (ordinal == 4) {
            return eszw.UNRECOGNIZED;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(esjxVar.toString()));
    }
}
