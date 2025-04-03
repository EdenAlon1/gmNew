package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emsh extends eyfy implements eyht {
    public static final emsh a;
    private static volatile eyhz d;
    public int c;
    public eyhm b = eyhm.a;
    private eyhm e = eyhm.a;

    static {
        emsh emshVar = new emsh();
        a = emshVar;
        eyfy.registerDefaultInstance(emsh.class, emshVar);
    }

    private emsh() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0002\u0005\u0003\u0002\u0000\u0000\u00022\u0003\u000b\u00052", new Object[]{"b", emsg.a, "c", "e", emsf.a});
        }
        if (ordinal == 3) {
            return new emsh();
        }
        if (ordinal == 4) {
            return new emse();
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
        synchronized (emsh.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
