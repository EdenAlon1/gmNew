package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class exqq implements eygg {
    static final eygg a = new exqq();

    private exqq() {
    }

    @Override // defpackage.eygg
    public final boolean a(int i) {
        exqr exqrVar;
        switch (i) {
            case 0:
                exqrVar = exqr.IMPORTANCE_UNSPECIFIED;
                break;
            case 1:
                exqrVar = exqr.IMPORTANCE_NONE;
                break;
            case 2:
                exqrVar = exqr.IMPORTANCE_DEFAULT;
                break;
            case 3:
                exqrVar = exqr.IMPORTANCE_HIGH;
                break;
            case 4:
                exqrVar = exqr.IMPORTANCE_LOW;
                break;
            case 5:
                exqrVar = exqr.IMPORTANCE_MAX;
                break;
            case 6:
                exqrVar = exqr.IMPORTANCE_MIN;
                break;
            default:
                exqrVar = null;
                break;
        }
        return exqrVar != null;
    }
}
