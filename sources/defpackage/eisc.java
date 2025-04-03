package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eisc extends eyfy implements eyht {
    public static final eisc a;
    private static volatile eyhz c;
    public eygi b;

    static {
        eisc eiscVar = new eisc();
        a = eiscVar;
        eyfy.registerDefaultInstance(eisc.class, eiscVar);
    }

    private eisc() {
        emptyProtobufList();
        this.b = emptyIntList();
        emptyIntList();
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002ࠞ", new Object[]{"b", eisb.a});
        }
        if (ordinal == 3) {
            return new eisc();
        }
        if (ordinal == 4) {
            return new eisa();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = c;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (eisc.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
