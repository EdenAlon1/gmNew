package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class edqo extends edro {
    public Integer a;
    public Integer b;
    public edps c;
    public dhqd d;

    @Override // defpackage.edro
    public final edps a() {
        edps edpsVar = this.c;
        if (edpsVar != null) {
            return edpsVar;
        }
        throw new IllegalStateException("Property \"photoMetadata\" has not been set");
    }

    @Override // defpackage.edro
    public final edrp b() {
        edps edpsVar = this.c;
        if (edpsVar != null) {
            return new edqp(this.a, this.b, edpsVar, this.d);
        }
        throw new IllegalStateException("Missing required properties: photoMetadata");
    }

    @Override // defpackage.edro
    public final Integer c() {
        return this.b;
    }

    @Override // defpackage.edro
    public final Integer d() {
        return this.a;
    }

    @Override // defpackage.edro
    public final void e(Integer num) {
        this.b = num;
    }

    @Override // defpackage.edro
    public final void f(Integer num) {
        this.a = num;
    }
}
