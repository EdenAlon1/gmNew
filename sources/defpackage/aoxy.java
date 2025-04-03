package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aoxy implements alyd {
    public final Object a = new Object();
    public final ArrayList b = new ArrayList();
    final /* synthetic */ aoyd c;

    public aoxy(aoyd aoydVar) {
        this.c = aoydVar;
    }

    @Override // defpackage.ctbf
    public final /* bridge */ /* synthetic */ elfl a(Object obj) {
        engw n;
        final alyc alycVar = (alyc) obj;
        synchronized (this.a) {
            n = engw.n(this.b);
        }
        final engw engwVar = (engw) Collection.EL.stream(n).map(new Function() { // from class: aoxt
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                return ((alyd) obj2).a(alyc.this);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(endq.a);
        if (!engwVar.isEmpty()) {
            axnw.h(elfo.h(new erog() { // from class: aoxu
                @Override // defpackage.erog
                public final ListenableFuture a() {
                    return elfo.a(engw.this);
                }
            }, this.c.b));
        }
        return elfo.e(null);
    }

    @Override // defpackage.alyd
    public final elfl b() {
        engw n;
        synchronized (this.a) {
            n = engw.n(this.b);
        }
        final engw engwVar = (engw) Collection.EL.stream(n).map(new Function() { // from class: aoxv
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((alyd) obj).b();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(endq.a);
        if (!engwVar.isEmpty()) {
            axnw.h(elfo.h(new erog() { // from class: aoxw
                @Override // defpackage.erog
                public final ListenableFuture a() {
                    return elfo.a(engw.this);
                }
            }, this.c.b));
        }
        return elfo.e(null);
    }
}
