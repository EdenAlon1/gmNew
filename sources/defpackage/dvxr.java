package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvxr extends eyft implements dvxs {
    public static final dvxr a;
    private static volatile eyhz i;
    public int b;
    public erhk d;
    public int e;
    public long f;
    public long g;
    public long h;
    private byte j = 2;
    public eygi c = emptyIntList();

    static {
        dvxr dvxrVar = new dvxr();
        a = dvxrVar;
        eyfy.registerDefaultInstance(dvxr.class, dvxrVar);
    }

    private dvxr() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        switch (eyfxVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                this.j = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0002\b\u0006\u0000\u0001\u0001\u0002\u0016\u0004ᐉ\u0000\u0005᠌\u0001\u0006ဂ\u0002\u0007ဂ\u0003\bဂ\u0004", new Object[]{"b", "c", "d", "e", epny.a, "f", "g", "h"});
            case 3:
                return new dvxr();
            case 4:
                return new dvxq();
            case 5:
                return a;
            case 6:
                eyhz eyhzVar2 = i;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (dvxr.class) {
                    eyhzVar = i;
                    if (eyhzVar == null) {
                        eyhzVar = new eyfr(a);
                        i = eyhzVar;
                    }
                }
                return eyhzVar;
            default:
                throw null;
        }
    }
}
