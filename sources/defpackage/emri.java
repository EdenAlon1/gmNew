package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emri extends eyfy implements eyht {
    public static final emri a;
    private static volatile eyhz d;
    public String b = "";
    public float c;

    static {
        emri emriVar = new emri();
        a = emriVar;
        eyfy.registerDefaultInstance(emri.class, emriVar);
    }

    private emri() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0001", new Object[]{"b", "c"});
        }
        if (ordinal == 3) {
            return new emri();
        }
        if (ordinal == 4) {
            return new emrh();
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
        synchronized (emri.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
