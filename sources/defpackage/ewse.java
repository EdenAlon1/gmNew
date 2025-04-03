package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewse extends eyfy implements eyht {
    public static final ewse a;
    private static volatile eyhz h;
    public int b;
    public int c;
    public eyee d = eyee.b;
    public ewry e;
    public eisc f;
    public int g;

    static {
        ewse ewseVar = new ewse();
        a = ewseVar;
        eyfy.registerDefaultInstance(ewse.class, ewseVar);
    }

    private ewse() {
        emptyProtobufList();
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\r\u0005\u0000\u0000\u0000\u0001\f\u0003\f\u0005\n\bဉ\u0002\rဉ\u0000", new Object[]{"b", "c", "g", "d", "f", "e"});
        }
        if (ordinal == 3) {
            return new ewse();
        }
        if (ordinal == 4) {
            return new ewsd();
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
        synchronized (ewse.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
