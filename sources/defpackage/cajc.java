package defpackage;

import com.google.communication.synapse.security.scytale.ReceiptError;
import com.google.communication.synapse.security.scytale.ReceiptInfo;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cajc extends caiv {
    @Override // defpackage.caiv
    public final void b(ReceiptInfo receiptInfo, cajk cajkVar) {
        cajj cajjVar;
        receiptInfo.getClass();
        cajkVar.getClass();
        ReceiptError error = receiptInfo.getError();
        if (error == null || (cajjVar = (cajj) new cajb().fP(error)) == null) {
            return;
        }
        cajkVar.copyOnWrite();
        cajl cajlVar = (cajl) cajkVar.instance;
        cajl cajlVar2 = cajl.a;
        cajlVar.e = cajjVar.a();
    }

    @Override // defpackage.caiv
    public final void c(ReceiptInfo receiptInfo, cajk cajkVar) {
        receiptInfo.getClass();
        cajkVar.getClass();
        if (receiptInfo.getSignature() == null) {
            return;
        }
        eyee x = eyee.x(receiptInfo.getSignature());
        cajkVar.copyOnWrite();
        cajl cajlVar = (cajl) cajkVar.instance;
        cajl cajlVar2 = cajl.a;
        cajlVar.b |= 1;
        cajlVar.f = x;
    }
}
