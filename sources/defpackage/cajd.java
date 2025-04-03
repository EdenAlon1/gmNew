package defpackage;

import com.google.communication.synapse.security.scytale.DecryptResult;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cajd extends caiu {
    public static final emwd a = new caja();
    public static final emwd b = new cajb();

    @Override // defpackage.caiu
    public final void b(DecryptResult decryptResult, caiy caiyVar) {
        decryptResult.getClass();
        caiyVar.getClass();
        if (decryptResult.getDecryptedMessage() == null) {
            return;
        }
        eyee x = eyee.x(decryptResult.getDecryptedMessage());
        caiyVar.copyOnWrite();
        caiz caizVar = (caiz) caiyVar.instance;
        caiz caizVar2 = caiz.a;
        caizVar.b |= 1;
        caizVar.d = x;
    }

    @Override // defpackage.caiu
    public final void c(DecryptResult decryptResult, caiy caiyVar) {
        decryptResult.getClass();
        caiyVar.getClass();
        if (decryptResult.getReceipt() == null) {
            return;
        }
        cajl apply = new cajc().apply(decryptResult.getReceipt());
        caiyVar.copyOnWrite();
        caiz caizVar = (caiz) caiyVar.instance;
        caiz caizVar2 = caiz.a;
        apply.getClass();
        caizVar.e = apply;
        caizVar.b |= 2;
    }
}
