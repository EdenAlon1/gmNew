package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewgy extends eyfy implements eyht {
    public static final ewgy a;
    private static volatile eyhz h;
    public int b;
    public int d;
    public ewhf e;
    public ewii f;
    public String c = "";
    public eygr g = emptyProtobufList();

    static {
        ewgy ewgyVar = new ewgy();
        a = ewgyVar;
        eyfy.registerDefaultInstance(ewgy.class, ewgyVar);
    }

    private ewgy() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0000\u0001Ȉ\u0002\f\u0003ဉ\u0000\u0004ဉ\u0001\u0006\u001b", new Object[]{"b", "c", "d", "e", "f", "g", ewgu.class});
        }
        if (ordinal == 3) {
            return new ewgy();
        }
        if (ordinal == 4) {
            return new ewgx();
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
        synchronized (ewgy.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
