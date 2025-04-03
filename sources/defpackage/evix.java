package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evix extends eyfy implements eyht {
    public static final evix a;
    private static volatile eyhz k;
    public int b;
    public int c;
    public long d;
    public fgmh e;
    public evio f;
    public erhq g;
    public eviq h;
    public eygr i;
    public eviw j;
    private byte l = 2;

    static {
        evix evixVar = new evix();
        a = evixVar;
        eyfy.registerDefaultInstance(evix.class, evixVar);
    }

    private evix() {
        eyee eyeeVar = eyee.b;
        this.i = emptyProtobufList();
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        switch (eyfxVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.l);
            case 1:
                this.l = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\b\u0000\u0001\u0002\u0010\b\u0000\u0001\u0002\u0002ဉ\u0004\u0003ᐉ\u0005\u0007ဉ\u0006\t\u001b\f᠌\u0000\rဂ\u0001\u000eᐉ\u0002\u0010ဉ\b", new Object[]{"b", "f", "g", "h", "i", evjc.class, "c", eviu.a, "d", "e", "j"});
            case 3:
                return new evix();
            case 4:
                return new evit();
            case 5:
                return a;
            case 6:
                eyhz eyhzVar2 = k;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (evix.class) {
                    eyhzVar = k;
                    if (eyhzVar == null) {
                        eyhzVar = new eyfr(a);
                        k = eyhzVar;
                    }
                }
                return eyhzVar;
            default:
                throw null;
        }
    }
}
