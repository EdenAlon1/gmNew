package defpackage;

import kotlinx.coroutines.CoroutineExceptionHandler;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hjm extends ffgo implements CoroutineExceptionHandler {
    final /* synthetic */ hua a;
    final /* synthetic */ hjn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hjm(ffse ffseVar, hua huaVar, hjn hjnVar) {
        super(ffseVar);
        this.a = huaVar;
        this.b = hjnVar;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(ffhd ffhdVar, Throwable th) {
        ffcu ffcuVar;
        this.a.b(th, this.b);
        this.b.c.get(CoroutineExceptionHandler.c);
        CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) this.b.b.get(CoroutineExceptionHandler.c);
        if (coroutineExceptionHandler != null) {
            coroutineExceptionHandler.handleException(ffhdVar, th);
            ffcuVar = ffcu.a;
        } else {
            ffcuVar = null;
        }
        if (ffcuVar == null) {
            throw th;
        }
    }
}
