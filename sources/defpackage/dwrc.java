package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwrc extends eyfy implements eyht {
    public static final dwrc a;
    private static volatile eyhz c;
    public eygr b = emptyProtobufList();

    static {
        dwrc dwrcVar = new dwrc();
        a = dwrcVar;
        eyfy.registerDefaultInstance(dwrc.class, dwrcVar);
    }

    private dwrc() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"b", dwra.class});
        }
        if (ordinal == 3) {
            return new dwrc();
        }
        if (ordinal == 4) {
            return new dwrb();
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
        synchronized (dwrc.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
