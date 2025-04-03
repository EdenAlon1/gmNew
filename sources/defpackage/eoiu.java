package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eoiu implements eygg {
    static final eygg a = new eoiu();

    private eoiu() {
    }

    @Override // defpackage.eygg
    public final boolean a(int i) {
        eoiv eoivVar;
        switch (i) {
            case 0:
                eoivVar = eoiv.UNKNOWN_BUGLE_OPEN_CAUSE;
                break;
            case 1:
                eoivVar = eoiv.VIA_LAUNCH_ICON;
                break;
            case 2:
                eoivVar = eoiv.VIA_NOTIFICATION;
                break;
            case 3:
                eoivVar = eoiv.VIA_SHARING_INTENT;
                break;
            case 4:
                eoivVar = eoiv.VIA_LOCKSCREEN;
                break;
            case 5:
                eoivVar = eoiv.VIA_WIDGET;
                break;
            case 6:
                eoivVar = eoiv.VIA_OTHER_APPS_WITHOUT_SHARING_DATA;
                break;
            case 7:
                eoivVar = eoiv.VIA_DEFAULT;
                break;
            case 8:
                eoivVar = eoiv.VIA_SHORTCUT;
                break;
            case 9:
                eoivVar = eoiv.VIA_TRAMPOLINE;
                break;
            case 10:
                eoivVar = eoiv.VIA_ASSISTANT_APP_CONTROL;
                break;
            default:
                eoivVar = null;
                break;
        }
        return eoivVar != null;
    }
}
