package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dvhu extends dviv {
    public enin a;
    public enin b;
    public enin c;
    private enip d;
    private enip e;
    private enip f;
    private enin g;
    private enip h;

    @Override // defpackage.dviv
    public final dviw a() {
        enin eninVar = this.a;
        if (eninVar != null) {
            this.d = eninVar.g();
        } else if (this.d == null) {
            this.d = enpd.a;
        }
        enin eninVar2 = this.b;
        if (eninVar2 != null) {
            this.e = eninVar2.g();
        } else if (this.e == null) {
            this.e = enpd.a;
        }
        enin eninVar3 = this.c;
        if (eninVar3 != null) {
            this.f = eninVar3.g();
        } else if (this.f == null) {
            this.f = enpd.a;
        }
        enin eninVar4 = this.g;
        if (eninVar4 != null) {
            this.h = eninVar4.g();
        } else if (this.h == null) {
            this.h = enpd.a;
        }
        return new dvhv(this.d, this.e, this.f, this.h);
    }

    @Override // defpackage.dviv
    public final enin b() {
        if (this.g == null) {
            this.g = new enin();
        }
        return this.g;
    }
}
