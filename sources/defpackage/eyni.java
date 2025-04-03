package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eyni extends eyfy implements eyht {
    public static final eyni a;
    private static volatile eyhz g;
    public int b;
    public String c = "";
    public long d;
    public int e;
    public int f;

    static {
        eyni eyniVar = new eyni();
        a = eyniVar;
        eyfy.registerDefaultInstance(eyni.class, eyniVar);
    }

    private eyni() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (ordinal == 3) {
            return new eyni();
        }
        if (ordinal == 4) {
            return new eynh();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = g;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (eyni.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
