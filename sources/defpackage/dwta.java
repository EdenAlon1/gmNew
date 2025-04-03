package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwta extends eyfy implements eyht {
    public static final dwta a;
    private static volatile eyhz g;
    public int b;
    public int c;
    public int d;
    public long e;
    public int f;

    static {
        dwta dwtaVar = new dwta();
        a = dwtaVar;
        eyfy.registerDefaultInstance(dwta.class, dwtaVar);
    }

    private dwta() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0003\u0004ဂ\u0002", new Object[]{"b", "c", dwsy.a, "d", dwsw.a, "f", dwst.a, "e"});
        }
        if (ordinal == 3) {
            return new dwta();
        }
        if (ordinal == 4) {
            return new dwsv();
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
        synchronized (dwta.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
