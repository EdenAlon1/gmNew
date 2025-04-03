package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eyuc implements eygg {
    static final eygg a = new eyuc();

    private eyuc() {
    }

    @Override // defpackage.eygg
    public final boolean a(int i) {
        eyud eyudVar;
        switch (i) {
            case 0:
                eyudVar = eyud.FEATURE_TAG_TYPE_UNKNOWN;
                break;
            case 1:
                eyudVar = eyud.FEATURE_TAG_TEXT;
                break;
            case 2:
                eyudVar = eyud.FEATURE_TAG_VIDEO;
                break;
            case 3:
                eyudVar = eyud.FEATURE_TAG_3GPP_SMSIP;
                break;
            case 4:
                eyudVar = eyud.FEATURE_TAG_3GPP_IARI_REF_RCSE_DP;
                break;
            case 5:
                eyudVar = eyud.FEATURE_TAG_3GPP_ICSI_REF_MMTEL;
                break;
            case 6:
                eyudVar = eyud.FEATURE_TAG_3GPP_IARI_REF_GEOPUSH;
                break;
            case 7:
                eyudVar = eyud.FEATURE_TAG_3GPP_ICSI_REF_CPM_SESSION;
                break;
            case 8:
                eyudVar = eyud.FEATURE_TAG_3GPP_IARI_REF_FTHTTP;
                break;
            case 9:
                eyudVar = eyud.FEATURE_TAG_3GPP_IARI_REF_CPM_FILETRANSFER;
                break;
            case 10:
                eyudVar = eyud.FEATURE_TAG_3GPP_ICSI_REF_CPM_MSG;
                break;
            case 11:
                eyudVar = eyud.FEATURE_TAG_3GPP_ICSI_REF_CPM_LARGEMSG;
                break;
            case 12:
                eyudVar = eyud.FEATURE_TAG_3GPP_ICSI_REF_CPM_DEFERRED;
                break;
            case 13:
                eyudVar = eyud.FEATURE_TAG_CPM_PAGER_LARGE;
                break;
            case 14:
                eyudVar = eyud.FEATURE_TAG_3GPP_IARI_REF_FTSMS;
                break;
            case 15:
                eyudVar = eyud.FEATURE_TAG_3GPP_ICSI_REF_CALLCOMPOSER;
                break;
            case 16:
                eyudVar = eyud.FEATURE_TAG_GSMA_CALLCOMPOSER;
                break;
            case 17:
                eyudVar = eyud.FEATURE_TAG_3GPP_ICSI_REF_CALLUNANSWERED;
                break;
            case 18:
                eyudVar = eyud.FEATURE_TAG_3GPP_ICSI_REF_SHAREDMAP;
                break;
            case 19:
                eyudVar = eyud.FEATURE_TAG_3GPP_ICSI_REF_SHAREDSKETCH;
                break;
            case 20:
                eyudVar = eyud.FEATURE_TAG_3GPP_IARI_REF_GEOSMS;
                break;
            case 21:
                eyudVar = eyud.FEATURE_TAG_3GPP_IARI_REF_CHATBOT;
                break;
            case 22:
                eyudVar = eyud.FEATURE_TAG_3GPP_IARI_REF_CHATBOT_SA;
                break;
            case 23:
                eyudVar = eyud.FEATURE_TAG_GSMA_BOTVERSION;
                break;
            case 24:
                eyudVar = eyud.FEATURE_TAG_GSMA_CPIMEXT;
                break;
            default:
                eyudVar = null;
                break;
        }
        return eyudVar != null;
    }
}
