package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clwz extends eyfy implements eyht {
    public static final clwz a;
    private static volatile eyhz c;
    public eygr b = eyfy.emptyProtobufList();

    static {
        clwz clwzVar = new clwz();
        a = clwzVar;
        eyfy.registerDefaultInstance(clwz.class, clwzVar);
    }

    private clwz() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"b"});
        }
        if (ordinal == 3) {
            return new clwz();
        }
        if (ordinal == 4) {
            return new clwy();
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
        synchronized (clwz.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
