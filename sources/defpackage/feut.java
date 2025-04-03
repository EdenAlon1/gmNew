package defpackage;

import com.google.common.util.concurrent.SettableFuture;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class feut extends fekk {
    final /* synthetic */ fdyg a;
    final /* synthetic */ SettableFuture b;
    final /* synthetic */ febo c;
    final /* synthetic */ fevc d;
    final /* synthetic */ feuo e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public feut(fdyg fdygVar, SettableFuture settableFuture, febo feboVar, fevc fevcVar, feuo feuoVar) {
        super(fdygVar);
        this.a = fdygVar;
        this.b = settableFuture;
        this.c = feboVar;
        this.d = fevcVar;
        this.e = feuoVar;
    }

    @Override // defpackage.fekk
    public final void a() {
        int i = ffbo.a;
        fevd fevdVar = feuy.c;
        if (this.b.isCancelled()) {
            return;
        }
        try {
            feuw feuwVar = (feuw) erqt.q(this.b);
            fect a = feuwVar.b.a(feuwVar.a, this.c);
            feui feuiVar = feuwVar.a;
            this.e.g(new feuh(feuiVar, a, feuiVar.b));
            this.a.d(new feus(this.d), erpp.a);
        } finally {
        }
    }
}
