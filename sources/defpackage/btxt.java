package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.time.Instant;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class btxt extends dtrr {
    public MessageIdType a;
    public MessageIdType b;
    public bdhg c;
    public Instant d;
    public Instant e;

    public btxt() {
        super(btza.c());
        MessageIdType messageIdType = bdhb.a;
        this.a = messageIdType;
        this.b = messageIdType;
        this.c = bdhg.a;
        this.d = Instant.EPOCH;
        this.e = Instant.EPOCH;
    }

    public final btxp a(Supplier supplier) {
        Object obj;
        obj = supplier.get();
        btxp btxpVar = (btxp) obj;
        btxpVar.aC(aB());
        btxpVar.a = this.a;
        btxpVar.b = this.b;
        btxpVar.c = this.c;
        btxpVar.d = this.d;
        btxpVar.e = this.e;
        btxpVar.cK = aC();
        return btxpVar;
    }

    public final void b() {
        btxp a = a(new Supplier() { // from class: btxr
            @Override // java.util.function.Supplier
            public final Object get() {
                return new btxq();
            }
        });
        final dtve a2 = btza.a();
        dtub.b(btza.a(), "message_edits", a, new Function() { // from class: btxl
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Long.valueOf(dtve.this.S("message_edits", (ContentValues) obj));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Consumer() { // from class: btxm
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    public final void c(Instant instant) {
        aE(3);
        this.d = instant;
    }

    public final void d(MessageIdType messageIdType) {
        aE(1);
        this.b = messageIdType;
    }

    public final void e(MessageIdType messageIdType) {
        aE(0);
        this.a = messageIdType;
    }

    public final void f(bdhg bdhgVar) {
        aE(2);
        this.c = bdhgVar;
    }

    public final void g(Instant instant) {
        aE(4);
        this.e = instant;
    }
}
