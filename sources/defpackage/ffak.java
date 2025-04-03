package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class ffak {
    public final fdxk a;
    public final fdxj b;

    protected ffak(fdxk fdxkVar, fdxj fdxjVar) {
        fdxkVar.getClass();
        this.a = fdxkVar;
        this.b = fdxjVar;
    }

    protected abstract ffak a(fdxk fdxkVar, fdxj fdxjVar);

    public final ffak i(fdxg fdxgVar) {
        fdxh a = fdxj.a(this.b);
        a.c = fdxgVar;
        return a(this.a, new fdxj(a));
    }

    public final ffak j(long j, TimeUnit timeUnit) {
        return a(this.a, this.b.b(fdys.c(j, timeUnit)));
    }

    public final ffak k(Executor executor) {
        return a(this.a, this.b.c(executor));
    }

    public final ffak l(fdxp... fdxpVarArr) {
        return a(fdxr.b(this.a, fdxpVarArr), this.b);
    }

    public final ffak m(fdxi fdxiVar, Object obj) {
        return a(this.a, this.b.f(fdxiVar, obj));
    }

    public final ffak n() {
        fdxh a = fdxj.a(this.b);
        a.d = "gzip";
        return a(this.a, new fdxj(a));
    }
}
