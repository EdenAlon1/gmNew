package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Optional;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class algq {
    private final ffbr a;
    private final ffbr b;
    private final cpdg c;

    public algq(ffbr ffbrVar, ffbr ffbrVar2, cpdg cpdgVar) {
        this.a = ffbrVar;
        this.b = ffbrVar2;
        this.c = cpdgVar;
    }

    private final int b(String str, int i) {
        if (i == 2) {
            return 3;
        }
        cskc cskcVar = cpdg.a;
        if (aoqw.h(str)) {
            return 4;
        }
        return this.c.k(str) ? 2 : 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(eoop eoopVar, MessageCoreData messageCoreData, int i) {
        epai a;
        String aA = messageCoreData.aA();
        bxro a2 = bdtf.a(aqvf.c(aA));
        if (a2 == null) {
            a = epai.a;
        } else {
            a2.az(1, "phone_number");
            String str = a2.b;
            if (str == null) {
                a = epai.a;
            } else {
                algp algpVar = new algp();
                algpVar.b = b(str, i);
                algpVar.b(str);
                a = algpVar.a();
            }
        }
        eoopVar.copyOnWrite();
        eopq eopqVar = (eopq) eoopVar.instance;
        eopq eopqVar2 = eopq.a;
        a.getClass();
        eopqVar.W = a;
        eopqVar.c |= 262144;
        ConversationIdType z = messageCoreData.z();
        ArrayList arrayList = new ArrayList();
        if (!z.b()) {
            enqv it = ((engw) ((bczy) this.b.b()).L(z)).iterator();
            while (it.hasNext()) {
                ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) it.next();
                String W = bindData.W();
                String U = bindData.U();
                if (W == null || U == null) {
                    break;
                }
                algp algpVar2 = new algp();
                algpVar2.b = b(W, i);
                algpVar2.b(W);
                algpVar2.a = Optional.of(U);
                arrayList.add(algpVar2.a());
            }
        }
        eoopVar.copyOnWrite();
        eopq eopqVar3 = (eopq) eoopVar.instance;
        eopqVar3.a();
        eydl.addAll(arrayList, eopqVar3.X);
    }
}
