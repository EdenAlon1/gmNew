package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ebzm extends ecax {
    public final ecaq a;
    public final ecaq b;
    public final ecaq c;
    public final int d;

    public ebzm(ecaq ecaqVar, ecaq ecaqVar2, ecaq ecaqVar3, int i) {
        this.a = ecaqVar;
        this.b = ecaqVar2;
        this.c = ecaqVar3;
        this.d = i;
    }

    @Override // defpackage.ecax
    public final int a() {
        return this.d;
    }

    @Override // defpackage.ecax
    public final ecaq b() {
        return this.b;
    }

    @Override // defpackage.ecax
    public final ecaq c() {
        return this.c;
    }

    @Override // defpackage.ecax
    public final ecaq d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ecax) {
            ecax ecaxVar = (ecax) obj;
            if (this.a.equals(ecaxVar.d()) && this.b.equals(ecaxVar.b()) && this.c.equals(ecaxVar.c()) && this.d == ecaxVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d;
    }

    public final String toString() {
        ecaq ecaqVar = this.c;
        ecaq ecaqVar2 = this.b;
        return "ViewProviders{headerViewProvider=" + this.a.toString() + ", contentViewProvider=" + ecaqVar2.toString() + ", footerViewProvider=" + ecaqVar.toString() + ", title=" + this.d + "}";
    }
}
