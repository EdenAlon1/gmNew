package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aqll extends dtrs {
    public static final /* synthetic */ int a = 0;
    private final ffjm b;

    public aqll(ffjm ffjmVar) {
        this.b = ffjmVar;
    }

    @Override // defpackage.dtrs
    public final /* bridge */ /* synthetic */ Object d(dtyq dtyqVar, dtuk dtukVar) {
        aqlk aqlkVar = new aqlk(null);
        duap e = dtukVar.e();
        if (e == null) {
            return aqlkVar;
        }
        String[] strArr = bsdr.a;
        bsdm bsdmVar = new bsdm(bsdr.a);
        bsdmVar.z("ConversationToParticipantsQueryListener#preChangeInTransaction");
        bsdmVar.e(new Function() { // from class: aqlj
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                int i = aqll.a;
                return ((bscz) obj).a;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bsdmVar.k((bsdp) e);
        bsdmVar.x(10);
        dtsu o = bsdmVar.b().o();
        try {
            bsdb bsdbVar = (bsdb) o;
            if (bsdbVar.moveToNext()) {
                aqlkVar.a.add(new BugleConversationId(bsdbVar.e()));
            }
            ffig.a(o, null);
            return aqlkVar;
        } finally {
        }
    }

    @Override // defpackage.dtrs
    public final /* bridge */ /* synthetic */ void e(dtyq dtyqVar, dtuk dtukVar, Object obj) {
        ConversationIdType m;
        obj.getClass();
        aqlk aqlkVar = (aqlk) obj;
        dtro b = dtukVar.b();
        if (b != null && (m = ((bscj) b).m()) != null) {
            aqlkVar.a.add(new BugleConversationId(m));
        }
        dtro[] a2 = dtukVar.a();
        if (a2 != null) {
            ArrayList arrayList = new ArrayList();
            for (dtro dtroVar : a2) {
                dtroVar.getClass();
                ConversationIdType m2 = ((bscj) dtroVar).m();
                if (m2 != null) {
                    arrayList.add(m2);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                aqlkVar.a.add(new BugleConversationId((ConversationIdType) it.next()));
            }
        }
        if (aqlkVar.a.isEmpty()) {
            return;
        }
        this.b.a(engq.f(aqlkVar.a), false);
    }
}
