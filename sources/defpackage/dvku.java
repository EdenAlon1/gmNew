package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
class dvku extends emwd {
    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        evxt evxtVar = (evxt) obj;
        int ordinal = evxtVar.ordinal();
        if (ordinal == 0) {
            return eyae.FONT_SIZE_UNSPECIFIED;
        }
        if (ordinal == 1) {
            return eyae.SMALL;
        }
        if (ordinal == 2) {
            return eyae.LARGE;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(evxtVar.toString()));
    }

    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        eyae eyaeVar = (eyae) obj;
        int ordinal = eyaeVar.ordinal();
        if (ordinal == 0) {
            return evxt.TEXT_SIZE_UNKNOWN;
        }
        if (ordinal == 1) {
            return evxt.MATERIAL_SUBHEAD_1;
        }
        if (ordinal == 2) {
            return evxt.MATERIAL_HEADLINE_5;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(eyaeVar.toString()));
    }
}
