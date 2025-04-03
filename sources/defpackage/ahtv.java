package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Intent;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.multishare.MultiShareActivity;
import com.google.android.apps.messaging.shared.conversation.draft.ComposeRowState;
import com.google.android.apps.messaging.shared.conversation.draft.IncomingDraft;
import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahtv implements ahtu {
    private static final enru a = enru.c("com/google/android/apps/messaging/multishare/MultiShareEntryPointImpl");
    private final ffbr b;
    private final ffbr c;

    public ahtv(ffbr ffbrVar, ffbr ffbrVar2) {
        ffbrVar2.getClass();
        this.b = ffbrVar;
        this.c = ffbrVar2;
    }

    @Override // defpackage.ahtu
    @ffbs
    public final void a(Activity activity, eisx eisxVar, MessageCoreData messageCoreData, equr equrVar) {
        ClipData clipData;
        equrVar.getClass();
        ((ecrj) this.b.b()).e(aifw.b);
        Intent intent = new Intent(activity, (Class<?>) MultiShareActivity.class);
        intent.putExtra("intent_source", equrVar.e);
        intent.addFlags(VCardConfig.FLAG_APPEND_TYPE_PARAM);
        intent.putExtra("draft_data", messageCoreData);
        intent.addFlags(1);
        ArrayList arrayList = new ArrayList();
        for (Object obj : ((MessageData) messageCoreData).i) {
            MessagePartCoreData messagePartCoreData = (MessagePartCoreData) obj;
            if (messagePartCoreData.aZ() && messagePartCoreData.t() != null) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(ffdx.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new ClipData.Item(((MessagePartCoreData) it.next()).t()));
        }
        List am = ffdx.am(arrayList2);
        if (am.isEmpty()) {
            clipData = null;
        } else {
            clipData = new ClipData(new ClipDescription("Attachment", new String[]{"text/uri-list"}), (ClipData.Item) am.get(0));
            int size = am.size();
            for (int i = 1; i < size; i++) {
                clipData.addItem((ClipData.Item) am.get(i));
            }
        }
        intent.setClipData(clipData);
        if (adhu.a() && eisxVar != null) {
            eiuy.c(intent, eisxVar);
        }
        eldl.p(activity, intent);
    }

    @Override // defpackage.ahtu
    public final void b(Activity activity, eisx eisxVar, IncomingDraft incomingDraft, equr equrVar) {
        ComposeRowState a2;
        equrVar.getClass();
        ((enrr) a.h().h("com/google/android/apps/messaging/multishare/MultiShareEntryPointImpl", "launchMultiShare", 66, "MultiShareEntryPointImpl.kt")).q("DRAFTBUG(b/348065860): launchMultiShare");
        ((ecrj) this.b.b()).e(aifw.b);
        Intent intent = new Intent(activity, (Class<?>) MultiShareActivity.class);
        intent.putExtra("intent_source", equrVar.e);
        intent.addFlags(VCardConfig.FLAG_APPEND_TYPE_PARAM);
        if (((atdn) this.c.b()).a()) {
            a2 = aygi.a(incomingDraft, 0);
            if (a2 != null) {
                aygl.f(intent, a2);
            }
            intent.setClipData(aygw.b(incomingDraft));
        } else {
            aygy.b(intent, incomingDraft);
        }
        intent.addFlags(1);
        if (adhu.a() && eisxVar != null) {
            eiuy.c(intent, eisxVar);
        }
        eldl.p(activity, intent);
    }
}
