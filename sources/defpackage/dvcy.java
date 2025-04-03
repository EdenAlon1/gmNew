package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
class dvcy extends emwd {
    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        evvf evvfVar = (evvf) obj;
        int ordinal = evvfVar.ordinal();
        if (ordinal == 0) {
            return eycb.ORIENTATION_UNKNOWN;
        }
        if (ordinal == 1) {
            return eycb.ORIENTATION_PORTRAIT;
        }
        if (ordinal == 2) {
            return eycb.ORIENTATION_LANDSCAPE;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(evvfVar.toString()));
    }

    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        eycb eycbVar = (eycb) obj;
        int ordinal = eycbVar.ordinal();
        if (ordinal == 0) {
            return evvf.ORIENTATION_UNKNOWN;
        }
        if (ordinal == 1) {
            return evvf.ORIENTATION_PORTRAIT;
        }
        if (ordinal == 2) {
            return evvf.ORIENTATION_LANDSCAPE;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(eycbVar.toString()));
    }
}
