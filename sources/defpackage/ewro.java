package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewro extends eyfy implements eyht {
    public static final ewro a;
    private static volatile eyhz g;
    public int b;
    public eygr c = eyfy.emptyProtobufList();
    public ewsb d;
    public ewrc e;
    public ewra f;

    static {
        ewro ewroVar = new ewro();
        a = ewroVar;
        eyfy.registerDefaultInstance(ewro.class, ewroVar);
    }

    private ewro() {
        emptyIntList();
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\f\u0004\u0000\u0001\u0000\u0001Ț\u0002ဉ\u0001\u0007ဉ\u0004\fဉ\u0007", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (ordinal == 3) {
            return new ewro();
        }
        if (ordinal == 4) {
            return new ewrn();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = g;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (ewro.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
