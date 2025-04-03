package defpackage;

import android.database.sqlite.SQLiteConstraintException;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ydj extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ydq b;
    final /* synthetic */ xhu c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ydj(ffgu ffguVar, ydq ydqVar, xhu xhuVar) {
        super(2, ffguVar);
        this.b = ydqVar;
        this.c = xhuVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ydj) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object obj2 = ffhh.a;
        try {
            if (this.a != 0) {
                ffci.b(obj);
            } else {
                ffci.b(obj);
                ensk e = ydq.a.e();
                e.Y(ente.a, "BugleComposeRow2");
                enrr enrrVar = (enrr) e;
                enrrVar.Y(csux.q, this.b.b);
                ((enrr) enrrVar.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/data/persistence/ConversationDraftPersistence$save$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 77, "ConversationDraftPersistence.kt")).t("Persistence saving draft %s", this.c);
                final ydq ydqVar = this.b;
                final xhu xhuVar = this.c;
                this.a = 1;
                elfl l = ydqVar.a(new ffji() { // from class: ydc
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj3) {
                        bswp bswpVar = (bswp) obj3;
                        bswpVar.getClass();
                        Iterator it = ydq.this.e.iterator();
                        while (it.hasNext()) {
                            ((yei) it.next()).c(bswpVar, xhuVar);
                        }
                        return ffcu.a;
                    }
                }).l();
                l.getClass();
                Object c = fgfz.c(l, this);
                if (c != ffhh.a) {
                    c = ffcu.a;
                }
                if (c == obj2) {
                    return obj2;
                }
            }
        } catch (SQLiteConstraintException e2) {
            ensk j = ydq.a.j();
            j.Y(ente.a, "BugleComposeRow2");
            ((enrr) ((enrr) j).g(e2).h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/data/persistence/ConversationDraftPersistence$save$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 84, "ConversationDraftPersistence.kt")).q("Draft was not persisted because conversation was already deleted");
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ydj ydjVar = new ydj(ffguVar, this.b, this.c);
        ydjVar.d = obj;
        return ydjVar;
    }
}
