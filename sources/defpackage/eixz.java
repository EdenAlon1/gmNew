package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eixz extends eyft<eixz, eixy> implements eyfu {
    public static final eixz a;
    private static volatile eyhz l;
    public int b;
    public boolean i;
    private byte m = 2;
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";
    public String h = "";
    public String j = "";
    public String k = "";

    static {
        eixz eixzVar = new eixz();
        a = eixzVar;
        eyfy.registerDefaultInstance(eixz.class, eixzVar);
    }

    private eixz() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        switch (eyfxVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.m);
            case 1:
                this.m = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0004\u0004ဈ\u0005\u0005ဇ\u0006\u0006ဈ\u0007\u0007ဈ\b\bဈ\u0002\tဈ\u0003", new Object[]{"b", "c", "d", "g", "h", "i", "j", "k", "e", "f"});
            case 3:
                return new eixz();
            case 4:
                return new eixy();
            case 5:
                return a;
            case 6:
                eyhz eyhzVar2 = l;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (eixz.class) {
                    eyhzVar = l;
                    if (eyhzVar == null) {
                        eyhzVar = new eyfr(a);
                        l = eyhzVar;
                    }
                }
                return eyhzVar;
            default:
                throw null;
        }
    }
}
