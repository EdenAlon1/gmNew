package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bqq extends brj {
    private final int j;
    private final String k;
    private final List l;

    public bqq(int i, String str, List list) {
        this.j = i;
        this.k = str;
        if (list == null) {
            throw new NullPointerException("Null typicalSizes");
        }
        this.l = list;
    }

    @Override // defpackage.brj
    public final int a() {
        return this.j;
    }

    @Override // defpackage.brj
    public final String b() {
        return this.k;
    }

    @Override // defpackage.brj
    public final List c() {
        return this.l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof brj) {
            brj brjVar = (brj) obj;
            if (this.j == brjVar.a() && this.k.equals(brjVar.b()) && this.l.equals(brjVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.j ^ 1000003) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l.hashCode();
    }

    public final String toString() {
        return "ConstantQuality{value=" + this.j + ", name=" + this.k + ", typicalSizes=" + this.l + "}";
    }
}
