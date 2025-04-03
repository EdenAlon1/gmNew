package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class eagr extends eagt {
    public final long a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final String g;
    public final enip h;
    public final String i;
    public final long j;
    public final long k;
    public final int l;
    public final long m;
    public final String n;
    public final long o;
    public final int p;

    public eagr(long j, String str, int i, String str2, String str3, String str4, int i2, String str5, enip enipVar, String str6, long j2, long j3, int i3, long j4, String str7, long j5) {
        this.a = j;
        this.b = str;
        this.p = i;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = i2;
        this.g = str5;
        this.h = enipVar;
        this.i = str6;
        this.j = j2;
        this.k = j3;
        this.l = i3;
        this.m = j4;
        this.n = str7;
        this.o = j5;
    }

    @Override // defpackage.eagt
    public final int a() {
        return this.l;
    }

    @Override // defpackage.eagt
    public final int b() {
        return this.f;
    }

    @Override // defpackage.eagt
    public final long c() {
        return this.m;
    }

    @Override // defpackage.eagt
    public final long d() {
        return this.o;
    }

    @Override // defpackage.eagt
    public final long e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        enip enipVar;
        String str5;
        String str6;
        if (obj == this) {
            return true;
        }
        if (obj instanceof eagt) {
            eagt eagtVar = (eagt) obj;
            if (this.a == eagtVar.e() && this.b.equals(eagtVar.j()) && this.p == eagtVar.q() && ((str = this.c) != null ? str.equals(eagtVar.n()) : eagtVar.n() == null) && ((str2 = this.d) != null ? str2.equals(eagtVar.k()) : eagtVar.k() == null) && ((str3 = this.e) != null ? str3.equals(eagtVar.l()) : eagtVar.l() == null) && this.f == eagtVar.b() && ((str4 = this.g) != null ? str4.equals(eagtVar.o()) : eagtVar.o() == null) && ((enipVar = this.h) != null ? enipVar.equals(eagtVar.i()) : eagtVar.i() == null) && ((str5 = this.i) != null ? str5.equals(eagtVar.p()) : eagtVar.p() == null) && this.j == eagtVar.g() && this.k == eagtVar.f() && this.l == eagtVar.a() && this.m == eagtVar.c() && ((str6 = this.n) != null ? str6.equals(eagtVar.m()) : eagtVar.m() == null) && this.o == eagtVar.d()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.eagt
    public final long f() {
        return this.k;
    }

    @Override // defpackage.eagt
    public final long g() {
        return this.j;
    }

    @Override // defpackage.eagt
    public final eags h() {
        return new eagq(this);
    }

    public final int hashCode() {
        long j = this.a;
        int hashCode = ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode();
        String str = this.c;
        int hashCode2 = ((((hashCode * 1000003) ^ this.p) * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.d;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.e;
        int hashCode4 = (((hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003) ^ this.f) * 1000003;
        String str4 = this.g;
        int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        enip enipVar = this.h;
        int hashCode6 = (hashCode5 ^ (enipVar == null ? 0 : enipVar.hashCode())) * 1000003;
        String str5 = this.i;
        int hashCode7 = str5 == null ? 0 : str5.hashCode();
        long j2 = this.j;
        int i = (((hashCode6 ^ hashCode7) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.k;
        int i2 = (((i ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ this.l) * 1000003;
        long j4 = this.m;
        int i3 = (i2 ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003;
        String str6 = this.n;
        int hashCode8 = str6 != null ? str6.hashCode() : 0;
        long j5 = this.o;
        return ((i3 ^ hashCode8) * 1000003) ^ ((int) ((j5 >>> 32) ^ j5));
    }

    @Override // defpackage.eagt
    public final enip i() {
        return this.h;
    }

    @Override // defpackage.eagt
    public final String j() {
        return this.b;
    }

    @Override // defpackage.eagt
    public final String k() {
        return this.d;
    }

    @Override // defpackage.eagt
    public final String l() {
        return this.e;
    }

    @Override // defpackage.eagt
    public final String m() {
        return this.n;
    }

    @Override // defpackage.eagt
    public final String n() {
        return this.c;
    }

    @Override // defpackage.eagt
    public final String o() {
        return this.g;
    }

    @Override // defpackage.eagt
    public final String p() {
        return this.i;
    }

    @Override // defpackage.eagt
    public final int q() {
        return this.p;
    }
}
