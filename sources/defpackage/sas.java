package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sas extends san {
    public final Context a;
    public final ExecutorService b;
    public final Executor c;
    public final boolean d;

    public sas(Context context, ExecutorService executorService, Executor executor, boolean z) {
        this.a = context;
        this.b = executorService;
        this.c = executor;
        this.d = z;
    }

    @Override // defpackage.san
    public final Context a() {
        return this.a;
    }

    @Override // defpackage.san
    public final Executor b() {
        return this.c;
    }

    @Override // defpackage.san
    public final ExecutorService c() {
        return this.b;
    }

    @Override // defpackage.san
    public final boolean d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof san) {
            san sanVar = (san) obj;
            if (this.a.equals(sanVar.a()) && this.b.equals(sanVar.c()) && this.c.equals(sanVar.b()) && this.d == sanVar.d()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (true != this.d ? 1237 : 1231);
    }

    public final String toString() {
        Executor executor = this.c;
        ExecutorService executorService = this.b;
        return "AiCoreClientOptions{context=" + this.a.toString() + ", workerExecutor=" + executorService.toString() + ", callbackExecutor=" + executor.toString() + ", bindImportantEnabled=" + this.d + "}";
    }
}
