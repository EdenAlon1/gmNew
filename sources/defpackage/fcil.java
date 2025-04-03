package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcil extends eyfy implements eyht {
    public static final fcil a;
    private static volatile eyhz k;
    public int b;
    public int c;
    public fcek d;
    public eygr e = emptyProtobufList();
    public eyja f;
    public int g;
    public eyee h;
    public int i;
    public fcek j;

    static {
        fcil fcilVar = new fcil();
        a = fcilVar;
        eyfy.registerDefaultInstance(fcil.class, fcilVar);
    }

    private fcil() {
        emptyIntList();
        this.h = eyee.b;
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\b\u0000\u0001\u0001\u0011\b\u0000\u0001\u0000\u0001\f\u0002ဉ\u0000\u0003\u001b\u0004ဉ\u0001\u0005\f\u000f\n\u0010\f\u0011ဉ\u0006", new Object[]{"b", "c", "d", "e", fcjm.class, "f", "g", "h", "i", "j"});
        }
        if (ordinal == 3) {
            return new fcil();
        }
        if (ordinal == 4) {
            return new fcik();
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
        synchronized (fcil.class) {
            eyhzVar = k;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                k = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
