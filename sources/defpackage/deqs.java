package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class deqs extends eyfy implements eyht {
    public static final deqs a;
    private static volatile eyhz f;
    public eyee b = eyee.b;
    public String c = "";
    public derl d;
    public eyja e;
    private int g;

    static {
        deqs deqsVar = new deqs();
        a = deqsVar;
        eyfy.registerDefaultInstance(deqs.class, deqsVar);
    }

    private deqs() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0000\u0000\u0002ည\u0001\u0003ለ\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"g", "b", "c", "d", "e"});
        }
        if (ordinal == 3) {
            return new deqs();
        }
        if (ordinal == 4) {
            return new deqr();
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
        synchronized (deqs.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
