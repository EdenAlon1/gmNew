package defpackage;

import com.android.vcard.VCardConstants;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eotr extends eyfy implements eyht {
    private static volatile eyhz R;
    public static final eotr a;
    public float A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public int L;
    public int M;
    public boolean N;
    public int O;
    public boolean P;
    public boolean Q;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public String k = "";
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public int z;

    static {
        eotr eotrVar = new eotr();
        a = eotrVar;
        eyfy.registerDefaultInstance(eotr.class, eotrVar);
    }

    private eotr() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001(\u0000\u0002\u0001*(\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bဈ\u0007\tဇ\b\nဇ\u0019\u000bဇ\t\fဇ\n\rဇ\u000b\u000eဇ\f\u000fဇ\r\u0010ဇ\u000e\u0011ဇ\u000f\u0012ဇ\u0010\u0013ဇ\u0011\u0014ဇ\u0012\u0015ဇ\u0013\u0016ဇ\u0014\u0017ဇ\u001a\u0018ဇ\u001b\u001aဇ\u0016\u001b᠌\u0017\u001cခ\u0018\u001dဇ!\u001eဇ\"\u001fဇ# ᠌$!᠌%\"ဇ&#᠌'$ဇ\u001c&ဇ\u001e'ဇ\u001f(ဇ )ဇ(*ဇ)", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", VCardConstants.PARAM_ENCODING_B, "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "C", "D", "y", "z", eotq.a, "A", "I", "J", "K", "L", eoto.a, "M", eotp.a, VCardConstants.PROPERTY_N, "O", eqbv.a, "E", "F", "G", "H", "P", "Q"});
        }
        if (ordinal == 3) {
            return new eotr();
        }
        if (ordinal == 4) {
            return new eotn();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = R;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (eotr.class) {
            eyhzVar = R;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                R = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
