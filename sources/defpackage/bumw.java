package defpackage;

import android.content.ContentValues;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bumw extends dtrr {
    public long a;
    public String b;
    public long c;
    public int d;
    public aliu e;
    public String f;

    public bumw() {
        super(buoc.b());
        this.c = 0L;
        this.d = 0;
    }

    public final bums a(Supplier supplier) {
        Object obj;
        obj = supplier.get();
        bums bumsVar = (bums) obj;
        bumsVar.aC(aB());
        bumsVar.a = this.a;
        bumsVar.b = this.b;
        bumsVar.c = this.c;
        bumsVar.d = this.d;
        bumsVar.e = this.e;
        bumsVar.f = this.f;
        bumsVar.cK = aC();
        return bumsVar;
    }

    @Deprecated
    public final void b() {
        final bums a = a(new Supplier() { // from class: bumv
            @Override // java.util.function.Supplier
            public final Object get() {
                return new bumt();
            }
        });
        final dtve a2 = buoc.a();
        dtub.b(buoc.a(), "message_status", a, new Function() { // from class: bump
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Long.valueOf(dtve.this.R("message_status", (ContentValues) obj));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Consumer() { // from class: bumq
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                Long l = (Long) obj;
                if (l.longValue() >= 0) {
                    bums bumsVar = bums.this;
                    bumsVar.a = new bumr(l).a.longValue();
                    bumsVar.fY(0);
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    public final void c(aliu aliuVar) {
        aE(4);
        this.e = aliuVar;
    }

    public final void d(String str) {
        aE(5);
        this.f = str;
    }

    public final void e(String str) {
        aE(1);
        this.b = str;
    }

    public final void f(int i) {
        aE(3);
        this.d = i;
    }

    public final void g(long j) {
        aE(2);
        this.c = j;
    }
}
