package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class emsv implements eygj {
    @Override // defpackage.eygj
    public final /* bridge */ /* synthetic */ Object a(int i) {
        emtp emtpVar;
        switch (i) {
            case 0:
                emtpVar = emtp.OS;
                break;
            case 1:
                emtpVar = emtp.ARCH;
                break;
            case 2:
                emtpVar = emtp.BOARD_NAME;
                break;
            case 3:
                emtpVar = emtp.PRODUCT_NAME;
                break;
            case 4:
                emtpVar = emtp.SYSTEM_VERSION;
                break;
            case 5:
                emtpVar = emtp.CHANNEL;
                break;
            case 6:
            case 8:
            default:
                emtpVar = null;
                break;
            case 7:
                emtpVar = emtp.BUILD_TYPE;
                break;
            case 9:
                emtpVar = emtp.EXPERIMENT_IDS;
                break;
            case 10:
                emtpVar = emtp.APP_VERSION;
                break;
        }
        return emtpVar == null ? emtp.UNRECOGNIZED : emtpVar;
    }
}
