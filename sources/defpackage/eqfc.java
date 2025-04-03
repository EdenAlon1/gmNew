package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqfc extends eyfy implements eyht {
    public static final eqfc a;
    private static volatile eyhz h;
    public int b;
    public int c = 0;
    public Object d;
    public int e;
    public boolean f;
    public boolean g;

    static {
        eqfc eqfcVar = new eqfc();
        a = eqfcVar;
        eyfy.registerDefaultInstance(eqfc.class, eqfcVar);
    }

    private eqfc() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0007\u0001\u0001\u0001h\u0007\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဇ\u0002e<\u0000f<\u0000g<\u0000h<\u0000", new Object[]{"d", "c", "b", "e", eqfh.a, "f", "g", eqfe.class, eqfk.class, eqfa.class, eqfg.class});
        }
        if (ordinal == 3) {
            return new eqfc();
        }
        if (ordinal == 4) {
            return new eqfb();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = h;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (eqfc.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
