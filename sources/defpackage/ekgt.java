package defpackage;

import android.content.Intent;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekgt implements ekap {
    public final eisx a;
    public final ekem b;
    public final ekgy c;
    public final ffbr d;
    public final String e;
    private final eixo f;
    private final Executor g;

    public ekgt(eisx eisxVar, eixo eixoVar, ekem ekemVar, ekgy ekgyVar, ffbr ffbrVar, Executor executor, String str) {
        eisxVar.getClass();
        eixoVar.getClass();
        ekgyVar.getClass();
        ffbrVar.getClass();
        executor.getClass();
        this.a = eisxVar;
        this.f = eixoVar;
        this.b = ekemVar;
        this.c = ekgyVar;
        this.d = ffbrVar;
        this.g = executor;
        this.e = str;
    }

    @Override // defpackage.ekap
    public final ListenableFuture a(String str, eyee eyeeVar, ecwu ecwuVar) {
        return this.c.a(ecwuVar, eyeeVar, str, this.e);
    }

    @Override // defpackage.ekap
    public final ListenableFuture b(final eyee eyeeVar, final ecwu ecwuVar) {
        ffji ffjiVar = new ffji() { // from class: ekgq
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                ekgt ekgtVar = ekgt.this;
                eisx eisxVar = (eisx) obj;
                emxc emxcVar = (emxc) ((fbbb) ekgtVar.d).a;
                boolean g = emxcVar.g();
                eyee eyeeVar2 = eyeeVar;
                ecwu ecwuVar2 = ecwuVar;
                return g ? elfr.k(((eivn) emxcVar.c()).a(new eiwu(new Intent())), eldl.d(new ekgr(ekgtVar, eyeeVar2, ecwuVar2)), erpp.a) : ekgtVar.c(eyeeVar2, eisxVar, ekgtVar.a, ecwuVar2);
            }
        };
        ekgy ekgyVar = this.c;
        ListenableFuture b = ekgyVar.d.b(new ekgz(ffjiVar, ekgyVar), erpp.a);
        b.getClass();
        return b;
    }

    public final ListenableFuture c(final eyee eyeeVar, eisx eisxVar, eisx eisxVar2, final ecwu ecwuVar) {
        if (eisxVar == null || !ffkj.e(eisxVar2, eisxVar)) {
            return erqt.i(null);
        }
        ListenableFuture c = this.f.c(eisxVar2);
        final ffji ffjiVar = new ffji() { // from class: ekgp
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                eixz b = ((eixn) obj).b();
                ekgt ekgtVar = ekgt.this;
                return ekgtVar.c.a(ecwuVar, eyeeVar, ekgtVar.b.a(b), ekgtVar.e);
            }
        };
        return elfr.k(c, new eroh() { // from class: ekgs
            /* JADX WARN: Type inference failed for: r2v1, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
            @Override // defpackage.eroh
            public final /* synthetic */ ListenableFuture a(Object obj) {
                return ffji.this.invoke(obj);
            }
        }, this.g);
    }
}
