package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlfd {
    private static final enru a = enru.c("com/google/android/libraries/abuse/hades/moirai/logging/LoggingHelper");

    public static final int a(rtm rtmVar) {
        if ((rtmVar.b & 4) == 0) {
            return 0;
        }
        rsq rsqVar = rtmVar.e;
        if (rsqVar == null) {
            rsqVar = rsq.a;
        }
        return !rsqVar.c ? 2 : 1;
    }

    public static final long b(dlgb dlgbVar) {
        int compare;
        int compare2;
        int compare3;
        long j = 0;
        if (ffkj.e(dlgbVar.b, "")) {
            return 0L;
        }
        try {
            String str = dlgbVar.b;
            int length = str.length();
            ffcp ffcpVar = null;
            if (length != 0) {
                int i = 0;
                char charAt = str.charAt(0);
                if (ffkj.a(charAt, 48) < 0) {
                    i = 1;
                    if (length != 1) {
                        if (charAt != '+') {
                        }
                    }
                }
                long j2 = 512409557603043100L;
                while (true) {
                    if (i >= length) {
                        ffcpVar = new ffcp(j);
                        break;
                    }
                    int b = ffol.b(str.charAt(i));
                    if (b < 0) {
                        break;
                    }
                    compare = Long.compare(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE);
                    if (compare > 0) {
                        if (j2 != 512409557603043100L) {
                            break;
                        }
                        j2 = 1844674407370955161L;
                        compare3 = Long.compare(j ^ Long.MIN_VALUE, 1844674407370955161L ^ Long.MIN_VALUE);
                        if (compare3 > 0) {
                            break;
                        }
                    }
                    long j3 = j * 10;
                    long j4 = b + j3;
                    compare2 = Long.compare(j4 ^ Long.MIN_VALUE, j3 ^ Long.MIN_VALUE);
                    if (compare2 < 0) {
                        break;
                    }
                    i++;
                    j = j4;
                }
            }
            if (ffcpVar != null) {
                return ffcpVar.a;
            }
            throw new NumberFormatException(a.a(str, "Invalid number format: '", "'"));
        } catch (NumberFormatException e) {
            ((enrr) ((enrr) a.j()).g(e).h("com/google/android/libraries/abuse/hades/moirai/logging/LoggingHelper", "clientRoleForLogging", 83, "LoggingHelper.kt")).q("ClientId.role is not a number.");
            return -1L;
        }
    }

    public static final int c(int i) {
        int i2 = i - 1;
        if (i2 != 1) {
            return i2 != 2 ? 1 : 3;
        }
        return 2;
    }
}
