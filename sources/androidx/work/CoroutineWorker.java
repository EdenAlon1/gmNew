package androidx.work;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.ffgu;
import defpackage.ffhd;
import defpackage.ffkj;
import defpackage.ffsd;
import defpackage.ffuf;
import defpackage.pok;
import defpackage.pol;
import defpackage.pom;
import defpackage.ppl;
import defpackage.ppr;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class CoroutineWorker extends ppr {
    private final WorkerParameters e;
    private final ffsd f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.e = workerParameters;
        this.f = pok.a;
    }

    @Override // defpackage.ppr
    public final ListenableFuture a() {
        return ppl.b(this.f.plus(new ffuf(null)), new pol(this, null));
    }

    @Override // defpackage.ppr
    public final ListenableFuture b() {
        ffhd ffhdVar = !ffkj.e(this.f, pok.a) ? this.f : this.e.g;
        ffhdVar.getClass();
        return ppl.b(ffhdVar.plus(new ffuf(null)), new pom(this, null));
    }

    public abstract Object c(ffgu ffguVar);

    @Override // defpackage.ppr
    public final void d() {
    }
}
