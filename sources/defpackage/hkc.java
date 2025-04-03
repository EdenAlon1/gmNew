package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hkc extends hto {
    public Object a;

    public hkc(long j, Object obj) {
        super(j);
        this.a = obj;
    }

    @Override // defpackage.hto
    public final /* bridge */ /* synthetic */ hto a(long j) {
        return new hkc(hsj.b().v(), this.a);
    }

    @Override // defpackage.hto
    public final void b(hto htoVar) {
        htoVar.getClass();
        this.a = ((hkc) htoVar).a;
    }
}
