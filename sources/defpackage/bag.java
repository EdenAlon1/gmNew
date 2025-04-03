package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bag {
    public final bax a;
    public final baw b;
    public kfb d;
    public kfb e;
    public ListenableFuture h;
    public boolean f = false;
    public boolean g = false;
    private final ListenableFuture i = kfg.a(new kfd() { // from class: bae
        @Override // defpackage.kfd
        public final Object a(kfb kfbVar) {
            bag.this.d = kfbVar;
            return "CaptureCompleteFuture";
        }
    });
    public final ListenableFuture c = kfg.a(new kfd() { // from class: baf
        @Override // defpackage.kfd
        public final Object a(kfb kfbVar) {
            bag.this.e = kfbVar;
            return "RequestCompleteFuture";
        }
    });

    public bag(bax baxVar, baw bawVar) {
        this.a = baxVar;
        this.b = bawVar;
    }

    final ListenableFuture a() {
        biw.b();
        return this.i;
    }

    public final void b(avl avlVar) {
        biw.b();
        this.f = true;
        ListenableFuture listenableFuture = this.h;
        listenableFuture.getClass();
        listenableFuture.cancel(true);
        this.d.c(avlVar);
        this.e.b(null);
    }

    public final void c() {
        ksw.d(this.i.isDone(), "onImageCaptured() must be called before onFinalResult()");
    }

    public final void d() {
        ksw.d(!this.c.isDone(), "The callback can only complete once.");
        this.e.b(null);
    }

    public final void e() {
        biw.b();
        if (this.f || this.g) {
            return;
        }
        this.g = true;
    }

    public final void f(avl avlVar) {
        biw.b();
        this.a.m(avlVar);
    }
}
