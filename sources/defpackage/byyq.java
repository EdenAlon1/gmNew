package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class byyq {
    public static String a(int i) {
        switch (i) {
            case 0:
            case 1:
                return "invited";
            case 2:
                return "left";
            case 3:
                return "different config";
            case 4:
                return "recovered from telephony";
            case 5:
                return "rcs group creation failed";
            case 6:
                return "forked";
            case 7:
                return "setting up for Vanilla RCS";
            case 8:
                return "setting up RCS group conversation";
            case 9:
                return "satellite ended";
            default:
                throw new IllegalArgumentException(a.f(i, "invalid join state (", ")"));
        }
    }
}
