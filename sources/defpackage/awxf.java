package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awxf extends eyfy implements eyht {
    public static final awxf a;
    private static volatile eyhz e;
    public int b;
    public awui c;
    public eyja d;

    static {
        awxf awxfVar = new awxf();
        a = awxfVar;
        eyfy.registerDefaultInstance(awxf.class, awxfVar);
    }

    private awxf() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"b", "c", "d"});
        }
        if (ordinal == 3) {
            return new awxf();
        }
        if (ordinal == 4) {
            return new awxe();
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
        synchronized (awxf.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
