package defpackage;

import android.net.Uri;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class edlt extends edpv {
    public List A;
    public List B;
    public edqf C;
    public Integer D;
    public String E;
    public String F;
    public String G;
    public Double H;
    public List I;
    public List J;
    public List K;
    public Integer L;
    public Integer M;
    public Integer N;
    public LatLngBounds O;
    public Uri P;
    public Uri Q;
    public edmh R;
    public edpm S;
    public edpo T;
    public edos U;
    public List V;
    public edow W;
    private edpu X;
    private edpu Y;
    private edpu Z;
    public String a;
    private edpu aa;
    private edpu ab;
    private edpu ac;
    private edpu ad;
    private edpu ae;
    private edpu af;
    private edpu ag;
    private edpu ah;
    private edpu ai;
    private edpu aj;
    private edpu ak;
    private edpu al;
    private edpu am;
    private edpu an;
    private edpu ao;
    private edpu ap;
    private edpu aq;
    private edpu ar;
    private edpu as;
    private edpu at;
    private edpu au;
    public String b;
    public String c;
    public String d;
    public edmk e;
    public List f;
    public edpx g;
    public edpi h;
    public String i;
    public String j;
    public Integer k;
    public String l;
    public String m;
    public String n;
    public LatLng o;
    public LatLng p;
    public String q;
    public String r;
    public String s;
    public String t;
    public String u;
    public edpi v;
    public String w;
    public String x;
    public String y;
    public List z;

    @Override // defpackage.edpv
    public final void A(edpu edpuVar) {
        if (edpuVar == null) {
            throw new NullPointerException("Null servesVegetarianFood");
        }
        this.ag = edpuVar;
    }

    @Override // defpackage.edpv
    public final void B(edpu edpuVar) {
        if (edpuVar == null) {
            throw new NullPointerException("Null servesWine");
        }
        this.ah = edpuVar;
    }

    @Override // defpackage.edpv
    public final void C(edpu edpuVar) {
        if (edpuVar == null) {
            throw new NullPointerException("Null takeout");
        }
        this.ai = edpuVar;
    }

    @Override // defpackage.edpv
    public final void D(List list) {
        this.K = list;
    }

    @Override // defpackage.edpv
    public final void E(edpu edpuVar) {
        if (edpuVar == null) {
            throw new NullPointerException("Null wheelchairAccessibleEntrance");
        }
        this.aj = edpuVar;
    }

    @Override // defpackage.edpv
    public final edqc a() {
        edpu edpuVar;
        edpu edpuVar2;
        edpu edpuVar3;
        edpu edpuVar4;
        edpu edpuVar5;
        edpu edpuVar6;
        edpu edpuVar7;
        edpu edpuVar8;
        edpu edpuVar9;
        edpu edpuVar10;
        edpu edpuVar11;
        edpu edpuVar12;
        edpu edpuVar13;
        edpu edpuVar14;
        edpu edpuVar15;
        edpu edpuVar16;
        edpu edpuVar17;
        edpu edpuVar18;
        edpu edpuVar19;
        edpu edpuVar20;
        edpu edpuVar21;
        edpu edpuVar22;
        edpu edpuVar23;
        edpu edpuVar24 = this.X;
        if (edpuVar24 != null && (edpuVar = this.Y) != null && (edpuVar2 = this.Z) != null && (edpuVar3 = this.aa) != null && (edpuVar4 = this.ab) != null && (edpuVar5 = this.ac) != null && (edpuVar6 = this.ad) != null && (edpuVar7 = this.ae) != null && (edpuVar8 = this.af) != null && (edpuVar9 = this.ag) != null && (edpuVar10 = this.ah) != null && (edpuVar11 = this.ai) != null && (edpuVar12 = this.aj) != null && (edpuVar13 = this.ak) != null && (edpuVar14 = this.al) != null && (edpuVar15 = this.am) != null && (edpuVar16 = this.an) != null && (edpuVar17 = this.ao) != null && (edpuVar18 = this.ap) != null && (edpuVar19 = this.aq) != null && (edpuVar20 = this.ar) != null && (edpuVar21 = this.as) != null && (edpuVar22 = this.at) != null && (edpuVar23 = this.au) != null) {
            return new ednz(this.a, this.b, this.c, this.d, this.e, this.f, this.g, edpuVar24, this.h, edpuVar, edpuVar2, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, edpuVar3, this.I, this.J, edpuVar4, edpuVar5, edpuVar6, edpuVar7, edpuVar8, edpuVar9, edpuVar10, edpuVar11, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, edpuVar12, this.R, this.S, this.T, this.U, edpuVar13, edpuVar14, edpuVar15, edpuVar16, edpuVar17, edpuVar18, edpuVar19, edpuVar20, edpuVar21, edpuVar22, edpuVar23, this.V, this.W);
        }
        StringBuilder sb = new StringBuilder();
        if (this.X == null) {
            sb.append(" curbsidePickup");
        }
        if (this.Y == null) {
            sb.append(" delivery");
        }
        if (this.Z == null) {
            sb.append(" dineIn");
        }
        if (this.aa == null) {
            sb.append(" reservable");
        }
        if (this.ab == null) {
            sb.append(" servesBeer");
        }
        if (this.ac == null) {
            sb.append(" servesBreakfast");
        }
        if (this.ad == null) {
            sb.append(" servesBrunch");
        }
        if (this.ae == null) {
            sb.append(" servesDinner");
        }
        if (this.af == null) {
            sb.append(" servesLunch");
        }
        if (this.ag == null) {
            sb.append(" servesVegetarianFood");
        }
        if (this.ah == null) {
            sb.append(" servesWine");
        }
        if (this.ai == null) {
            sb.append(" takeout");
        }
        if (this.aj == null) {
            sb.append(" wheelchairAccessibleEntrance");
        }
        if (this.ak == null) {
            sb.append(" outdoorSeating");
        }
        if (this.al == null) {
            sb.append(" liveMusic");
        }
        if (this.am == null) {
            sb.append(" menuForChildren");
        }
        if (this.an == null) {
            sb.append(" servesCocktails");
        }
        if (this.ao == null) {
            sb.append(" servesDessert");
        }
        if (this.ap == null) {
            sb.append(" servesCoffee");
        }
        if (this.aq == null) {
            sb.append(" goodForChildren");
        }
        if (this.ar == null) {
            sb.append(" allowsDogs");
        }
        if (this.as == null) {
            sb.append(" restroom");
        }
        if (this.at == null) {
            sb.append(" goodForGroups");
        }
        if (this.au == null) {
            sb.append(" goodForWatchingSports");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.edpv
    public final void b(edpu edpuVar) {
        if (edpuVar == null) {
            throw new NullPointerException("Null allowsDogs");
        }
        this.ar = edpuVar;
    }

    @Override // defpackage.edpv
    public final void c(List list) {
        this.f = list;
    }

    @Override // defpackage.edpv
    public final void d(edpu edpuVar) {
        if (edpuVar == null) {
            throw new NullPointerException("Null curbsidePickup");
        }
        this.X = edpuVar;
    }

    @Override // defpackage.edpv
    public final void e(edpu edpuVar) {
        if (edpuVar == null) {
            throw new NullPointerException("Null delivery");
        }
        this.Y = edpuVar;
    }

    @Override // defpackage.edpv
    public final void f(edpu edpuVar) {
        if (edpuVar == null) {
            throw new NullPointerException("Null dineIn");
        }
        this.Z = edpuVar;
    }

    @Override // defpackage.edpv
    public final void g(edpu edpuVar) {
        if (edpuVar == null) {
            throw new NullPointerException("Null goodForChildren");
        }
        this.aq = edpuVar;
    }

    @Override // defpackage.edpv
    public final void h(edpu edpuVar) {
        if (edpuVar == null) {
            throw new NullPointerException("Null goodForGroups");
        }
        this.at = edpuVar;
    }

    @Override // defpackage.edpv
    public final void i(edpu edpuVar) {
        if (edpuVar == null) {
            throw new NullPointerException("Null goodForWatchingSports");
        }
        this.au = edpuVar;
    }

    @Override // defpackage.edpv
    public final void j(edpu edpuVar) {
        if (edpuVar == null) {
            throw new NullPointerException("Null liveMusic");
        }
        this.al = edpuVar;
    }

    @Override // defpackage.edpv
    public final void k(edpu edpuVar) {
        if (edpuVar == null) {
            throw new NullPointerException("Null menuForChildren");
        }
        this.am = edpuVar;
    }

    @Override // defpackage.edpv
    public final void l(edpu edpuVar) {
        if (edpuVar == null) {
            throw new NullPointerException("Null outdoorSeating");
        }
        this.ak = edpuVar;
    }

    @Override // defpackage.edpv
    public final void m(List list) {
        this.z = list;
    }

    @Override // defpackage.edpv
    public final void n(List list) {
        this.B = list;
    }

    @Override // defpackage.edpv
    public final void o(edpu edpuVar) {
        if (edpuVar == null) {
            throw new NullPointerException("Null reservable");
        }
        this.aa = edpuVar;
    }

    @Override // defpackage.edpv
    public final void p(edpu edpuVar) {
        if (edpuVar == null) {
            throw new NullPointerException("Null restroom");
        }
        this.as = edpuVar;
    }

    @Override // defpackage.edpv
    public final void q(List list) {
        this.A = list;
    }

    @Override // defpackage.edpv
    public final void r(List list) {
        this.I = list;
    }

    @Override // defpackage.edpv
    public final void s(edpu edpuVar) {
        if (edpuVar == null) {
            throw new NullPointerException("Null servesBeer");
        }
        this.ab = edpuVar;
    }

    @Override // defpackage.edpv
    public final void t(edpu edpuVar) {
        if (edpuVar == null) {
            throw new NullPointerException("Null servesBreakfast");
        }
        this.ac = edpuVar;
    }

    @Override // defpackage.edpv
    public final void u(edpu edpuVar) {
        if (edpuVar == null) {
            throw new NullPointerException("Null servesBrunch");
        }
        this.ad = edpuVar;
    }

    @Override // defpackage.edpv
    public final void v(edpu edpuVar) {
        if (edpuVar == null) {
            throw new NullPointerException("Null servesCocktails");
        }
        this.an = edpuVar;
    }

    @Override // defpackage.edpv
    public final void w(edpu edpuVar) {
        if (edpuVar == null) {
            throw new NullPointerException("Null servesCoffee");
        }
        this.ap = edpuVar;
    }

    @Override // defpackage.edpv
    public final void x(edpu edpuVar) {
        if (edpuVar == null) {
            throw new NullPointerException("Null servesDessert");
        }
        this.ao = edpuVar;
    }

    @Override // defpackage.edpv
    public final void y(edpu edpuVar) {
        if (edpuVar == null) {
            throw new NullPointerException("Null servesDinner");
        }
        this.ae = edpuVar;
    }

    @Override // defpackage.edpv
    public final void z(edpu edpuVar) {
        if (edpuVar == null) {
            throw new NullPointerException("Null servesLunch");
        }
        this.af = edpuVar;
    }
}
