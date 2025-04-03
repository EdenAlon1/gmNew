package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqbp extends eyfy implements eyht {
    public static final eygj a = new eqba();
    public static final eqbp b;
    private static volatile eyhz o;
    public int c;
    public long d;
    public int e;
    public int f;
    public int g;
    public int h;
    public eygi i = emptyIntList();
    public eygr j = emptyProtobufList();
    public int k;
    public int l;
    public eqbe m;
    public int n;

    static {
        eqbp eqbpVar = new eqbp();
        b = eqbpVar;
        eyfy.registerDefaultInstance(eqbp.class, eqbpVar);
    }

    private eqbp() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(b, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0002\u0000\u0001ဂ\u0000\u0002᠌\u0001\u0003᠌\u0003\u0004᠌\u0004\u0005ࠞ\u0006᠌\u0005\u0007᠌\u0006\bဉ\u0007\t᠌\b\n᠌\u0002\u000b\u001b", new Object[]{"c", "d", "e", eqbh.a, "g", eqbk.a, "h", eqbg.a, "i", eqbi.a, "k", eqbo.a, "l", eqbf.a, "m", "n", eqbc.a, "f", eqbl.a, "j", eqbn.class});
        }
        if (ordinal == 3) {
            return new eqbp();
        }
        if (ordinal == 4) {
            return new eqbb();
        }
        if (ordinal == 5) {
            return b;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = o;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (eqbp.class) {
            eyhzVar = o;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(b);
                o = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
