package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bczp implements Function {
    final /* synthetic */ axcl a;
    final /* synthetic */ ConversationIdType b;

    public bczp(axcl axclVar, ConversationIdType conversationIdType) {
        this.a = axclVar;
        this.b = conversationIdType;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo448andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        brbr brbrVar = (brbr) obj;
        brbrVar.c(this.a);
        brbrVar.d(this.b);
        return brbrVar;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
