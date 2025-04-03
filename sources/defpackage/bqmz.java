package defpackage;

import android.content.ContentValues;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bqmz extends dtrr {
    public long a;
    public long b;
    public long c;
    public String d;
    public long e;
    public long f;
    public long g;

    public bqmz() {
        super(bqon.a().P());
    }

    public final bqmv a() {
        return b(new Supplier() { // from class: bqmx
            @Override // java.util.function.Supplier
            public final Object get() {
                return new bqmw();
            }
        });
    }

    public final bqmv b(Supplier supplier) {
        Object obj;
        obj = supplier.get();
        bqmv bqmvVar = (bqmv) obj;
        bqmvVar.aC(aB());
        bqmvVar.a = this.a;
        bqmvVar.b = this.b;
        bqmvVar.c = this.c;
        bqmvVar.d = this.d;
        bqmvVar.e = this.e;
        bqmvVar.f = this.f;
        bqmvVar.g = this.g;
        bqmvVar.cK = aC();
        return bqmvVar;
    }

    public final void c() {
        final bqmv b = b(new Supplier() { // from class: bqmy
            @Override // java.util.function.Supplier
            public final Object get() {
                return new bqmw();
            }
        });
        final dtve a = bqon.a();
        dtub.b(bqon.a(), "cms_incremental_events", b, new Function() { // from class: bqmt
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Long.valueOf(dtve.this.S("cms_incremental_events", (ContentValues) obj));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Consumer() { // from class: bqmu
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                bqmv.this.q((Long) obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    public final void d(long j) {
        aE(4);
        this.e = j;
    }

    public final void e(String str) {
        aE(3);
        this.d = str;
    }

    public final void f(long j) {
        aE(5);
        this.f = j;
    }

    public final void g(long j) {
        aE(6);
        this.g = j;
    }

    public final void h(long j) {
        aE(2);
        this.c = j;
    }

    public final void i(long j) {
        aE(1);
        this.b = j;
    }
}
