package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alko extends eyfy implements eyht {
    public static final alko a;
    private static volatile eyhz k;
    public int b;
    public int g;
    public int c = -1;
    public int d = -2;
    public int e = -2;
    public int f = -2;
    public eygr h = emptyProtobufList();
    public int i = -1;
    public int j = -2;

    static {
        alko alkoVar = new alko();
        a = alkoVar;
        eyfy.registerDefaultInstance(alko.class, alkoVar);
    }

    private alko() {
    }

    public final void a() {
        eygr eygrVar = this.h;
        if (eygrVar.c()) {
            return;
        }
        this.h = eyfy.mutableCopy(eygrVar);
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001ဏ\u0000\u0002ဏ\u0001\u0003ဏ\u0002\u0004ဏ\u0003\u0005᠌\u0004\u0006\u001b\u0007ဏ\u0005\bဏ\u0006", new Object[]{"b", "c", "d", "e", "f", "g", eyqu.a, "h", alkg.class, "i", "j"});
        }
        if (ordinal == 3) {
            return new alko();
        }
        if (ordinal == 4) {
            return new alkn();
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
        synchronized (alko.class) {
            eyhzVar = k;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                k = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
