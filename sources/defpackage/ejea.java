package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejea extends eyfy implements eyht {
    public static final ejea a;
    private static volatile eyhz c;
    public eyhm b = eyhm.a;

    static {
        ejea ejeaVar = new ejea();
        a = ejeaVar;
        eyfy.registerDefaultInstance(ejea.class, ejeaVar);
    }

    private ejea() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", ejdz.a});
        }
        if (ordinal == 3) {
            return new ejea();
        }
        if (ordinal == 4) {
            return new ejdy();
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
        synchronized (ejea.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
