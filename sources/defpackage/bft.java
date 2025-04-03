package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bft implements bfk {
    private final ksp a;

    public bft(ksp kspVar) {
        this.a = kspVar;
    }

    @Override // defpackage.bfk
    public final void a(Throwable th) {
        avw.d("ObserverToConsumerAdapter", "Unexpected error in Observable", th);
    }

    @Override // defpackage.bfk
    public final void b(Object obj) {
        this.a.accept(obj);
    }
}
