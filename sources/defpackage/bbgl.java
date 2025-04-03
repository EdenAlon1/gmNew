package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import j$.util.function.Function$CC;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bbgl {
    public final Context a;
    public final covo b;
    public final csuk c;
    public final cqoh d;
    public final bdve e;

    public bbgl(Context context, covo covoVar, csuk csukVar, cqoh cqohVar, bdve bdveVar) {
        this.a = context;
        this.b = covoVar;
        this.c = csukVar;
        this.d = cqohVar;
        this.e = bdveVar;
    }

    public static void a(List list, List list2) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            final MessagePartCoreData messagePartCoreData = (MessagePartCoreData) it.next();
            String[] strArr = PartsTable.a;
            bwdi bwdiVar = new bwdi();
            bwdiVar.ap("updateMessagePartsForResizingInTransaction");
            Uri w = messagePartCoreData.w();
            int intValue = PartsTable.e().intValue();
            int intValue2 = PartsTable.e().intValue();
            if (intValue2 < 4020) {
                dtub.w("output_uri", intValue2);
            }
            if (intValue >= 4020) {
                if (w == null) {
                    bwdiVar.a.putNull("output_uri");
                } else {
                    bwdiVar.a.put("output_uri", w.toString());
                }
            }
            bwdiVar.y(messagePartCoreData.p());
            bwdiVar.w(messagePartCoreData.J());
            bwdiVar.D(new Function() { // from class: bbgk
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bwdm bwdmVar = (bwdm) obj;
                    bwdmVar.j(MessagePartCoreData.this.aa());
                    return bwdmVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bwdiVar.al();
            if (bwdiVar.b().e() > 0) {
                list2.add(messagePartCoreData);
            }
        }
    }
}
