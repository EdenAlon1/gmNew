package defpackage;

import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgyx implements Serializable {
    public static final int a;
    private static final long serialVersionUID = -7333226591784095142L;
    public transient Log b;
    public String c;
    public fgux d;
    public int e;
    private int f;
    private fgvh g;
    private fgvh h;
    private fgvh i;
    private fgzg j;
    private fgvh k;
    private fgvh l;
    private fgvh m;
    private fgvh n;
    private fgvh o;
    private String p;
    private int q;
    private Map r;
    private int s;

    static {
        String a2 = fhem.a("net.fortuna.ical4j.recur.maxincrementcount");
        a = (a2 == null || a2.length() <= 0) ? 1000 : Integer.parseInt(a2);
    }

    public fgyx() {
        this.b = LogFactory.getLog(fgyx.class);
        this.e = -1;
        this.f = -1;
        this.r = new HashMap();
        this.q = 2;
    }

    public static fguy b(fguy fguyVar) {
        fguy fguyVar2 = new fguy(fguyVar.a);
        if (fguyVar.c) {
            fguyVar2.c();
            return fguyVar2;
        }
        fguyVar2.a(fguyVar.b);
        return fguyVar2;
    }

    private final void m() {
        int i;
        String str = this.c;
        if (str == null) {
            throw new IllegalArgumentException("A recurrence rule MUST contain a FREQ rule part.");
        }
        if ("SECONDLY".equals(str)) {
            i = 13;
        } else if ("MINUTELY".equals(this.c)) {
            i = 12;
        } else if ("HOURLY".equals(this.c)) {
            i = 11;
        } else if ("DAILY".equals(this.c)) {
            i = 6;
        } else if ("WEEKLY".equals(this.c)) {
            i = 3;
        } else if ("MONTHLY".equals(this.c)) {
            i = 2;
        } else {
            if (!"YEARLY".equals(this.c)) {
                throw new IllegalArgumentException("Invalid FREQ rule part '" + this.c + "' in recurrence rule");
            }
            i = 1;
        }
        this.s = i;
    }

    private static final String n(StringTokenizer stringTokenizer, String str) {
        try {
            return stringTokenizer.nextToken();
        } catch (NoSuchElementException unused) {
            throw new IllegalArgumentException("Missing expected token, last token: ".concat(String.valueOf(str)));
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.b = LogFactory.getLog(fgyx.class);
    }

    public final Calendar a(fgux fguxVar, boolean z) {
        Calendar c = fheo.c(fguxVar);
        c.setMinimalDaysInFirstWeek(4);
        c.setFirstDayOfWeek(this.q);
        c.setLenient(z);
        c.setTime(fguxVar);
        return c;
    }

    public final fgvh c() {
        if (this.i == null) {
            this.i = new fgvh(0, 23, false);
        }
        return this.i;
    }

    public final fgvh d() {
        if (this.h == null) {
            this.h = new fgvh(0, 59, false);
        }
        return this.h;
    }

    public final fgvh e() {
        if (this.k == null) {
            this.k = new fgvh(1, 31, true);
        }
        return this.k;
    }

    public final fgvh f() {
        if (this.n == null) {
            this.n = new fgvh(1, 12, false);
        }
        return this.n;
    }

    public final fgvh g() {
        if (this.g == null) {
            this.g = new fgvh(0, 59, false);
        }
        return this.g;
    }

    public final fgvh h() {
        if (this.o == null) {
            this.o = new fgvh(1, 366, true);
        }
        return this.o;
    }

    public final fgvh i() {
        if (this.m == null) {
            this.m = new fgvh(1, 53, true);
        }
        return this.m;
    }

    public final fgvh j() {
        if (this.l == null) {
            this.l = new fgvh(1, 366, true);
        }
        return this.l;
    }

    public final fgzg k() {
        if (this.j == null) {
            this.j = new fgzg();
        }
        return this.j;
    }

    public final void l(Calendar calendar) {
        int i = this.f;
        if (i <= 0) {
            i = 1;
        }
        calendar.add(this.s, i);
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer("FREQ=");
        stringBuffer.append(this.c);
        if (this.p != null) {
            stringBuffer.append(";WKST=");
            stringBuffer.append(this.p);
        }
        if (this.f > 0) {
            stringBuffer.append(";INTERVAL=");
            stringBuffer.append(this.f);
        }
        if (this.d != null) {
            stringBuffer.append(";UNTIL=");
            stringBuffer.append(this.d);
        }
        if (this.e > 0) {
            stringBuffer.append(";COUNT=");
            stringBuffer.append(this.e);
        }
        if (!f().isEmpty()) {
            stringBuffer.append(";BYMONTH=");
            stringBuffer.append(this.n);
        }
        if (!i().isEmpty()) {
            stringBuffer.append(";BYWEEKNO=");
            stringBuffer.append(this.m);
        }
        if (!j().isEmpty()) {
            stringBuffer.append(";BYYEARDAY=");
            stringBuffer.append(this.l);
        }
        if (!e().isEmpty()) {
            stringBuffer.append(";BYMONTHDAY=");
            stringBuffer.append(this.k);
        }
        if (!k().isEmpty()) {
            stringBuffer.append(";BYDAY=");
            stringBuffer.append(this.j);
        }
        if (!c().isEmpty()) {
            stringBuffer.append(";BYHOUR=");
            stringBuffer.append(this.i);
        }
        if (!d().isEmpty()) {
            stringBuffer.append(";BYMINUTE=");
            stringBuffer.append(this.h);
        }
        if (!g().isEmpty()) {
            stringBuffer.append(";BYSECOND=");
            stringBuffer.append(this.g);
        }
        if (!h().isEmpty()) {
            stringBuffer.append(";BYSETPOS=");
            stringBuffer.append(this.o);
        }
        return stringBuffer.toString();
    }

    public fgyx(String str) {
        this.b = LogFactory.getLog(fgyx.class);
        this.e = -1;
        this.f = -1;
        this.r = new HashMap();
        this.q = 2;
        StringTokenizer stringTokenizer = new StringTokenizer(str, ";=");
        while (stringTokenizer.hasMoreTokens()) {
            String nextToken = stringTokenizer.nextToken();
            if ("FREQ".equals(nextToken)) {
                this.c = n(stringTokenizer, nextToken);
            } else if ("UNTIL".equals(nextToken)) {
                String n = n(stringTokenizer, nextToken);
                if (n != null && n.indexOf("T") >= 0) {
                    fgvb fgvbVar = new fgvb(n);
                    this.d = fgvbVar;
                    fgvbVar.b(true);
                } else {
                    this.d = new fgux(n);
                }
            } else if ("COUNT".equals(nextToken)) {
                this.e = Integer.parseInt(n(stringTokenizer, nextToken));
            } else if ("INTERVAL".equals(nextToken)) {
                this.f = Integer.parseInt(n(stringTokenizer, nextToken));
            } else if ("BYSECOND".equals(nextToken)) {
                this.g = new fgvh(n(stringTokenizer, nextToken), 0, 59, false);
            } else if ("BYMINUTE".equals(nextToken)) {
                this.h = new fgvh(n(stringTokenizer, nextToken), 0, 59, false);
            } else if ("BYHOUR".equals(nextToken)) {
                this.i = new fgvh(n(stringTokenizer, nextToken), 0, 23, false);
            } else if ("BYDAY".equals(nextToken)) {
                this.j = new fgzg(n(stringTokenizer, nextToken));
            } else if ("BYMONTHDAY".equals(nextToken)) {
                this.k = new fgvh(n(stringTokenizer, nextToken), 1, 31, true);
            } else if ("BYYEARDAY".equals(nextToken)) {
                this.l = new fgvh(n(stringTokenizer, nextToken), 1, 366, true);
            } else if ("BYWEEKNO".equals(nextToken)) {
                this.m = new fgvh(n(stringTokenizer, nextToken), 1, 53, true);
            } else if ("BYMONTH".equals(nextToken)) {
                this.n = new fgvh(n(stringTokenizer, nextToken), 1, 12, false);
            } else if ("BYSETPOS".equals(nextToken)) {
                this.o = new fgvh(n(stringTokenizer, nextToken), 1, 366, true);
            } else if ("WKST".equals(nextToken)) {
                this.p = n(stringTokenizer, nextToken);
                this.q = fgzf.a(new fgzf(this.p));
            } else if (fhel.b("ical4j.parsing.relaxed")) {
                this.r.put(nextToken, n(stringTokenizer, nextToken));
            } else {
                throw new IllegalArgumentException("Invalid recurrence rule part: " + nextToken + "=" + n(stringTokenizer, nextToken));
            }
        }
        m();
    }

    public fgyx(byte[] bArr) {
        this.b = LogFactory.getLog(fgyx.class);
        this.e = -1;
        this.f = -1;
        this.r = new HashMap();
        this.q = 2;
        this.c = "DAILY";
        this.e = 1;
        m();
    }
}
