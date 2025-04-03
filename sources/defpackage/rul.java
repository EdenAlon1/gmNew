package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rul implements eygg {
    public static final eygg a = new rul();

    private rul() {
    }

    @Override // defpackage.eygg
    public final boolean a(int i) {
        rum rumVar;
        switch (i) {
            case 0:
                rumVar = rum.USER_FEEDBACK_UNKNOWN;
                break;
            case 1:
                rumVar = rum.USER_FEEDBACK_MARKED_NOT_SPAM;
                break;
            case 2:
                rumVar = rum.USER_FEEDBACK_MARKED_SPAM;
                break;
            case 3:
                rumVar = rum.USER_FEEDBACK_CONFIRMED_SPAM;
                break;
            case 4:
                rumVar = rum.USER_FEEDBACK_LEFT_SPAM;
                break;
            case 5:
                rumVar = rum.USER_FEEDBACK_DELETED_SPAM;
                break;
            case 6:
                rumVar = rum.USER_FEEDBACK_BLOCKED_SPAM;
                break;
            default:
                rumVar = null;
                break;
        }
        return rumVar != null;
    }
}
