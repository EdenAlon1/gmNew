package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eybb extends eyfy implements eyht {
    public static final eybb a;
    private static volatile eyhz i;
    public int b;
    public Object d;
    public boolean e;
    public int f;
    public boolean g;
    public int c = 0;
    public eygi h = emptyIntList();

    static {
        eybb eybbVar = new eybb();
        a = eybbVar;
        eyfy.registerDefaultInstance(eybb.class, eybbVar);
    }

    private eybb() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\n\u0001\u0001\u0001\r\n\u0000\u0001\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0007ဇ\u0000\b᠌\u0001\tဇ\u0002\u000b\u0016\r<\u0000", new Object[]{"d", "c", "b", eyaj.class, eyaw.class, eybm.class, eybi.class, eybd.class, "e", "f", eyaz.a, "g", "h", eyal.class});
        }
        if (ordinal == 3) {
            return new eybb();
        }
        if (ordinal == 4) {
            return new eyax();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = i;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (eybb.class) {
            eyhzVar = i;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                i = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
