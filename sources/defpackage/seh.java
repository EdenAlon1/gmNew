package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class seh extends eyfy implements eyht {
    public static final seh a;
    private static volatile eyhz f;
    public long c;
    public int e;
    public String b = "";
    public eygr d = emptyProtobufList();

    static {
        seh sehVar = new seh();
        a = sehVar;
        eyfy.registerDefaultInstance(seh.class, sehVar);
    }

    private seh() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0000\u0001\u0005\u0004\u0000\u0001\u0000\u0001Ȉ\u0002\u0002\u0003\u001b\u0005\f", new Object[]{"b", "c", "d", seg.class, "e"});
        }
        if (ordinal == 3) {
            return new seh();
        }
        if (ordinal == 4) {
            return new see();
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
        synchronized (seh.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
