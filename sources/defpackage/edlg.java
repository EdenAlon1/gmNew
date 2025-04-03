package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class edlg extends edpb {
    public final int a;
    public final int b;
    public final int c;

    public edlg(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    @Override // defpackage.edpb
    public final int a() {
        return this.c;
    }

    @Override // defpackage.edpb
    public final int b() {
        return this.b;
    }

    @Override // defpackage.edpb
    public final int c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof edpb) {
            edpb edpbVar = (edpb) obj;
            if (this.a == edpbVar.c() && this.b == edpbVar.b() && this.c == edpbVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c;
    }
}
