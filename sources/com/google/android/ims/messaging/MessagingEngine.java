package com.google.android.ims.messaging;

import com.google.android.rcs.client.messaging.AddUserToGroupRequest;
import com.google.android.rcs.client.messaging.AddUserToGroupResponse;
import com.google.android.rcs.client.messaging.CreateGroupRequest;
import com.google.android.rcs.client.messaging.CreateGroupResponse;
import com.google.android.rcs.client.messaging.GetGroupNotificationsRequest;
import com.google.android.rcs.client.messaging.GetGroupNotificationsResponse;
import com.google.android.rcs.client.messaging.GetMessagesRequest;
import com.google.android.rcs.client.messaging.GetMessagesResponse;
import com.google.android.rcs.client.messaging.IMessaging;
import com.google.android.rcs.client.messaging.JoinGroupRequest;
import com.google.android.rcs.client.messaging.JoinGroupResponse;
import com.google.android.rcs.client.messaging.MessagingResult;
import com.google.android.rcs.client.messaging.RemoveUserFromGroupRequest;
import com.google.android.rcs.client.messaging.RemoveUserFromGroupResponse;
import com.google.android.rcs.client.messaging.RevokeMessageRequest;
import com.google.android.rcs.client.messaging.RevokeMessageResponse;
import com.google.android.rcs.client.messaging.SendMessageRequest;
import com.google.android.rcs.client.messaging.SendMessageResponse;
import com.google.android.rcs.client.messaging.TriggerGroupNotificationRequest;
import com.google.android.rcs.client.messaging.TriggerGroupNotificationResponse;
import com.google.android.rcs.client.messaging.UpdateGroupRequest;
import com.google.android.rcs.client.messaging.UpdateGroupResponse;
import com.google.android.rcs.client.messaging.data.GroupNotification;
import com.google.android.rcs.client.messaging.data.MessageNotification;
import defpackage.dikx;
import defpackage.djcu;
import defpackage.djfx;
import defpackage.djgj;
import defpackage.djgk;
import defpackage.djhi;
import defpackage.djhl;
import defpackage.djif;
import defpackage.djil;
import defpackage.djio;
import defpackage.djir;
import defpackage.dktn;
import defpackage.dkty;
import defpackage.ehye;
import defpackage.ehyk;
import defpackage.ehyo;
import defpackage.ehyq;
import defpackage.ehyx;
import defpackage.ehzi;
import defpackage.ehzn;
import defpackage.ehzr;
import defpackage.ehzt;
import defpackage.engr;
import defpackage.engw;
import defpackage.erqt;
import defpackage.errl;
import defpackage.ffbr;
import defpackage.fjay;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class MessagingEngine extends IMessaging.Stub {
    private static final dktn a = new dktn("MessagingEngine");
    private final errl b;
    private final ffbr c;
    private final djgj d;
    private final ffbr e;
    private final dikx f;
    private final djfx g;
    private final djil h;
    private final djhl i;
    private final djhi j;
    private final djif k;
    private final djir l;
    private final djio m;

    public MessagingEngine(errl errlVar, ffbr<djgk> ffbrVar, djgj djgjVar, djil djilVar, djhl djhlVar, djhi djhiVar, djif djifVar, djir djirVar, djio djioVar, ffbr<djcu> ffbrVar2, dikx dikxVar, djfx djfxVar) {
        this.b = errlVar;
        this.c = ffbrVar;
        this.d = djgjVar;
        this.e = ffbrVar2;
        this.f = dikxVar;
        this.h = djilVar;
        this.i = djhlVar;
        this.j = djhiVar;
        this.k = djifVar;
        this.l = djirVar;
        this.m = djioVar;
        this.g = djfxVar;
    }

    @Override // com.google.android.rcs.client.messaging.IMessaging
    public AddUserToGroupResponse addUserToGroup(AddUserToGroupRequest addUserToGroupRequest) {
        dkty.l(a, "addUserToGroup, conversationId:{%s}", addUserToGroupRequest.b().b());
        erqt.r(((djcu) this.e.b()).b(addUserToGroupRequest), this.j.a(addUserToGroupRequest), this.b);
        ehye ehyeVar = new ehye();
        ehyeVar.b(MessagingResult.e);
        return ehyeVar.a();
    }

    @Override // com.google.android.rcs.client.messaging.IMessaging
    public CreateGroupResponse createGroup(CreateGroupRequest createGroupRequest) {
        dkty.l(a, "createGroup, conversationId:{%s}", createGroupRequest.d());
        erqt.r(((djcu) this.e.b()).c(createGroupRequest), this.i.a(createGroupRequest), this.b);
        ehyk ehykVar = new ehyk();
        ehykVar.b(MessagingResult.e);
        return ehykVar.a();
    }

    @Override // com.google.android.rcs.client.messaging.IMessaging
    public GetGroupNotificationsResponse getGroupNotifications(GetGroupNotificationsRequest getGroupNotificationsRequest) {
        engw g;
        dkty.l(a, "getGroupNotifications, limit:{%s}", Integer.valueOf(getGroupNotificationsRequest.a()));
        ehyo ehyoVar = new ehyo();
        ehyoVar.c(MessagingResult.d);
        int a2 = getGroupNotificationsRequest.a();
        int i = engw.d;
        engr engrVar = new engr();
        djgj djgjVar = this.d;
        if (a2 <= 0) {
            synchronized (djgjVar.a) {
                dkty.c("Group notifications queue: pop operation, popCount:{%s}, queueSize:{0}", Integer.valueOf(djgjVar.b.size()));
                engrVar.j(djgjVar.b);
                djgjVar.b.clear();
                g = engrVar.g();
            }
        } else {
            synchronized (djgjVar.a) {
                int i2 = 0;
                while (i2 < a2) {
                    GroupNotification groupNotification = (GroupNotification) djgjVar.b.poll();
                    if (groupNotification == null) {
                        break;
                    }
                    engrVar.h(groupNotification);
                    i2++;
                }
                dkty.c("Group notifications queue: pop operation, popCount:{%s}, queueSize:{%s}", Integer.valueOf(i2), Integer.valueOf(djgjVar.b.size()));
            }
            g = engrVar.g();
        }
        ehyoVar.b(g);
        return ehyoVar.a();
    }

    @Override // com.google.android.rcs.client.messaging.IMessaging
    public GetMessagesResponse getMessages(GetMessagesRequest getMessagesRequest) {
        engw g;
        dkty.l(a, "getMessages, limit:{%s}", Integer.valueOf(getMessagesRequest.a()));
        ehyq ehyqVar = new ehyq();
        ehyqVar.c(MessagingResult.d);
        djgk djgkVar = (djgk) this.c.b();
        int a2 = getMessagesRequest.a();
        int i = engw.d;
        engr engrVar = new engr();
        if (a2 < 0) {
            synchronized (djgkVar.a) {
                dkty.c("Messages queue: pop operation, popCount:{%s}, queueSize:{0}.", Integer.valueOf(djgkVar.b.size()));
                engrVar.j(djgkVar.b);
                djgkVar.b.clear();
            }
            g = engrVar.g();
        } else {
            synchronized (djgkVar.a) {
                int i2 = 0;
                while (i2 < a2) {
                    MessageNotification messageNotification = (MessageNotification) djgkVar.b.poll();
                    if (messageNotification == null) {
                        break;
                    }
                    engrVar.h(messageNotification);
                    i2++;
                }
                dkty.c("Messages queue: pop operation, popCount:{%s}, queueSize:{%s}.", Integer.valueOf(i2), Integer.valueOf(djgkVar.b.size()));
            }
            g = engrVar.g();
        }
        ehyqVar.b(g);
        return ehyqVar.a();
    }

    @Override // com.google.android.rcs.client.messaging.IMessaging
    public int getServiceVersion() {
        return 1;
    }

    @Override // com.google.android.rcs.client.messaging.IMessaging
    public JoinGroupResponse joinGroup(JoinGroupRequest joinGroupRequest) {
        dkty.l(a, "joinGroup, conversationId:{%s}", joinGroupRequest.b().b());
        ehyx ehyxVar = new ehyx();
        ehyxVar.b(MessagingResult.d);
        return ehyxVar.a();
    }

    @Override // com.google.android.rcs.client.messaging.IMessaging
    public RemoveUserFromGroupResponse removeUserFromGroup(RemoveUserFromGroupRequest removeUserFromGroupRequest) {
        dkty.l(a, "removeUserFromGroup, conversationId:{%s}", removeUserFromGroupRequest.b().b());
        erqt.r(((djcu) this.e.b()).d(removeUserFromGroupRequest), this.k.a(removeUserFromGroupRequest), this.b);
        ehzi ehziVar = new ehzi();
        ehziVar.b(MessagingResult.e);
        return ehziVar.a();
    }

    @Override // com.google.android.rcs.client.messaging.IMessaging
    public RevokeMessageResponse revokeMessage(RevokeMessageRequest revokeMessageRequest) {
        throw new IllegalStateException("Not implemented anymore!");
    }

    @Override // com.google.android.rcs.client.messaging.IMessaging
    public SendMessageResponse sendMessage(SendMessageRequest sendMessageRequest) {
        String h = sendMessageRequest.c().h();
        dkty.l(a, "sendMessage, messageId:{%s}, messageClass:{%s}", h, sendMessageRequest.d());
        if (((Boolean) dikx.b.a()).booleanValue()) {
            this.f.f((fjay) this.g.fP(sendMessageRequest.h()), h, 5);
        }
        erqt.r(((djcu) this.e.b()).e(sendMessageRequest), this.h.a(sendMessageRequest), this.b);
        if (((Boolean) dikx.b.a()).booleanValue()) {
            this.f.f((fjay) this.g.fP(sendMessageRequest.h()), h, 6);
        }
        ehzn ehznVar = new ehzn();
        ehznVar.b(MessagingResult.e);
        return ehznVar.a();
    }

    @Override // com.google.android.rcs.client.messaging.IMessaging
    public TriggerGroupNotificationResponse triggerGroupNotification(TriggerGroupNotificationRequest triggerGroupNotificationRequest) {
        dkty.l(a, "triggerGroupNotification, conversationId:{%s}", triggerGroupNotificationRequest.b().b());
        erqt.r(((djcu) this.e.b()).f(triggerGroupNotificationRequest), this.m.a(triggerGroupNotificationRequest), this.b);
        ehzr ehzrVar = new ehzr();
        ehzrVar.b(MessagingResult.e);
        return ehzrVar.a();
    }

    @Override // com.google.android.rcs.client.messaging.IMessaging
    public UpdateGroupResponse updateGroup(UpdateGroupRequest updateGroupRequest) {
        dkty.l(a, "updateGroup, conversationId:{%s}", updateGroupRequest.b().b());
        erqt.r(((djcu) this.e.b()).g(updateGroupRequest), this.l.a(updateGroupRequest), this.b);
        ehzt ehztVar = new ehzt();
        ehztVar.b(MessagingResult.e);
        return ehztVar.a();
    }
}
