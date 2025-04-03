package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aih implements ayp {
    public final air a;
    private final Executor b;
    private final int c;

    public aih(air airVar, Executor executor, int i) {
        this.a = airVar;
        this.b = executor;
        this.c = i;
    }

    @Override // defpackage.ayp
    public final ListenableFuture a() {
        return kfg.a(new kfd() { // from class: aif
            @Override // defpackage.kfd
            public final Object a(kfb kfbVar) {
                aih.this.a.c();
                kfbVar.b(null);
                return "invokePostCaptureFuture";
            }
        });
    }

    @Override // defpackage.ayp
    public final ListenableFuture b() {
        avw.a("Camera2CapturePipeline", "invokePreCapture");
        return bkj.f(bjv.a(this.a.a(this.c)), new afd() { // from class: aig
            @Override // defpackage.afd
            public final Object a(Object obj) {
                return null;
            }
        }, this.b);
    }
}
