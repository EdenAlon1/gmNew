package defpackage;

import android.content.ContentValues;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class byej extends dtrr {
    public int a;
    public String b;
    public byfj c;

    public byej() {
        super(byfi.a().P());
    }

    public final byef a(Supplier supplier) {
        Object obj;
        obj = supplier.get();
        byef byefVar = (byef) obj;
        byefVar.aC(aB());
        byefVar.a = this.a;
        byefVar.b = this.b;
        byefVar.c = this.c;
        byefVar.cK = aC();
        return byefVar;
    }

    @Deprecated
    public final void b() {
        byef a = a(new Supplier() { // from class: byei
            @Override // java.util.function.Supplier
            public final Object get() {
                return new byeg();
            }
        });
        final dtve a2 = byfi.a();
        dtub.b(byfi.a(), "supersort_labels", a, new Function() { // from class: byed
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Long.valueOf(dtve.this.R("supersort_labels", (ContentValues) obj));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Consumer() { // from class: byee
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    public final void c(int i) {
        aE(0);
        this.a = i;
    }

    public final void d(String str) {
        aE(1);
        this.b = str;
    }

    public final void e(byfj byfjVar) {
        aE(2);
        this.c = byfjVar;
    }
}
