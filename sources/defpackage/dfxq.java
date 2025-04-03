package defpackage;

import android.util.Log;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class dfxq {
    public final String a;
    private final String b;
    private final int c;

    public dfxq(String str, String... strArr) {
        String sb;
        if (strArr.length == 0) {
            sb = "";
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('[');
            String str2 = strArr[0];
            if (sb2.length() > 1) {
                sb2.append(",");
            }
            sb2.append(str2);
            sb2.append("] ");
            sb = sb2.toString();
        }
        this.b = sb;
        this.a = str;
        new dfwj(str);
        int i = 2;
        while (i <= 7 && !Log.isLoggable(this.a, i)) {
            i++;
        }
        this.c = i;
    }

    public final String a(String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.b.concat(str);
    }

    public final void b(String str, Object... objArr) {
        if (this.c <= 3) {
            Log.d(this.a, a(str, objArr));
        }
    }

    public final void c(String str, Object... objArr) {
        Log.e(this.a, a(str, objArr));
    }

    public final void d(String str, Throwable th, Object... objArr) {
        Log.e(this.a, a(str, objArr), th);
    }

    public final void e(String str, Object... objArr) {
        Log.w(this.a, a(str, objArr));
    }

    public final void f(String str, Throwable th, Object... objArr) {
        Log.w(this.a, a(str, objArr), th);
    }
}
