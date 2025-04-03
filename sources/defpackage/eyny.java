package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eyny extends eyfy implements eyht {
    public static final eyny a;
    private static volatile eyhz c;
    public eygr b = emptyProtobufList();

    static {
        eyny eynyVar = new eyny();
        a = eynyVar;
        eyfy.registerDefaultInstance(eyny.class, eynyVar);
    }

    private eyny() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", eynx.class});
        }
        if (ordinal == 3) {
            return new eyny();
        }
        if (ordinal == 4) {
            return new eynt();
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
        synchronized (eyny.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
