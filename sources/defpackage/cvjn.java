package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvjn extends eyfy implements eyht {
    public static final cvjn a;
    private static volatile eyhz k;
    public int b;
    public int c;
    public eyja d;
    public int e;
    public int g;
    public eyja h;
    public eyja j;
    public String f = "";
    public eygr i = eyfy.emptyProtobufList();

    static {
        cvjn cvjnVar = new cvjn();
        a = cvjnVar;
        eyfy.registerDefaultInstance(cvjn.class, cvjnVar);
    }

    private cvjn() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0001\u0000\u0001င\u0000\u0002ဉ\u0001\u0003᠌\u0002\u0005᠌\u0004\u0006ဉ\u0005\u0007\u001a\bဉ\u0006\tဈ\u0003", new Object[]{"b", "c", "d", "e", cvji.a, "g", cvjk.a, "h", "i", "j", "f"});
        }
        if (ordinal == 3) {
            return new cvjn();
        }
        if (ordinal == 4) {
            return new cvjm();
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
        synchronized (cvjn.class) {
            eyhzVar = k;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                k = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
