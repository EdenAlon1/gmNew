package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class escp extends eyfy implements eyht {
    public static final escp a;
    private static volatile eyhz d;
    public int b;
    public ewnm c;

    static {
        escp escpVar = new escp();
        a = escpVar;
        eyfy.registerDefaultInstance(escp.class, escpVar);
    }

    private escp() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0000", new Object[]{"b", "c"});
        }
        if (ordinal == 3) {
            return new escp();
        }
        if (ordinal == 4) {
            return new esco();
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
        synchronized (escp.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
