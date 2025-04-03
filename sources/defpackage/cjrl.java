package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjrl extends eyfy implements eyht {
    public static final cjrl a;
    private static volatile eyhz e;
    public int b;
    public long c;
    public long d;

    static {
        cjrl cjrlVar = new cjrl();
        a = cjrlVar;
        eyfy.registerDefaultInstance(cjrl.class, cjrlVar);
    }

    private cjrl() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001", new Object[]{"b", "c", "d"});
        }
        if (ordinal == 3) {
            return new cjrl();
        }
        if (ordinal == 4) {
            return new cjrk();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = e;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (cjrl.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
