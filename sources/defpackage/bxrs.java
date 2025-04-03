package defpackage;

import android.content.ContentValues;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bxrs extends dtrr {
    public String a;
    public String b;
    public String c;
    public int d;
    public int e;
    public String f;
    public int g;
    public String h;
    public String i;

    public bxrs() {
        super(bxth.e());
        this.g = 0;
    }

    public final bxro a() {
        return b(new Supplier() { // from class: bxrr
            @Override // java.util.function.Supplier
            public final Object get() {
                return new bxrp();
            }
        });
    }

    public final bxro b(Supplier supplier) {
        Object obj;
        obj = supplier.get();
        bxro bxroVar = (bxro) obj;
        bxroVar.aC(aB());
        bxroVar.a = this.a;
        bxroVar.b = this.b;
        bxroVar.c = this.c;
        bxroVar.d = this.d;
        bxroVar.e = this.e;
        bxroVar.f = this.f;
        bxroVar.g = this.g;
        bxroVar.h = this.h;
        bxroVar.i = this.i;
        bxroVar.cK = aC();
        return bxroVar;
    }

    @Deprecated
    public final bxro c() {
        final bxro b = b(new Supplier() { // from class: bxrq
            @Override // java.util.function.Supplier
            public final Object get() {
                return new bxrp();
            }
        });
        final dtve b2 = bxth.b();
        dtub.b(bxth.b(), "self_participants", b, new Function() { // from class: bxrn
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Long.valueOf(dtve.this.R("self_participants", (ContentValues) obj));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Consumer() { // from class: bxri
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                final Long l = (Long) obj;
                if (l.longValue() >= 0) {
                    bxro bxroVar = bxro.this;
                    bxroVar.a = (String) new dtuj() { // from class: bxrl
                        @Override // defpackage.dtuj
                        public final Object a() {
                            return String.valueOf(l);
                        }
                    }.a();
                    bxroVar.fY(0);
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        return b;
    }

    public final void d(String str) {
        aE(7);
        this.h = str;
    }

    public final void e(String str) {
        aE(1);
        this.b = str;
    }

    public final void f(int i) {
        aE(3);
        this.d = i;
    }

    public final void g(String str) {
        int i = this.aB;
        if (i < 29080) {
            dtub.w("smsc", i);
        }
        aE(8);
        this.i = str;
    }

    public final void h(int i) {
        aE(4);
        this.e = i;
    }

    public final void i(int i) {
        aE(6);
        this.g = i;
    }

    public final void j(String str) {
        aE(5);
        this.f = str;
    }
}
