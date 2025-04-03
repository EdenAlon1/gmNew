package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcec implements eygj {
    @Override // defpackage.eygj
    public final /* bridge */ /* synthetic */ Object a(int i) {
        fgtb fgtbVar;
        if (i != 0) {
            switch (i) {
                case 3:
                    fgtbVar = fgtb.GAIA_CALLER_ID;
                    break;
                case 4:
                    fgtbVar = fgtb.TESTING;
                    break;
                case 5:
                    fgtbVar = fgtb.EMAIL_CONTACTS;
                    break;
                case 6:
                    fgtbVar = fgtb.TACHYGRAM;
                    break;
                case 7:
                    fgtbVar = fgtb.MUTUAL_CJNS;
                    break;
                case 8:
                    fgtbVar = fgtb.PUSH_ALERTS;
                    break;
                case 9:
                    fgtbVar = fgtb.UNICORN;
                    break;
                case 10:
                    fgtbVar = fgtb.GROUP_CALLING_TICKLE_WEB;
                    break;
                case 11:
                    fgtbVar = fgtb.GUESTS_SUPPORTED;
                    break;
                case 12:
                    fgtbVar = fgtb.SUSPECTED_SPAM_UI_SUPPORTED;
                    break;
                case 13:
                    fgtbVar = fgtb.SELF_GROUP_CALL_TICKLE_SUPPORTED;
                    break;
                case 14:
                    fgtbVar = fgtb.DUET_GROUP_CALL;
                    break;
                case 15:
                    fgtbVar = fgtb.SUPPORTS_LONG_LIVED_RCS_AUTH_TOKEN;
                    break;
                case 16:
                    fgtbVar = fgtb.SUPPORTS_24_HOUR_RCS_AUTH_TOKEN;
                    break;
                default:
                    fgtbVar = null;
                    break;
            }
        } else {
            fgtbVar = fgtb.UNKNOWN;
        }
        return fgtbVar == null ? fgtb.UNRECOGNIZED : fgtbVar;
    }
}
