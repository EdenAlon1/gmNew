package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tzt extends ffhv implements ffjm {
    int a;
    final /* synthetic */ tzv b;
    final /* synthetic */ ConversationIdType c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tzt(ffgu ffguVar, tzv tzvVar, ConversationIdType conversationIdType) {
        super(2, ffguVar);
        this.b = tzvVar;
        this.c = conversationIdType;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((tzt) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        bctx bctxVar;
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            bctxVar = (bctx) this.d;
            ffci.b(obj);
        } else {
            ffci.b(obj);
            tzv tzvVar = this.b;
            ConversationIdType conversationIdType = this.c;
            bctx bctxVar2 = tzvVar.b;
            this.d = bctxVar2;
            this.a = 1;
            obj = tzvVar.d.c(conversationIdType, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
            bctxVar = bctxVar2;
        }
        return bctxVar.a(engq.a((Collection) obj));
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        tzt tztVar = new tzt(ffguVar, this.b, this.c);
        tztVar.d = obj;
        return tztVar;
    }
}
