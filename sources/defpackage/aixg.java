package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aixg extends eyfy implements eyht {
    public static final aixg a;
    private static volatile eyhz b;

    static {
        aixg aixgVar = new aixg();
        a = aixgVar;
        eyfy.registerDefaultInstance(aixg.class, aixgVar);
    }

    private aixg() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0000", null);
        }
        if (ordinal == 3) {
            return new aixg();
        }
        if (ordinal == 4) {
            return new aixf();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = b;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (aixg.class) {
            eyhzVar = b;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                b = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
