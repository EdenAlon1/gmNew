package defpackage;

import com.google.communication.synapse.security.scytale.DecryptResult;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
abstract class caiu implements Function {
    @Override // java.util.function.Function
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final caiz apply(DecryptResult decryptResult) {
        caiy caiyVar = (caiy) caiz.a.createBuilder();
        if (decryptResult.getStatus() != null) {
            caje cajeVar = (caje) cajd.a.fP(decryptResult.getStatus());
            caiyVar.copyOnWrite();
            ((caiz) caiyVar.instance).c = cajeVar.a();
        }
        if (decryptResult.getDecryptedMessage() != null) {
            b(decryptResult, caiyVar);
        }
        c(decryptResult, caiyVar);
        return (caiz) caiyVar.build();
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo448andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    public abstract void b(DecryptResult decryptResult, caiy caiyVar);

    public abstract void c(DecryptResult decryptResult, caiy caiyVar);

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
