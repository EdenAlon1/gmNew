package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erxf extends eyfy implements eyht {
    public static final erxf a;
    private static volatile eyhz c;
    public long b;

    static {
        erxf erxfVar = new erxf();
        a = erxfVar;
        eyfy.registerDefaultInstance(erxf.class, erxfVar);
    }

    private erxf() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u0002", new Object[]{"b"});
        }
        if (ordinal == 3) {
            return new erxf();
        }
        if (ordinal == 4) {
            return new erxe();
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
        synchronized (erxf.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
