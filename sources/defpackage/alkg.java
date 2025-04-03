package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alkg extends eyfy implements eyht {
    public static final alkg a;
    private static volatile eyhz p;
    public int b;
    public int c;
    public eoqb d;
    public int e;
    public int h;
    public int j;
    public int k;
    public alkj l;
    public int m;
    public long n;
    public int f = -1;
    public int g = -2;
    public int i = -1;
    public int o = -1;

    static {
        alkg alkgVar = new alkg();
        a = alkgVar;
        eyfy.registerDefaultInstance(alkg.class, alkgVar);
    }

    private alkg() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဋ\u0002\u0004ဏ\u0003\u0005ဏ\u0004\u0006᠌\u0005\u0007ဏ\u0006\bဋ\u0007\tဋ\b\nဉ\t\u000b᠌\n\fတ\u000b\rဏ\f", new Object[]{"b", "c", eool.a, "d", "e", "f", "g", "h", eyqu.a, "i", "j", "k", "l", "m", eopo.a, "n", "o"});
        }
        if (ordinal == 3) {
            return new alkg();
        }
        if (ordinal == 4) {
            return new alkf();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = p;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (alkg.class) {
            eyhzVar = p;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                p = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
