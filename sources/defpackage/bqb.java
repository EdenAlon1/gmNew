package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bqb {
    public static final ListenableFuture a(Context context) {
        ListenableFuture listenableFuture;
        context.getClass();
        bpx bpxVar = bqc.a.b;
        synchronized (bpxVar.a) {
            listenableFuture = bpxVar.b;
            if (listenableFuture == null) {
                atu atuVar = new atu(context);
                bjv a = bjv.a(bpxVar.c);
                final bpw bpwVar = new bpw(atuVar);
                ListenableFuture g = bkj.g(a, new bjq() { // from class: bpu
                    /* JADX WARN: Type inference failed for: r2v1, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
                    @Override // defpackage.bjq
                    public final ListenableFuture a(Object obj) {
                        return ffji.this.invoke(obj);
                    }
                }, bjb.a());
                bpxVar.b = g;
                bkj.i(g, new bpv(bpxVar, atuVar, context), bjb.a());
                listenableFuture = bkj.d(g);
                listenableFuture.getClass();
            }
        }
        final bqa bqaVar = bqa.a;
        return bkj.f(listenableFuture, new afd() { // from class: bpz
            @Override // defpackage.afd
            public final Object a(Object obj) {
                return ffji.this.invoke(obj);
            }
        }, bjb.a());
    }
}
