package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.message.internal.CoreBugleMessageId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.time.Instant;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aqfe extends dtrs {
    public static final /* synthetic */ int c = 0;
    public final ffji a;
    final /* synthetic */ aqff b;

    public aqfe(aqff aqffVar, ffji ffjiVar) {
        this.b = aqffVar;
        this.a = ffjiVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dtrs
    public final /* synthetic */ void b(dtyq dtyqVar, dtuk dtukVar) {
        final List list;
        dtro b = dtukVar.b();
        final bysc byscVar = b instanceof bysc ? (bysc) b : null;
        if (byscVar == null) {
            list = ffel.a;
        } else {
            buxo d = MessagesTable.d();
            d.z("UserReferenceChangeQueryListener::getChangedMessages");
            d.e(new Function() { // from class: aqez
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    buum buumVar = (buum) obj;
                    int i = aqfe.c;
                    return new buun[]{buumVar.a, buumVar.b, buumVar.i};
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            d.h(new Function() { // from class: aqfa
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    buxz buxzVar = (buxz) obj;
                    int i = aqfe.c;
                    buxzVar.q(bysc.this.m());
                    return buxzVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            d.h(new Function() { // from class: aqfb
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    buxz buxzVar = (buxz) obj;
                    int i = aqfe.c;
                    buxzVar.ai(aqff.a);
                    return buxzVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            engw y = d.b().y();
            y.getClass();
            ArrayList arrayList = new ArrayList(ffdx.n(y, 10));
            enqv it = y.iterator();
            while (it.hasNext()) {
                MessagesTable.BindData bindData = (MessagesTable.BindData) it.next();
                alxd alxdVar = alxd.UPDATE;
                CoreBugleMessageId coreBugleMessageId = new CoreBugleMessageId(bindData.D(), -1L);
                ConversationIdType C = bindData.C();
                if (C == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                arrayList.add(new apsl(alxdVar, coreBugleMessageId, new BugleConversationId(C), Instant.ofEpochMilli(bindData.w()), 0));
            }
            list = arrayList;
        }
        if (list.isEmpty()) {
            return;
        }
        ((dtuu) this.b.b.b()).g(new dtut() { // from class: aqfc
            @Override // defpackage.dtut
            public final ekzz a() {
                int i = aqfe.c;
                return eleg.f("UserReferenceChangeQueryListener::onChangeInTransaction");
            }
        }, String.valueOf(list.hashCode()), new Runnable() { // from class: aqfd
            @Override // java.lang.Runnable
            public final void run() {
                aqfe.this.a.invoke(engq.a(list));
            }
        });
    }
}
