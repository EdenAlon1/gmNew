package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckxq extends eyfy implements eyht {
    public static final ckxq a;
    private static volatile eyhz i;
    public int b;
    public String c = "";
    public String d = "";
    public String e = "";
    public eygr f = emptyProtobufList();
    public ckxx g;
    public long h;

    static {
        ckxq ckxqVar = new ckxq();
        a = ckxqVar;
        eyfy.registerDefaultInstance(ckxq.class, ckxqVar);
    }

    private ckxq() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\u001b\u0005ဉ\u0000\u0006\u0002", new Object[]{"b", "c", "d", "e", "f", ckxc.class, "g", "h"});
        }
        if (ordinal == 3) {
            return new ckxq();
        }
        if (ordinal == 4) {
            return new ckxp();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = i;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (ckxq.class) {
            eyhzVar = i;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                i = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
