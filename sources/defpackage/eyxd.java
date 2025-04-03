package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eyxd extends eyfy implements eyht {
    public static final eyxd a;
    private static volatile eyhz j;
    public int b;
    public int c;
    public boolean d;
    public int e;
    public int f;
    public int g;
    public int h;
    public String i = "";

    static {
        eyxd eyxdVar = new eyxd();
        a = eyxdVar;
        eyfy.registerDefaultInstance(eyxd.class, eyxdVar);
    }

    private eyxd() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005င\u0004\u0006᠌\u0005\u0007ဈ\u0006", new Object[]{"b", "c", eyxb.a, "d", "e", eywx.a, "f", eyuk.a, "g", "h", eywz.a, "i"});
        }
        if (ordinal == 3) {
            return new eyxd();
        }
        if (ordinal == 4) {
            return new eyww();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = j;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (eyxd.class) {
            eyhzVar = j;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                j = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
