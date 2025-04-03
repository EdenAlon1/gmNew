package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.BitSet;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class btor extends dtrr {
    public long a;
    public MessageIdType b;
    public String c;
    public long d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public boolean j;
    public boolean k;

    public btor() {
        super(btqq.g());
        this.b = bdhb.a;
        this.d = 0L;
        this.j = false;
        this.k = false;
    }

    public final bton a() {
        return b(new Supplier() { // from class: btoq
            @Override // java.util.function.Supplier
            public final Object get() {
                return new btoo();
            }
        });
    }

    public final bton b(Supplier supplier) {
        Object obj;
        obj = supplier.get();
        bton btonVar = (bton) obj;
        btonVar.aC(aB());
        btonVar.a = this.a;
        btonVar.b = this.b;
        btonVar.c = this.c;
        btonVar.d = this.d;
        btonVar.e = this.e;
        btonVar.f = this.f;
        btonVar.g = this.g;
        btonVar.h = this.h;
        btonVar.i = this.i;
        btonVar.j = this.j;
        btonVar.k = this.k;
        btonVar.cK = aC();
        return btonVar;
    }

    public final void c(bton btonVar, boolean z, BitSet bitSet) {
        this.az = bitSet == null ? null : (BitSet) bitSet.clone();
        if (z) {
            BitSet bitSet2 = this.az;
            if (bitSet2 != null) {
                bitSet2.clear(0);
            }
        } else {
            BitSet bitSet3 = this.az;
            if (bitSet3 == null || bitSet3.get(0)) {
                btonVar.az(0, "_id");
                this.a = btonVar.a;
            }
        }
        BitSet bitSet4 = this.az;
        if (bitSet4 == null || bitSet4.get(1)) {
            this.b = btonVar.l();
        }
        BitSet bitSet5 = this.az;
        if (bitSet5 == null || bitSet5.get(2)) {
            this.c = btonVar.s();
        }
        BitSet bitSet6 = this.az;
        if (bitSet6 == null || bitSet6.get(3)) {
            this.d = btonVar.k();
        }
        BitSet bitSet7 = this.az;
        if (bitSet7 == null || bitSet7.get(4)) {
            this.e = btonVar.r();
        }
        BitSet bitSet8 = this.az;
        if (bitSet8 == null || bitSet8.get(5)) {
            this.f = btonVar.n();
        }
        BitSet bitSet9 = this.az;
        if (bitSet9 == null || bitSet9.get(6)) {
            this.g = btonVar.q();
        }
        BitSet bitSet10 = this.az;
        if (bitSet10 == null || bitSet10.get(7)) {
            this.h = btonVar.o();
        }
        BitSet bitSet11 = this.az;
        if (bitSet11 == null || bitSet11.get(8)) {
            this.i = btonVar.m();
        }
        BitSet bitSet12 = this.az;
        if (bitSet12 == null || bitSet12.get(9)) {
            this.j = btonVar.w();
        }
        BitSet bitSet13 = this.az;
        if (bitSet13 == null || bitSet13.get(10)) {
            this.k = btonVar.v();
        }
    }

    public final void d() {
        final bton b = b(new Supplier() { // from class: btop
            @Override // java.util.function.Supplier
            public final Object get() {
                return new btoo();
            }
        });
        final dtve c = btqq.c();
        dtub.b(btqq.c(), "link_preview", b, new Function() { // from class: btoh
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Long.valueOf(dtve.this.S("link_preview", (ContentValues) obj));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Consumer() { // from class: btoi
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                bton.this.u((Long) obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    public final void e(long j) {
        aE(3);
        this.d = j;
    }

    public final void f(String str) {
        aE(8);
        this.i = str;
    }

    public final void g(String str) {
        aE(5);
        if (!this.aC) {
            str = cuxs.a(str);
        }
        this.f = str;
    }

    public final void h(String str) {
        aE(7);
        this.h = str;
    }

    public final void i(String str) {
        aE(6);
        this.g = str;
    }

    public final void j(boolean z) {
        int i = this.aB;
        if (i < 22020) {
            dtub.w("link_preview_failed", i);
        }
        aE(10);
        this.k = z;
    }

    public final void k(boolean z) {
        int i = this.aB;
        if (i < 21010) {
            dtub.w("link_preview_prevented", i);
        }
        aE(9);
        this.j = z;
    }

    public final void l(String str) {
        aE(4);
        if (!this.aC) {
            str = cuxs.a(str);
        }
        this.e = str;
    }

    public final void m(MessageIdType messageIdType) {
        aE(1);
        this.b = messageIdType;
    }

    public final void n(String str) {
        aE(2);
        this.c = str;
    }
}
