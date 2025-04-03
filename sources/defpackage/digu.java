package defpackage;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class digu {
    public static final digw a;

    static {
        Uri uri = digv.a;
        a = digx.a();
    }

    public static int a(ContentResolver contentResolver, String str, int i) {
        Object obj;
        Integer num;
        digw digwVar = a;
        dihe.e(contentResolver);
        synchronized (digwVar) {
            ((dihe) digwVar).c(contentResolver);
            obj = ((dihe) digwVar).f;
            num = (Integer) dihe.f(((dihe) digwVar).c, str, Integer.valueOf(i));
        }
        if (num != null) {
            return num.intValue();
        }
        String a2 = ((dihe) digwVar).a(contentResolver, str, null);
        if (a2 != null) {
            try {
                int parseInt = Integer.parseInt(a2);
                num = Integer.valueOf(parseInt);
                i = parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        synchronized (digwVar) {
            ((dihe) digwVar).d(obj, ((dihe) digwVar).c, str, num);
        }
        return i;
    }

    public static long b(ContentResolver contentResolver, String str, long j) {
        Object obj;
        Long l;
        digw digwVar = a;
        dihe.e(contentResolver);
        synchronized (digwVar) {
            ((dihe) digwVar).c(contentResolver);
            obj = ((dihe) digwVar).f;
            l = (Long) dihe.f(((dihe) digwVar).d, str, Long.valueOf(j));
        }
        if (l != null) {
            return l.longValue();
        }
        String a2 = ((dihe) digwVar).a(contentResolver, str, null);
        if (a2 != null) {
            try {
                long parseLong = Long.parseLong(a2);
                l = Long.valueOf(parseLong);
                j = parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        synchronized (digwVar) {
            ((dihe) digwVar).d(obj, ((dihe) digwVar).d, str, l);
        }
        return j;
    }

    public static String c(ContentResolver contentResolver, String str, String str2) {
        return a.a(contentResolver, str, str2);
    }

    public static Map d(ContentResolver contentResolver, String... strArr) {
        try {
            dihb dihbVar = ((dihe) a).i;
            return dihb.a(contentResolver, strArr, new dihc() { // from class: digz
                @Override // defpackage.dihc
                public final Map a(int i) {
                    return new TreeMap();
                }
            });
        } catch (dihd unused) {
            return new TreeMap();
        }
    }

    public static boolean e(ContentResolver contentResolver, String str, boolean z) {
        Object obj;
        Boolean bool;
        digw digwVar = a;
        dihe.e(contentResolver);
        synchronized (digwVar) {
            ((dihe) digwVar).c(contentResolver);
            obj = ((dihe) digwVar).f;
            bool = (Boolean) dihe.f(((dihe) digwVar).b, str, Boolean.valueOf(z));
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        String a2 = ((dihe) digwVar).a(contentResolver, str, null);
        if (a2 != null && !a2.isEmpty()) {
            if (digv.c.matcher(a2).matches()) {
                z = true;
                bool = true;
            } else if (digv.d.matcher(a2).matches()) {
                z = false;
                bool = false;
            } else {
                Log.w("Gservices", a.d(a2, str, "attempt to read Gservices key ", " (value \"", "\") as boolean"));
            }
        }
        synchronized (digwVar) {
            ((dihe) digwVar).d(obj, ((dihe) digwVar).b, str, bool);
        }
        return z;
    }
}
