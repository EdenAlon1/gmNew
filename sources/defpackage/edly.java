package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class edly extends edqg {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public Double f;
    public edmm g;
    public String h;
    public String i;

    @Override // defpackage.edqg
    public final edqh a() {
        edmm edmmVar;
        String str;
        Double d = this.f;
        if (d != null && (edmmVar = this.g) != null && (str = this.h) != null) {
            return new edof(this.a, this.b, this.c, this.d, this.e, d, edmmVar, str, this.i);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f == null) {
            sb.append(" rating");
        }
        if (this.g == null) {
            sb.append(" authorAttribution");
        }
        if (this.h == null) {
            sb.append(" attribution");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
