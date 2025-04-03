package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epol extends eyfy implements eyht {
    public static final epol a;
    private static volatile eyhz h;
    public int b;
    public Object d;
    public int e;
    public epon g;
    public int c = 0;
    public eyee f = eyee.b;

    static {
        epol epolVar = new epol();
        a = epolVar;
        eyfy.registerDefaultInstance(epol.class, epolVar);
    }

    private epol() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0006\u0001\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002ည\u0001\u0004ဉ\u0003\u0005<\u0000\u0006<\u0000\u0007<\u0000", new Object[]{"d", "c", "b", "e", epoj.a, "f", "g", epou.class, epop.class, epos.class});
        }
        if (ordinal == 3) {
            return new epol();
        }
        if (ordinal == 4) {
            return new epok();
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
        synchronized (epol.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
