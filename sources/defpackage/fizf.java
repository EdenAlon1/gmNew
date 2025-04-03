package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fizf {
    private static final fiyi a;
    private static final fiyi b;

    static {
        fiyi fiyiVar = new fiyi("DNS Rcode", 2);
        a = fiyiVar;
        fiyi fiyiVar2 = new fiyi("TSIG rcode", 2);
        b = fiyiVar2;
        fiyiVar.e = 4095;
        fiyiVar.f("RESERVED");
        fiyiVar.d(0, "NOERROR");
        fiyiVar.d(1, "FORMERR");
        fiyiVar.d(2, "SERVFAIL");
        fiyiVar.d(3, "NXDOMAIN");
        fiyiVar.d(4, "NOTIMP");
        fiyiVar.e(4, "NOTIMPL");
        fiyiVar.d(5, "REFUSED");
        fiyiVar.d(6, "YXDOMAIN");
        fiyiVar.d(7, "YXRRSET");
        fiyiVar.d(8, "NXRRSET");
        fiyiVar.d(9, "NOTAUTH");
        fiyiVar.d(10, "NOTZONE");
        fiyiVar.d(16, "BADVERS");
        fiyiVar2.e = 65535;
        fiyiVar2.f("RESERVED");
        if (fiyiVar2.d != fiyiVar.d) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(fiyiVar.c);
            stringBuffer.append(": wordcases do not match");
            throw new IllegalArgumentException(stringBuffer.toString());
        }
        fiyiVar2.a.putAll(fiyiVar.a);
        fiyiVar2.b.putAll(fiyiVar.b);
        fiyiVar2.d(16, "BADSIG");
        fiyiVar2.d(17, "BADKEY");
        fiyiVar2.d(18, "BADTIME");
        fiyiVar2.d(19, "BADMODE");
    }

    public static String a(int i) {
        return b.c(i);
    }

    public static String b(int i) {
        return a.c(i);
    }
}
