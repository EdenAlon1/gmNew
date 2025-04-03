package defpackage;

import android.content.res.Resources;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aqcx implements aqdf {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/api/messaging/message/status/OutgoingFailedRecipientDidNotDecryptStatusHandler");
    private final bzqa b;

    public aqcx(bzqa bzqaVar) {
        bzqaVar.getClass();
        this.b = bzqaVar;
    }

    @Override // defpackage.aqdl
    public final /* synthetic */ aqcm a(Resources resources, MessagesTable.BindData bindData, engw engwVar, aoug aougVar, apug apugVar, amfx amfxVar) {
        return aqde.a(this, resources, bindData, engwVar, aougVar, apugVar, amfxVar);
    }

    @Override // defpackage.aqdf
    public final aqcl b(Resources resources, MessagesTable.BindData bindData, engw engwVar, aoug aougVar, apug apugVar, amfx amfxVar) {
        String string;
        String str;
        if (this.b.i() && byyr.d(amfxVar.v()) && aougVar.a() != 0) {
            engw engwVar2 = ((apsn) apugVar).j;
            int size = engwVar2.size();
            engwVar2.getClass();
            Iterator<E> it = engwVar2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = null;
                    break;
                }
                str = ((ResolvedRecipient) it.next()).v();
                if (str != null) {
                    break;
                }
            }
            if (str == null) {
                string = resources.getQuantityString(R.plurals.mapi_message_status_recipients_failed_decryption, size, Integer.valueOf(size));
                string.getClass();
            } else if (size > 1) {
                int i = size - 1;
                string = resources.getString(R.string.mapi_message_status_group_named_recipient_failed_decryption, resources.getQuantityString(R.plurals.name_and_other_plural, i, str, Integer.valueOf(i)));
                string.getClass();
            } else {
                string = resources.getString(R.string.mapi_message_status_group_named_recipient_failed_decryption, str);
                string.getClass();
            }
        } else {
            string = resources.getString(R.string.mapi_message_status_recipient_failed_decryption);
            string.getClass();
        }
        String str2 = string;
        ((enrr) a.h().h("com/google/android/apps/messaging/shared/api/messaging/message/status/OutgoingFailedRecipientDidNotDecryptStatusHandler", "convertFailure", 64, "OutgoingFailedRecipientDidNotDecryptStatusHandler.kt")).D("Message with id %x has status %s", bindData, str2);
        return new aqcl(str2, 2, bindData.s() == 19, bindData.l() == 3 && !amfxVar.M(), true, false, false, false, 224);
    }
}
