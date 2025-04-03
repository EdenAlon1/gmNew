package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cufa extends eyfy implements eyht {
    public static final cufa a;
    private static volatile eyhz d;
    public int b;
    public int c;

    static {
        cufa cufaVar = new cufa();
        a = cufaVar;
        eyfy.registerDefaultInstance(cufa.class, cufaVar);
    }

    private cufa() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\f\u0003\f", new Object[]{"b", "c"});
        }
        if (ordinal == 3) {
            return new cufa();
        }
        if (ordinal == 4) {
            return new cuez();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = d;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (cufa.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
