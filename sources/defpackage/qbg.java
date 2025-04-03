package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qbg extends ffhv implements ffjm {
    int a;
    final /* synthetic */ pvn b;
    final /* synthetic */ pyj c;
    final /* synthetic */ AtomicInteger d;
    final /* synthetic */ ListenableFuture e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qbg(pvn pvnVar, pyj pyjVar, AtomicInteger atomicInteger, ListenableFuture listenableFuture, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = pvnVar;
        this.c = pyjVar;
        this.d = atomicInteger;
        this.e = listenableFuture;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((qbg) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            pvn pvnVar = this.b;
            pyj pyjVar = this.c;
            this.a = 1;
            obj = qbp.a(pvnVar, pyjVar, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        this.d.set(((Number) obj).intValue());
        this.e.cancel(true);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new qbg(this.b, this.c, this.d, this.e, ffguVar);
    }
}
