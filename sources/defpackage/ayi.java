package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ayi extends baa {
    public final bmx a;
    public final bmx b;
    public final int c;
    public final List d;

    public ayi(bmx bmxVar, bmx bmxVar2, int i, List list) {
        this.a = bmxVar;
        this.b = bmxVar2;
        this.c = i;
        this.d = list;
    }

    @Override // defpackage.baa
    public final int a() {
        return this.c;
    }

    @Override // defpackage.baa
    public final bmx b() {
        return this.a;
    }

    @Override // defpackage.baa
    public final bmx c() {
        return this.b;
    }

    @Override // defpackage.baa
    public final List d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof baa) {
            baa baaVar = (baa) obj;
            if (this.a.equals(baaVar.b()) && this.b.equals(baaVar.c()) && this.c == baaVar.a() && this.d.equals(baaVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        return "In{edge=" + this.a + ", postviewEdge=" + this.b + ", inputFormat=" + this.c + ", outputFormats=" + this.d + "}";
    }
}
