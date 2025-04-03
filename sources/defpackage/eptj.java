package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eptj implements eygg {
    static final eygg a = new eptj();

    private eptj() {
    }

    @Override // defpackage.eygg
    public final boolean a(int i) {
        eptk eptkVar;
        switch (i) {
            case 0:
                eptkVar = eptk.UNKNOWN_CLOSING_SOURCE;
                break;
            case 1:
                eptkVar = eptk.BACK_BUTTON;
                break;
            case 2:
                eptkVar = eptk.BACK_ICON;
                break;
            case 3:
                eptkVar = eptk.KEYBOARD_OPEN;
                break;
            case 4:
                eptkVar = eptk.SELECTION;
                break;
            case 5:
                eptkVar = eptk.DISMISSAL;
                break;
            case 6:
                eptkVar = eptk.MESSAGE_SELECTED;
                break;
            default:
                eptkVar = null;
                break;
        }
        return eptkVar != null;
    }
}
