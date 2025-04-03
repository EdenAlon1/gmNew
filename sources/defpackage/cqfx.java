package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqfx extends eyfy implements eyht {
    public static final cqfx a;
    private static volatile eyhz c;
    public boolean b;

    static {
        cqfx cqfxVar = new cqfx();
        a = cqfxVar;
        eyfy.registerDefaultInstance(cqfx.class, cqfxVar);
    }

    private cqfx() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"b"});
        }
        if (ordinal == 3) {
            return new cqfx();
        }
        if (ordinal == 4) {
            return new cqfw();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = c;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (cqfx.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
