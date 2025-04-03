package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctjj extends ffhv implements ffjm {
    final /* synthetic */ ctqh a;
    final /* synthetic */ MessageCoreData b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctjj(ffgu ffguVar, ctqh ctqhVar, MessageCoreData messageCoreData) {
        super(2, ffguVar);
        this.a = ctqhVar;
        this.b = messageCoreData;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ctjj) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        MessageIdType B = this.b.B();
        B.getClass();
        return this.a.b(B);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ctjj ctjjVar = new ctjj(ffguVar, this.a, this.b);
        ctjjVar.c = obj;
        return ctjjVar;
    }
}
