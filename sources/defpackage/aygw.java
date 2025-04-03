package defpackage;

import android.content.ClipData;
import android.content.ClipDescription;
import com.google.android.apps.messaging.shared.conversation.draft.IncomingDraft;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aygw {
    public static final IncomingDraft a(aygq aygqVar, String str, List list, String str2) {
        aygqVar.getClass();
        try {
            return new IncomingDraft(aygqVar, str, list, str2, false, null, null, false);
        } catch (aygt unused) {
            return null;
        }
    }

    public static final ClipData b(IncomingDraft incomingDraft) {
        List list = incomingDraft.b;
        ArrayList arrayList = new ArrayList(ffdx.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new ClipData.Item(((IncomingDraft.Attachment) it.next()).b));
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        ClipData clipData = new ClipData(new ClipDescription("Incoming attachments", new String[]{"text/uri-list"}), (ClipData.Item) arrayList.get(0));
        int size = arrayList.size();
        for (int i = 1; i < size; i++) {
            clipData.addItem((ClipData.Item) arrayList.get(i));
        }
        return clipData;
    }
}
