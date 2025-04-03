package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewfy extends eyfy implements eyht {
    public static final ewfy a;
    private static volatile eyhz g;
    public int b;
    public ewge c;
    public ewge d;
    public ewgg e;
    public ewgs f;

    static {
        ewfy ewfyVar = new ewfy();
        a = ewfyVar;
        eyfy.registerDefaultInstance(ewfy.class, ewfyVar);
    }

    private ewfy() {
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
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0000\u0000\u0002ဉ\u0002\u0003ဉ\u0003\u0004ဉ\u0000\u0005ဉ\u0001", new Object[]{"b", "e", "f", "c", "d"});
        }
        if (ordinal == 3) {
            return new ewfy();
        }
        if (ordinal == 4) {
            return new ewfx();
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
        synchronized (ewfy.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
