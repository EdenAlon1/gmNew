package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwpx extends eyfy implements eyht {
    public static final dwpx a;
    private static volatile eyhz c;
    public eygr b = eyfy.emptyProtobufList();

    static {
        dwpx dwpxVar = new dwpx();
        a = dwpxVar;
        eyfy.registerDefaultInstance(dwpx.class, dwpxVar);
    }

    private dwpx() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"b"});
        }
        if (ordinal == 3) {
            return new dwpx();
        }
        if (ordinal == 4) {
            return new dwpw();
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
        synchronized (dwpx.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
