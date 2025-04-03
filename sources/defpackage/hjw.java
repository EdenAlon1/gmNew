package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hjw extends hto {
    public float a;

    public hjw(long j, float f) {
        super(j);
        this.a = f;
    }

    @Override // defpackage.hto
    public final hto a(long j) {
        return new hjw(j, this.a);
    }

    @Override // defpackage.hto
    public final void b(hto htoVar) {
        htoVar.getClass();
        this.a = ((hjw) htoVar).a;
    }
}
