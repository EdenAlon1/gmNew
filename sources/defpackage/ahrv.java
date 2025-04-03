package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahrv extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ahrw b;
    final /* synthetic */ ConversationIdType c;
    final /* synthetic */ List d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahrv(ahrw ahrwVar, ConversationIdType conversationIdType, List list, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ahrwVar;
        this.c = conversationIdType;
        this.d = list;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ahrv) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        ahrw ahrwVar = this.b;
        ConversationIdType conversationIdType = this.c;
        List list = this.d;
        this.a = 1;
        Object d = ahrwVar.d(conversationIdType, list, this);
        return d == ffhhVar ? ffhhVar : d;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ahrv(this.b, this.c, this.d, ffguVar);
    }
}
