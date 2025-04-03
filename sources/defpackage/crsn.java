package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crsn extends eyfy<crsn, crsm> implements eyht {
    public static final crsn a;
    private static volatile eyhz h;
    public int b;
    public crro c;
    public cudm d;
    public String e = "";
    public long f;
    public int g;

    static {
        crsn crsnVar = new crsn();
        a = crsnVar;
        eyfy.registerDefaultInstance(crsn.class, crsnVar);
    }

    private crsn() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ለ\u0002\u0004ဂ\u0003\u0005င\u0004", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (ordinal == 3) {
            return new crsn();
        }
        if (ordinal == 4) {
            return new crsm();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = h;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (crsn.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
