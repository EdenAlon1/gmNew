package defpackage;

/* compiled from: PG */
@Deprecated
/* loaded from: classes5.dex */
public final class epbs extends eyfy implements eyht {
    public static final epbs a;
    private static volatile eyhz e;
    public int b;
    public boolean c;
    public boolean d;

    static {
        epbs epbsVar = new epbs();
        a = epbsVar;
        eyfy.registerDefaultInstance(epbs.class, epbsVar);
    }

    private epbs() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"b", "c", "d"});
        }
        if (ordinal == 3) {
            return new epbs();
        }
        if (ordinal == 4) {
            return new epbr();
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
        synchronized (epbs.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
