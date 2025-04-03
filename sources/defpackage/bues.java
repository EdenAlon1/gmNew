package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bues extends dtrr {
    public MessageIdType a;
    public MessageIdType b;
    public ajrb c;
    public bdhg d;

    public bues() {
        super(bufy.c());
        MessageIdType messageIdType = bdhb.a;
        this.a = messageIdType;
        this.b = messageIdType;
        this.c = ajrb.b(0);
        this.d = bdhg.a;
    }

    public final bueo a() {
        return b(new Supplier() { // from class: bueq
            @Override // java.util.function.Supplier
            public final Object get() {
                return new buep();
            }
        });
    }

    public final bueo b(Supplier supplier) {
        Object obj;
        obj = supplier.get();
        bueo bueoVar = (bueo) obj;
        bueoVar.aC(aB());
        bueoVar.a = this.a;
        bueoVar.b = this.b;
        bueoVar.c = this.c;
        bueoVar.d = this.d;
        bueoVar.cK = aC();
        return bueoVar;
    }

    public final bueo c() {
        bueo b = b(new Supplier() { // from class: buer
            @Override // java.util.function.Supplier
            public final Object get() {
                return new buep();
            }
        });
        final dtve a = bufy.a();
        dtub.b(bufy.a(), "message_replies", b, new Function() { // from class: buek
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Long.valueOf(dtve.this.S("message_replies", (ContentValues) obj));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Consumer() { // from class: buel
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        return b;
    }

    public final void d(MessageIdType messageIdType) {
        aE(0);
        this.a = messageIdType;
    }

    public final void e(MessageIdType messageIdType) {
        aE(1);
        this.b = messageIdType;
    }

    public final void f(ajrb ajrbVar) {
        aE(2);
        this.c = ajrbVar;
    }

    public final void g(bdhg bdhgVar) {
        aE(3);
        this.d = bdhgVar;
    }
}
