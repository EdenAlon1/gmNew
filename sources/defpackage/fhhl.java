package defpackage;

import androidx.car.app.model.Alert;
import j$.util.DesugarCollections;
import j$.util.DesugarTimeZone;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.Field;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhhl {
    public static final byte[] a;
    public static final fhgh b = fhgg.c(new String[0]);
    public static final fhhe c;
    public static final fhnh d;
    public static final TimeZone e;
    public static final String f;
    private static final ffpa g;

    static {
        byte[] bArr = new byte[0];
        a = bArr;
        fhmt fhmtVar = new fhmt();
        fhmtVar.Y(bArr);
        c = new fhhd(null, 0L, fhmtVar);
        fhgy.a(bArr);
        fhng fhngVar = fhnh.a;
        fhmx fhmxVar = fhmx.a;
        d = fhngVar.a(fhmw.a("efbbbf"), fhmw.a("feff"), fhmw.a("fffe"), fhmw.a("0000ffff"), fhmw.a("ffff0000"));
        TimeZone timeZone = DesugarTimeZone.getTimeZone("GMT");
        timeZone.getClass();
        e = timeZone;
        g = new ffpa("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        String name = fhgs.class.getName();
        name.getClass();
        f = ffpc.B(ffpc.A(name, "okhttp3."), "Client");
    }

    public static final int A(long j, TimeUnit timeUnit) {
        long j2 = 0;
        if (j < 0) {
            throw new IllegalStateException("timeout < 0");
        }
        long millis = timeUnit.toMillis(j);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException("timeout too large.");
        }
        if (millis != 0) {
            j2 = millis;
        } else if (j > 0) {
            throw new IllegalArgumentException("timeout too small.");
        }
        return (int) j2;
    }

    public static final void B(long j, long j2) {
        if (j < 0 || j < j2) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static /* synthetic */ int C(String str, char c2, int i, int i2) {
        if ((i2 & 4) != 0) {
            i = str.length();
        }
        return a(str, c2, 0, i);
    }

    public static final boolean D(fhnv fhnvVar, TimeUnit timeUnit) {
        timeUnit.getClass();
        try {
            return x(fhnvVar, 100, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final void E(Exception exc, List list) {
        exc.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ffbt.a(exc, (Exception) it.next());
        }
    }

    public static final int a(String str, char c2, int i, int i2) {
        while (i < i2) {
            if (str.charAt(i) == c2) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int b(String str, String str2, int i, int i2) {
        while (i < i2) {
            if (ffpc.L(str2, str.charAt(i))) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int c(String str) {
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (ffkj.a(charAt, 31) <= 0 || ffkj.a(charAt, 127) >= 0) {
                return i;
            }
        }
        return -1;
    }

    public static final int d(String str, int i, int i2) {
        while (i < i2) {
            char charAt = str.charAt(i);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int e(String str, int i, int i2) {
        int i3 = i2 - 1;
        if (i <= i3) {
            while (true) {
                char charAt = str.charAt(i3);
                if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                    return i3 + 1;
                }
                if (i3 == i) {
                    break;
                }
                i3--;
            }
        }
        return i;
    }

    public static final int f(char c2) {
        if (c2 >= '0' && c2 < ':') {
            return c2 - '0';
        }
        if (c2 >= 'a' && c2 < 'g') {
            return c2 - 'W';
        }
        if (c2 < 'A' || c2 >= 'G') {
            return -1;
        }
        return c2 - '7';
    }

    public static final int g(fhmv fhmvVar) {
        return z(fhmvVar.d()) | (z(fhmvVar.d()) << 16) | (z(fhmvVar.d()) << 8);
    }

    public static final int h(String str, int i) {
        if (str != null) {
            try {
                long parseLong = Long.parseLong(str);
                if (parseLong > 2147483647L) {
                    return Alert.DURATION_SHOW_INDEFINITELY;
                }
                if (parseLong < 0) {
                    return 0;
                }
                return (int) parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        return i;
    }

    public static final long i(fhhb fhhbVar) {
        String b2 = fhhbVar.f.b("Content-Length");
        if (b2 == null) {
            return -1L;
        }
        try {
            return Long.parseLong(b2);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static final Object j(Object obj, Class cls, String str) {
        Object obj2;
        Object j;
        Class<?> cls2 = obj.getClass();
        while (true) {
            obj2 = null;
            if (ffkj.e(cls2, Object.class)) {
                if (ffkj.e(str, "delegate") || (j = j(obj, Object.class, "delegate")) == null) {
                    return null;
                }
                return j(j, cls, str);
            }
            try {
                Field declaredField = cls2.getDeclaredField(str);
                declaredField.setAccessible(true);
                Object obj3 = declaredField.get(obj);
                if (!cls.isInstance(obj3)) {
                    break;
                }
                obj2 = cls.cast(obj3);
                break;
            } catch (NoSuchFieldException unused) {
                cls2 = cls2.getSuperclass();
            }
        }
        return obj2;
    }

    public static final String k(String str, Object... objArr) {
        int length = objArr.length;
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(objArr, length);
        String format = String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length));
        format.getClass();
        return format;
    }

    public static final String l(fhgk fhgkVar, boolean z) {
        boolean I;
        String str;
        I = ffpc.I(fhgkVar.c, ":", false);
        if (I) {
            str = "[" + fhgkVar.c + "]";
        } else {
            str = fhgkVar.c;
        }
        if (!z && fhgkVar.d == fhgj.a(fhgkVar.b)) {
            return str;
        }
        return str + ":" + fhgkVar.d;
    }

    public static final String m(String str, int i, int i2) {
        int d2 = d(str, i, i2);
        String substring = str.substring(d2, e(str, d2, i2));
        substring.getClass();
        return substring;
    }

    @SafeVarargs
    public static final List n(Object... objArr) {
        objArr.getClass();
        Object[] objArr2 = (Object[]) objArr.clone();
        List unmodifiableList = DesugarCollections.unmodifiableList(ffdx.g(Arrays.copyOf(objArr2, objArr2.length)));
        unmodifiableList.getClass();
        return unmodifiableList;
    }

    public static final List o(List list) {
        List unmodifiableList = DesugarCollections.unmodifiableList(ffdx.am(list));
        unmodifiableList.getClass();
        return unmodifiableList;
    }

    public static final fhgh p(List list) {
        fhgf fhgfVar = new fhgf();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            fhjl fhjlVar = (fhjl) it.next();
            fhgfVar.c(fhjlVar.g.e(), fhjlVar.h.e());
        }
        return fhgfVar.b();
    }

    public static final void q(Closeable closeable) {
        closeable.getClass();
        try {
            closeable.close();
        } catch (RuntimeException e2) {
            throw e2;
        } catch (Exception unused) {
        }
    }

    public static final void r(Socket socket) {
        try {
            socket.close();
        } catch (AssertionError e2) {
            throw e2;
        } catch (RuntimeException e3) {
            if (!ffkj.e(e3.getMessage(), "bio == null")) {
                throw e3;
            }
        } catch (Exception unused) {
        }
    }

    public static final boolean s(String str) {
        return g.d(str);
    }

    public static final boolean t(fhgk fhgkVar, fhgk fhgkVar2) {
        return ffkj.e(fhgkVar.c, fhgkVar2.c) && fhgkVar.d == fhgkVar2.d && ffkj.e(fhgkVar.b, fhgkVar2.b);
    }

    public static final boolean u(String[] strArr, String[] strArr2, Comparator comparator) {
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                Iterator a2 = ffjw.a(strArr2);
                while (a2.hasNext()) {
                    if (comparator.compare(str, (String) a2.next()) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final boolean v(Socket socket, fhmv fhmvVar) {
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                return !fhmvVar.D();
            } finally {
                socket.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public static final boolean w(String str) {
        str.getClass();
        return ffpc.j(str, "Authorization", true) || ffpc.j(str, "Cookie", true) || ffpc.j(str, "Proxy-Authorization", true) || ffpc.j(str, "Set-Cookie", true);
    }

    public static final boolean x(fhnv fhnvVar, int i, TimeUnit timeUnit) {
        boolean z;
        timeUnit.getClass();
        long nanoTime = System.nanoTime();
        long j = fhnvVar.a().h() ? fhnvVar.a().j() - nanoTime : Long.MAX_VALUE;
        fhnvVar.a().m(Math.min(j, timeUnit.toNanos(i)) + nanoTime);
        try {
            fhmt fhmtVar = new fhmt();
            while (fhnvVar.b(fhmtVar, 8192L) != -1) {
                fhmtVar.A();
            }
            z = true;
        } catch (InterruptedIOException unused) {
            z = false;
        } catch (Throwable th) {
            fhnx a2 = fhnvVar.a();
            if (j == Long.MAX_VALUE) {
                a2.k();
            } else {
                a2.m(nanoTime + j);
            }
            throw th;
        }
        if (j == Long.MAX_VALUE) {
            fhnvVar.a().k();
        } else {
            fhnvVar.a().m(nanoTime + j);
        }
        return z;
    }

    public static final String[] y(String[] strArr, String[] strArr2, Comparator comparator) {
        strArr2.getClass();
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int i = 0;
            while (true) {
                if (i >= strArr2.length) {
                    break;
                }
                if (comparator.compare(str, strArr2[i]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i++;
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final int z(byte b2) {
        return b2 & 255;
    }
}
