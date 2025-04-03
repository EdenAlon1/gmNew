package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eohi implements eygg {
    static final eygg a = new eohi();

    private eohi() {
    }

    @Override // defpackage.eygg
    public final boolean a(int i) {
        eohj eohjVar;
        switch (i) {
            case 0:
                eohjVar = eohj.UNKNOWN_BUGLE_CONTENT_TYPE;
                break;
            case 1:
                eohjVar = eohj.TEXT;
                break;
            case 2:
                eohjVar = eohj.IMAGE;
                break;
            case 3:
                eohjVar = eohj.VIDEO;
                break;
            case 4:
                eohjVar = eohj.AUDIO;
                break;
            case 5:
                eohjVar = eohj.VCARD;
                break;
            case 6:
                eohjVar = eohj.PDF;
                break;
            case 7:
                eohjVar = eohj.CALENDAR;
                break;
            case 8:
                eohjVar = eohj.DOC;
                break;
            case 9:
                eohjVar = eohj.PPT;
                break;
            case 10:
                eohjVar = eohj.XLS;
                break;
            case 11:
                eohjVar = eohj.TXT;
                break;
            case 12:
                eohjVar = eohj.HTML;
                break;
            case 13:
                eohjVar = eohj.COMPRESSED;
                break;
            default:
                eohjVar = null;
                break;
        }
        return eohjVar != null;
    }
}
