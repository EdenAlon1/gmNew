package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bucs extends dtrr {
    public long a;
    public MessageIdType b;
    public cmrf c;
    public MessageIdType d;
    public cmrv e;
    public cmrl f;
    public cmrl g;

    public bucs() {
        super(bueg.h());
        MessageIdType messageIdType = bdhb.a;
        this.b = messageIdType;
        this.d = messageIdType;
        this.e = cmrv.b(0);
    }

    public final buco a() {
        return b(new Supplier() { // from class: bucq
            @Override // java.util.function.Supplier
            public final Object get() {
                return new bucp();
            }
        });
    }

    public final buco b(Supplier supplier) {
        Object obj;
        obj = supplier.get();
        buco bucoVar = (buco) obj;
        bucoVar.aC(aB());
        bucoVar.a = this.a;
        bucoVar.b = this.b;
        bucoVar.c = this.c;
        bucoVar.d = this.d;
        bucoVar.e = this.e;
        bucoVar.f = this.f;
        bucoVar.g = this.g;
        bucoVar.cK = aC();
        return bucoVar;
    }

    public final void c(cmrl cmrlVar) {
        int i = this.aB;
        if (i < 59520) {
            dtub.w("animation_effect", i);
        }
        aE(6);
        this.g = cmrlVar;
    }

    public final void d(cmrl cmrlVar) {
        int i = this.aB;
        if (i < 59060) {
            dtub.w("applied_reaction", i);
        }
        aE(5);
        this.f = cmrlVar;
    }

    public final void e(MessageIdType messageIdType) {
        aE(1);
        this.b = messageIdType;
    }

    public final void f(MessageIdType messageIdType) {
        int i = this.aB;
        if (i < 46020) {
            dtub.w("reacted_message_id", i);
        }
        aE(3);
        this.d = messageIdType;
    }

    public final void g(cmrv cmrvVar) {
        int i = this.aB;
        if (i < 48000) {
            dtub.w("reaction", i);
        }
        aE(4);
        this.e = cmrvVar;
    }

    public final void h(cmrf cmrfVar) {
        aE(2);
        this.c = cmrfVar;
    }
}
