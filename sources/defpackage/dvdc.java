package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
class dvdc extends emwd {
    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        evvq evvqVar = (evvq) obj;
        int ordinal = evvqVar.ordinal();
        if (ordinal == 0) {
            return eycq.ACTION_UNKNOWN;
        }
        if (ordinal == 1) {
            return eycq.ACTION_POSITIVE;
        }
        if (ordinal == 2) {
            return eycq.ACTION_NEGATIVE;
        }
        if (ordinal == 3) {
            return eycq.ACTION_DISMISS;
        }
        if (ordinal == 4) {
            return eycq.ACTION_ACKNOWLEDGE;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(evvqVar.toString()));
    }

    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        eycq eycqVar = (eycq) obj;
        int ordinal = eycqVar.ordinal();
        if (ordinal == 0) {
            return evvq.ACTION_UNKNOWN;
        }
        if (ordinal == 1) {
            return evvq.ACTION_POSITIVE;
        }
        if (ordinal == 2) {
            return evvq.ACTION_NEGATIVE;
        }
        if (ordinal == 3) {
            return evvq.ACTION_DISMISS;
        }
        if (ordinal == 4) {
            return evvq.ACTION_ACKNOWLEDGE;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(eycqVar.toString()));
    }
}
