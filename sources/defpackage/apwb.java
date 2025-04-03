package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.message.internal.CoreBugleMessageId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import j$.time.Instant;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apwb extends dtrs {
    public static final /* synthetic */ int b = 0;
    public final ffji a;
    private final dtuu c;

    public apwb(dtuu dtuuVar, ffji ffjiVar) {
        this.c = dtuuVar;
        this.a = ffjiVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dtrs
    public final /* synthetic */ void b(dtyq dtyqVar, dtuk dtukVar) {
        final ArrayList arrayList;
        bwdh bwdhVar = (bwdh) dtukVar.d();
        if (bwdhVar == null) {
            arrayList = new ArrayList();
        } else {
            bwdf c = PartsTable.c();
            c.z("MPSCQL::onChangeInTransaction::update");
            c.e(new Function() { // from class: apvz
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    int i = apwb.b;
                    return new bwau[]{((bwat) obj).b};
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            enqv it = bwdhVar.e.iterator();
            while (it.hasNext()) {
                duap duapVar = (duap) it.next();
                duapVar.getClass();
                c.k((bwdj) duapVar);
            }
            buxo d = MessagesTable.d();
            d.z("MPSCQL::onChangeInTransaction::update2");
            d.e(new Function() { // from class: apwa
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    buum buumVar = (buum) obj;
                    int i = apwb.b;
                    return new buun[]{buumVar.a, buumVar.b, buumVar.i};
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            d.F(dtvz.i(c.b(), PartsTable.d.b, MessagesTable.c.a));
            dtsu o = d.b().o();
            try {
                buuo buuoVar = (buuo) o;
                alxd alxdVar = alxd.UPDATE;
                ArrayList arrayList2 = new ArrayList();
                while (buuoVar.moveToNext()) {
                    MessagesTable.BindData bindData = (MessagesTable.BindData) buuoVar.cO();
                    CoreBugleMessageId coreBugleMessageId = new CoreBugleMessageId(bindData.D(), -1L);
                    ConversationIdType C = bindData.C();
                    if (C == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    arrayList2.add(new apsl(alxdVar, coreBugleMessageId, new BugleConversationId(C), Instant.ofEpochMilli(bindData.w()), 0));
                }
                ffig.a(o, null);
                arrayList = arrayList2;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    ffig.a(o, th);
                    throw th2;
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        this.c.g(new dtut() { // from class: apvx
            @Override // defpackage.dtut
            public final ekzz a() {
                int i = apwb.b;
                return eleg.f("MPSCQL::onChangeInTransaction::runAfterCommit");
            }
        }, String.valueOf(arrayList.hashCode()), new Runnable() { // from class: apvy
            @Override // java.lang.Runnable
            public final void run() {
                apwb.this.a.invoke(engq.a(arrayList));
            }
        });
    }
}
