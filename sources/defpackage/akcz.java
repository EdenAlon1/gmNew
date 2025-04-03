package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class akcz extends eyfy implements eyht {
    public static final akcz a;
    private static volatile eyhz c;
    public eyhm b = eyhm.a;

    static {
        akcz akczVar = new akcz();
        a = akczVar;
        eyfy.registerDefaultInstance(akcz.class, akczVar);
    }

    private akcz() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", akcy.a});
        }
        if (ordinal == 3) {
            return new akcz();
        }
        if (ordinal == 4) {
            return new akcx();
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
        synchronized (akcz.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
