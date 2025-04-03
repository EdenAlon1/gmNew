package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class coor implements copf {
    final /* synthetic */ copc a;

    public coor(copc copcVar) {
        this.a = copcVar;
    }

    @Override // defpackage.copf
    public final elfl a() {
        copc copcVar = this.a;
        final coph cophVar = copcVar.i;
        return elfo.f(new Runnable() { // from class: coop
            @Override // java.lang.Runnable
            public final void run() {
                coph.this.b();
            }
        }, copcVar.c);
    }

    @Override // defpackage.copf
    public final elfl b() {
        final copc copcVar = this.a;
        return elfo.g(new Callable() { // from class: cooq
            @Override // java.util.concurrent.Callable
            public final Object call() {
                copc copcVar2 = copc.this;
                return (eyhs) copcVar2.i.a().orElse(copcVar2.g);
            }
        }, copcVar.c);
    }

    @Override // defpackage.copg
    public final void c() {
        this.a.i.c();
    }
}
