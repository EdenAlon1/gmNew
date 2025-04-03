package defpackage;

import com.google.communication.synapse.security.scytale.ReceiptInfo;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
abstract class caiv implements Function {
    @Override // java.util.function.Function
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final cajl apply(ReceiptInfo receiptInfo) {
        cajk cajkVar = (cajk) cajl.a.createBuilder();
        if (receiptInfo.getMessageId() != null) {
            String messageId = receiptInfo.getMessageId();
            cajkVar.copyOnWrite();
            cajl cajlVar = (cajl) cajkVar.instance;
            messageId.getClass();
            cajlVar.c = messageId;
        }
        long messageTimestampUsec = receiptInfo.getMessageTimestampUsec();
        cajkVar.copyOnWrite();
        ((cajl) cajkVar.instance).d = messageTimestampUsec;
        b(receiptInfo, cajkVar);
        if (receiptInfo.getSignature() != null) {
            c(receiptInfo, cajkVar);
        }
        return (cajl) cajkVar.build();
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo448andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    public abstract void b(ReceiptInfo receiptInfo, cajk cajkVar);

    public abstract void c(ReceiptInfo receiptInfo, cajk cajkVar);

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
