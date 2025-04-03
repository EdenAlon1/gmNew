package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgqo extends eyfy implements eyht {
    public static final fgqo a;
    private static volatile eyhz d;
    public eygi b = emptyIntList();
    public eygi c = emptyIntList();

    static {
        fgqo fgqoVar = new fgqo();
        a = fgqoVar;
        eyfy.registerDefaultInstance(fgqo.class, fgqoVar);
    }

    private fgqo() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001'\u0002'", new Object[]{"b", "c"});
        }
        if (ordinal == 3) {
            return new fgqo();
        }
        if (ordinal == 4) {
            return new fgqn();
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
        synchronized (fgqo.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
