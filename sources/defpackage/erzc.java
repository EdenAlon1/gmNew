package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erzc extends eyfy implements eyht {
    public static final erzc a;
    private static volatile eyhz c;
    public eygr b = emptyProtobufList();

    static {
        erzc erzcVar = new erzc();
        a = erzcVar;
        eyfy.registerDefaultInstance(erzc.class, erzcVar);
    }

    private erzc() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", eruj.class});
        }
        if (ordinal == 3) {
            return new erzc();
        }
        if (ordinal == 4) {
            return new erzb();
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
        synchronized (erzc.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
