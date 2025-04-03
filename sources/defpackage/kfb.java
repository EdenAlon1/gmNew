package defpackage;

import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kfb {
    Object a;
    kff b;
    public kfk c = new kfk();
    private boolean d;

    private final void e() {
        this.a = null;
        this.b = null;
        this.c = null;
    }

    public final void a(Runnable runnable, Executor executor) {
        kfk kfkVar = this.c;
        if (kfkVar != null) {
            kfkVar.b(runnable, executor);
        }
    }

    public final boolean b(Object obj) {
        this.d = true;
        kff kffVar = this.b;
        boolean z = kffVar != null && kffVar.b.g(obj);
        if (z) {
            e();
        }
        return z;
    }

    public final boolean c(Throwable th) {
        this.d = true;
        kff kffVar = this.b;
        boolean z = kffVar != null && kffVar.a(th);
        if (z) {
            e();
        }
        return z;
    }

    public final void d() {
        this.d = true;
        kff kffVar = this.b;
        if (kffVar == null || !kffVar.b.cancel(true)) {
            return;
        }
        e();
    }

    protected final void finalize() {
        kfk kfkVar;
        kff kffVar = this.b;
        if (kffVar != null && !kffVar.isDone()) {
            Object obj = this.a;
            Objects.toString(obj);
            kffVar.a(new kfc("The completer object was garbage collected - this future would otherwise never complete. The tag was: ".concat(String.valueOf(obj))));
        }
        if (this.d || (kfkVar = this.c) == null) {
            return;
        }
        kfkVar.g(null);
    }
}
