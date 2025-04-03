package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewdi extends eyfy implements eyht {
    public static final ewdi a;
    private static volatile eyhz c;
    public eyhm b = eyhm.a;

    static {
        ewdi ewdiVar = new ewdi();
        a = ewdiVar;
        eyfy.registerDefaultInstance(ewdi.class, ewdiVar);
    }

    private ewdi() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0001\u0000\u0000\u00022", new Object[]{"b", ewdh.a});
        }
        if (ordinal == 3) {
            return new ewdi();
        }
        if (ordinal == 4) {
            return new ewdg();
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
        synchronized (ewdi.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
