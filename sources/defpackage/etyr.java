package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etyr extends eyfy implements eyht {
    public static final etyr a;
    private static volatile eyhz e;
    public int b;
    public eyee c = eyee.b;
    public etzx d;

    static {
        etyr etyrVar = new etyr();
        a = etyrVar;
        eyfy.registerDefaultInstance(etyr.class, etyrVar);
    }

    private etyr() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0003ဉ\u0000", new Object[]{"b", "c", "d"});
        }
        if (ordinal == 3) {
            return new etyr();
        }
        if (ordinal == 4) {
            return new etyq();
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
        synchronized (etyr.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
