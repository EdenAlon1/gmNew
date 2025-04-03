package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apzc implements apze {
    private final apzd a;
    private final apzj b;

    public apzc(apzd apzdVar, apzj apzjVar) {
        this.a = apzdVar;
        this.b = apzjVar;
    }

    private final apze d(apyv apyvVar) {
        if (apyvVar instanceof apxx) {
            return this.a;
        }
        if (apyvVar instanceof apyb) {
            return this.b;
        }
        throw new ffcd();
    }

    @Override // defpackage.apze
    public final appw a(MessageCoreData messageCoreData, apyv apyvVar, apyw apywVar, boolean z) {
        apywVar.getClass();
        return d(apyvVar).a(messageCoreData, apyvVar, apywVar, z);
    }

    @Override // defpackage.apze
    public final engw b(apyv apyvVar, apyw apywVar) {
        apywVar.getClass();
        return d(apyvVar).b(apyvVar, apywVar);
    }

    @Override // defpackage.apze
    public final void c(MessageCoreData messageCoreData, apyz apyzVar, alxg alxgVar, MessageCoreData messageCoreData2, boolean z) {
        apyzVar.getClass();
        alxgVar.getClass();
        d(apyzVar.b()).c(messageCoreData, apyzVar, alxgVar, messageCoreData2, z);
    }
}
