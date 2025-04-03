package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cajx extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cakc b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cajx(ffgu ffguVar, cakc cakcVar) {
        super(2, ffguVar);
        this.b = cakcVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cajx) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            ffci.b(obj);
        } else {
            ffci.b(obj);
            elfl b = ((aqkp) this.b.a.b()).d(new BugleConversationId(this.b.e.a)).b();
            this.a = 1;
            obj = fgfz.c(b, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        obj.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (Iterable) obj) {
            if (((ResolvedRecipient) obj2).g().e().isPresent()) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cajx cajxVar = new cajx(ffguVar, this.b);
        cajxVar.c = obj;
        return cajxVar;
    }
}
