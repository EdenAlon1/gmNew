package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
class dvkv extends emwd {
    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        evvw evvwVar = (evvw) obj;
        int ordinal = evvwVar.ordinal();
        if (ordinal == 0) {
            return eybp.UNKNOWN;
        }
        if (ordinal == 1) {
            return eybp.ACTIVITY;
        }
        if (ordinal == 2) {
            return eybp.SERVICE;
        }
        if (ordinal == 3) {
            return eybp.BROADCAST;
        }
        if (ordinal == 4) {
            return eybp.ACTIVITY_WITH_RESULT;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(evvwVar.toString()));
    }

    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        eybp eybpVar = (eybp) obj;
        int ordinal = eybpVar.ordinal();
        if (ordinal == 0) {
            return evvw.UNKNOWN;
        }
        if (ordinal == 1) {
            return evvw.ACTIVITY;
        }
        if (ordinal == 2) {
            return evvw.SERVICE;
        }
        if (ordinal == 3) {
            return evvw.BROADCAST;
        }
        if (ordinal == 4) {
            return evvw.ACTIVITY_WITH_RESULT;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(eybpVar.toString()));
    }
}
