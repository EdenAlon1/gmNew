package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hka extends hto {
    public long a;

    public hka(long j, long j2) {
        super(j);
        this.a = j2;
    }

    @Override // defpackage.hto
    public final hto a(long j) {
        return new hka(j, this.a);
    }

    @Override // defpackage.hto
    public final void b(hto htoVar) {
        htoVar.getClass();
        this.a = ((hka) htoVar).a;
    }
}
