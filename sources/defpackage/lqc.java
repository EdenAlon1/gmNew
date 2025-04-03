package defpackage;

import android.text.TextUtils;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lqc {
    public static final /* synthetic */ int N = 0;
    public final byte[] A;
    public final int B;
    public final lpo C;
    public final int D;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
    public final int K;
    public final int L;
    public final int M;
    private int O;
    public final String a;
    public final String b;
    public final List c;
    public final String d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final String k;
    public final lrb l;
    public final Object m;
    public final String n;
    public final String o;
    public final int p;
    public final int q;
    public final List r;
    public final lpw s;
    public final long t;
    public final boolean u;
    public final int v;
    public final int w;
    public final float x;
    public final int y;
    public final float z;

    static {
        new lqc(new lqb());
        lvf.N(0);
        lvf.N(1);
        lvf.N(2);
        lvf.N(3);
        lvf.N(4);
        lvf.N(5);
        lvf.N(6);
        lvf.N(7);
        lvf.N(8);
        lvf.N(9);
        lvf.N(10);
        lvf.N(11);
        lvf.N(12);
        lvf.N(13);
        lvf.N(14);
        lvf.N(15);
        lvf.N(16);
        lvf.N(17);
        lvf.N(18);
        lvf.N(19);
        lvf.N(20);
        lvf.N(21);
        lvf.N(22);
        lvf.N(23);
        lvf.N(24);
        lvf.N(25);
        lvf.N(26);
        lvf.N(27);
        lvf.N(28);
        lvf.N(29);
        lvf.N(30);
        lvf.N(31);
        lvf.N(32);
        lvf.N(33);
        lvf.N(34);
    }

    public lqc(lqb lqbVar) {
        boolean z;
        String str;
        this.a = lqbVar.a;
        String P = lvf.P(lqbVar.d);
        this.d = P;
        if (lqbVar.c.isEmpty() && lqbVar.b != null) {
            this.c = engw.r(new lqj(P, lqbVar.b));
            this.b = lqbVar.b;
        } else if (lqbVar.c.isEmpty() || lqbVar.b != null) {
            if (!lqbVar.c.isEmpty() || lqbVar.b != null) {
                for (int i = 0; i < lqbVar.c.size(); i++) {
                    if (!((lqj) lqbVar.c.get(i)).b.equals(lqbVar.b)) {
                    }
                }
                z = false;
                lti.c(z);
                this.c = lqbVar.c;
                this.b = lqbVar.b;
            }
            z = true;
            lti.c(z);
            this.c = lqbVar.c;
            this.b = lqbVar.b;
        } else {
            this.c = lqbVar.c;
            List list = lqbVar.c;
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = ((lqj) list.get(0)).b;
                    break;
                }
                lqj lqjVar = (lqj) it.next();
                if (TextUtils.equals(lqjVar.a, P)) {
                    str = lqjVar.b;
                    break;
                }
            }
            this.b = str;
        }
        this.e = lqbVar.e;
        lti.d(lqbVar.g == 0 || (lqbVar.f & 32768) != 0, "Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set");
        this.f = lqbVar.f;
        this.g = lqbVar.g;
        int i2 = lqbVar.h;
        this.h = i2;
        int i3 = lqbVar.i;
        this.i = i3;
        this.j = i3 != -1 ? i3 : i2;
        this.k = lqbVar.j;
        this.l = lqbVar.k;
        this.m = null;
        this.n = lqbVar.l;
        this.o = lqbVar.m;
        this.p = lqbVar.n;
        this.q = lqbVar.o;
        List list2 = lqbVar.p;
        this.r = list2 == null ? Collections.EMPTY_LIST : list2;
        lpw lpwVar = lqbVar.q;
        this.s = lpwVar;
        this.t = lqbVar.r;
        this.u = lqbVar.s;
        this.v = lqbVar.t;
        this.w = lqbVar.u;
        this.x = lqbVar.v;
        int i4 = lqbVar.w;
        this.y = i4 == -1 ? 0 : i4;
        float f = lqbVar.x;
        this.z = f == -1.0f ? 1.0f : f;
        this.A = lqbVar.y;
        this.B = lqbVar.z;
        this.C = lqbVar.A;
        this.D = lqbVar.B;
        this.E = lqbVar.C;
        this.F = lqbVar.D;
        this.G = lqbVar.E;
        int i5 = lqbVar.F;
        this.H = i5 == -1 ? 0 : i5;
        int i6 = lqbVar.G;
        this.I = i6 != -1 ? i6 : 0;
        this.J = lqbVar.H;
        this.K = lqbVar.I;
        this.L = -1;
        int i7 = lqbVar.J;
        this.M = (i7 != 0 || lpwVar == null) ? i7 : 1;
    }

    public static String c(lqc lqcVar) {
        String str;
        String str2;
        if (lqcVar == null) {
            return "null";
        }
        emww d = emww.d(',');
        StringBuilder sb = new StringBuilder();
        sb.append("id=");
        sb.append(lqcVar.a);
        sb.append(", mimeType=");
        sb.append(lqcVar.o);
        if (lqcVar.n != null) {
            sb.append(", container=");
            sb.append(lqcVar.n);
        }
        if (lqcVar.j != -1) {
            sb.append(", bitrate=");
            sb.append(lqcVar.j);
        }
        if (lqcVar.k != null) {
            sb.append(", codecs=");
            sb.append(lqcVar.k);
        }
        if (lqcVar.s != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i = 0;
            while (true) {
                lpw lpwVar = lqcVar.s;
                if (i >= lpwVar.b) {
                    break;
                }
                UUID uuid = lpwVar.a(i).a;
                if (uuid.equals(lpn.b)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(lpn.c)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(lpn.e)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(lpn.d)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(lpn.a)) {
                    linkedHashSet.add("universal");
                } else {
                    linkedHashSet.add(a.b(uuid, "unknown (", ")"));
                }
                i++;
            }
            sb.append(", drm=[");
            d.i(sb, linkedHashSet);
            sb.append(']');
        }
        if (lqcVar.v != -1 && lqcVar.w != -1) {
            sb.append(", res=");
            sb.append(lqcVar.v);
            sb.append("x");
            sb.append(lqcVar.w);
        }
        if (!erkx.b(lqcVar.z, 1.0d, 0.001d)) {
            sb.append(", par=");
            sb.append(lvf.G("%.3f", Float.valueOf(lqcVar.z)));
        }
        lpo lpoVar = lqcVar.C;
        if (lpoVar != null && (lpoVar.f() || lpoVar.g())) {
            sb.append(", color=");
            lpo lpoVar2 = lqcVar.C;
            String G = lpoVar2.g() ? lvf.G("%s/%s/%s", lpo.d(lpoVar2.c), lpo.c(lpoVar2.d), lpo.e(lpoVar2.e)) : "NA/NA/NA";
            if (lpoVar2.f()) {
                str2 = lpoVar2.g + "/" + lpoVar2.h;
            } else {
                str2 = "NA/NA";
            }
            sb.append(a.w(str2, G, "/"));
        }
        if (lqcVar.x != -1.0f) {
            sb.append(", fps=");
            sb.append(lqcVar.x);
        }
        if (lqcVar.D != -1) {
            sb.append(", maxSubLayers=");
            sb.append(lqcVar.D);
        }
        if (lqcVar.E != -1) {
            sb.append(", channels=");
            sb.append(lqcVar.E);
        }
        if (lqcVar.F != -1) {
            sb.append(", sample_rate=");
            sb.append(lqcVar.F);
        }
        if (lqcVar.d != null) {
            sb.append(", language=");
            sb.append(lqcVar.d);
        }
        if (!lqcVar.c.isEmpty()) {
            sb.append(", labels=[");
            d.i(sb, enkr.g(lqcVar.c, new emwl() { // from class: lqa
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    lqj lqjVar = (lqj) obj;
                    int i2 = lqc.N;
                    return lqjVar.a + ": " + lqjVar.b;
                }
            }));
            sb.append("]");
        }
        if (lqcVar.e != 0) {
            sb.append(", selectionFlags=[");
            int i2 = lqcVar.e;
            int i3 = lvf.a;
            ArrayList arrayList = new ArrayList();
            if ((i2 & 1) != 0) {
                arrayList.add("default");
            }
            if ((i2 & 2) != 0) {
                arrayList.add("forced");
            }
            d.i(sb, arrayList);
            sb.append("]");
        }
        if (lqcVar.f != 0) {
            sb.append(", roleFlags=[");
            int i4 = lqcVar.f;
            int i5 = lvf.a;
            ArrayList arrayList2 = new ArrayList();
            if ((i4 & 1) != 0) {
                arrayList2.add("main");
            }
            if ((i4 & 2) != 0) {
                arrayList2.add("alt");
            }
            if ((i4 & 4) != 0) {
                arrayList2.add("supplementary");
            }
            if ((i4 & 8) != 0) {
                arrayList2.add("commentary");
            }
            if ((i4 & 16) != 0) {
                arrayList2.add("dub");
            }
            if ((i4 & 32) != 0) {
                arrayList2.add("emergency");
            }
            if ((i4 & 64) != 0) {
                arrayList2.add("caption");
            }
            if ((i4 & 128) != 0) {
                arrayList2.add("subtitle");
            }
            if ((i4 & 256) != 0) {
                arrayList2.add("sign");
            }
            if ((i4 & 512) != 0) {
                arrayList2.add("describes-video");
            }
            if ((i4 & 1024) != 0) {
                arrayList2.add("describes-music");
            }
            if ((i4 & 2048) != 0) {
                arrayList2.add("enhanced-intelligibility");
            }
            if ((i4 & 4096) != 0) {
                arrayList2.add("transcribes-dialog");
            }
            if ((i4 & 8192) != 0) {
                arrayList2.add("easy-read");
            }
            if ((i4 & 16384) != 0) {
                arrayList2.add("trick-play");
            }
            if ((i4 & 32768) != 0) {
                arrayList2.add("auxiliary");
            }
            d.i(sb, arrayList2);
            sb.append("]");
        }
        if ((lqcVar.f & 32768) != 0) {
            sb.append(", auxiliaryTrackType=");
            int i6 = lqcVar.g;
            int i7 = lvf.a;
            if (i6 == 0) {
                str = "undefined";
            } else if (i6 == 1) {
                str = "original";
            } else if (i6 == 2) {
                str = "depth-linear";
            } else if (i6 == 3) {
                str = "depth-inverse";
            } else {
                if (i6 != 4) {
                    throw new IllegalStateException("Unsupported auxiliary track type");
                }
                str = "depth metadata";
            }
            sb.append(str);
        }
        return sb.toString();
    }

    public final int a() {
        int i;
        int i2 = this.v;
        if (i2 == -1 || (i = this.w) == -1) {
            return -1;
        }
        return i2 * i;
    }

    public final lqc b(int i) {
        lqb lqbVar = new lqb(this);
        lqbVar.J = i;
        return new lqc(lqbVar);
    }

    public final boolean d(lqc lqcVar) {
        if (this.r.size() != lqcVar.r.size()) {
            return false;
        }
        for (int i = 0; i < this.r.size(); i++) {
            if (!Arrays.equals((byte[]) this.r.get(i), (byte[]) lqcVar.r.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            lqc lqcVar = (lqc) obj;
            int i2 = this.O;
            if ((i2 == 0 || (i = lqcVar.O) == 0 || i2 == i) && this.e == lqcVar.e && this.f == lqcVar.f && this.g == lqcVar.g && this.h == lqcVar.h && this.i == lqcVar.i && this.p == lqcVar.p && this.t == lqcVar.t && this.v == lqcVar.v && this.w == lqcVar.w && this.y == lqcVar.y && this.B == lqcVar.B && this.D == lqcVar.D && this.E == lqcVar.E && this.F == lqcVar.F && this.G == lqcVar.G && this.H == lqcVar.H && this.I == lqcVar.I && this.J == lqcVar.J && this.M == lqcVar.M && Float.compare(this.x, lqcVar.x) == 0 && Float.compare(this.z, lqcVar.z) == 0 && Objects.equals(this.a, lqcVar.a) && Objects.equals(this.b, lqcVar.b) && this.c.equals(lqcVar.c) && Objects.equals(this.k, lqcVar.k) && Objects.equals(this.n, lqcVar.n) && Objects.equals(this.o, lqcVar.o) && Objects.equals(this.d, lqcVar.d) && Arrays.equals(this.A, lqcVar.A) && Objects.equals(this.l, lqcVar.l) && Objects.equals(this.C, lqcVar.C) && Objects.equals(this.s, lqcVar.s) && d(lqcVar) && Objects.equals(null, null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.O;
        if (i != 0) {
            return i;
        }
        String str = this.a;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.b;
        int hashCode2 = ((((hashCode + 527) * 31) + (str2 == null ? 0 : str2.hashCode())) * 31) + this.c.hashCode();
        String str3 = this.d;
        int hashCode3 = ((((((((((((hashCode2 * 31) + (str3 == null ? 0 : str3.hashCode())) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31) + this.i) * 31;
        String str4 = this.k;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        lrb lrbVar = this.l;
        int hashCode5 = hashCode4 + (lrbVar == null ? 0 : lrbVar.hashCode());
        String str5 = this.n;
        int hashCode6 = ((hashCode5 * 961) + (str5 == null ? 0 : str5.hashCode())) * 31;
        int hashCode7 = ((((((((((((((((((((((((((((((((((((hashCode6 + (this.o != null ? r2.hashCode() : 0)) * 31) + this.p) * 31) + ((int) this.t)) * 31) + this.v) * 31) + this.w) * 31) + Float.floatToIntBits(this.x)) * 31) + this.y) * 31) + Float.floatToIntBits(this.z)) * 31) + this.B) * 31) + this.D) * 31) + this.E) * 31) + this.F) * 31) + this.G) * 31) + this.H) * 31) + this.I) * 31) + this.J) * 31) - 1) * 31) - 1) * 31) + this.M;
        this.O = hashCode7;
        return hashCode7;
    }

    public final String toString() {
        return "Format(" + this.a + ", " + this.b + ", " + this.n + ", " + this.o + ", " + this.k + ", " + this.j + ", " + this.d + ", [" + this.v + ", " + this.w + ", " + this.x + ", " + String.valueOf(this.C) + "], [" + this.E + ", " + this.F + "])";
    }
}
