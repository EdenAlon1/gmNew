package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hsp extends hto {
    public hnn a;
    public int b;
    public int c;

    public hsp(long j, hnn hnnVar) {
        super(j);
        this.a = hnnVar;
    }

    @Override // defpackage.hto
    public final hto a(long j) {
        return new hsp(j, this.a);
    }

    @Override // defpackage.hto
    public final void b(hto htoVar) {
        synchronized (hst.a) {
            htoVar.getClass();
            hsp hspVar = (hsp) htoVar;
            this.a = hspVar.a;
            this.b = hspVar.b;
            this.c = hspVar.c;
        }
    }
}
