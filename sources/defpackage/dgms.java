package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgms {
    public static final dgmt a = new dgmt("UdevsVerdict");
    public static final dgxl b = new dgxi();
    public final Executor c;
    public final dglm d;
    public final dgmy e;
    private final dgmd f;

    public dgms(Executor executor, dgmd dgmdVar, dglm dglmVar, dgmy dgmyVar) {
        this.c = executor;
        this.f = dgmdVar;
        this.d = dglmVar;
        this.e = dgmyVar;
    }

    public static emxc a(emxc emxcVar, emxg emxgVar) {
        return (emxcVar.g() && emxgVar.a(emxcVar.c())) ? emxcVar : emux.a;
    }

    public final ListenableFuture b(final ewoj ewojVar) {
        final dgmd dgmdVar = this.f;
        return erny.f(erqc.o(erqt.n(new erog() { // from class: dgmc
            @Override // defpackage.erog
            public final ListenableFuture a() {
                dgmd.this.b.a.b(ewojVar);
                return erre.a;
            }
        }, dgmdVar.a)), new emwl() { // from class: dgmn
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                dgmt dgmtVar = dgms.a;
                return emxc.j(ewoj.this);
            }
        }, this.c);
    }
}
