package defpackage;

import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class firk implements Serializable {
    public static final firk a = new fiuz("UTC", "UTC", 0, 0);
    public static Set b = null;
    public static fiuy d = null;
    private static fiva e = null;
    private static volatile firk f = null;
    private static fits g = null;
    private static Map h = null;
    private static Map i = null;
    private static final long serialVersionUID = 5546345482340108586L;
    public final String c;

    /* JADX WARN: Removed duplicated region for block: B:40:0x002d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0042  */
    static {
        /*
            fiuz r0 = new fiuz
            r1 = 0
            java.lang.String r2 = "UTC"
            r0.<init>(r2, r2, r1, r1)
            defpackage.firk.a = r0
            r0 = 0
            java.lang.String r1 = "org.joda.time.DateTimeZone.Provider"
            java.lang.String r1 = java.lang.System.getProperty(r1)     // Catch: java.lang.SecurityException -> L2a
            if (r1 == 0) goto L2a
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Exception -> L1e java.lang.SecurityException -> L2a
            java.lang.Object r1 = r1.newInstance()     // Catch: java.lang.Exception -> L1e java.lang.SecurityException -> L2a
            fiva r1 = (defpackage.fiva) r1     // Catch: java.lang.Exception -> L1e java.lang.SecurityException -> L2a
            goto L2b
        L1e:
            r1 = move-exception
            java.lang.Thread r3 = java.lang.Thread.currentThread()     // Catch: java.lang.SecurityException -> L2a
            java.lang.ThreadGroup r4 = r3.getThreadGroup()     // Catch: java.lang.SecurityException -> L2a
            r4.uncaughtException(r3, r1)     // Catch: java.lang.SecurityException -> L2a
        L2a:
            r1 = r0
        L2b:
            if (r1 != 0) goto L40
            fivd r3 = new fivd     // Catch: java.lang.Exception -> L34
            r3.<init>(r0)     // Catch: java.lang.Exception -> L34
            r1 = r3
            goto L40
        L34:
            r3 = move-exception
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            java.lang.ThreadGroup r5 = r4.getThreadGroup()
            r5.uncaughtException(r4, r3)
        L40:
            if (r1 != 0) goto L47
            fivb r1 = new fivb
            r1.<init>()
        L47:
            java.util.Set r3 = r1.a()
            if (r3 == 0) goto La3
            int r4 = r3.size()
            if (r4 == 0) goto La3
            boolean r4 = r3.contains(r2)
            if (r4 == 0) goto L9b
            firk r2 = r1.b(r2)
            firk r4 = defpackage.firk.a
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L93
            defpackage.firk.e = r1
            defpackage.firk.b = r3
            java.lang.String r1 = "org.joda.time.DateTimeZone.NameProvider"
            java.lang.String r1 = java.lang.System.getProperty(r1)     // Catch: java.lang.SecurityException -> L89
            if (r1 == 0) goto L89
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Exception -> L7d java.lang.SecurityException -> L89
            java.lang.Object r1 = r1.newInstance()     // Catch: java.lang.Exception -> L7d java.lang.SecurityException -> L89
            fiuy r1 = (defpackage.fiuy) r1     // Catch: java.lang.Exception -> L7d java.lang.SecurityException -> L89
            r0 = r1
            goto L89
        L7d:
            r1 = move-exception
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch: java.lang.SecurityException -> L89
            java.lang.ThreadGroup r3 = r2.getThreadGroup()     // Catch: java.lang.SecurityException -> L89
            r3.uncaughtException(r2, r1)     // Catch: java.lang.SecurityException -> L89
        L89:
            if (r0 != 0) goto L90
            fiuy r0 = new fiuy
            r0.<init>()
        L90:
            defpackage.firk.d = r0
            return
        L93:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Invalid UTC zone provided"
            r0.<init>(r1)
            throw r0
        L9b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "The provider doesn't support UTC"
            r0.<init>(r1)
            throw r0
        La3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "The provider doesn't have any available ids"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.firk.<clinit>():void");
    }

    protected firk(String str) {
        this.c = str;
    }

    public static String h(int i2) {
        StringBuffer stringBuffer = new StringBuffer();
        if (i2 >= 0) {
            stringBuffer.append('+');
        } else {
            stringBuffer.append('-');
            i2 = -i2;
        }
        int i3 = i2 / 3600000;
        fium.c(stringBuffer, i3, 2);
        stringBuffer.append(':');
        int i4 = i2 - (i3 * 3600000);
        int i5 = i4 / 60000;
        fium.c(stringBuffer, i5, 2);
        int i6 = i4 - (i5 * 60000);
        if (i6 != 0) {
            int i7 = i6 / 1000;
            stringBuffer.append(':');
            fium.c(stringBuffer, i7, 2);
            int i8 = i6 - (i7 * 1000);
            if (i8 != 0) {
                stringBuffer.append('.');
                fium.c(stringBuffer, i8, 3);
                return stringBuffer.toString();
            }
        }
        return stringBuffer.toString();
    }

    public static firk i(String str) {
        if (str == null) {
            return j();
        }
        if (!str.equals("UTC")) {
            firk b2 = e.b(str);
            if (b2 != null) {
                return b2;
            }
            if (!str.startsWith("+") && !str.startsWith("-")) {
                throw new IllegalArgumentException(a.a(str, "The datetime zone id '", "' is not recognised"));
            }
            int n = n(str);
            if (n != 0) {
                return p(h(n), n);
            }
        }
        return a;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0090 A[Catch: all -> 0x0096, TRY_ENTER, TryCatch #1 {, blocks: (B:6:0x0007, B:10:0x000c, B:12:0x0014, B:19:0x001c, B:21:0x0022, B:22:0x0027, B:24:0x0033, B:25:0x0036, B:27:0x003c, B:29:0x0044, B:33:0x004f, B:35:0x005b, B:37:0x0063, B:39:0x0073, B:40:0x0076, B:41:0x007f, B:42:0x008c, B:16:0x0090, B:17:0x0092, B:49:0x0094), top: B:5:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x001c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.firk j() {
        /*
            firk r0 = defpackage.firk.f
            if (r0 != 0) goto L99
            java.lang.Class<firk> r1 = defpackage.firk.class
            monitor-enter(r1)
            firk r0 = defpackage.firk.f     // Catch: java.lang.Throwable -> L96
            if (r0 != 0) goto L94
            r0 = 0
            java.lang.String r2 = "user.timezone"
            java.lang.String r2 = java.lang.System.getProperty(r2)     // Catch: java.lang.RuntimeException -> L19 java.lang.IllegalArgumentException -> L8e java.lang.Throwable -> L96
            if (r2 == 0) goto L19
            firk r2 = i(r2)     // Catch: java.lang.RuntimeException -> L19 java.lang.IllegalArgumentException -> L8e java.lang.Throwable -> L96
            goto L1a
        L19:
            r2 = r0
        L1a:
            if (r2 != 0) goto L8d
            java.util.TimeZone r3 = java.util.TimeZone.getDefault()     // Catch: java.lang.IllegalArgumentException -> L8d java.lang.Throwable -> L96
            if (r3 != 0) goto L27
            firk r0 = j()     // Catch: java.lang.IllegalArgumentException -> L8d java.lang.Throwable -> L96
            goto L8e
        L27:
            java.lang.String r4 = r3.getID()     // Catch: java.lang.IllegalArgumentException -> L8d java.lang.Throwable -> L96
            java.lang.String r5 = "UTC"
            boolean r5 = r4.equals(r5)     // Catch: java.lang.IllegalArgumentException -> L8d java.lang.Throwable -> L96
            if (r5 == 0) goto L36
            firk r0 = defpackage.firk.a     // Catch: java.lang.IllegalArgumentException -> L8d java.lang.Throwable -> L96
            goto L8e
        L36:
            java.lang.String r5 = o(r4)     // Catch: java.lang.IllegalArgumentException -> L8d java.lang.Throwable -> L96
            if (r5 == 0) goto L42
            fiva r0 = defpackage.firk.e     // Catch: java.lang.IllegalArgumentException -> L8d java.lang.Throwable -> L96
            firk r0 = r0.b(r5)     // Catch: java.lang.IllegalArgumentException -> L8d java.lang.Throwable -> L96
        L42:
            if (r0 != 0) goto L4a
            fiva r0 = defpackage.firk.e     // Catch: java.lang.IllegalArgumentException -> L8d java.lang.Throwable -> L96
            firk r0 = r0.b(r4)     // Catch: java.lang.IllegalArgumentException -> L8d java.lang.Throwable -> L96
        L4a:
            if (r0 == 0) goto L4d
            goto L8e
        L4d:
            if (r5 != 0) goto L7f
            java.lang.String r0 = r3.getID()     // Catch: java.lang.IllegalArgumentException -> L8d java.lang.Throwable -> L96
            java.lang.String r3 = "GMT+"
            boolean r3 = r0.startsWith(r3)     // Catch: java.lang.IllegalArgumentException -> L8d java.lang.Throwable -> L96
            if (r3 != 0) goto L63
            java.lang.String r3 = "GMT-"
            boolean r3 = r0.startsWith(r3)     // Catch: java.lang.IllegalArgumentException -> L8d java.lang.Throwable -> L96
            if (r3 == 0) goto L7f
        L63:
            r3 = 3
            java.lang.String r0 = r0.substring(r3)     // Catch: java.lang.IllegalArgumentException -> L8d java.lang.Throwable -> L96
            int r0 = n(r0)     // Catch: java.lang.IllegalArgumentException -> L8d java.lang.Throwable -> L96
            long r3 = (long) r0     // Catch: java.lang.IllegalArgumentException -> L8d java.lang.Throwable -> L96
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L76
            firk r0 = defpackage.firk.a     // Catch: java.lang.IllegalArgumentException -> L8d java.lang.Throwable -> L96
            goto L8e
        L76:
            java.lang.String r3 = h(r0)     // Catch: java.lang.IllegalArgumentException -> L8d java.lang.Throwable -> L96
            firk r0 = p(r3, r0)     // Catch: java.lang.IllegalArgumentException -> L8d java.lang.Throwable -> L96
            goto L8e
        L7f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.IllegalArgumentException -> L8d java.lang.Throwable -> L96
            java.lang.String r3 = "The datetime zone id '"
            java.lang.String r5 = "' is not recognised"
            java.lang.String r3 = defpackage.a.a(r4, r3, r5)     // Catch: java.lang.IllegalArgumentException -> L8d java.lang.Throwable -> L96
            r0.<init>(r3)     // Catch: java.lang.IllegalArgumentException -> L8d java.lang.Throwable -> L96
            throw r0     // Catch: java.lang.IllegalArgumentException -> L8d java.lang.Throwable -> L96
        L8d:
            r0 = r2
        L8e:
            if (r0 != 0) goto L92
            firk r0 = defpackage.firk.a     // Catch: java.lang.Throwable -> L96
        L92:
            defpackage.firk.f = r0     // Catch: java.lang.Throwable -> L96
        L94:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L96
            return r0
        L96:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L96
            throw r0
        L99:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.firk.j():firk");
    }

    private static int n(String str) {
        String str2;
        firi firiVar = new firi();
        fits q = q();
        if (q.c != firiVar) {
            q = new fits(q.a, q.b, firiVar, q.d);
        }
        fiuo fiuoVar = q.b;
        if (fiuoVar == null) {
            throw new UnsupportedOperationException("Parsing not supported");
        }
        fiuk fiukVar = new fiuk(q.b(q.c));
        int c = fiuoVar.c(fiukVar, str, 0);
        if (c < 0) {
            c = ~c;
        } else if (c >= str.length()) {
            return -((int) fiukVar.g(str));
        }
        String charSequence = str.toString();
        int i2 = fium.a;
        String concat = charSequence.length() <= c + 35 ? charSequence : charSequence.substring(0, c + 32).concat("...");
        if (c <= 0) {
            str2 = "Invalid format: \"" + concat + "\"";
        } else if (c >= charSequence.length()) {
            str2 = "Invalid format: \"" + concat + "\" is too short";
        } else {
            str2 = "Invalid format: \"" + concat + "\" is malformed at \"" + concat.substring(c) + "\"";
        }
        throw new IllegalArgumentException(str2);
    }

    private static synchronized String o(String str) {
        String str2;
        synchronized (firk.class) {
            Map map = i;
            if (map == null) {
                map = new HashMap();
                map.put("GMT", "UTC");
                map.put("WET", "WET");
                map.put("CET", "CET");
                map.put("MET", "CET");
                map.put("ECT", "CET");
                map.put("EET", "EET");
                map.put("MIT", "Pacific/Apia");
                map.put("HST", "Pacific/Honolulu");
                map.put("AST", "America/Anchorage");
                map.put("PST", "America/Los_Angeles");
                map.put("MST", "America/Denver");
                map.put("PNT", "America/Phoenix");
                map.put("CST", "America/Chicago");
                map.put("EST", "America/New_York");
                map.put("IET", "America/Indiana/Indianapolis");
                map.put("PRT", "America/Puerto_Rico");
                map.put("CNT", "America/St_Johns");
                map.put("AGT", "America/Argentina/Buenos_Aires");
                map.put("BET", "America/Sao_Paulo");
                map.put("ART", "Africa/Cairo");
                map.put("CAT", "Africa/Harare");
                map.put("EAT", "Africa/Addis_Ababa");
                map.put("NET", "Asia/Yerevan");
                map.put("PLT", "Asia/Karachi");
                map.put("IST", "Asia/Kolkata");
                map.put("BST", "Asia/Dhaka");
                map.put("VST", "Asia/Ho_Chi_Minh");
                map.put("CTT", "Asia/Shanghai");
                map.put("JST", "Asia/Tokyo");
                map.put("ACT", "Australia/Darwin");
                map.put("AET", "Australia/Sydney");
                map.put("SST", "Pacific/Guadalcanal");
                map.put("NST", "Pacific/Auckland");
                i = map;
            }
            str2 = (String) map.get(str);
        }
        return str2;
    }

    private static synchronized firk p(String str, int i2) {
        firk firkVar;
        synchronized (firk.class) {
            if (i2 == 0) {
                return a;
            }
            if (h == null) {
                h = new HashMap();
            }
            Reference reference = (Reference) h.get(str);
            if (reference != null && (firkVar = (firk) reference.get()) != null) {
                return firkVar;
            }
            fiuz fiuzVar = new fiuz(str, null, i2, i2);
            h.put(str, new SoftReference(fiuzVar));
            return fiuzVar;
        }
    }

    private static synchronized fits q() {
        fits fitsVar;
        synchronized (firk.class) {
            if (g == null) {
                fiuh fiuhVar = new fiuh();
                fiuhVar.u(null, true, 4);
                g = fiuhVar.a();
            }
            fitsVar = g;
        }
        return fitsVar;
    }

    public abstract int a(long j);

    public int b(long j) {
        int a2 = a(j);
        long j2 = j - a2;
        int a3 = a(j2);
        if (a2 != a3) {
            if (a2 - a3 < 0 && e(j2) != e(j - a3)) {
                return a2;
            }
        } else if (a2 >= 0) {
            long f2 = f(j2);
            if (f2 < j2) {
                int a4 = a(f2);
                if (j2 - f2 <= a4 - a2) {
                    return a4;
                }
            }
        }
        return a3;
    }

    public abstract int c(long j);

    public final long d(long j) {
        long a2 = a(j);
        long j2 = j + a2;
        if ((j ^ j2) >= 0 || (j ^ a2) < 0) {
            return j2;
        }
        throw new ArithmeticException("Adding time zone offset caused overflow");
    }

    public abstract long e(long j);

    public abstract boolean equals(Object obj);

    public abstract long f(long j);

    public abstract String g(long j);

    public int hashCode() {
        return this.c.hashCode() + 57;
    }

    public abstract boolean k();

    public final boolean l(long j) {
        return a(j) == c(j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
    
        if (r2 != (r6 != r0 ? r6 : Long.MAX_VALUE)) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long m(long r9, long r11) {
        /*
            r8 = this;
            int r11 = r8.a(r11)
            long r0 = (long) r11
            long r0 = r9 - r0
            int r12 = r8.a(r0)
            if (r12 == r11) goto L56
            int r11 = r8.a(r9)
            long r0 = (long) r11
            long r0 = r9 - r0
            int r12 = r8.a(r0)
            if (r11 == r12) goto L3c
            if (r11 >= 0) goto L3c
            long r2 = r8.e(r0)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r0 != 0) goto L2a
            r2 = r4
        L2a:
            long r0 = (long) r12
            long r0 = r9 - r0
            long r6 = r8.e(r0)
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 != 0) goto L36
            goto L37
        L36:
            r4 = r6
        L37:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L3c
            goto L3d
        L3c:
            r11 = r12
        L3d:
            long r11 = (long) r11
            long r0 = r9 - r11
            long r2 = r9 ^ r0
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 >= 0) goto L56
            long r9 = r9 ^ r11
            int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r9 < 0) goto L4e
            goto L56
        L4e:
            java.lang.ArithmeticException r9 = new java.lang.ArithmeticException
            java.lang.String r10 = "Subtracting time zone offset caused overflow"
            r9.<init>(r10)
            throw r9
        L56:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.firk.m(long, long):long");
    }

    public final String toString() {
        return this.c;
    }

    protected Object writeReplace() {
        return new firj(this.c);
    }
}
