package androidx.work;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.ppq;
import defpackage.ppr;
import defpackage.pqw;
import defpackage.pqx;
import defpackage.prd;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class Worker extends ppr {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    @Override // defpackage.ppr
    public final ListenableFuture a() {
        return prd.a(h(), new pqw());
    }

    @Override // defpackage.ppr
    public final ListenableFuture b() {
        return prd.a(h(), new pqx(this));
    }

    public abstract ppq c();
}
