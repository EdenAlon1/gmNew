package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eyas extends eyfy implements eyht {
    public static final eyas a;
    private static volatile eyhz k;
    public int b;
    public int c = 0;
    public Object d;
    public fauw e;
    public fauw f;
    public exzp g;
    public exzp h;
    public eyan i;
    public int j;

    static {
        eyas eyasVar = new eyas();
        a = eyasVar;
        eyfy.registerDefaultInstance(eyas.class, eyasVar);
    }

    private eyas() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\t\u0001\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006;\u0000\u0007;\u0000\b7\u0000\t᠌\u0005", new Object[]{"d", "c", "b", "e", "f", "g", "h", "i", "j", eyaq.a});
        }
        if (ordinal == 3) {
            return new eyas();
        }
        if (ordinal == 4) {
            return new eyao();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = k;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (eyas.class) {
            eyhzVar = k;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                k = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
