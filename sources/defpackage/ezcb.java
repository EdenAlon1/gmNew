package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ezcb extends eyfy implements eyht {
    public static final ezcb a;
    private static volatile eyhz x;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int j;
    public int l;
    public long m;
    public boolean n;
    public int o;
    public int p;
    public eyyt r;
    public ezbw s;
    public ezca t;
    public ezbs u;
    public ezdt v;
    public eqpc w;
    public eygi i = emptyIntList();
    public String k = "";
    public String q = "";

    static {
        ezcb ezcbVar = new ezcb();
        a = ezcbVar;
        eyfy.registerDefaultInstance(ezcb.class, ezcbVar);
    }

    private ezcb() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0001\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003င\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006᠌\u0005\u0007ࠞ\b᠌\u0006\tဈ\u0007\n᠌\b\u000bဂ\t\fဇ\n\r᠌\u000b\u000e᠌\f\u000fဈ\r\u0010ဉ\u000e\u0011ဉ\u000f\u0012ဉ\u0010\u0013ဉ\u0011\u0014ဉ\u0012\u0015ဉ\u0013", new Object[]{"b", "c", ezey.a, "d", ezbt.a, "e", "f", ezet.a, "g", ezeu.a, "h", ezeo.a, "i", ezep.a, "j", ezex.a, "k", "l", ezfc.a, "m", "n", "o", ezfa.a, "p", ezem.a, "q", "r", "s", "t", "u", "v", "w"});
        }
        if (ordinal == 3) {
            return new ezcb();
        }
        if (ordinal == 4) {
            return new ezbo();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = x;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (ezcb.class) {
            eyhzVar = x;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                x = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
