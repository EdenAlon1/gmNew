package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class faof extends eyfy implements eyht {
    public static final faof a;
    private static volatile eyhz e;
    public int b;
    public int c;
    public eyee d = eyee.b;

    static {
        faof faofVar = new faof();
        a = faofVar;
        eyfy.registerDefaultInstance(faof.class, faofVar);
    }

    private faof() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ည\u0001", new Object[]{"b", "c", faoh.a, "d"});
        }
        if (ordinal == 3) {
            return new faof();
        }
        if (ordinal == 4) {
            return new faoe();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = e;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (faof.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
