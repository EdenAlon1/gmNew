package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcfm extends eyfy implements eyht {
    public static final fcfm a;
    private static volatile eyhz h;
    public int b;
    public eyee c = eyee.b;
    public eygi d = emptyIntList();
    public eygr e = emptyProtobufList();
    public fcfa f;
    public long g;

    static {
        fcfm fcfmVar = new fcfm();
        a = fcfmVar;
        eyfy.registerDefaultInstance(fcfm.class, fcfmVar);
    }

    private fcfm() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0002\u0000\u0001\n\u0002'\u0003ဉ\u0000\u0006\u001b\u0007\u0003", new Object[]{"b", "c", "d", "f", "e", fcdx.class, "g"});
        }
        if (ordinal == 3) {
            return new fcfm();
        }
        if (ordinal == 4) {
            return new fcfl();
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
        synchronized (fcfm.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
