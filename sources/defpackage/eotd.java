package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eotd implements eygg {
    static final eygg a = new eotd();

    private eotd() {
    }

    @Override // defpackage.eygg
    public final boolean a(int i) {
        eote eoteVar;
        switch (i) {
            case 0:
                eoteVar = eote.UNKNOWN;
                break;
            case 1:
                eoteVar = eote.TEXT;
                break;
            case 2:
                eoteVar = eote.ATTACHMENT;
                break;
            case 3:
                eoteVar = eote.SUCCESS_RECEIPT;
                break;
            case 4:
                eoteVar = eote.FTD_RECEIPT;
                break;
            case 5:
                eoteVar = eote.LOCATION;
                break;
            case 6:
                eoteVar = eote.READ_REPORT;
                break;
            case 7:
                eoteVar = eote.TYPING_INDICATOR;
                break;
            default:
                eoteVar = null;
                break;
        }
        return eoteVar != null;
    }
}
