package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eova implements eygg {
    static final eygg a = new eova();

    private eova() {
    }

    @Override // defpackage.eygg
    public final boolean a(int i) {
        eovb eovbVar;
        switch (i) {
            case 0:
                eovbVar = eovb.UNKNOWN_HAPPINESS_TRACKING_MODE;
                break;
            case 1:
                eovbVar = eovb.HAPPINESS_TRACKING_MODE_SURVEY;
                break;
            case 2:
                eovbVar = eovb.HAPPINESS_TRACKING_MODE_PLAY_STORE_RATING;
                break;
            case 3:
                eovbVar = eovb.HAPPINESS_TRACKING_MODE_HIDDEN;
                break;
            case 4:
                eovbVar = eovb.SMART_REPLY_HAPPINESS_TRACKING_SURVEY;
                break;
            case 5:
                eovbVar = eovb.SHARE_AND_CONNECT_HAPPINESS_TRACKING_SURVEY;
                break;
            case 6:
                eovbVar = eovb.ORGANIZE_HAPPINESS_TRACKING_SURVEY;
                break;
            default:
                eovbVar = null;
                break;
        }
        return eovbVar != null;
    }
}
