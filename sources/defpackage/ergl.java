package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ergl extends eyfy implements eyht {
    public static final ergl a;
    private static volatile eyhz d;
    public int b;
    public ergv c;
    private int e;

    static {
        ergl erglVar = new ergl();
        a = erglVar;
        eyfy.registerDefaultInstance(ergl.class, erglVar);
    }

    private ergl() {
        eyfy.emptyProtobufList();
    }

    public static /* synthetic */ void a(ergl erglVar) {
        erglVar.b |= 2;
        erglVar.e = 1;
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0000\u0003ဋ\u0001\u0004ဉ\u0002", new Object[]{"b", "e", "c"});
        }
        if (ordinal == 3) {
            return new ergl();
        }
        if (ordinal == 4) {
            return new ergk();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = d;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (ergl.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
