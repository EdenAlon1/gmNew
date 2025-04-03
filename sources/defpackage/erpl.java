package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class erpl extends erpn {
    final /* synthetic */ erpo a;
    private final erog c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public erpl(erpo erpoVar, erog erogVar, Executor executor) {
        super(erpoVar, executor);
        this.a = erpoVar;
        this.c = erogVar;
    }

    @Override // defpackage.errh
    public final /* bridge */ /* synthetic */ Object a() {
        ListenableFuture a = this.c.a();
        a.getClass();
        return a;
    }

    @Override // defpackage.errh
    public final String b() {
        return this.c.toString();
    }

    @Override // defpackage.erpn
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        this.a.m((ListenableFuture) obj);
    }
}
