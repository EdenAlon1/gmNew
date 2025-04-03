package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esvm extends eyfy implements eyht {
    public static final esvm a;
    private static volatile eyhz e;
    public int b;
    public etau c;
    public eygr d = eyfy.emptyProtobufList();

    static {
        esvm esvmVar = new esvm();
        a = esvmVar;
        eyfy.registerDefaultInstance(esvm.class, esvmVar);
    }

    private esvm() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0001ϧ\u0002\u0000\u0001\u0000\u0001Țϧဉ\u0000", new Object[]{"b", "d", "c"});
        }
        if (ordinal == 3) {
            return new esvm();
        }
        if (ordinal == 4) {
            return new esvl();
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
        synchronized (esvm.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
