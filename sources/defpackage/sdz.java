package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sdz extends eyfy implements eyht {
    public static final sdz a;
    private static volatile eyhz c;
    public eygr b = emptyProtobufList();

    static {
        sdz sdzVar = new sdz();
        a = sdzVar;
        eyfy.registerDefaultInstance(sdz.class, sdzVar);
    }

    private sdz() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", sdx.class});
        }
        if (ordinal == 3) {
            return new sdz();
        }
        if (ordinal == 4) {
            return new sdy();
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
        synchronized (sdz.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
