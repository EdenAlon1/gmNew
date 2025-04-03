package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
class easf extends emwd {
    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        exqr exqrVar = (exqr) obj;
        switch (exqrVar) {
            case IMPORTANCE_UNSPECIFIED:
                return exvf.IMPORTANCE_UNSPECIFIED;
            case IMPORTANCE_NONE:
                return exvf.IMPORTANCE_NONE;
            case IMPORTANCE_DEFAULT:
                return exvf.IMPORTANCE_DEFAULT;
            case IMPORTANCE_HIGH:
                return exvf.IMPORTANCE_HIGH;
            case IMPORTANCE_LOW:
                return exvf.IMPORTANCE_LOW;
            case IMPORTANCE_MAX:
                return exvf.IMPORTANCE_MAX;
            case IMPORTANCE_MIN:
                return exvf.IMPORTANCE_MIN;
            default:
                throw new IllegalArgumentException("unknown enum value: ".concat(exqrVar.toString()));
        }
    }

    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        exvf exvfVar = (exvf) obj;
        switch (exvfVar) {
            case IMPORTANCE_UNSPECIFIED:
                return exqr.IMPORTANCE_UNSPECIFIED;
            case IMPORTANCE_NONE:
                return exqr.IMPORTANCE_NONE;
            case IMPORTANCE_DEFAULT:
                return exqr.IMPORTANCE_DEFAULT;
            case IMPORTANCE_HIGH:
                return exqr.IMPORTANCE_HIGH;
            case IMPORTANCE_LOW:
                return exqr.IMPORTANCE_LOW;
            case IMPORTANCE_MAX:
                return exqr.IMPORTANCE_MAX;
            case IMPORTANCE_MIN:
                return exqr.IMPORTANCE_MIN;
            default:
                throw new IllegalArgumentException("unknown enum value: ".concat(exvfVar.toString()));
        }
    }
}
