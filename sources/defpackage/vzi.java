package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vzi extends eyfy implements eyht {
    public static final vzi a;
    private static volatile eyhz k;
    public String b = "";
    public boolean c;
    public boolean d;
    public int e;
    public int f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;

    static {
        vzi vziVar = new vzi();
        a = vziVar;
        eyfy.registerDefaultInstance(vzi.class, vziVar);
    }

    private vzi() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0000\u0000\u0001Ȉ\u0002\u0007\u0003\u0007\u0004\u0004\u0005\f\u0006\u0007\u0007\u0007\b\u0004\t\u0004", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j"});
        }
        if (ordinal == 3) {
            return new vzi();
        }
        if (ordinal == 4) {
            return new vzh();
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
        synchronized (vzi.class) {
            eyhzVar = k;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                k = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
