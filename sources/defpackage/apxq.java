package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import j$.time.Instant;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class apxq extends ffhv implements ffjm {
    int a;
    final /* synthetic */ apxr b;
    final /* synthetic */ MessageId c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apxq(apxr apxrVar, MessageId messageId, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = apxrVar;
        this.c = messageId;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((apxq) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        engw c;
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        apxr apxrVar = this.b;
        final MessageId messageId = this.c;
        this.a = 1;
        String[] strArr = btza.a;
        btyv btyvVar = new btyv(btza.a);
        btyvVar.z("+loadEditHistory");
        btyvVar.g(new Function() { // from class: apxo
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                btyz btyzVar = (btyz) obj2;
                MessageId messageId2 = MessageId.this;
                if (!(messageId2 instanceof apah)) {
                    throw new IllegalStateException("Unsupported message id type.");
                }
                MessageIdType c2 = ((apah) messageId2).c();
                c2.getClass();
                btyzVar.aq(new dtrt("message_edits.latest_message_id", 1, Long.valueOf(bdhb.a(c2))));
                return btyzVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        btyvVar.e(new Function() { // from class: apxp
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                return new btyi[]{((btyh) obj2).e};
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        btyvVar.d(new btys(btza.c.d));
        btyvVar.G(dtvz.i(apag.c(null, null, null, null, 15).b(), MessagesTable.c.a, btza.c.a).g());
        engw cW = ((btyj) btyvVar.b().o()).cW();
        cW.getClass();
        ArrayList arrayList = new ArrayList();
        enqv it = cW.iterator();
        while (it.hasNext()) {
            btxp btxpVar = (btxp) it.next();
            MessagesTable.BindData bindData = (MessagesTable.BindData) btxpVar.aw("messages", MessagesTable.BindData.class);
            if (bindData == null) {
                c = null;
            } else {
                aptd aptdVar = apxrVar.a;
                String[] strArr2 = PartsTable.a;
                dtro[] aG = btxpVar.aG("parts", new PartsTable.BindData[0]);
                aG.getClass();
                c = aptdVar.c(bindData, engq.c(aG), new BugleConversationId(bindData.C()), apxrVar.d, apxrVar.b, apug.n, apxrVar.c);
                enqv it2 = c.iterator();
                it2.getClass();
                while (it2.hasNext()) {
                    alxr alxrVar = (alxr) it2.next();
                    alxrVar.getClass();
                    Instant m = btxpVar.m();
                    m.getClass();
                    ((aork) alxrVar).g = m;
                }
            }
            if (c != null) {
                arrayList.add(c);
            }
        }
        engw a = engq.a(ffdx.o(arrayList));
        return a == ffhhVar ? ffhhVar : a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new apxq(this.b, this.c, ffguVar);
    }
}
