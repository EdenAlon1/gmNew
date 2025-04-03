package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class bbbl extends bbbq {
    public final fjay a;
    public final bdhg b;
    public final fgjz c;
    public final eyja d;
    public final int e;
    public final int f;
    public final int g;

    public bbbl(fjay fjayVar, bdhg bdhgVar, int i, int i2, int i3, fgjz fgjzVar, eyja eyjaVar) {
        this.a = fjayVar;
        this.b = bdhgVar;
        this.e = i;
        this.f = i2;
        this.g = i3;
        this.c = fgjzVar;
        this.d = eyjaVar;
    }

    @Override // defpackage.bbbq
    public final bdhg a() {
        return this.b;
    }

    @Override // defpackage.bbbq
    public final eyja b() {
        return this.d;
    }

    @Override // defpackage.bbbq
    public final fgjz c() {
        return this.c;
    }

    @Override // defpackage.bbbq
    public final fjay d() {
        return this.a;
    }

    @Override // defpackage.bbbq
    public final int e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        fgjz fgjzVar;
        eyja eyjaVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof bbbq) {
            bbbq bbbqVar = (bbbq) obj;
            fjay fjayVar = this.a;
            if (fjayVar != null ? fjayVar.equals(bbbqVar.d()) : bbbqVar.d() == null) {
                bdhg bdhgVar = this.b;
                if (bdhgVar != null ? bdhgVar.equals(bbbqVar.a()) : bbbqVar.a() == null) {
                    if (this.e == bbbqVar.f() && this.f == bbbqVar.g() && this.g == bbbqVar.e() && ((fgjzVar = this.c) != null ? fgjzVar.equals(bbbqVar.c()) : bbbqVar.c() == null) && ((eyjaVar = this.d) != null ? eyjaVar.equals(bbbqVar.b()) : bbbqVar.b() == null)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.bbbq
    public final int f() {
        return this.e;
    }

    @Override // defpackage.bbbq
    public final int g() {
        return this.f;
    }

    public final int hashCode() {
        fjay fjayVar = this.a;
        int hashCode = fjayVar == null ? 0 : fjayVar.hashCode();
        bdhg bdhgVar = this.b;
        int hashCode2 = bdhgVar == null ? 0 : bdhgVar.hashCode();
        int i = hashCode ^ 1000003;
        int i2 = this.e;
        int i3 = this.f;
        int i4 = this.g;
        fgjz fgjzVar = this.c;
        int hashCode3 = ((((((((((i * 1000003) ^ hashCode2) * 1000003) ^ i2) * 1000003) ^ i3) * 1000003) ^ i4) * 1000003) ^ (fgjzVar == null ? 0 : fgjzVar.hashCode())) * 1000003;
        eyja eyjaVar = this.d;
        return hashCode3 ^ (eyjaVar != null ? eyjaVar.hashCode() : 0);
    }

    public final String toString() {
        int i = this.e;
        bdhg bdhgVar = this.b;
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(bdhgVar);
        String num = Integer.toString(fgkh.a(i));
        String num2 = Integer.toString(fjaz.a(this.f));
        String num3 = Integer.toString(fgkg.a(this.g));
        eyja eyjaVar = this.d;
        return "XslParams{traceId=" + valueOf + ", rcsMessageId=" + valueOf2 + ", type=" + num + ", xslNode=" + num2 + ", xslInsideNode=" + num3 + ", bugleSendingInternalStatus=" + String.valueOf(this.c) + ", timestamp=" + String.valueOf(eyjaVar) + "}";
    }
}
