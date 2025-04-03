package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ducl extends dufr {
    public enhd a;
    public enhk b;
    private enin c;
    private enip d;
    private enin e;
    private enip f;
    private engr g;
    private engw h;

    public ducl() {
    }

    @Override // defpackage.dufr
    public final dufs a() {
        enhk enhkVar;
        enin eninVar = this.c;
        if (eninVar != null) {
            this.d = eninVar.g();
        } else if (this.d == null) {
            this.d = enpd.a;
        }
        enin eninVar2 = this.e;
        if (eninVar2 != null) {
            this.f = eninVar2.g();
        } else if (this.f == null) {
            this.f = enpd.a;
        }
        engr engrVar = this.g;
        if (engrVar != null) {
            this.h = engrVar.g();
        } else if (this.h == null) {
            int i = engw.d;
            this.h = enou.a;
        }
        enhd enhdVar = this.a;
        if (enhdVar == null) {
            if (this.b == null) {
                enhkVar = enoz.a;
            }
            return new ducm(this.d, this.f, this.h, this.b);
        }
        enhkVar = enhdVar.c();
        this.b = enhkVar;
        return new ducm(this.d, this.f, this.h, this.b);
    }

    @Override // defpackage.dufr
    public final engr b() {
        if (this.g == null) {
            if (this.h == null) {
                int i = engw.d;
                this.g = new engr();
            } else {
                int i2 = engw.d;
                engr engrVar = new engr();
                this.g = engrVar;
                engrVar.j(this.h);
                this.h = null;
            }
        }
        return this.g;
    }

    @Override // defpackage.dufr
    public final enin c() {
        if (this.c == null) {
            if (this.d == null) {
                this.c = new enin();
            } else {
                enin eninVar = new enin();
                this.c = eninVar;
                eninVar.j(this.d);
                this.d = null;
            }
        }
        return this.c;
    }

    @Override // defpackage.dufr
    public final enin d() {
        if (this.e == null) {
            if (this.f == null) {
                this.e = new enin();
            } else {
                enin eninVar = new enin();
                this.e = eninVar;
                eninVar.j(this.f);
                this.f = null;
            }
        }
        return this.e;
    }

    public ducl(dufs dufsVar) {
        ducm ducmVar = (ducm) dufsVar;
        this.d = ducmVar.a;
        this.f = ducmVar.b;
        this.h = ducmVar.c;
        this.b = ducmVar.d;
    }
}
