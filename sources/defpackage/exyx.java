package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exyx extends eyfy implements eyht {
    public static final exyx a;
    private static volatile eyhz g;
    public int b;
    public long c;
    public eyev d;
    public eyev e;
    public boolean f;

    static {
        exyx exyxVar = new exyx();
        a = exyxVar;
        eyfy.registerDefaultInstance(exyx.class, exyxVar);
    }

    private exyx() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (ordinal == 3) {
            return new exyx();
        }
        if (ordinal == 4) {
            return new exyw();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = g;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (exyx.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
