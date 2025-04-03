package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bsf implements bjt {
    final /* synthetic */ bvu a;

    public bsf(bvu bvuVar) {
        this.a = bvuVar;
    }

    @Override // defpackage.bjt
    public final void a(Throwable th) {
        avw.a("Recorder", String.format("An error occurred while attempting to release audio source: 0x%x", Integer.valueOf(this.a.hashCode())));
    }

    @Override // defpackage.bjt
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        avw.a("Recorder", String.format("Released audio source successfully: 0x%x", Integer.valueOf(this.a.hashCode())));
    }
}
