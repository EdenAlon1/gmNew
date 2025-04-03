package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwcz extends eyfy implements eyht {
    public static final dwcz a;
    private static volatile eyhz c;
    public int b;
    private int d;

    static {
        dwcz dwczVar = new dwcz();
        a = dwczVar;
        eyfy.registerDefaultInstance(dwcz.class, dwczVar);
    }

    private dwcz() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"d", "b"});
        }
        if (ordinal == 3) {
            return new dwcz();
        }
        if (ordinal == 4) {
            return new dwcy();
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
        synchronized (dwcz.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
