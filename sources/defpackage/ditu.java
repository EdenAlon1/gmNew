package defpackage;

import com.google.android.ims.rcsservice.chatsession.GroupChatSessionEvent;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.CpmGroupManagement;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupData;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementDeserializer;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequestOrResponse;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementResponse;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.io.IOException;
import java.util.function.Consumer;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ditu implements ditw {
    private final dips a;

    public ditu(dips dipsVar) {
        this.a = dipsVar;
    }

    @Override // defpackage.ditw
    public final void a(dkjt dkjtVar, long j, String str) {
        try {
            CpmGroupManagement parseCpmGroupManagement = GroupManagementDeserializer.parseCpmGroupManagement(dkjtVar.f);
            String messageId = parseCpmGroupManagement.getMessageId();
            Optional<GroupData> groupData = parseCpmGroupManagement.getGroupData();
            if (groupData.isPresent() && groupData.get().getRequestOrResponse().getKind() == GroupManagementRequestOrResponse.Kind.RESPONSE) {
                GroupManagementResponse response = groupData.get().getRequestOrResponse().response();
                Optional<String> responseText = response.getResponseText();
                dkty.c("Sending CHATSESSION_CPM_GROUP_MANAGEMENT_RESPONSE_RECEIVED with sessionId: %d, messageId: %s, responseCode: %d", Long.valueOf(j), messageId, Integer.valueOf(response.getResponseCode()));
                final dkmq dkmqVar = new dkmq(50048, j, response.getResponseCode());
                dkmqVar.g = Optional.of(messageId);
                responseText.ifPresent(new Consumer() { // from class: ditt
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        Optional of = Optional.of((String) obj);
                        dkmq dkmqVar2 = dkmq.this;
                        dkmqVar2.h = of;
                        new GroupChatSessionEvent(dkmqVar2);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                this.a.c(new GroupChatSessionEvent(dkmqVar), dkuj.GROUP_MANAGEMENT_MESSAGE_FILTER);
            }
        } catch (IOException | XmlPullParserException e) {
            dkty.s(e, "Error parsing CpmGroupManagement message", new Object[0]);
        }
    }
}
