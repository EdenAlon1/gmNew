package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hjy extends hto {
    public int a;

    public hjy(long j, int i) {
        super(j);
        this.a = i;
    }

    @Override // defpackage.hto
    public final hto a(long j) {
        return new hjy(j, this.a);
    }

    @Override // defpackage.hto
    public final void b(hto htoVar) {
        htoVar.getClass();
        this.a = ((hjy) htoVar).a;
    }
}
