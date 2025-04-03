package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwto extends eyfy implements eyht {
    public static final dwto a;
    private static volatile eyhz c;
    public boolean b;
    private int d;

    static {
        dwto dwtoVar = new dwto();
        a = dwtoVar;
        eyfy.registerDefaultInstance(dwto.class, dwtoVar);
    }

    private dwto() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"d", "b"});
        }
        if (ordinal == 3) {
            return new dwto();
        }
        if (ordinal == 4) {
            return new dwtn();
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
        synchronized (dwto.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
