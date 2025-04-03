package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bczu extends ffhv implements ffjm {
    final /* synthetic */ bczv a;
    final /* synthetic */ ConversationIdType b;
    final /* synthetic */ amer c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bczu(bczv bczvVar, ConversationIdType conversationIdType, amer amerVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = bczvVar;
        this.b = conversationIdType;
        this.c = amerVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bczu) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        Object b = this.a.a.b();
        b.getClass();
        Iterator it = ((Iterable) b).iterator();
        while (it.hasNext()) {
            amer amerVar = this.c;
            ((bczr) it.next()).a(this.b, amerVar);
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new bczu(this.a, this.b, this.c, ffguVar);
    }
}
