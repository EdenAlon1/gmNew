package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class akoh extends eyfy<akoh, akog> implements eyht {
    public static final akoh a;
    private static volatile eyhz d;
    public int b;
    public boolean c;

    static {
        akoh akohVar = new akoh();
        a = akohVar;
        eyfy.registerDefaultInstance(akoh.class, akohVar);
    }

    private akoh() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"b", "c"});
        }
        if (ordinal == 3) {
            return new akoh();
        }
        if (ordinal == 4) {
            return new akog();
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
        synchronized (akoh.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
