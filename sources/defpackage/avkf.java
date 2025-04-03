package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.function.Function$CC;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avkf {
    private final avkc a;

    public avkf(avkc avkcVar) {
        this.a = avkcVar;
    }

    public final awwf a(String str, String str2) {
        emxf.b(!str.isEmpty(), "RCS conversation id is empty");
        emxf.b(!str2.isEmpty(), "RCS group Uri is empty");
        awui a = this.a.a(str2, true);
        awwe awweVar = (awwe) awwf.a.createBuilder();
        awweVar.copyOnWrite();
        awwf awwfVar = (awwf) awweVar.instance;
        str.getClass();
        awwfVar.b = 1 | awwfVar.b;
        awwfVar.c = str;
        awweVar.copyOnWrite();
        awwf awwfVar2 = (awwf) awweVar.instance;
        a.getClass();
        awwfVar2.d = a;
        awwfVar2.b |= 2;
        return (awwf) awweVar.build();
    }

    public final awwf b(ConversationIdType conversationIdType) {
        return (awwf) bsom.i(conversationIdType, new Function() { // from class: avkd
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bseh bsehVar = (bseh) obj;
                return avkf.this.a(emxe.b(bsehVar.ad()), emxe.b(bsehVar.ac()));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Supplier() { // from class: avke
            @Override // java.util.function.Supplier
            public final Object get() {
                throw new IllegalArgumentException("Conversation not found");
            }
        });
    }
}
