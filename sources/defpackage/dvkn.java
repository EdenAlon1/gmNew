package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
class dvkn extends emwd {
    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        evxg evxgVar = (evxg) obj;
        int ordinal = evxgVar.ordinal();
        if (ordinal == 0) {
            return exzn.USER_ACTION_UNSPECIFIED;
        }
        if (ordinal == 1) {
            return exzn.USER_ACTION_POSITIVE;
        }
        if (ordinal == 2) {
            return exzn.USER_ACTION_NEGATIVE;
        }
        if (ordinal == 3) {
            return exzn.USER_ACTION_DISMISS;
        }
        if (ordinal == 4) {
            return exzn.USER_ACTION_ACKNOWLEDGE;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(evxgVar.toString()));
    }

    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        exzn exznVar = (exzn) obj;
        int ordinal = exznVar.ordinal();
        if (ordinal == 0) {
            return evxg.ACTION_UNKNOWN;
        }
        if (ordinal == 1) {
            return evxg.ACTION_POSITIVE;
        }
        if (ordinal == 2) {
            return evxg.ACTION_NEGATIVE;
        }
        if (ordinal == 3) {
            return evxg.ACTION_DISMISS;
        }
        if (ordinal == 4) {
            return evxg.ACTION_ACKNOWLEDGE;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(exznVar.toString()));
    }
}
