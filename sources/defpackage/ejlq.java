package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class ejlq {
    public final void g(ejlp ejlpVar, ejlr ejlrVar) {
        j(ejlpVar.a, null, ejlrVar);
    }

    public final void h(ListenableFuture listenableFuture, ejlr ejlrVar) {
        g(ejlp.a(listenableFuture), ejlrVar);
    }

    public final void i(ejlp ejlpVar, ejlm ejlmVar, ejlr ejlrVar) {
        j(ejlpVar.a, ejlmVar.a, ejlrVar);
    }

    protected abstract void j(ListenableFuture listenableFuture, Object obj, ejlr ejlrVar);

    public abstract void k(ejlr ejlrVar);

    public abstract void l(ejlp ejlpVar, ejlm ejlmVar, ejlr ejlrVar);
}
