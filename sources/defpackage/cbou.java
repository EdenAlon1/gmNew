package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.function.Function$CC;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbou implements cbop {
    public final cbpl a;
    private final cbsf b;
    private final errl c;
    private final errl d;

    public cbou(cbsf cbsfVar, cbpl cbplVar, errl errlVar, errl errlVar2) {
        this.b = cbsfVar;
        this.a = cbplVar;
        this.c = errlVar;
        this.d = errlVar2;
    }

    @Override // defpackage.cbop
    public final elfl a(final String str) {
        return elfo.g(new Callable() { // from class: cbot
            @Override // java.util.concurrent.Callable
            public final Object call() {
                cbnb g = cbou.this.a.g(str, cbne.e());
                boolean z = false;
                if (g != null && !g.c()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }, this.d);
    }

    @Override // defpackage.cbop
    public final elfl b(String str, final ConversationIdType conversationIdType) {
        if (TextUtils.isEmpty(str)) {
            int i = engw.d;
            return elfo.e(enou.a);
        }
        final Function function = new Function() { // from class: cboq
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function2) {
                return Function$CC.$default$andThen(this, function2);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                List list = (List) obj;
                if (list == null || list.isEmpty()) {
                    int i2 = engw.d;
                    return enou.a;
                }
                enin eninVar = new enin();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    eninVar.c(Long.valueOf(((cbnf) it.next()).a()));
                }
                ConversationIdType conversationIdType2 = conversationIdType;
                cbou cbouVar = cbou.this;
                return cbouVar.a.l(eninVar.g(), conversationIdType2);
            }

            public final /* synthetic */ Function compose(Function function2) {
                return Function$CC.$default$compose(this, function2);
            }
        };
        return this.b.b(str).h(new emwl() { // from class: cbor
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                Object apply;
                apply = Function.this.apply((List) obj);
                return (List) apply;
            }
        }, this.c).e(cbse.class, new emwl() { // from class: cbos
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                Object apply;
                apply = Function.this.apply(((cbse) obj).a);
                return (List) apply;
            }
        }, this.c);
    }
}
