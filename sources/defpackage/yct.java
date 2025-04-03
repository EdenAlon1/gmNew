package defpackage;

import com.google.android.apps.messaging.shared.conversation.draft.IncomingDraft;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yct {
    public static final xhu a(IncomingDraft incomingDraft, int i, xgp xgpVar) {
        incomingDraft.getClass();
        List<IncomingDraft.Attachment> list = incomingDraft.b;
        ArrayList arrayList = new ArrayList(ffdx.n(list, 10));
        for (IncomingDraft.Attachment attachment : list) {
            String str = attachment.a;
            xhi a = xgpVar.a();
            drlx a2 = drlo.a(str);
            if (a2 == null) {
                throw new IllegalArgumentException("Failed to parse MediaType: ".concat(attachment.a));
            }
            arrayList.add(new xhl(a, a2, attachment.b, attachment.c, new doxm(null, 2)));
        }
        return new xhu(incomingDraft.a, arrayList, incomingDraft.c, incomingDraft.d, null, incomingDraft.f, incomingDraft.e, false, i, incomingDraft.g, 144);
    }
}
