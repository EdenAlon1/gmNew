package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctsx extends eyfy<ctsx, ctsw> implements eyht {
    public static final ctsx a;
    private static volatile eyhz f;
    public int b;
    public boolean c = true;
    public boolean d = true;
    public boolean e = true;

    static {
        ctsx ctsxVar = new ctsx();
        a = ctsxVar;
        eyfy.registerDefaultInstance(ctsx.class, ctsxVar);
    }

    private ctsx() {
    }

    public static /* synthetic */ void a(ctsx ctsxVar) {
        ctsxVar.b |= 2;
        ctsxVar.d = false;
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (ordinal == 3) {
            return new ctsx();
        }
        if (ordinal == 4) {
            return new ctsw();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = f;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (ctsx.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
