package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eidg extends eidq {
    private engr b;
    private engw c;
    private eyee d;
    private Optional e = Optional.empty();

    @Override // defpackage.eidq
    public final eidr a() {
        engr engrVar = this.b;
        if (engrVar != null) {
            this.c = engrVar.g();
        } else if (this.c == null) {
            int i = engw.d;
            this.c = enou.a;
        }
        eyee eyeeVar = this.d;
        if (eyeeVar != null) {
            return new eidh(this.c, eyeeVar, this.e);
        }
        throw new IllegalStateException("Missing required properties: content");
    }

    @Override // defpackage.eidq
    public final engr b() {
        if (this.b == null) {
            int i = engw.d;
            this.b = new engr();
        }
        return this.b;
    }

    @Override // defpackage.eidq
    public final void c(eyee eyeeVar) {
        if (eyeeVar == null) {
            throw new NullPointerException("Null content");
        }
        this.d = eyeeVar;
    }

    @Override // defpackage.eidq
    public final void d(edzh edzhVar) {
        this.e = Optional.of(edzhVar);
    }
}
