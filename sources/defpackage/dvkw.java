package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
class dvkw extends emwd {
    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        evzz evzzVar = (evzz) obj;
        int ordinal = evzzVar.ordinal();
        if (ordinal == 0) {
            return eybl.PLACEMENT_UNSPECIFIED;
        }
        if (ordinal == 1) {
            return eybl.ABOVE;
        }
        if (ordinal == 2) {
            return eybl.BELOW;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(evzzVar.toString()));
    }

    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        eybl eyblVar = (eybl) obj;
        int ordinal = eyblVar.ordinal();
        if (ordinal == 0) {
            return evzz.UNKNOWN;
        }
        if (ordinal == 1) {
            return evzz.ABOVE;
        }
        if (ordinal == 2) {
            return evzz.BELOW;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(eyblVar.toString()));
    }
}
