package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
class dvko extends emwd {
    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        evxk evxkVar = (evxk) obj;
        int ordinal = evxkVar.ordinal();
        if (ordinal == 0) {
            return eyaa.ALIGNMENT_UNSPECIFIED;
        }
        if (ordinal == 1) {
            return eyaa.TRAILING;
        }
        if (ordinal == 2) {
            return eyaa.CENTER;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(evxkVar.toString()));
    }

    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        eyaa eyaaVar = (eyaa) obj;
        int ordinal = eyaaVar.ordinal();
        if (ordinal == 0) {
            return evxk.UNKNOWN_ALIGNMENT;
        }
        if (ordinal == 1) {
            return evxk.RIGHT;
        }
        if (ordinal == 2) {
            return evxk.CENTER;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(eyaaVar.toString()));
    }
}
