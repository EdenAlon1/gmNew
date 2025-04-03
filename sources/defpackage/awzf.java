package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awzf extends eyfy implements eyht {
    public static final awzf a;
    private static volatile eyhz e;
    public int b;
    public eyja c;
    public boolean d;

    static {
        awzf awzfVar = new awzf();
        a = awzfVar;
        eyfy.registerDefaultInstance(awzf.class, awzfVar);
    }

    private awzf() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001", new Object[]{"b", "c", "d"});
        }
        if (ordinal == 3) {
            return new awzf();
        }
        if (ordinal == 4) {
            return new awze();
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
        synchronized (awzf.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
