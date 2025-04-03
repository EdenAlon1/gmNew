package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class firf implements Serializable {
    public static final firf b = new fire("era", (byte) 1, firn.a);
    public static final firf c;
    public static final firf d;
    public static final firf e;
    public static final firf f;
    public static final firf g;
    public static final firf h;
    public static final firf i;
    public static final firf j;
    public static final firf k;
    public static final firf l;
    public static final firf m;
    public static final firf n;
    public static final firf o;
    public static final firf p;
    public static final firf q;
    public static final firf r;
    public static final firf s;
    private static final long serialVersionUID = -42615285973990L;
    public static final firf t;
    public static final firf u;
    public static final firf v;
    public static final firf w;
    public static final firf x;
    public final String y;

    static {
        firn firnVar = firn.d;
        c = new fire("yearOfEra", (byte) 2, firnVar);
        d = new fire("centuryOfEra", (byte) 3, firn.b);
        e = new fire("yearOfCentury", (byte) 4, firnVar);
        f = new fire("year", (byte) 5, firnVar);
        firn firnVar2 = firn.g;
        g = new fire("dayOfYear", (byte) 6, firnVar2);
        h = new fire("monthOfYear", (byte) 7, firn.e);
        i = new fire("dayOfMonth", (byte) 8, firnVar2);
        firn firnVar3 = firn.c;
        j = new fire("weekyearOfCentury", (byte) 9, firnVar3);
        k = new fire("weekyear", (byte) 10, firnVar3);
        l = new fire("weekOfWeekyear", (byte) 11, firn.f);
        m = new fire("dayOfWeek", (byte) 12, firnVar2);
        n = new fire("halfdayOfDay", (byte) 13, firn.h);
        firn firnVar4 = firn.i;
        o = new fire("hourOfHalfday", (byte) 14, firnVar4);
        p = new fire("clockhourOfHalfday", (byte) 15, firnVar4);
        q = new fire("clockhourOfDay", (byte) 16, firnVar4);
        r = new fire("hourOfDay", (byte) 17, firnVar4);
        firn firnVar5 = firn.j;
        s = new fire("minuteOfDay", (byte) 18, firnVar5);
        t = new fire("minuteOfHour", (byte) 19, firnVar5);
        firn firnVar6 = firn.k;
        u = new fire("secondOfDay", (byte) 20, firnVar6);
        v = new fire("secondOfMinute", (byte) 21, firnVar6);
        firn firnVar7 = firn.l;
        w = new fire("millisOfDay", (byte) 22, firnVar7);
        x = new fire("millisOfSecond", (byte) 23, firnVar7);
    }

    protected firf(String str) {
        this.y = str;
    }

    public abstract fird a(firb firbVar);

    public final String toString() {
        return this.y;
    }
}
