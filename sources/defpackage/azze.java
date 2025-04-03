package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import com.google.android.apps.messaging.shared.datamodel.data.common.ParticipantColor;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azze {
    public final Context a;
    private final ffbr b;
    private final ffbr c;

    public azze(Context context, ffbr ffbrVar, ffbr ffbrVar2) {
        this.a = context;
        this.b = ffbrVar;
        this.c = ffbrVar2;
    }

    public final Uri a(ParticipantsTable.BindData bindData) {
        ffbr ffbrVar = this.c;
        Uri x = bindData.x();
        String R = bindData.R();
        aoku q = ((aolr) ffbrVar.b()).q(bindData);
        boolean d = bdqv.d(bindData);
        boolean ab = bindData.ab();
        boolean Y = bindData.Y();
        ParticipantColor a = bdqo.a(bindData);
        bindData.G();
        return ((crji) this.b.b()).g(x, R, q, a, d, ab, Y);
    }

    public final Uri b(List list) {
        csix.k(!list.isEmpty());
        if (list.size() == 1) {
            return a((ParticipantsTable.BindData) list.get(0));
        }
        int min = Math.min(list.size(), 4);
        ArrayList arrayList = new ArrayList(min);
        for (int i = 0; i < min; i++) {
            arrayList.add(a((ParticipantsTable.BindData) list.get(i)));
        }
        return crjm.o(this.a, arrayList);
    }

    public final Uri c(crjg crjgVar, engw engwVar) {
        if (engwVar.size() == 1) {
            return ((ResolvedRecipient) engwVar.get(0)).c(crjgVar);
        }
        int min = Math.min(engwVar.size(), 4);
        engr engrVar = new engr();
        for (int i = 0; i < min; i++) {
            engrVar.h(((ResolvedRecipient) engwVar.get(i)).c(crjgVar));
        }
        return crjm.o(this.a, engrVar.g());
    }
}
