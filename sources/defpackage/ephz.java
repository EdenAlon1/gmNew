package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ephz extends eyfy implements eyht {
    public static final ephz a;
    private static volatile eyhz m;
    public int b;
    public eyev c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public eyee l = eyee.b;

    static {
        ephz ephzVar = new ephz();
        a = ephzVar;
        eyfy.registerDefaultInstance(ephz.class, ephzVar);
    }

    private ephz() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            eygg eyggVar = eppm.a;
            return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006᠌\u0005\u0007င\u0006\bင\u0007\t᠌\b\nည\t", new Object[]{"b", "c", "d", eyggVar, "e", eyggVar, "f", eyggVar, "g", eyggVar, "h", eyggVar, "i", "j", "k", epid.a, "l"});
        }
        if (ordinal == 3) {
            return new ephz();
        }
        if (ordinal == 4) {
            return new ephy();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = m;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (ephz.class) {
            eyhzVar = m;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                m = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
