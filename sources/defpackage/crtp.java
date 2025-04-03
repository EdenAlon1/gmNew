package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crtp extends csbf {
    private enhd a;
    private enhk b;

    @Override // defpackage.csbf
    public final csbg a() {
        enhk enhkVar;
        enhd enhdVar = this.a;
        if (enhdVar == null) {
            if (this.b == null) {
                enhkVar = enoz.a;
            }
            return new crtq(this.b);
        }
        enhkVar = enhdVar.c();
        this.b = enhkVar;
        return new crtq(this.b);
    }

    @Override // defpackage.csbf
    public final enhd b() {
        if (this.a == null) {
            this.a = new enhd();
        }
        return this.a;
    }
}
