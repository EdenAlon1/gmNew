package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class duvk implements AutoCloseable {
    public static final duvk b;

    static {
        duvj duvjVar = duvj.a;
        ListenableFuture g = erqt.g();
        duwm duwmVar = new duwm();
        duwmVar.a = erpp.a;
        b = e(duvjVar, g, duwmVar.a());
    }

    public static duvk e(duvj duvjVar, ListenableFuture listenableFuture, duwk duwkVar) {
        erqt.r(listenableFuture, duwkVar, duwkVar.a);
        return new duvg(duvjVar, listenableFuture, duwkVar);
    }

    public abstract duvj a();

    public abstract ListenableFuture b();

    public abstract duwk c();

    @Override // java.lang.AutoCloseable
    public final void close() {
        b().cancel(true);
        c().close();
    }

    public final boolean d() {
        return !b().isDone();
    }
}
