package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehyy extends eibj {
    public final double a;
    public final double b;
    public final Optional c;
    private final Optional d;
    private final String e;
    private final Optional f;
    private final Optional g;
    private final Optional h;
    private final Optional i;

    public ehyy(Optional optional, String str, Optional optional2, Optional optional3, Optional optional4, double d, double d2, Optional optional5, Optional optional6) {
        this.d = optional;
        this.e = str;
        this.f = optional2;
        this.g = optional3;
        this.h = optional4;
        this.a = d;
        this.b = d2;
        this.c = optional5;
        this.i = optional6;
    }

    @Override // defpackage.eibj
    public final double a() {
        return this.b;
    }

    @Override // defpackage.eibj
    public final double b() {
        return this.a;
    }

    @Override // defpackage.eibj
    public final Optional c() {
        return this.i;
    }

    @Override // defpackage.eibj
    public final Optional d() {
        return this.f;
    }

    @Override // defpackage.eibj
    public final Optional e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eibj) {
            eibj eibjVar = (eibj) obj;
            if (this.d.equals(eibjVar.h()) && this.e.equals(eibjVar.i()) && this.f.equals(eibjVar.d()) && this.g.equals(eibjVar.e()) && this.h.equals(eibjVar.f()) && Double.doubleToLongBits(this.a) == Double.doubleToLongBits(eibjVar.b()) && Double.doubleToLongBits(this.b) == Double.doubleToLongBits(eibjVar.a()) && this.c.equals(eibjVar.g()) && this.i.equals(eibjVar.c())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.eibj
    public final Optional f() {
        return this.h;
    }

    @Override // defpackage.eibj
    public final Optional g() {
        return this.c;
    }

    @Override // defpackage.eibj
    public final Optional h() {
        return this.d;
    }

    public final int hashCode() {
        return ((((((((((((((((this.d.hashCode() ^ 1000003) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.a) >>> 32) ^ Double.doubleToLongBits(this.a)))) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.b) >>> 32) ^ Double.doubleToLongBits(this.b)))) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.i.hashCode();
    }

    @Override // defpackage.eibj
    public final String i() {
        return this.e;
    }
}
