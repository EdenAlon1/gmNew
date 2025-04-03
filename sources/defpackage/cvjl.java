package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public enum cvjl implements eyge {
    WELCOME_FLOW_UNSPECIFIED(0),
    WELCOME_FLOW_EXPRESS_SIGN_IN_EXISTING_USER(1),
    WELCOME_FLOW_EXPRESS_SIGN_IN_NEW_USER(2),
    WELCOME_FLOW_ACCOUNT_SWITCH(3),
    WELCOME_FLOW_ALREADY_SIGNED_IN(4),
    WELCOME_FLOW_SETTINGS(5);

    public final int g;

    cvjl(int i) {
        this.g = i;
    }

    public static cvjl b(int i) {
        if (i == 0) {
            return WELCOME_FLOW_UNSPECIFIED;
        }
        if (i == 1) {
            return WELCOME_FLOW_EXPRESS_SIGN_IN_EXISTING_USER;
        }
        if (i == 2) {
            return WELCOME_FLOW_EXPRESS_SIGN_IN_NEW_USER;
        }
        if (i == 3) {
            return WELCOME_FLOW_ACCOUNT_SWITCH;
        }
        if (i == 4) {
            return WELCOME_FLOW_ALREADY_SIGNED_IN;
        }
        if (i != 5) {
            return null;
        }
        return WELCOME_FLOW_SETTINGS;
    }

    @Override // defpackage.eyge
    public final int a() {
        return this.g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.g);
    }
}
