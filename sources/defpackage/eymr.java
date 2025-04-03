package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eymr extends eyfy implements eyht {
    public static final eymr a;
    private static volatile eyhz c;
    public eygr b = emptyProtobufList();

    static {
        eymr eymrVar = new eymr();
        a = eymrVar;
        eyfy.registerDefaultInstance(eymr.class, eymrVar);
    }

    private eymr() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", eymp.class});
        }
        if (ordinal == 3) {
            return new eymr();
        }
        if (ordinal == 4) {
            return new eymm();
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
        synchronized (eymr.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
