package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bscn extends dtrr {
    public ConversationIdType a;
    public long b;
    public awwp c;
    public bdpy d;

    public bscn() {
        super(bsdr.c());
        this.a = bdgq.a;
        this.c = awwp.UNKNOWN_STATE;
        this.d = bdqb.b();
    }

    public final bscj a() {
        return b(new Supplier() { // from class: bscl
            @Override // java.util.function.Supplier
            public final Object get() {
                return new bsck();
            }
        });
    }

    public final bscj b(Supplier supplier) {
        Object obj;
        obj = supplier.get();
        bscj bscjVar = (bscj) obj;
        bscjVar.aC(aB());
        bscjVar.a = this.a;
        bscjVar.b = this.b;
        bscjVar.c = this.c;
        bscjVar.d = this.d;
        bscjVar.cK = aC();
        return bscjVar;
    }

    public final void c() {
        bscj b = b(new Supplier() { // from class: bscm
            @Override // java.util.function.Supplier
            public final Object get() {
                return new bsck();
            }
        });
        final dtve a = bsdr.a();
        dtub.b(bsdr.a(), "conversation_to_participants", b, new Function() { // from class: bscg
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Long.valueOf(dtve.this.S("conversation_to_participants", (ContentValues) obj));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Consumer() { // from class: bsch
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    public final void d(ConversationIdType conversationIdType) {
        aE(0);
        this.a = conversationIdType;
    }

    public final void e(bdpy bdpyVar) {
        aE(3);
        this.d = bdpyVar;
    }

    public final void f(long j) {
        aE(1);
        this.b = j;
    }

    public final void g(awwp awwpVar) {
        aE(2);
        this.c = awwpVar;
    }
}
