package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbdh extends eyfy implements eyht {
    public static final fbdh a;
    private static volatile eyhz l;
    public int b;
    public fcfo c;
    public int d;
    public fbdf e;
    public int f;
    public boolean g;
    public float h;
    public String i = "";
    public String j = "";
    public fcfw k;

    static {
        fbdh fbdhVar = new fbdh();
        a = fbdhVar;
        eyfy.registerDefaultInstance(fbdh.class, fbdhVar);
    }

    private fbdh() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\t\u0000\u0001\u0001\n\t\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003ဉ\u0001\u0004\f\u0005\u0001\u0006Ȉ\u0007Ȉ\b\u0007\nဉ\u0002", new Object[]{"b", "c", "d", "e", "f", "h", "i", "j", "g", "k"});
        }
        if (ordinal == 3) {
            return new fbdh();
        }
        if (ordinal == 4) {
            return new fbdg();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = l;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (fbdh.class) {
            eyhzVar = l;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                l = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
