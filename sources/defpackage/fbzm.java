package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbzm {
    public static /* synthetic */ String a(int i) {
        if (i == 1) {
            return "UNRECOGNIZED";
        }
        if (i == 2) {
            return "UNKNOWN";
        }
        switch (i) {
            case 7:
                return "CREATE_GROUP_PUSH";
            case 8:
                return "ADD_GROUP_USERS_PUSH";
            case 9:
                return "KICK_GROUP_USERS_PUSH";
            case 10:
                return "CHANGE_GROUP_PROFILE_PUSH";
            case 11:
                return "CHANGE_GROUP_MEMBER_ROLE_PUSH";
            case 12:
                return "CHANGE_GROUP_INFO_PUSH";
            default:
                return "null";
        }
    }

    public static int b(int i) {
        if (i != 1) {
            return i - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static int c(int i) {
        if (i == 0) {
            return 2;
        }
        switch (i) {
            case 5:
                return 7;
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
                return 10;
            case 9:
                return 11;
            case 10:
                return 12;
            default:
                return 0;
        }
    }
}
