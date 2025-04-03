package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eiub extends eyfy<eiub, eity> implements eyht {
    public static final eiub a;
    private static volatile eyhz k;
    public int b;
    public int c;
    public int d;
    public int e;
    public eygr f = eyfy.emptyProtobufList();
    public boolean g;
    public int h;
    public boolean i;
    public int j;

    static {
        eiub eiubVar = new eiub();
        a = eiubVar;
        eyfy.registerDefaultInstance(eiub.class, eiubVar);
    }

    private eiub() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003᠌\u0002\u0004\u001a\u0005ဇ\u0003\u0006င\u0004\u0007ဇ\u0005\bင\u0006", new Object[]{"b", "c", "d", "e", eitz.a, "f", "g", "h", "i", "j"});
        }
        if (ordinal == 3) {
            return new eiub();
        }
        if (ordinal == 4) {
            return new eity();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = k;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (eiub.class) {
            eyhzVar = k;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                k = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
