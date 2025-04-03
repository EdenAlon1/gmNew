package defpackage;

/* compiled from: PG */
@Deprecated
/* loaded from: classes5.dex */
public final class ephe extends eyfy implements eyht {
    public static final ephe a;
    private static volatile eyhz k;
    public int b;
    public int c;
    public eygi d = emptyIntList();
    public eygi e = emptyIntList();
    public eygi f = emptyIntList();
    public int g;
    public int h;
    public int i;
    public int j;

    static {
        ephe epheVar = new ephe();
        a = epheVar;
        eyfy.registerDefaultInstance(ephe.class, epheVar);
    }

    private ephe() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            eygg eyggVar = epgz.a;
            return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0003\u0000\u0001᠌\u0000\u0003ࠞ\u0004ࠞ\u0005ࠞ\u0006᠌\u0001\u0007᠌\u0002\b᠌\u0003\t᠌\u0004", new Object[]{"b", "c", epgw.a, "d", eyggVar, "e", eyggVar, "f", eyggVar, "g", ephc.a, "h", epgy.a, "i", ephb.a, "j", epgx.a});
        }
        if (ordinal == 3) {
            return new ephe();
        }
        if (ordinal == 4) {
            return new epgv();
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
        synchronized (ephe.class) {
            eyhzVar = k;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                k = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
