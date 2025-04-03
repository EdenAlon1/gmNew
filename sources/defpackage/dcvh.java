package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcvh {
    public final errl a;
    public final ejtr b;
    public final cqoh c;
    public final csrh d;
    public final dcvp e;
    private final ejvb f;

    public dcvh(errl errlVar, ejtr ejtrVar, ejvb ejvbVar, cqoh cqohVar, csrh csrhVar, dcvp dcvpVar) {
        this.a = errlVar;
        this.b = ejtrVar;
        this.f = ejvbVar;
        this.c = cqohVar;
        this.d = csrhVar;
        this.e = dcvpVar;
    }

    static /* synthetic */ Boolean b() {
        if (csjc.j()) {
            return true;
        }
        try {
            csli.b("am_expression_jni");
            return true;
        } catch (UnsatisfiedLinkError unused) {
            return false;
        }
    }

    public final ejuh a() {
        return new ejuy(this.f, new eros() { // from class: dcvb
            @Override // defpackage.eros
            public final erph a(erpc erpcVar) {
                return new erph(elfo.g(new Callable() { // from class: dcvc
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return dcvh.b();
                    }
                }, dcvh.this.a));
            }
        }, new Object());
    }
}
