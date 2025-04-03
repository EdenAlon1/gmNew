package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erts extends eyfy implements eyht {
    public static final erts a;
    private static volatile eyhz c;
    public int b;

    static {
        erts ertsVar = new erts();
        a = ertsVar;
        eyfy.registerDefaultInstance(erts.class, ertsVar);
    }

    private erts() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\f", new Object[]{"b"});
        }
        if (ordinal == 3) {
            return new erts();
        }
        if (ordinal == 4) {
            return new ertr();
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
        synchronized (erts.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
