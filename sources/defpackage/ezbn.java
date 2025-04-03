package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ezbn extends eyfy implements eyht {
    public static final ezbn a;
    private static volatile eyhz h;
    public int b;
    public Object d;
    public int f;
    public int c = 0;
    public String e = "";
    public String g = "";

    static {
        ezbn ezbnVar = new ezbn();
        a = ezbnVar;
        eyfy.registerDefaultInstance(ezbn.class, ezbnVar);
    }

    private ezbn() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u000b\u0001\u0001\u0001\f\u000b\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007ဈ\u0002\b<\u0000\n<\u0000\u000b:\u0000\f<\u0000", new Object[]{"d", "c", "b", "e", "f", ezcd.class, ezcg.class, ezcu.class, eysy.class, "g", ezdl.class, ezdr.class, ezdg.class});
        }
        if (ordinal == 3) {
            return new ezbn();
        }
        if (ordinal == 4) {
            return new ezbm();
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
        synchronized (ezbn.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
