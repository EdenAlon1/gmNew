package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.DefaultConversation;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class amwt extends ffhv implements ffjm {
    Object a;
    Object b;
    Object c;
    Object d;
    int e;
    final /* synthetic */ amwu f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amwt(amwu amwuVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.f = amwuVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((amwt) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        amwu amwuVar;
        fffs fffsVar;
        fffs fffsVar2;
        Object obj2;
        fffs fffsVar3;
        ?? r1;
        ffhh ffhhVar = ffhh.a;
        int i = this.e;
        if (i == 0) {
            ffci.b(obj);
            amwuVar = this.f;
            fffsVar = new fffs((byte[]) null);
            cfzc cfzcVar = new cfzc();
            cfzcVar.b("conversation_id");
            cfzcVar.c(((DefaultConversation) amwuVar.a).a.b());
            fffsVar.add(cfzcVar.a());
            this.a = amwuVar;
            this.b = fffsVar;
            this.c = fffsVar;
            this.d = fffsVar;
            this.e = 1;
            obj = amwuVar.a(this);
            if (obj != ffhhVar) {
                fffsVar2 = fffsVar;
                obj2 = fffsVar2;
            }
            return ffhhVar;
        }
        if (i != 1) {
            ?? r0 = this.b;
            List list = (List) this.a;
            ffci.b(obj);
            fffsVar3 = r0;
            r1 = list;
            fffsVar3.add(obj);
            return ffdx.a(r1);
        }
        ?? r12 = this.d;
        ?? r2 = this.c;
        obj2 = this.b;
        amwuVar = (amwu) this.a;
        ffci.b(obj);
        fffsVar2 = r12;
        fffsVar = r2;
        fffsVar2.add(obj);
        this.a = obj2;
        this.b = fffsVar;
        this.c = null;
        this.d = null;
        this.e = 2;
        obj = amwuVar.f(this);
        if (obj != ffhhVar) {
            fffsVar3 = fffsVar;
            r1 = obj2;
            fffsVar3.add(obj);
            return ffdx.a(r1);
        }
        return ffhhVar;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new amwt(this.f, ffguVar);
    }
}
