package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awtr extends eyfy implements eyht {
    public static final awtr a;
    private static volatile eyhz f;
    public int b;
    public awui c;
    public awxf d;
    public int e;

    static {
        awtr awtrVar = new awtr();
        a = awtrVar;
        eyfy.registerDefaultInstance(awtr.class, awtrVar);
    }

    private awtr() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003᠌\u0002", new Object[]{"b", "c", "d", "e", awwo.a});
        }
        if (ordinal == 3) {
            return new awtr();
        }
        if (ordinal == 4) {
            return new awtq();
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
        synchronized (awtr.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
