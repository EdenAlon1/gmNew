package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxvi {
    public final dxvh a;
    private final Executor d;
    private final dycc c = new dycc();
    public final Map b = new HashMap();

    public dxvi(Executor executor, dxvh dxvhVar) {
        this.d = executor;
        this.a = dxvhVar;
    }

    public static dxvi a(Executor executor) {
        return new dxvi(executor, new dxvg());
    }

    public final ListenableFuture b(final String str, final ListenableFuture listenableFuture) {
        dxth.l("%s: submitting request to add in-progress download future with key: %s", "DownloadFutureMap", str);
        return this.c.b(new erog() { // from class: dxvf
            @Override // defpackage.erog
            public final ListenableFuture a() {
                String str2 = str;
                dxvi dxviVar = dxvi.this;
                ListenableFuture listenableFuture2 = listenableFuture;
                try {
                    dxviVar.a.a(str2, dxviVar.b.size() + 1);
                    dxviVar.b.put(str2, listenableFuture2);
                    return erre.a;
                } catch (Exception e) {
                    dxth.k(e, "%s: Failed to add download future (%s) to map", "DownloadFutureMap", str2);
                    return erqt.h(e);
                }
            }
        }, this.d);
    }

    public final ListenableFuture c(final String str) {
        dxth.l("%s: submitting check for in-progress download future with key: %s", "DownloadFutureMap", str);
        return this.c.a(new Callable() { // from class: dxvc
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf(dxvi.this.b.containsKey(str));
            }
        }, this.d);
    }

    public final ListenableFuture d(final String str) {
        dxth.l("%s: submitting request for in-progress download future with key: %s", "DownloadFutureMap", str);
        return this.c.a(new Callable() { // from class: dxvd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return emxc.i((ListenableFuture) dxvi.this.b.get(str));
            }
        }, this.d);
    }

    public final ListenableFuture e(final String str) {
        dxth.l("%s: submitting request to remove in-progress download future with key: %s", "DownloadFutureMap", str);
        return this.c.b(new erog() { // from class: dxve
            @Override // defpackage.erog
            public final ListenableFuture a() {
                dxvi dxviVar = dxvi.this;
                String str2 = str;
                try {
                    dxviVar.b.remove(str2);
                    dxviVar.a.b(str2, dxviVar.b.size());
                    return erre.a;
                } catch (Exception e) {
                    dxth.k(e, "%s: Failed to remove download future (%s) from map", "DownloadFutureMap", str2);
                    return erqt.h(e);
                }
            }
        }, this.d);
    }
}
