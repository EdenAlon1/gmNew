package defpackage;

import com.google.android.rcs.client.messaging.AddUserToGroupRequest;
import com.google.android.rcs.client.messaging.data.Conversation;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes5.dex */
abstract class eikz implements Function {
    public abstract void a(clni clniVar, ehxt ehxtVar);

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo448andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    public abstract void b(clni clniVar, ehxt ehxtVar);

    public abstract void c(ehxt ehxtVar);

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }

    @Override // java.util.function.Function
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final AddUserToGroupRequest apply(clni clniVar) {
        ehyd ehydVar = new ehyd();
        c(ehydVar);
        if ((clniVar.b & 4) != 0) {
            emwd emwdVar = eiky.a;
            clns clnsVar = clniVar.d;
            if (clnsVar == null) {
                clnsVar = clns.a;
            }
            ehydVar.b((Conversation) emwdVar.fP(clnsVar));
        }
        b(clniVar, ehydVar);
        a(clniVar, ehydVar);
        return ehydVar.a();
    }
}
