package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
class esru extends emwd {
    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        fgte fgteVar = (fgte) obj;
        int ordinal = fgteVar.ordinal();
        if (ordinal == 0) {
            return esrd.b;
        }
        if (ordinal == 1) {
            return esrd.c;
        }
        if (ordinal == 2) {
            return esrd.a;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(fgteVar.toString()));
    }

    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        esrd esrdVar = (esrd) obj;
        int ordinal = esrdVar.ordinal();
        if (ordinal == 0) {
            return fgte.UNRECOGNIZED;
        }
        if (ordinal == 1) {
            return fgte.DEFAULT_TYPE;
        }
        if (ordinal == 2) {
            return fgte.ADMINISTRATED;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(esrdVar.toString()));
    }
}
