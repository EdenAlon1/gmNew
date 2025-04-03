package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzwl extends dzwu {
    public final emwl a;
    public final dzwt b = new dzwt() { // from class: dzwj
        @Override // defpackage.dzwt
        public final void a(Object obj) {
            dzwl.this.c(obj);
        }
    };
    public boolean c;
    public dzwu d;
    private final ListenableFuture g;
    private final errl h;

    public dzwl(ListenableFuture listenableFuture, emwl emwlVar, errl errlVar) {
        this.g = listenableFuture;
        this.a = emwlVar;
        this.h = errlVar;
    }

    @Override // defpackage.dzwu
    protected final synchronized void a() {
        this.c = false;
        erqt.r(this.g, new dzwk(this), this.h);
    }

    @Override // defpackage.dzwu
    protected final synchronized void b() {
        this.c = true;
        dzwu dzwuVar = this.d;
        if (dzwuVar != null) {
            dzwuVar.l(this.b);
        }
    }
}
