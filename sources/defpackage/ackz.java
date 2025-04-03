package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ackz extends eyfy implements eyht {
    public static final ackz a;
    private static volatile eyhz h;
    public int b;
    public Object d;
    public boolean f;
    public int g;
    public int c = 0;
    public String e = "";

    static {
        ackz ackzVar = new ackz();
        a = ackzVar;
        eyfy.registerDefaultInstance(ackz.class, ackzVar);
    }

    private ackz() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003;\u0000\u0004᠌\u0002", new Object[]{"d", "c", "b", "e", "f", "g", ackx.a});
        }
        if (ordinal == 3) {
            return new ackz();
        }
        if (ordinal == 4) {
            return new ackw();
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
        synchronized (ackz.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
