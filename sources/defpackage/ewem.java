package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewem extends eyfy implements eyht {
    public static final ewem a;
    private static volatile eyhz f;
    public int b;
    public long c;
    public long d;
    public eyja e;

    static {
        ewem ewemVar = new ewem();
        a = ewemVar;
        eyfy.registerDefaultInstance(ewem.class, ewemVar);
    }

    private ewem() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0002\u0002\u0002\u0003ဉ\u0000", new Object[]{"b", "c", "d", "e"});
        }
        if (ordinal == 3) {
            return new ewem();
        }
        if (ordinal == 4) {
            return new ewel();
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
        synchronized (ewem.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
