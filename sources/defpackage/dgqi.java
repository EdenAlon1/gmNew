package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgqi extends eyfy implements eyht {
    public static final dgqi a;
    private static volatile eyhz c;
    public ewox b;
    private int d;

    static {
        dgqi dgqiVar = new dgqi();
        a = dgqiVar;
        eyfy.registerDefaultInstance(dgqi.class, dgqiVar);
    }

    private dgqi() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0000", new Object[]{"d", "b"});
        }
        if (ordinal == 3) {
            return new dgqi();
        }
        if (ordinal == 4) {
            return new dgqh();
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
        synchronized (dgqi.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
