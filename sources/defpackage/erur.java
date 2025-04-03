package defpackage;

import com.android.vcard.VCardConstants;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erur extends eyfy implements eyht {
    private static volatile eyhz C;
    public static final erur a;
    public boolean A;
    public esof B;
    public int b;
    public eruq e;
    public long f;
    public int g;
    public boolean h;
    public boolean i;
    public int k;
    public boolean l;
    public boolean m;
    public int p;
    public escr q;
    public int t;
    public boolean u;
    public esci v;
    public boolean w;
    public esbs x;
    public long y;
    public boolean z;
    public String c = "";
    public String d = "";
    public String j = "";
    public String n = "";
    public String o = "";
    public eygr r = emptyProtobufList();
    public eygr s = eyfy.emptyProtobufList();

    static {
        erur erurVar = new erur();
        a = erurVar;
        eyfy.registerDefaultInstance(erur.class, erurVar);
    }

    private erur() {
    }

    public final void a() {
        eygr eygrVar = this.r;
        if (eygrVar.c()) {
            return;
        }
        this.r = eyfy.mutableCopy(eygrVar);
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u001a\u0000\u0001\u0001\u001f\u001a\u0000\u0002\u0000\u0001Ȉ\u0002Ȉ\u0004ဉ\u0000\u0005\u0002\u0006\u0004\u0007\u0007\n\u0007\u000bȈ\f\f\r\u0007\u000e\u0007\u000fȈ\u0011Ȉ\u0012\f\u0013ဉ\u0002\u0014\u001b\u0015Ț\u0016\f\u0018\u0007\u0019ဉ\u0003\u001a\u0007\u001bဉ\u0004\u001c\u0002\u001d\u0007\u001e\u0007\u001fဉ\u0005", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", esal.class, "s", "t", "u", "v", "w", "x", "y", "z", "A", VCardConstants.PARAM_ENCODING_B});
        }
        if (ordinal == 3) {
            return new erur();
        }
        if (ordinal == 4) {
            return new eruo();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = C;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (erur.class) {
            eyhzVar = C;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                C = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
