package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cokc extends eyfy implements eyht {
    public static final cokc a;
    private static volatile eyhz e;
    public int b;
    public long c;
    public eyja d;

    static {
        cokc cokcVar = new cokc();
        a = cokcVar;
        eyfy.registerDefaultInstance(cokc.class, cokcVar);
    }

    private cokc() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0006\u0007\u0002\u0000\u0000\u0000\u0006ဂ\u0004\u0007ဉ\u0005", new Object[]{"b", "c", "d"});
        }
        if (ordinal == 3) {
            return new cokc();
        }
        if (ordinal == 4) {
            return new cokb();
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
        synchronized (cokc.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
