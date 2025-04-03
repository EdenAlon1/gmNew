package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erzp extends eyfy implements eyht {
    public static final erzp a;
    private static volatile eyhz d;
    public int b = 0;
    public Object c;

    static {
        erzp erzpVar = new erzp();
        a = erzpVar;
        eyfy.registerDefaultInstance(erzp.class, erzpVar);
    }

    private erzp() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001<\u0000", new Object[]{"c", "b", esas.class});
        }
        if (ordinal == 3) {
            return new erzp();
        }
        if (ordinal == 4) {
            return new erzo();
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
        synchronized (erzp.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
