package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewfs extends eyfy implements eyht {
    public static final ewfs a;
    private static volatile eyhz e;
    public ewfh b;
    public ewff c;
    public ewex d;
    private int f;

    static {
        ewfs ewfsVar = new ewfs();
        a = ewfsVar;
        eyfy.registerDefaultInstance(ewfs.class, ewfsVar);
    }

    private ewfs() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"f", "b", "c", "d"});
        }
        if (ordinal == 3) {
            return new ewfs();
        }
        if (ordinal == 4) {
            return new ewfr();
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
        synchronized (ewfs.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
