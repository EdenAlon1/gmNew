package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class degu extends ffhv implements ffjm {
    final /* synthetic */ ConversationIdType a;
    final /* synthetic */ int b;
    final /* synthetic */ degw c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public degu(ffgu ffguVar, ConversationIdType conversationIdType, int i, degw degwVar) {
        super(2, ffguVar);
        this.a = conversationIdType;
        this.b = i;
        this.c = degwVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((degu) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ensz enszVar = (ensz) degw.a.h();
        enszVar.Y(csux.O, "MessagesPageDataBuilder");
        enszVar.B("#loadLatestPage for conversation: %s, with page size: %s", this.a, this.b);
        if (this.c.f.a()) {
            engw y = ((bcsy) this.c.d.b()).c(this.a, this.b, 0).b().y();
            y.getClass();
            ArrayList arrayList = new ArrayList(ffdx.n(y, 10));
            enqv it = y.iterator();
            while (it.hasNext()) {
                arrayList.add(((cvgy) this.c.b.b()).a(((bcsf) this.c.e.b()).b((bgmp) it.next()), null, (Context) this.c.h.b()));
            }
            return arrayList;
        }
        engw y2 = ((bcsq) this.c.c.b()).d(this.a, this.b, 0).b().y();
        y2.getClass();
        ArrayList arrayList2 = new ArrayList(ffdx.n(y2, 10));
        enqv it2 = y2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((cvgy) this.c.b.b()).a(((bcsf) this.c.e.b()).d((bigm) it2.next()), null, (Context) this.c.h.b()));
        }
        return arrayList2;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        degu deguVar = new degu(ffguVar, this.a, this.b, this.c);
        deguVar.d = obj;
        return deguVar;
    }
}
