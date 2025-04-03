package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckqh extends eyfy implements eyht {
    public static final ckqh a;
    private static volatile eyhz i;
    public int b;
    public String c = "";
    public int d;
    public eyja e;
    public boolean f;
    public int g;
    public awui h;

    static {
        ckqh ckqhVar = new ckqh();
        a = ckqhVar;
        eyfy.registerDefaultInstance(ckqh.class, ckqhVar);
    }

    private ckqh() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0004ဉ\u0000\u0005ဇ\u0001\u0006င\u0002\u0007ဉ\u0003", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
        }
        if (ordinal == 3) {
            return new ckqh();
        }
        if (ordinal == 4) {
            return new ckqf();
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
        synchronized (ckqh.class) {
            eyhzVar = i;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                i = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
