package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfij extends eyfy implements eyht {
    public static final dfij a;
    private static volatile eyhz e;
    public int b;
    public eygr c = emptyProtobufList();
    public eygr d;
    private int f;

    static {
        dfij dfijVar = new dfij();
        a = dfijVar;
        eyfy.registerDefaultInstance(dfij.class, dfijVar);
    }

    private dfij() {
        emptyProtobufList();
        this.d = emptyProtobufList();
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0002\u0000\u0001᠌\u0000\u0002\u001b\u0004\u001b", new Object[]{"f", "b", dfih.a, "c", dfhz.class, "d", dfig.class});
        }
        if (ordinal == 3) {
            return new dfij();
        }
        if (ordinal == 4) {
            return new dfic();
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
        synchronized (dfij.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
