package defpackage;

import android.net.Uri;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class edlu extends edqc {
    public final String A;
    public final String B;
    public final List C;
    public final List D;
    public final List E;
    public final edqf F;
    public final Integer G;
    public final String H;
    public final String I;
    public final String J;
    public final Double K;
    public final edpu L;
    public final List M;
    public final List N;
    public final edpu O;
    public final edpu P;
    public final edpu Q;
    public final edpu R;
    public final edpu S;
    public final edpu T;
    public final edpu U;
    public final edpu V;
    public final List W;
    public final Integer X;
    public final Integer Y;
    public final Integer Z;
    public final String a;
    public final LatLngBounds aa;
    public final Uri ab;
    public final Uri ac;
    public final edpu ad;
    public final edmh ae;
    public final edpm af;
    public final edpo ag;
    public final edos ah;
    public final edpu ai;
    public final edpu aj;
    public final edpu ak;
    public final edpu al;
    public final edpu am;
    public final edpu an;
    public final edpu ao;
    public final edpu ap;
    public final edpu aq;
    public final edpu ar;
    public final edpu as;
    public final List at;
    public final edow au;
    public final String b;
    public final String c;
    public final String d;
    public final edmk e;
    public final List f;
    public final edpx g;
    public final edpu h;
    public final edpi i;
    public final edpu j;
    public final edpu k;
    public final String l;
    public final String m;
    public final Integer n;
    public final String o;
    public final String p;
    public final String q;
    public final LatLng r;
    public final LatLng s;
    public final String t;
    public final String u;
    public final String v;
    public final String w;
    public final String x;
    public final edpi y;
    public final String z;

    public edlu(String str, String str2, String str3, String str4, edmk edmkVar, List list, edpx edpxVar, edpu edpuVar, edpi edpiVar, edpu edpuVar2, edpu edpuVar3, String str5, String str6, Integer num, String str7, String str8, String str9, LatLng latLng, LatLng latLng2, String str10, String str11, String str12, String str13, String str14, edpi edpiVar2, String str15, String str16, String str17, List list2, List list3, List list4, edqf edqfVar, Integer num2, String str18, String str19, String str20, Double d, edpu edpuVar4, List list5, List list6, edpu edpuVar5, edpu edpuVar6, edpu edpuVar7, edpu edpuVar8, edpu edpuVar9, edpu edpuVar10, edpu edpuVar11, edpu edpuVar12, List list7, Integer num3, Integer num4, Integer num5, LatLngBounds latLngBounds, Uri uri, Uri uri2, edpu edpuVar13, edmh edmhVar, edpm edpmVar, edpo edpoVar, edos edosVar, edpu edpuVar14, edpu edpuVar15, edpu edpuVar16, edpu edpuVar17, edpu edpuVar18, edpu edpuVar19, edpu edpuVar20, edpu edpuVar21, edpu edpuVar22, edpu edpuVar23, edpu edpuVar24, List list8, edow edowVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = edmkVar;
        this.f = list;
        this.g = edpxVar;
        if (edpuVar == null) {
            throw new NullPointerException("Null curbsidePickup");
        }
        this.h = edpuVar;
        this.i = edpiVar;
        if (edpuVar2 == null) {
            throw new NullPointerException("Null delivery");
        }
        this.j = edpuVar2;
        if (edpuVar3 == null) {
            throw new NullPointerException("Null dineIn");
        }
        this.k = edpuVar3;
        this.l = str5;
        this.m = str6;
        this.n = num;
        this.o = str7;
        this.p = str8;
        this.q = str9;
        this.r = latLng;
        this.s = latLng2;
        this.t = str10;
        this.u = str11;
        this.v = str12;
        this.w = str13;
        this.x = str14;
        this.y = edpiVar2;
        this.z = str15;
        this.A = str16;
        this.B = str17;
        this.C = list2;
        this.D = list3;
        this.E = list4;
        this.F = edqfVar;
        this.G = num2;
        this.H = str18;
        this.I = str19;
        this.J = str20;
        this.K = d;
        if (edpuVar4 == null) {
            throw new NullPointerException("Null reservable");
        }
        this.L = edpuVar4;
        this.M = list5;
        this.N = list6;
        if (edpuVar5 == null) {
            throw new NullPointerException("Null servesBeer");
        }
        this.O = edpuVar5;
        if (edpuVar6 == null) {
            throw new NullPointerException("Null servesBreakfast");
        }
        this.P = edpuVar6;
        if (edpuVar7 == null) {
            throw new NullPointerException("Null servesBrunch");
        }
        this.Q = edpuVar7;
        if (edpuVar8 == null) {
            throw new NullPointerException("Null servesDinner");
        }
        this.R = edpuVar8;
        if (edpuVar9 == null) {
            throw new NullPointerException("Null servesLunch");
        }
        this.S = edpuVar9;
        if (edpuVar10 == null) {
            throw new NullPointerException("Null servesVegetarianFood");
        }
        this.T = edpuVar10;
        if (edpuVar11 == null) {
            throw new NullPointerException("Null servesWine");
        }
        this.U = edpuVar11;
        if (edpuVar12 == null) {
            throw new NullPointerException("Null takeout");
        }
        this.V = edpuVar12;
        this.W = list7;
        this.X = num3;
        this.Y = num4;
        this.Z = num5;
        this.aa = latLngBounds;
        this.ab = uri;
        this.ac = uri2;
        if (edpuVar13 == null) {
            throw new NullPointerException("Null wheelchairAccessibleEntrance");
        }
        this.ad = edpuVar13;
        this.ae = edmhVar;
        this.af = edpmVar;
        this.ag = edpoVar;
        this.ah = edosVar;
        if (edpuVar14 == null) {
            throw new NullPointerException("Null outdoorSeating");
        }
        this.ai = edpuVar14;
        if (edpuVar15 == null) {
            throw new NullPointerException("Null liveMusic");
        }
        this.aj = edpuVar15;
        if (edpuVar16 == null) {
            throw new NullPointerException("Null menuForChildren");
        }
        this.ak = edpuVar16;
        if (edpuVar17 == null) {
            throw new NullPointerException("Null servesCocktails");
        }
        this.al = edpuVar17;
        if (edpuVar18 == null) {
            throw new NullPointerException("Null servesDessert");
        }
        this.am = edpuVar18;
        if (edpuVar19 == null) {
            throw new NullPointerException("Null servesCoffee");
        }
        this.an = edpuVar19;
        if (edpuVar20 == null) {
            throw new NullPointerException("Null goodForChildren");
        }
        this.ao = edpuVar20;
        if (edpuVar21 == null) {
            throw new NullPointerException("Null allowsDogs");
        }
        this.ap = edpuVar21;
        if (edpuVar22 == null) {
            throw new NullPointerException("Null restroom");
        }
        this.aq = edpuVar22;
        if (edpuVar23 == null) {
            throw new NullPointerException("Null goodForGroups");
        }
        this.ar = edpuVar23;
        if (edpuVar24 == null) {
            throw new NullPointerException("Null goodForWatchingSports");
        }
        this.as = edpuVar24;
        this.at = list8;
        this.au = edowVar;
    }

    @Override // defpackage.edqc
    public final edpu A() {
        return this.P;
    }

    @Override // defpackage.edqc
    public final edpu B() {
        return this.Q;
    }

    @Override // defpackage.edqc
    public final edpu C() {
        return this.al;
    }

    @Override // defpackage.edqc
    public final edpu D() {
        return this.an;
    }

    @Override // defpackage.edqc
    public final edpu E() {
        return this.am;
    }

    @Override // defpackage.edqc
    public final edpu F() {
        return this.R;
    }

    @Override // defpackage.edqc
    public final edpu G() {
        return this.S;
    }

    @Override // defpackage.edqc
    public final edpu H() {
        return this.T;
    }

    @Override // defpackage.edqc
    public final edpu I() {
        return this.U;
    }

    @Override // defpackage.edqc
    public final edpu J() {
        return this.V;
    }

    @Override // defpackage.edqc
    @Deprecated
    public final edpu K() {
        return this.ad;
    }

    @Override // defpackage.edqc
    public final edpx L() {
        return this.g;
    }

    @Override // defpackage.edqc
    public final edqf M() {
        return this.F;
    }

    @Override // defpackage.edqc
    public final Double N() {
        return this.K;
    }

    @Override // defpackage.edqc
    public final Integer O() {
        return this.n;
    }

    @Override // defpackage.edqc
    public final Integer P() {
        return this.G;
    }

    @Override // defpackage.edqc
    public final Integer Q() {
        return this.Y;
    }

    @Override // defpackage.edqc
    @Deprecated
    public final Integer R() {
        return this.X;
    }

    @Override // defpackage.edqc
    public final Integer S() {
        return this.Z;
    }

    @Override // defpackage.edqc
    @Deprecated
    public final String T() {
        return this.a;
    }

    @Override // defpackage.edqc
    public final String U() {
        return this.d;
    }

    @Override // defpackage.edqc
    public final String V() {
        return this.u;
    }

    @Override // defpackage.edqc
    public final String W() {
        return this.w;
    }

    @Override // defpackage.edqc
    public final String X() {
        return this.l;
    }

    @Override // defpackage.edqc
    public final String Y() {
        return this.m;
    }

    @Override // defpackage.edqc
    public final String Z() {
        return this.b;
    }

    @Override // defpackage.edqc
    public final Uri a() {
        return this.ac;
    }

    @Override // defpackage.edqc
    public final String aa() {
        return this.p;
    }

    @Override // defpackage.edqc
    @Deprecated
    public final String ab() {
        return this.o;
    }

    @Override // defpackage.edqc
    public final String ac() {
        return this.q;
    }

    @Override // defpackage.edqc
    public final String ad() {
        return this.A;
    }

    @Override // defpackage.edqc
    @Deprecated
    public final String ae() {
        return this.t;
    }

    @Override // defpackage.edqc
    @Deprecated
    public final String af() {
        return this.v;
    }

    @Override // defpackage.edqc
    public final String ag() {
        return this.B;
    }

    @Override // defpackage.edqc
    @Deprecated
    public final String ah() {
        return this.z;
    }

    @Override // defpackage.edqc
    public final String ai() {
        return this.H;
    }

    @Override // defpackage.edqc
    public final String aj() {
        return this.I;
    }

    @Override // defpackage.edqc
    public final String ak() {
        return this.J;
    }

    @Override // defpackage.edqc
    public final String al() {
        return this.x;
    }

    @Override // defpackage.edqc
    public final String am() {
        return this.c;
    }

    @Override // defpackage.edqc
    public final List an() {
        return this.f;
    }

    @Override // defpackage.edqc
    public final List ao() {
        return this.N;
    }

    @Override // defpackage.edqc
    public final List ap() {
        return this.C;
    }

    @Override // defpackage.edqc
    public final List aq() {
        return this.E;
    }

    @Override // defpackage.edqc
    public final List ar() {
        return this.D;
    }

    @Override // defpackage.edqc
    public final List as() {
        return this.M;
    }

    @Override // defpackage.edqc
    public final List at() {
        return this.at;
    }

    @Override // defpackage.edqc
    @Deprecated
    public final List au() {
        return this.W;
    }

    @Override // defpackage.edqc
    public final Uri b() {
        return this.ab;
    }

    @Override // defpackage.edqc
    @Deprecated
    public final LatLng c() {
        return this.r;
    }

    @Override // defpackage.edqc
    public final LatLng d() {
        return this.s;
    }

    @Override // defpackage.edqc
    public final LatLngBounds e() {
        return this.aa;
    }

    public final boolean equals(Object obj) {
        edpi edpiVar;
        String str;
        String str2;
        Integer num;
        String str3;
        String str4;
        String str5;
        LatLng latLng;
        LatLng latLng2;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        edpi edpiVar2;
        String str11;
        String str12;
        String str13;
        List list;
        List list2;
        List list3;
        edqf edqfVar;
        Integer num2;
        String str14;
        String str15;
        String str16;
        Double d;
        List list4;
        List list5;
        List list6;
        Integer num3;
        Integer num4;
        Integer num5;
        LatLngBounds latLngBounds;
        Uri uri;
        Uri uri2;
        edmh edmhVar;
        edpm edpmVar;
        edpo edpoVar;
        edos edosVar;
        List list7;
        edow edowVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof edqc) {
            edqc edqcVar = (edqc) obj;
            String str17 = this.a;
            if (str17 != null ? str17.equals(edqcVar.T()) : edqcVar.T() == null) {
                String str18 = this.b;
                if (str18 != null ? str18.equals(edqcVar.Z()) : edqcVar.Z() == null) {
                    String str19 = this.c;
                    if (str19 != null ? str19.equals(edqcVar.am()) : edqcVar.am() == null) {
                        String str20 = this.d;
                        if (str20 != null ? str20.equals(edqcVar.U()) : edqcVar.U() == null) {
                            edmk edmkVar = this.e;
                            if (edmkVar != null ? edmkVar.equals(edqcVar.g()) : edqcVar.g() == null) {
                                List list8 = this.f;
                                if (list8 != null ? list8.equals(edqcVar.an()) : edqcVar.an() == null) {
                                    edpx edpxVar = this.g;
                                    if (edpxVar != null ? edpxVar.equals(edqcVar.L()) : edqcVar.L() == null) {
                                        if (this.h.equals(edqcVar.o()) && ((edpiVar = this.i) != null ? edpiVar.equals(edqcVar.j()) : edqcVar.j() == null) && this.j.equals(edqcVar.p()) && this.k.equals(edqcVar.q()) && ((str = this.l) != null ? str.equals(edqcVar.X()) : edqcVar.X() == null) && ((str2 = this.m) != null ? str2.equals(edqcVar.Y()) : edqcVar.Y() == null) && ((num = this.n) != null ? num.equals(edqcVar.O()) : edqcVar.O() == null) && ((str3 = this.o) != null ? str3.equals(edqcVar.ab()) : edqcVar.ab() == null) && ((str4 = this.p) != null ? str4.equals(edqcVar.aa()) : edqcVar.aa() == null) && ((str5 = this.q) != null ? str5.equals(edqcVar.ac()) : edqcVar.ac() == null) && ((latLng = this.r) != null ? latLng.equals(edqcVar.c()) : edqcVar.c() == null) && ((latLng2 = this.s) != null ? latLng2.equals(edqcVar.d()) : edqcVar.d() == null) && ((str6 = this.t) != null ? str6.equals(edqcVar.ae()) : edqcVar.ae() == null) && ((str7 = this.u) != null ? str7.equals(edqcVar.V()) : edqcVar.V() == null) && ((str8 = this.v) != null ? str8.equals(edqcVar.af()) : edqcVar.af() == null) && ((str9 = this.w) != null ? str9.equals(edqcVar.W()) : edqcVar.W() == null) && ((str10 = this.x) != null ? str10.equals(edqcVar.al()) : edqcVar.al() == null) && ((edpiVar2 = this.y) != null ? edpiVar2.equals(edqcVar.k()) : edqcVar.k() == null) && ((str11 = this.z) != null ? str11.equals(edqcVar.ah()) : edqcVar.ah() == null) && ((str12 = this.A) != null ? str12.equals(edqcVar.ad()) : edqcVar.ad() == null) && ((str13 = this.B) != null ? str13.equals(edqcVar.ag()) : edqcVar.ag() == null) && ((list = this.C) != null ? list.equals(edqcVar.ap()) : edqcVar.ap() == null) && ((list2 = this.D) != null ? list2.equals(edqcVar.ar()) : edqcVar.ar() == null) && ((list3 = this.E) != null ? list3.equals(edqcVar.aq()) : edqcVar.aq() == null) && ((edqfVar = this.F) != null ? edqfVar.equals(edqcVar.M()) : edqcVar.M() == null) && ((num2 = this.G) != null ? num2.equals(edqcVar.P()) : edqcVar.P() == null) && ((str14 = this.H) != null ? str14.equals(edqcVar.ai()) : edqcVar.ai() == null) && ((str15 = this.I) != null ? str15.equals(edqcVar.aj()) : edqcVar.aj() == null) && ((str16 = this.J) != null ? str16.equals(edqcVar.ak()) : edqcVar.ak() == null) && ((d = this.K) != null ? d.equals(edqcVar.N()) : edqcVar.N() == null) && this.L.equals(edqcVar.x()) && ((list4 = this.M) != null ? list4.equals(edqcVar.as()) : edqcVar.as() == null) && ((list5 = this.N) != null ? list5.equals(edqcVar.ao()) : edqcVar.ao() == null) && this.O.equals(edqcVar.z()) && this.P.equals(edqcVar.A()) && this.Q.equals(edqcVar.B()) && this.R.equals(edqcVar.F()) && this.S.equals(edqcVar.G()) && this.T.equals(edqcVar.H()) && this.U.equals(edqcVar.I()) && this.V.equals(edqcVar.J()) && ((list6 = this.W) != null ? list6.equals(edqcVar.au()) : edqcVar.au() == null) && ((num3 = this.X) != null ? num3.equals(edqcVar.R()) : edqcVar.R() == null) && ((num4 = this.Y) != null ? num4.equals(edqcVar.Q()) : edqcVar.Q() == null) && ((num5 = this.Z) != null ? num5.equals(edqcVar.S()) : edqcVar.S() == null) && ((latLngBounds = this.aa) != null ? latLngBounds.equals(edqcVar.e()) : edqcVar.e() == null) && ((uri = this.ab) != null ? uri.equals(edqcVar.b()) : edqcVar.b() == null) && ((uri2 = this.ac) != null ? uri2.equals(edqcVar.a()) : edqcVar.a() == null) && this.ad.equals(edqcVar.K()) && ((edmhVar = this.ae) != null ? edmhVar.equals(edqcVar.f()) : edqcVar.f() == null) && ((edpmVar = this.af) != null ? edpmVar.equals(edqcVar.l()) : edqcVar.l() == null) && ((edpoVar = this.ag) != null ? edpoVar.equals(edqcVar.m()) : edqcVar.m() == null) && ((edosVar = this.ah) != null ? edosVar.equals(edqcVar.h()) : edqcVar.h() == null) && this.ai.equals(edqcVar.w()) && this.aj.equals(edqcVar.u()) && this.ak.equals(edqcVar.v()) && this.al.equals(edqcVar.C()) && this.am.equals(edqcVar.E()) && this.an.equals(edqcVar.D()) && this.ao.equals(edqcVar.r()) && this.ap.equals(edqcVar.n()) && this.aq.equals(edqcVar.y()) && this.ar.equals(edqcVar.s()) && this.as.equals(edqcVar.t()) && ((list7 = this.at) != null ? list7.equals(edqcVar.at()) : edqcVar.at() == null) && ((edowVar = this.au) != null ? edowVar.equals(edqcVar.i()) : edqcVar.i() == null)) {
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.edqc
    public final edmh f() {
        return this.ae;
    }

    @Override // defpackage.edqc
    public final edmk g() {
        return this.e;
    }

    @Override // defpackage.edqc
    public final edos h() {
        return this.ah;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.b;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        int i = hashCode ^ 1000003;
        String str3 = this.c;
        int hashCode3 = ((((i * 1000003) ^ hashCode2) * 1000003) ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.d;
        int hashCode4 = (hashCode3 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        edmk edmkVar = this.e;
        int hashCode5 = (hashCode4 ^ (edmkVar == null ? 0 : edmkVar.hashCode())) * 1000003;
        List list = this.f;
        int hashCode6 = (hashCode5 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        edpx edpxVar = this.g;
        int hashCode7 = (((hashCode6 ^ (edpxVar == null ? 0 : edpxVar.hashCode())) * 1000003) ^ this.h.hashCode()) * 1000003;
        edpi edpiVar = this.i;
        int hashCode8 = (((((hashCode7 ^ (edpiVar == null ? 0 : edpiVar.hashCode())) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003;
        String str5 = this.l;
        int hashCode9 = (hashCode8 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.m;
        int hashCode10 = (hashCode9 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        Integer num = this.n;
        int hashCode11 = (hashCode10 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str7 = this.o;
        int hashCode12 = (hashCode11 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.p;
        int hashCode13 = (hashCode12 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        String str9 = this.q;
        int hashCode14 = (hashCode13 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        LatLng latLng = this.r;
        int hashCode15 = (hashCode14 ^ (latLng == null ? 0 : latLng.hashCode())) * 1000003;
        LatLng latLng2 = this.s;
        int hashCode16 = (hashCode15 ^ (latLng2 == null ? 0 : latLng2.hashCode())) * 1000003;
        String str10 = this.t;
        int hashCode17 = (hashCode16 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        String str11 = this.u;
        int hashCode18 = (hashCode17 ^ (str11 == null ? 0 : str11.hashCode())) * 1000003;
        String str12 = this.v;
        int hashCode19 = (hashCode18 ^ (str12 == null ? 0 : str12.hashCode())) * 1000003;
        String str13 = this.w;
        int hashCode20 = (hashCode19 ^ (str13 == null ? 0 : str13.hashCode())) * 1000003;
        String str14 = this.x;
        int hashCode21 = (hashCode20 ^ (str14 == null ? 0 : str14.hashCode())) * 1000003;
        edpi edpiVar2 = this.y;
        int hashCode22 = (hashCode21 ^ (edpiVar2 == null ? 0 : edpiVar2.hashCode())) * 1000003;
        String str15 = this.z;
        int hashCode23 = (hashCode22 ^ (str15 == null ? 0 : str15.hashCode())) * 1000003;
        String str16 = this.A;
        int hashCode24 = (hashCode23 ^ (str16 == null ? 0 : str16.hashCode())) * 1000003;
        String str17 = this.B;
        int hashCode25 = (hashCode24 ^ (str17 == null ? 0 : str17.hashCode())) * 1000003;
        List list2 = this.C;
        int hashCode26 = (hashCode25 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        List list3 = this.D;
        int hashCode27 = (hashCode26 ^ (list3 == null ? 0 : list3.hashCode())) * 1000003;
        List list4 = this.E;
        int hashCode28 = (hashCode27 ^ (list4 == null ? 0 : list4.hashCode())) * 1000003;
        edqf edqfVar = this.F;
        int hashCode29 = (hashCode28 ^ (edqfVar == null ? 0 : edqfVar.hashCode())) * 1000003;
        Integer num2 = this.G;
        int hashCode30 = (hashCode29 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        String str18 = this.H;
        int hashCode31 = (hashCode30 ^ (str18 == null ? 0 : str18.hashCode())) * 1000003;
        String str19 = this.I;
        int hashCode32 = (hashCode31 ^ (str19 == null ? 0 : str19.hashCode())) * 1000003;
        String str20 = this.J;
        int hashCode33 = (hashCode32 ^ (str20 == null ? 0 : str20.hashCode())) * 1000003;
        Double d = this.K;
        int hashCode34 = (((hashCode33 ^ (d == null ? 0 : d.hashCode())) * 1000003) ^ this.L.hashCode()) * 1000003;
        List list5 = this.M;
        int hashCode35 = (hashCode34 ^ (list5 == null ? 0 : list5.hashCode())) * 1000003;
        List list6 = this.N;
        int hashCode36 = (((((((((((((((((hashCode35 ^ (list6 == null ? 0 : list6.hashCode())) * 1000003) ^ this.O.hashCode()) * 1000003) ^ this.P.hashCode()) * 1000003) ^ this.Q.hashCode()) * 1000003) ^ this.R.hashCode()) * 1000003) ^ this.S.hashCode()) * 1000003) ^ this.T.hashCode()) * 1000003) ^ this.U.hashCode()) * 1000003) ^ this.V.hashCode()) * 1000003;
        List list7 = this.W;
        int hashCode37 = (hashCode36 ^ (list7 == null ? 0 : list7.hashCode())) * 1000003;
        Integer num3 = this.X;
        int hashCode38 = (hashCode37 ^ (num3 == null ? 0 : num3.hashCode())) * 1000003;
        Integer num4 = this.Y;
        int hashCode39 = (hashCode38 ^ (num4 == null ? 0 : num4.hashCode())) * 1000003;
        Integer num5 = this.Z;
        int hashCode40 = (hashCode39 ^ (num5 == null ? 0 : num5.hashCode())) * 1000003;
        LatLngBounds latLngBounds = this.aa;
        int hashCode41 = (hashCode40 ^ (latLngBounds == null ? 0 : latLngBounds.hashCode())) * 1000003;
        Uri uri = this.ab;
        int hashCode42 = (hashCode41 ^ (uri == null ? 0 : uri.hashCode())) * 1000003;
        Uri uri2 = this.ac;
        int hashCode43 = (((hashCode42 ^ (uri2 == null ? 0 : uri2.hashCode())) * 1000003) ^ this.ad.hashCode()) * 1000003;
        edmh edmhVar = this.ae;
        int hashCode44 = (hashCode43 ^ (edmhVar == null ? 0 : edmhVar.hashCode())) * 1000003;
        edpm edpmVar = this.af;
        int hashCode45 = (hashCode44 ^ (edpmVar == null ? 0 : edpmVar.hashCode())) * 1000003;
        edpo edpoVar = this.ag;
        int hashCode46 = (hashCode45 ^ (edpoVar == null ? 0 : edpoVar.hashCode())) * 1000003;
        edos edosVar = this.ah;
        int hashCode47 = (((((((((((((((((((((((hashCode46 ^ (edosVar == null ? 0 : edosVar.hashCode())) * 1000003) ^ this.ai.hashCode()) * 1000003) ^ this.aj.hashCode()) * 1000003) ^ this.ak.hashCode()) * 1000003) ^ this.al.hashCode()) * 1000003) ^ this.am.hashCode()) * 1000003) ^ this.an.hashCode()) * 1000003) ^ this.ao.hashCode()) * 1000003) ^ this.ap.hashCode()) * 1000003) ^ this.aq.hashCode()) * 1000003) ^ this.ar.hashCode()) * 1000003) ^ this.as.hashCode()) * 1000003;
        List list8 = this.at;
        int hashCode48 = (hashCode47 ^ (list8 == null ? 0 : list8.hashCode())) * 1000003;
        edow edowVar = this.au;
        return hashCode48 ^ (edowVar != null ? edowVar.hashCode() : 0);
    }

    @Override // defpackage.edqc
    public final edow i() {
        return this.au;
    }

    @Override // defpackage.edqc
    public final edpi j() {
        return this.i;
    }

    @Override // defpackage.edqc
    public final edpi k() {
        return this.y;
    }

    @Override // defpackage.edqc
    public final edpm l() {
        return this.af;
    }

    @Override // defpackage.edqc
    public final edpo m() {
        return this.ag;
    }

    @Override // defpackage.edqc
    public final edpu n() {
        return this.ap;
    }

    @Override // defpackage.edqc
    public final edpu o() {
        return this.h;
    }

    @Override // defpackage.edqc
    public final edpu p() {
        return this.j;
    }

    @Override // defpackage.edqc
    public final edpu q() {
        return this.k;
    }

    @Override // defpackage.edqc
    public final edpu r() {
        return this.ao;
    }

    @Override // defpackage.edqc
    public final edpu s() {
        return this.ar;
    }

    @Override // defpackage.edqc
    public final edpu t() {
        return this.as;
    }

    public final String toString() {
        edpu edpuVar = this.ak;
        edpu edpuVar2 = this.aj;
        edpu edpuVar3 = this.ai;
        edos edosVar = this.ah;
        edpo edpoVar = this.ag;
        edpm edpmVar = this.af;
        edmh edmhVar = this.ae;
        edpu edpuVar4 = this.ad;
        Uri uri = this.ac;
        Uri uri2 = this.ab;
        LatLngBounds latLngBounds = this.aa;
        List list = this.W;
        edpu edpuVar5 = this.V;
        edpu edpuVar6 = this.U;
        edpu edpuVar7 = this.T;
        edpu edpuVar8 = this.S;
        edpu edpuVar9 = this.R;
        edpu edpuVar10 = this.Q;
        edpu edpuVar11 = this.P;
        edpu edpuVar12 = this.O;
        List list2 = this.N;
        List list3 = this.M;
        edpu edpuVar13 = this.L;
        edqf edqfVar = this.F;
        List list4 = this.E;
        List list5 = this.D;
        List list6 = this.C;
        edpi edpiVar = this.y;
        LatLng latLng = this.s;
        LatLng latLng2 = this.r;
        edpu edpuVar14 = this.k;
        edpu edpuVar15 = this.j;
        edpi edpiVar2 = this.i;
        edpu edpuVar16 = this.h;
        edpx edpxVar = this.g;
        List list7 = this.f;
        String valueOf = String.valueOf(this.e);
        String valueOf2 = String.valueOf(list7);
        String valueOf3 = String.valueOf(edpxVar);
        String obj = edpuVar16.toString();
        String valueOf4 = String.valueOf(edpiVar2);
        String obj2 = edpuVar15.toString();
        String obj3 = edpuVar14.toString();
        String valueOf5 = String.valueOf(latLng2);
        String valueOf6 = String.valueOf(latLng);
        String valueOf7 = String.valueOf(edpiVar);
        String valueOf8 = String.valueOf(list6);
        String valueOf9 = String.valueOf(list5);
        String valueOf10 = String.valueOf(list4);
        String valueOf11 = String.valueOf(edqfVar);
        String obj4 = edpuVar13.toString();
        String valueOf12 = String.valueOf(list3);
        String valueOf13 = String.valueOf(list2);
        String obj5 = edpuVar12.toString();
        String obj6 = edpuVar11.toString();
        String obj7 = edpuVar10.toString();
        String obj8 = edpuVar9.toString();
        String obj9 = edpuVar8.toString();
        String obj10 = edpuVar7.toString();
        String obj11 = edpuVar6.toString();
        String obj12 = edpuVar5.toString();
        String valueOf14 = String.valueOf(list);
        String valueOf15 = String.valueOf(latLngBounds);
        String valueOf16 = String.valueOf(uri2);
        String valueOf17 = String.valueOf(uri);
        String obj13 = edpuVar4.toString();
        String valueOf18 = String.valueOf(edmhVar);
        String valueOf19 = String.valueOf(edpmVar);
        String valueOf20 = String.valueOf(edpoVar);
        String valueOf21 = String.valueOf(edosVar);
        String obj14 = edpuVar3.toString();
        String obj15 = edpuVar2.toString();
        String obj16 = edpuVar.toString();
        edpu edpuVar17 = this.al;
        String str = this.A;
        String str2 = this.z;
        String str3 = this.x;
        String str4 = this.w;
        String str5 = this.v;
        String str6 = this.u;
        String str7 = this.t;
        String str8 = this.q;
        String str9 = this.p;
        String str10 = this.o;
        Integer num = this.n;
        String str11 = this.m;
        String str12 = this.l;
        String str13 = this.d;
        String str14 = this.c;
        String str15 = this.b;
        String str16 = this.a;
        edpu edpuVar18 = this.am;
        edpu edpuVar19 = this.an;
        edpu edpuVar20 = this.ao;
        edpu edpuVar21 = this.ap;
        edpu edpuVar22 = this.aq;
        edpu edpuVar23 = this.ar;
        edpu edpuVar24 = this.as;
        List list8 = this.at;
        edow edowVar = this.au;
        String obj17 = edpuVar17.toString();
        String obj18 = edpuVar18.toString();
        String obj19 = edpuVar19.toString();
        String obj20 = edpuVar20.toString();
        String obj21 = edpuVar21.toString();
        String obj22 = edpuVar22.toString();
        String obj23 = edpuVar23.toString();
        String obj24 = edpuVar24.toString();
        String valueOf22 = String.valueOf(list8);
        String valueOf23 = String.valueOf(edowVar);
        StringBuilder sb = new StringBuilder("Place{address=");
        sb.append(str16);
        sb.append(", formattedAddress=");
        sb.append(str15);
        sb.append(", shortFormattedAddress=");
        sb.append(str14);
        sb.append(", adrFormatAddress=");
        sb.append(str13);
        sb.append(", addressComponents=");
        sb.append(valueOf);
        sb.append(", attributions=");
        sb.append(valueOf2);
        sb.append(", businessStatus=");
        sb.append(valueOf3);
        sb.append(", curbsidePickup=");
        sb.append(obj);
        sb.append(", currentOpeningHours=");
        sb.append(valueOf4);
        sb.append(", delivery=");
        sb.append(obj2);
        sb.append(", dineIn=");
        sb.append(obj3);
        sb.append(", editorialSummary=");
        sb.append(str12);
        sb.append(", editorialSummaryLanguageCode=");
        sb.append(str11);
        sb.append(", iconBackgroundColor=");
        sb.append(num);
        sb.append(", iconUrl=");
        sb.append(str10);
        sb.append(", iconMaskUrl=");
        sb.append(str9);
        sb.append(", id=");
        sb.append(str8);
        sb.append(", latLng=");
        sb.append(valueOf5);
        sb.append(", location=");
        sb.append(valueOf6);
        sb.append(", name=");
        sb.append(str7);
        sb.append(", displayName=");
        sb.append(str6);
        sb.append(", nameLanguageCode=");
        sb.append(str5);
        sb.append(", displayNameLanguageCode=");
        sb.append(str4);
        sb.append(", resourceName=");
        sb.append(str3);
        sb.append(", openingHours=");
        sb.append(valueOf7);
        sb.append(", phoneNumber=");
        sb.append(str2);
        sb.append(", internationalPhoneNumber=");
        sb.append(str);
        Integer num2 = this.Z;
        Integer num3 = this.Y;
        Integer num4 = this.X;
        Double d = this.K;
        String str17 = this.J;
        String str18 = this.I;
        String str19 = this.H;
        Integer num5 = this.G;
        String str20 = this.B;
        sb.append(", nationalPhoneNumber=");
        sb.append(str20);
        sb.append(", photoMetadatas=");
        sb.append(valueOf8);
        sb.append(", reviews=");
        sb.append(valueOf9);
        sb.append(", placeTypes=");
        sb.append(valueOf10);
        sb.append(", plusCode=");
        sb.append(valueOf11);
        sb.append(", priceLevel=");
        sb.append(num5);
        sb.append(", primaryType=");
        sb.append(str19);
        sb.append(", primaryTypeDisplayName=");
        sb.append(str18);
        sb.append(", primaryTypeDisplayNameLanguageCode=");
        sb.append(str17);
        sb.append(", rating=");
        sb.append(d);
        sb.append(", reservable=");
        sb.append(obj4);
        sb.append(", secondaryOpeningHours=");
        sb.append(valueOf12);
        sb.append(", currentSecondaryOpeningHours=");
        sb.append(valueOf13);
        sb.append(", servesBeer=");
        sb.append(obj5);
        sb.append(", servesBreakfast=");
        sb.append(obj6);
        sb.append(", servesBrunch=");
        sb.append(obj7);
        sb.append(", servesDinner=");
        sb.append(obj8);
        sb.append(", servesLunch=");
        sb.append(obj9);
        sb.append(", servesVegetarianFood=");
        sb.append(obj10);
        sb.append(", servesWine=");
        sb.append(obj11);
        sb.append(", takeout=");
        sb.append(obj12);
        sb.append(", types=");
        sb.append(valueOf14);
        sb.append(", userRatingsTotal=");
        sb.append(num4);
        sb.append(", userRatingCount=");
        sb.append(num3);
        sb.append(", utcOffsetMinutes=");
        sb.append(num2);
        sb.append(", viewport=");
        sb.append(valueOf15);
        sb.append(", websiteUri=");
        sb.append(valueOf16);
        sb.append(", googleMapsUri=");
        sb.append(valueOf17);
        sb.append(", wheelchairAccessibleEntrance=");
        sb.append(obj13);
        sb.append(", accessibilityOptions=");
        sb.append(valueOf18);
        sb.append(", parkingOptions=");
        sb.append(valueOf19);
        sb.append(", paymentOptions=");
        sb.append(valueOf20);
        sb.append(", evChargeOptions=");
        sb.append(valueOf21);
        sb.append(", outdoorSeating=");
        sb.append(obj14);
        sb.append(", liveMusic=");
        sb.append(obj15);
        sb.append(", menuForChildren=");
        sb.append(obj16);
        sb.append(", servesCocktails=");
        sb.append(obj17);
        sb.append(", servesDessert=");
        sb.append(obj18);
        sb.append(", servesCoffee=");
        sb.append(obj19);
        sb.append(", goodForChildren=");
        sb.append(obj20);
        sb.append(", allowsDogs=");
        sb.append(obj21);
        sb.append(", restroom=");
        sb.append(obj22);
        sb.append(", goodForGroups=");
        sb.append(obj23);
        sb.append(", goodForWatchingSports=");
        sb.append(obj24);
        sb.append(", subDestinations=");
        sb.append(valueOf22);
        sb.append(", fuelOptions=");
        sb.append(valueOf23);
        sb.append("}");
        return sb.toString();
    }

    @Override // defpackage.edqc
    public final edpu u() {
        return this.aj;
    }

    @Override // defpackage.edqc
    public final edpu v() {
        return this.ak;
    }

    @Override // defpackage.edqc
    public final edpu w() {
        return this.ai;
    }

    @Override // defpackage.edqc
    public final edpu x() {
        return this.L;
    }

    @Override // defpackage.edqc
    public final edpu y() {
        return this.aq;
    }

    @Override // defpackage.edqc
    public final edpu z() {
        return this.O;
    }
}
