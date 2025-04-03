package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvun extends dvuv {
    public String a;
    public enhd b;
    public int c;
    private enhk d;

    @Override // defpackage.dvuv
    public final dvuw a() {
        enhd enhdVar = this.b;
        if (enhdVar != null) {
            this.d = enhdVar.c();
        } else if (this.d == null) {
            this.d = enoz.a;
        }
        int i = this.c;
        if (i != 0) {
            return new dvuo(i, this.a, this.d);
        }
        throw new IllegalStateException("Missing required properties: promoType");
    }
}
