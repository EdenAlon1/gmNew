package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public enum cvjj implements eyge {
    ACTION_UNSPECIFIED(0),
    ACTION_ACCEPT_NOTICE(1),
    ACTION_USE_WITHOUT_AN_ACCOUNT(2);

    public final int d;

    cvjj(int i) {
        this.d = i;
    }

    public static cvjj b(int i) {
        if (i == 0) {
            return ACTION_UNSPECIFIED;
        }
        if (i == 1) {
            return ACTION_ACCEPT_NOTICE;
        }
        if (i != 2) {
            return null;
        }
        return ACTION_USE_WITHOUT_AN_ACCOUNT;
    }

    @Override // defpackage.eyge
    public final int a() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.d);
    }
}
