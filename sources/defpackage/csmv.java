package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csmv extends eyfy implements eyht {
    public static final csmv a;
    private static volatile eyhz e;
    public int b;
    public int c;
    public int d;

    static {
        csmv csmvVar = new csmv();
        a = csmvVar;
        eyfy.registerDefaultInstance(csmv.class, csmvVar);
    }

    private csmv() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001", new Object[]{"b", "c", csmt.a, "d"});
        }
        if (ordinal == 3) {
            return new csmv();
        }
        if (ordinal == 4) {
            return new csms();
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
        synchronized (csmv.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
