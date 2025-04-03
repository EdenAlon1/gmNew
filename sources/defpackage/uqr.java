package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uqr extends eyfy<uqr, uqq> implements eyht {
    public static final uqr a;
    private static volatile eyhz o;
    public int b;
    public int c;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public int n;
    public String d = "";
    public String e = "";
    public String i = "";

    static {
        uqr uqrVar = new uqr();
        a = uqrVar;
        eyfy.registerDefaultInstance(uqr.class, uqrVar);
    }

    private uqr() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001င\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ለ\u0006\bဇ\u0007\tဇ\b\nဇ\t\u000bဇ\n\fင\u000b", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n"});
        }
        if (ordinal == 3) {
            return new uqr();
        }
        if (ordinal == 4) {
            return new uqq();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = o;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (uqr.class) {
            eyhzVar = o;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                o = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
