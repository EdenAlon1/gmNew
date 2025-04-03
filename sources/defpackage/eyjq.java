package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eyjq extends eyfy implements eyht {
    public static final eyjq a;
    private static volatile eyhz d;
    public int b = 0;
    public Object c;

    static {
        eyjq eyjqVar = new eyjq();
        a = eyjqVar;
        eyfy.registerDefaultInstance(eyjq.class, eyjqVar);
    }

    private eyjq() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001?\u0000\u00023\u0000\u0003Ȼ\u0000\u0004:\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"c", "b", eyiw.class, eyhf.class});
        }
        if (ordinal == 3) {
            return new eyjq();
        }
        if (ordinal == 4) {
            return new eyjp();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = d;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (eyjq.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
