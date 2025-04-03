package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.startchat.StartChatActivity;
import com.google.android.apps.messaging.startchat.chip.ChipData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvqs implements cvqq {
    private static final cskc c = cskc.g("BugleContacts", "StartChatEntryPointImpl");
    public final ffbr a;
    public final ffbr b;
    private final fazb d;

    public cvqs(ffbr ffbrVar, fazb fazbVar, ffbr ffbrVar2) {
        ffbrVar.getClass();
        fazbVar.getClass();
        ffbrVar2.getClass();
        this.a = ffbrVar;
        this.d = fazbVar;
        this.b = ffbrVar2;
    }

    private static final int d(int i) {
        return i != 5 ? i != 12 ? i != 14 ? (((Boolean) cvqt.b.e()).booleanValue() ? cwjb.c : cwjb.b).ordinal() : cwjb.f.ordinal() : cwjb.e.ordinal() : cwjb.d.ordinal();
    }

    @Override // defpackage.cvqq
    public final cvqr a() {
        return new cvqr(this);
    }

    @Override // defpackage.cvqq
    public final void b(Context context, eisx eisxVar, ConversationId conversationId, int i, List list, SelfIdentityId selfIdentityId) {
        ArrayList arrayList = new ArrayList(ffdx.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Recipient recipient = (Recipient) it.next();
            aoku g = recipient.g();
            g.getClass();
            String a = aswb.a() ? cuxh.a(recipient.x(true)) : recipient.x(true);
            a.getClass();
            arrayList.add(new ChipData(g, a, recipient.f().k, recipient.b(), true));
        }
        ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
        ffdx.aB(arrayList, arrayList2);
        enrr i2 = c.i();
        i2.Y(csux.q, conversationId);
        i2.Y(new ensn("state", Integer.class, false, false), Integer.valueOf(i));
        ((enrr) i2.h("com/google/android/apps/messaging/startchat/StartChatEntryPointImpl", "internalLaunchStartChatToAddPeople", 179, "StartChatEntryPointImpl.kt")).q("launch start chat to add people");
        ((amav) this.a.b()).h(Boolean.valueOf(!((Boolean) cvqt.j.e()).booleanValue()));
        Bundle bundle = new Bundle(4);
        bundle.putInt("selection_mode", d(i));
        bundle.putParcelable("conversation_mapi_id", conversationId);
        bundle.putParcelableArrayList("identities", arrayList2);
        bundle.putParcelable("self_identity_id", selfIdentityId);
        bundle.putInt("contact_picker_source", 2);
        Intent intent = new Intent(context, (Class<?>) StartChatActivity.class);
        intent.putExtras(bundle);
        eiuy.c(intent, eisxVar);
        eldl.p(context, intent);
    }

    @Override // defpackage.cvqq
    public final void c(Context context, eisx eisxVar, ConversationIdType conversationIdType, int i, List list) {
        String k;
        list.getClass();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) it.next();
            aoku q = ((aolr) this.d.b()).q(bindData);
            String R = bindData.R();
            if (R != null && R.length() != 0) {
                k = bindData.R();
                k.getClass();
            } else if (bdqv.d(bindData)) {
                k = ttz.a(q);
            } else {
                k = bdqu.k(bindData);
                k.getClass();
            }
            arrayList.add(new ChipData(q, k, bindData.T(), bindData.x(), true));
        }
        csjb c2 = c.c();
        c2.c(conversationIdType);
        c2.y("state", i);
        c2.I("launch start chat to add people");
        c2.r();
        ((amav) this.a.b()).h(Boolean.valueOf(!((Boolean) cvqt.j.e()).booleanValue()));
        Bundle bundle = new Bundle(4);
        bundle.putInt("selection_mode", d(i));
        bundle.putParcelableArrayList("identities", arrayList);
        bundle.putString("conversation_id", conversationIdType.a());
        bundle.putInt("contact_picker_source", 2);
        Intent intent = new Intent(context, (Class<?>) StartChatActivity.class);
        intent.putExtras(bundle);
        if (eisxVar != null) {
            eiuy.c(intent, eisxVar);
        }
        eldl.p(context, intent);
    }
}
