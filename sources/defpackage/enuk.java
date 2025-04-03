package defpackage;

import java.lang.reflect.InvocationTargetException;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enuk {
    public static final Cenum a;

    static {
        String[] strArr;
        strArr = Cenum.d;
        a = a(strArr);
    }

    private static Cenum a(String[] strArr) {
        enuu enuuVar;
        try {
            enuuVar = enuv.a;
        } catch (NoClassDefFoundError unused) {
            enuuVar = null;
        }
        if (enuuVar != null) {
            return enuuVar;
        }
        StringBuilder sb = new StringBuilder();
        for (String str : strArr) {
            try {
                return (Cenum) Class.forName(str).getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Throwable th) {
                th = th;
                sb.append('\n');
                sb.append(str);
                sb.append(": ");
                if (th instanceof InvocationTargetException) {
                    th = th.getCause();
                }
                sb.append(th);
            }
        }
        throw new IllegalStateException(sb.insert(0, "No logging platforms found:").toString());
    }
}
