package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
class dvcz extends emwd {
    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        evvh evvhVar = (evvh) obj;
        int ordinal = evvhVar.ordinal();
        if (ordinal == 0) {
            return eycd.THEME_UNKNOWN;
        }
        if (ordinal == 1) {
            return eycd.THEME_LIGHT;
        }
        if (ordinal == 2) {
            return eycd.THEME_DARK;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(evvhVar.toString()));
    }

    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        eycd eycdVar = (eycd) obj;
        int ordinal = eycdVar.ordinal();
        if (ordinal == 0) {
            return evvh.THEME_UNKNOWN;
        }
        if (ordinal == 1) {
            return evvh.THEME_LIGHT;
        }
        if (ordinal == 2) {
            return evvh.THEME_DARK;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(eycdVar.toString()));
    }
}
