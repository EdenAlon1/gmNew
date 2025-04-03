package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlro extends eyfy implements eyht {
    public static final dlro a;
    private static volatile eyhz g;
    public int b;
    public ewgy c;
    public ewgw d;
    public eyja e;
    public eyja f;

    static {
        dlro dlroVar = new dlro();
        a = dlroVar;
        eyfy.registerDefaultInstance(dlro.class, dlroVar);
    }

    private dlro() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (ordinal == 3) {
            return new dlro();
        }
        if (ordinal == 4) {
            return new dlrn();
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
        synchronized (dlro.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
