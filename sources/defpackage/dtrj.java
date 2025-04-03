package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtrj extends dtza {
    public final String a;
    public final boolean b;
    public final engw c;
    public final engw d;
    public final String e;
    public final engw f;
    public final String g;
    public final engw h;
    public final dtzj i;
    public final String j;
    public final String k;
    public final dtzj l;
    public final String m;
    public final String n;
    public final Boolean o;
    public final engw p;
    public final enhk q;
    public final engw r;
    public final boolean s;
    public final dtui t;
    public final boolean u;
    public final String v;
    public final emyl w;
    public final String x;
    public final boolean y;
    public final boolean z;

    public dtrj(String str, boolean z, engw engwVar, engw engwVar2, String str2, engw engwVar3, String str3, engw engwVar4, dtzj dtzjVar, String str4, String str5, dtzj dtzjVar2, String str6, String str7, Boolean bool, engw engwVar5, enhk enhkVar, engw engwVar6, boolean z2, dtui dtuiVar, boolean z3, String str8, emyl emylVar, String str9, boolean z4, boolean z5) {
        this.a = str;
        this.b = z;
        this.c = engwVar;
        this.d = engwVar2;
        this.e = str2;
        this.f = engwVar3;
        this.g = str3;
        this.h = engwVar4;
        this.i = dtzjVar;
        this.j = str4;
        this.k = str5;
        this.l = dtzjVar2;
        this.m = str6;
        this.n = str7;
        this.o = bool;
        this.p = engwVar5;
        this.q = enhkVar;
        this.r = engwVar6;
        this.s = z2;
        this.t = dtuiVar;
        this.u = z3;
        this.v = str8;
        this.w = emylVar;
        this.x = str9;
        this.y = z4;
        this.z = z5;
    }

    @Override // defpackage.dtza
    public final dtui a() {
        return this.t;
    }

    @Override // defpackage.dtza
    public final dtzj b() {
        return this.l;
    }

    @Override // defpackage.dtza
    public final dtzj c() {
        return this.i;
    }

    @Override // defpackage.dtza
    public final emyl d() {
        return this.w;
    }

    @Override // defpackage.dtza
    public final engw e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        engw engwVar;
        String str;
        String str2;
        dtzj dtzjVar;
        String str3;
        String str4;
        dtzj dtzjVar2;
        String str5;
        String str6;
        Boolean bool;
        dtui dtuiVar;
        String str7;
        emyl emylVar;
        String str8;
        if (obj == this) {
            return true;
        }
        if (obj instanceof dtza) {
            dtza dtzaVar = (dtza) obj;
            if (this.a.equals(dtzaVar.t()) && this.b == dtzaVar.w() && enkr.h(this.c, dtzaVar.e()) && ((engwVar = this.d) != null ? enkr.h(engwVar, dtzaVar.h()) : dtzaVar.h() == null) && ((str = this.e) != null ? str.equals(dtzaVar.o()) : dtzaVar.o() == null) && enkr.h(this.f, dtzaVar.g()) && ((str2 = this.g) != null ? str2.equals(dtzaVar.s()) : dtzaVar.s() == null) && enkr.h(this.h, dtzaVar.j()) && ((dtzjVar = this.i) != null ? dtzjVar.equals(dtzaVar.c()) : dtzaVar.c() == null) && ((str3 = this.j) != null ? str3.equals(dtzaVar.r()) : dtzaVar.r() == null) && ((str4 = this.k) != null ? str4.equals(dtzaVar.n()) : dtzaVar.n() == null) && ((dtzjVar2 = this.l) != null ? dtzjVar2.equals(dtzaVar.b()) : dtzaVar.b() == null) && ((str5 = this.m) != null ? str5.equals(dtzaVar.p()) : dtzaVar.p() == null) && ((str6 = this.n) != null ? str6.equals(dtzaVar.q()) : dtzaVar.q() == null) && ((bool = this.o) != null ? bool.equals(dtzaVar.l()) : dtzaVar.l() == null) && enkr.h(this.p, dtzaVar.i()) && ennc.m(this.q, dtzaVar.k()) && enkr.h(this.r, dtzaVar.f()) && this.s == dtzaVar.x() && ((dtuiVar = this.t) != null ? dtuiVar.equals(dtzaVar.a()) : dtzaVar.a() == null) && this.u == dtzaVar.y() && ((str7 = this.v) != null ? str7.equals(dtzaVar.u()) : dtzaVar.u() == null) && ((emylVar = this.w) != null ? emylVar.equals(dtzaVar.d()) : dtzaVar.d() == null) && ((str8 = this.x) != null ? str8.equals(dtzaVar.m()) : dtzaVar.m() == null) && this.y == dtzaVar.z()) {
                dtzaVar.A();
                if (this.z == dtzaVar.v()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.dtza
    public final engw f() {
        return this.r;
    }

    @Override // defpackage.dtza
    public final engw g() {
        return this.f;
    }

    @Override // defpackage.dtza
    public final engw h() {
        return this.d;
    }

    public final int hashCode() {
        int hashCode = ((((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ this.c.hashCode();
        engw engwVar = this.d;
        int hashCode2 = ((hashCode * 1000003) ^ (engwVar == null ? 0 : engwVar.hashCode())) * 1000003;
        String str = this.e;
        int hashCode3 = (((hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f.hashCode()) * 1000003;
        String str2 = this.g;
        int hashCode4 = (((hashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003) ^ this.h.hashCode()) * 1000003;
        dtzj dtzjVar = this.i;
        int hashCode5 = (hashCode4 ^ (dtzjVar == null ? 0 : dtzjVar.hashCode())) * 1000003;
        String str3 = this.j;
        int hashCode6 = (hashCode5 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.k;
        int hashCode7 = (hashCode6 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        dtzj dtzjVar2 = this.l;
        int hashCode8 = (hashCode7 ^ (dtzjVar2 == null ? 0 : dtzjVar2.hashCode())) * 1000003;
        String str5 = this.m;
        int hashCode9 = (hashCode8 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.n;
        int hashCode10 = (hashCode9 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        Boolean bool = this.o;
        int hashCode11 = (((((((((hashCode10 ^ (bool == null ? 0 : bool.hashCode())) * 1000003) ^ this.p.hashCode()) * 1000003) ^ this.q.hashCode()) * 1000003) ^ this.r.hashCode()) * 1000003) ^ (true != this.s ? 1237 : 1231)) * 1000003;
        dtui dtuiVar = this.t;
        int hashCode12 = (((hashCode11 ^ (dtuiVar == null ? 0 : dtuiVar.hashCode())) * 1000003) ^ (true != this.u ? 1237 : 1231)) * 1000003;
        String str7 = this.v;
        int hashCode13 = (hashCode12 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        emyl emylVar = this.w;
        int hashCode14 = (hashCode13 ^ (emylVar == null ? 0 : emylVar.hashCode())) * 1000003;
        String str8 = this.x;
        return ((((((hashCode14 ^ (str8 != null ? str8.hashCode() : 0)) * 1000003) ^ (true != this.y ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003) ^ (true != this.z ? 1237 : 1231);
    }

    @Override // defpackage.dtza
    public final engw i() {
        return this.p;
    }

    @Override // defpackage.dtza
    public final engw j() {
        return this.h;
    }

    @Override // defpackage.dtza
    public final enhk k() {
        return this.q;
    }

    @Override // defpackage.dtza
    public final Boolean l() {
        return this.o;
    }

    @Override // defpackage.dtza
    public final String m() {
        return this.x;
    }

    @Override // defpackage.dtza
    public final String n() {
        return this.k;
    }

    @Override // defpackage.dtza
    public final String o() {
        return this.e;
    }

    @Override // defpackage.dtza
    public final String p() {
        return this.m;
    }

    @Override // defpackage.dtza
    public final String q() {
        return this.n;
    }

    @Override // defpackage.dtza
    public final String r() {
        return this.j;
    }

    @Override // defpackage.dtza
    public final String s() {
        return this.g;
    }

    @Override // defpackage.dtza
    public final String t() {
        return this.a;
    }

    public final String toString() {
        emyl emylVar = this.w;
        dtui dtuiVar = this.t;
        engw engwVar = this.r;
        enhk enhkVar = this.q;
        engw engwVar2 = this.p;
        dtzj dtzjVar = this.l;
        dtzj dtzjVar2 = this.i;
        engw engwVar3 = this.h;
        engw engwVar4 = this.f;
        engw engwVar5 = this.d;
        String obj = this.c.toString();
        String valueOf = String.valueOf(engwVar5);
        String valueOf2 = String.valueOf(engwVar4);
        String valueOf3 = String.valueOf(engwVar3);
        String valueOf4 = String.valueOf(dtzjVar2);
        String valueOf5 = String.valueOf(dtzjVar);
        String valueOf6 = String.valueOf(engwVar2);
        String valueOf7 = String.valueOf(enhkVar);
        String valueOf8 = String.valueOf(engwVar);
        String valueOf9 = String.valueOf(dtuiVar);
        String valueOf10 = String.valueOf(emylVar);
        StringBuilder sb = new StringBuilder("QueryParameters{table=");
        sb.append(this.a);
        sb.append(", distinct=");
        sb.append(this.b);
        sb.append(", defaultColumns=");
        sb.append(obj);
        sb.append(", projection=");
        sb.append(valueOf);
        sb.append(", index=");
        sb.append(this.e);
        sb.append(", expressions=");
        sb.append(valueOf2);
        sb.append(", staticWhereClause=");
        sb.append(this.g);
        sb.append(", whereClauses=");
        sb.append(valueOf3);
        sb.append(", orderBy=");
        sb.append(valueOf4);
        sb.append(", orderByForUnion=");
        sb.append(this.j);
        sb.append(", groupBy=");
        sb.append(this.k);
        sb.append(", having=");
        sb.append(valueOf5);
        sb.append(", limit=");
        sb.append(this.m);
        sb.append(", offset=");
        sb.append(this.n);
        sb.append(", disableTableFilters=");
        sb.append(this.o);
        sb.append(", unions=");
        sb.append(valueOf6);
        sb.append(", substitutions=");
        sb.append(valueOf7);
        sb.append(", dynamicJoins=");
        sb.append(valueOf8);
        sb.append(", exemptFromQueryPlanChecking=");
        sb.append(this.s);
        sb.append(", loggingTag=");
        sb.append(valueOf9);
        sb.append(", isEmptyProjection=");
        boolean z = this.z;
        boolean z2 = this.y;
        String str = this.x;
        String str2 = this.v;
        sb.append(this.u);
        sb.append(", tableAs=");
        sb.append(str2);
        sb.append(", canonicalSql=");
        sb.append(valueOf10);
        sb.append(", databaseName=");
        sb.append(str);
        sb.append(", queryForColumnSizes=");
        sb.append(z2);
        sb.append(", disableCaching=false, deliverForeignKeyChangesToObservers=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }

    @Override // defpackage.dtza
    public final String u() {
        return this.v;
    }

    @Override // defpackage.dtza
    public final boolean v() {
        return this.z;
    }

    @Override // defpackage.dtza
    public final boolean w() {
        return this.b;
    }

    @Override // defpackage.dtza
    public final boolean x() {
        return this.s;
    }

    @Override // defpackage.dtza
    public final boolean y() {
        return this.u;
    }

    @Override // defpackage.dtza
    public final boolean z() {
        return this.y;
    }

    @Override // defpackage.dtza
    public final void A() {
    }
}
