package defpackage;

import android.content.Context;
import j$.util.function.Consumer$CC;
import java.util.List;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
class uut implements ejlr<Void, List<eyjv<vjg>>> {
    final /* synthetic */ uuy a;

    public uut(uuy uuyVar) {
        this.a = uuyVar;
    }

    @Override // defpackage.ejlr
    public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        final List list = (List) obj2;
        this.a.Q.ifPresent(new Consumer() { // from class: uus
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj3) {
                uut uutVar = uut.this;
                Context z = uutVar.a.e.z();
                z.getClass();
                ((vfq) obj3).e(z, uutVar.a.az, list);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    @Override // defpackage.ejlr
    public final /* bridge */ /* synthetic */ void m(Object obj, Throwable th) {
        csjy.h("Bugle", th, "Unable to show reactions summary for message");
    }

    @Override // defpackage.ejlr
    public final /* synthetic */ void b(Object obj) {
    }
}
