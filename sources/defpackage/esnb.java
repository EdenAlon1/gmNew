package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esnb extends eyfy implements eyht {
    public static final esnb a;
    private static volatile eyhz b;

    static {
        esnb esnbVar = new esnb();
        a = esnbVar;
        eyfy.registerDefaultInstance(esnb.class, esnbVar);
    }

    private esnb() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0000", null);
        }
        if (ordinal == 3) {
            return new esnb();
        }
        if (ordinal == 4) {
            return new esna();
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
        synchronized (esnb.class) {
            eyhzVar = b;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                b = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
