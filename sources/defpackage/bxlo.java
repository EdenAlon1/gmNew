package defpackage;

import android.content.ContentValues;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bxlo extends dtrr {
    public long a;
    public long b;
    public akcg c;
    public bxmw d;
    public bxmv e;

    public bxlo() {
        super(bxmu.a().P());
    }

    public final bxlk a(Supplier supplier) {
        Object obj;
        obj = supplier.get();
        bxlk bxlkVar = (bxlk) obj;
        bxlkVar.aC(aB());
        bxlkVar.a = this.a;
        bxlkVar.b = this.b;
        bxlkVar.c = this.c;
        bxlkVar.d = this.d;
        bxlkVar.e = this.e;
        bxlkVar.cK = aC();
        return bxlkVar;
    }

    public final void b() {
        final bxlk a = a(new Supplier() { // from class: bxlm
            @Override // java.util.function.Supplier
            public final Object get() {
                return new bxll();
            }
        });
        final dtve a2 = bxmu.a();
        dtub.b(bxmu.a(), "restore_workflow_files", a, new Function() { // from class: bxlh
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Long.valueOf(dtve.this.S("restore_workflow_files", (ContentValues) obj));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Consumer() { // from class: bxli
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                Long l = (Long) obj;
                if (l.longValue() >= 0) {
                    bxlk bxlkVar = bxlk.this;
                    bxlkVar.a = new bxlj(l).a.longValue();
                    bxlkVar.fY(0);
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    public final void c(akcg akcgVar) {
        aE(2);
        this.c = akcgVar;
    }

    public final void d(bxmw bxmwVar) {
        aE(3);
        this.d = bxmwVar;
    }

    public final void e(bxmv bxmvVar) {
        aE(4);
        this.e = bxmvVar;
    }

    public final void f(long j) {
        aE(1);
        this.b = j;
    }
}
