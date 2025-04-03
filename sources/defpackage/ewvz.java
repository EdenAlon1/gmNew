package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewvz extends exac {
    public engr a;
    private engw b;

    @Override // defpackage.exac
    public final exaf a() {
        engr engrVar = this.a;
        if (engrVar != null) {
            this.b = engrVar.g();
        } else if (this.b == null) {
            int i = engw.d;
            this.b = enou.a;
        }
        return new ewwa(this.b);
    }
}
