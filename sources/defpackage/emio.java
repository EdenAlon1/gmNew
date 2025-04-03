package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emio extends eyfy implements eyht {
    public static final emio a;
    private static volatile eyhz c;
    public eygr b = emptyProtobufList();

    static {
        emio emioVar = new emio();
        a = emioVar;
        eyfy.registerDefaultInstance(emio.class, emioVar);
    }

    private emio() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", emkw.class});
        }
        if (ordinal == 3) {
            return new emio();
        }
        if (ordinal == 4) {
            return new emin();
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
        synchronized (emio.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
