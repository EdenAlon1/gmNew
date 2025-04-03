package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cltb extends eyfy implements eyht {
    public static final cltb a;
    private static volatile eyhz f;
    public int b;
    public eydq c;
    public clns d;
    public String e = "";

    static {
        cltb cltbVar = new cltb();
        a = cltbVar;
        eyfy.registerDefaultInstance(cltb.class, cltbVar);
    }

    private cltb() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဉ\u0002\u0004ဈ\u0003", new Object[]{"b", "c", "d", "e"});
        }
        if (ordinal == 3) {
            return new cltb();
        }
        if (ordinal == 4) {
            return new clta();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = f;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (cltb.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
