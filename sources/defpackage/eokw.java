package defpackage;

import com.android.vcard.VCardConstants;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eokw extends eyfy implements eyht {
    private static volatile eyhz H;
    public static final eokw a;
    public int A;
    public int B;
    public int C;
    public int D;
    public boolean G;
    public int b;
    public Object d;
    public int e;
    public int f;
    public boolean i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public long r;
    public int s;
    public int t;
    public long u;
    public int v;
    public int w;
    public int x;
    public eotr y;
    public boolean z;
    public int c = 0;
    public int g = -1;
    public int h = -1;
    public eygi E = emptyIntList();
    public eygi F = emptyIntList();

    static {
        eokw eokwVar = new eokw();
        a = eokwVar;
        eyfy.registerDefaultInstance(eokw.class, eokwVar);
    }

    private eokw() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            eygg eyggVar = epuy.a;
            return newMessageInfo(a, "\u0001 \u0001\u0001\u0001$ \u0000\u0002\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003င\u0002\u0004င\u0003\u0006ဇ\u0005\t᠌\b\n᠌\t\u000b᠌\n\fင\u000b\r᠌\f\u000eင\r\u000f᠌\u000e\u0010င\u000f\u0011ဂ\u0010\u0012င\u0011\u0013င\u0012\u0014ဃ\u0013\u0015᠌\u0014\u0017င\u0016\u0018᠌\u0017\u0019ဉ\u0018\u001aဇ\u0019\u001b᠌\u001a\u001c\u083f\u0000\u001d\u083f\u0000\u001e\u083f\u0000\u001f᠌\u001b ᠌\u001c!᠌\u001d\"ࠞ#ࠞ$ဇ\u001e", new Object[]{"d", "c", "b", "e", eokq.a, "f", eokn.a, "g", "h", "i", "j", eokr.a, "k", eokp.a, "l", eokh.a, "m", "n", eokj.a, "o", "p", eony.a, "q", "r", "s", "t", "u", "v", eoph.a, "w", "x", eokm.a, "y", "z", "A", eolc.a, eokk.a, eoku.a, eokt.a, VCardConstants.PARAM_ENCODING_B, eokg.a, "C", eyggVar, "D", eyggVar, "E", eoob.a, "F", eqju.a, "G"});
        }
        if (ordinal == 3) {
            return new eokw();
        }
        if (ordinal == 4) {
            return new eokv();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = H;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (eokw.class) {
            eyhzVar = H;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                H = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
