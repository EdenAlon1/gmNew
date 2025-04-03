package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctki extends ffhv implements ffjm {
    final /* synthetic */ ctko a;
    final /* synthetic */ MessageCoreData b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctki(ffgu ffguVar, ctko ctkoVar, MessageCoreData messageCoreData) {
        super(2, ffguVar);
        this.a = ctkoVar;
        this.b = messageCoreData;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ctki) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ctqh ctqhVar = (ctqh) this.a.b.b();
        MessageIdType B = this.b.B();
        B.getClass();
        return ctqhVar.e(B).orElse(null);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ctki ctkiVar = new ctki(ffguVar, this.a, this.b);
        ctkiVar.c = obj;
        return ctkiVar;
    }
}
