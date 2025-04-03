package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aajc extends eyfy implements eyht {
    public static final aajc a;
    private static volatile eyhz e;
    public int b;
    public int c;
    public boolean d;

    static {
        aajc aajcVar = new aajc();
        a = aajcVar;
        eyfy.registerDefaultInstance(aajc.class, aajcVar);
    }

    private aajc() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002င\u0001\u0003ဇ\u0002", new Object[]{"b", "c", "d"});
        }
        if (ordinal == 3) {
            return new aajc();
        }
        if (ordinal == 4) {
            return new aajb();
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
        synchronized (aajc.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
