package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azvx extends eyfy implements eyht {
    public static final azvx a;
    private static volatile eyhz c;
    public String b = "";

    static {
        azvx azvxVar = new azvx();
        a = azvxVar;
        eyfy.registerDefaultInstance(azvx.class, azvxVar);
    }

    private azvx() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"b"});
        }
        if (ordinal == 3) {
            return new azvx();
        }
        if (ordinal == 4) {
            return new azvw();
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
        synchronized (azvx.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
