package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ezcq extends eyfy implements eyht {
    private static volatile eyhz B;
    public static final ezcq a;
    public int A;
    public int b;
    public int c;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int n;
    public int o;
    public int p;
    public long q;
    public long r;
    public long s;
    public long t;
    public int u;
    public int v;
    public int y;
    public eqpc z;
    public String d = "";
    public eygi m = emptyIntList();
    public String w = "";
    public String x = "";

    static {
        ezcq ezcqVar = new ezcq();
        a = ezcqVar;
        eyfy.registerDefaultInstance(ezcq.class, ezcqVar);
    }

    private ezcq() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            eygg eyggVar = ezcm.a;
            eygg eyggVar2 = ezcj.a;
            return newMessageInfo(a, "\u0004\u0019\u0000\u0001\u0001\u001a\u0019\u0000\u0001\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003᠌\u0002\u0004᠌\u0004\u0005᠌\u0005\u0006᠌\u0006\u0007᠌\u0007\b᠌\b\t᠌\t\n᠌\n\u000b᠌\u000b\f᠌\f\rဂ\r\u000eဂ\u000e\u000fဂ\u000f\u0010ဂ\u0010\u0011᠌\u0011\u0012᠌\u0012\u0013ဈ\u0013\u0014ဈ\u0014\u0015ࠬ\u0016᠌\u0003\u0017᠌\u0015\u0018ဉ\u0016\u001a᠌\u0018", new Object[]{"b", "c", eyggVar, "d", "e", ezcl.a, "g", eyggVar, "h", ezci.a, "i", eyggVar, "j", eqwe.a, "k", eyggVar, "l", eyggVar, "n", eyggVar2, "o", eyggVar, "p", ezeo.a, "q", "r", "s", "t", "u", ezfa.a, "v", ezem.a, "w", "x", "m", eyggVar2, "f", ezco.a, "y", ezen.a, "z", "A", eqwr.a});
        }
        if (ordinal == 3) {
            return new ezcq();
        }
        if (ordinal == 4) {
            return new ezch();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = B;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (ezcq.class) {
            eyhzVar = B;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                B = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
