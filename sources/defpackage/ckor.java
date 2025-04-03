package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckor extends eyfy implements eyht {
    public static final ckor a;
    private static volatile eyhz c;
    public long b;

    static {
        ckor ckorVar = new ckor();
        a = ckorVar;
        eyfy.registerDefaultInstance(ckor.class, ckorVar);
    }

    private ckor() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0002", new Object[]{"b"});
        }
        if (ordinal == 3) {
            return new ckor();
        }
        if (ordinal == 4) {
            return new ckoq();
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
        synchronized (ckor.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
