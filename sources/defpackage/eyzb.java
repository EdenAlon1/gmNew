package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eyzb extends eyfy implements eyht {
    public static final eyzb a;
    private static volatile eyhz c;
    public eygr b = eyfy.emptyProtobufList();

    static {
        eyzb eyzbVar = new eyzb();
        a = eyzbVar;
        eyfy.registerDefaultInstance(eyzb.class, eyzbVar);
    }

    private eyzb() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"b"});
        }
        if (ordinal == 3) {
            return new eyzb();
        }
        if (ordinal == 4) {
            return new eyza();
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
        synchronized (eyzb.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
