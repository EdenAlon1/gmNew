package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewap extends eyfy implements eyht {
    public static final ewap a;
    private static volatile eyhz c;
    public boolean b;

    static {
        ewap ewapVar = new ewap();
        a = ewapVar;
        eyfy.registerDefaultInstance(ewap.class, ewapVar);
    }

    private ewap() {
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
            return new ewap();
        }
        if (ordinal == 4) {
            return new ewao();
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
        synchronized (ewap.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
