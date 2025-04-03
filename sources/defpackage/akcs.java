package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class akcs extends eyfy implements eyht {
    public static final akcs a;
    private static volatile eyhz b;

    static {
        akcs akcsVar = new akcs();
        a = akcsVar;
        eyfy.registerDefaultInstance(akcs.class, akcsVar);
    }

    private akcs() {
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
            return new akcs();
        }
        if (ordinal == 4) {
            return new akcr();
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
        synchronized (akcs.class) {
            eyhzVar = b;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                b = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
