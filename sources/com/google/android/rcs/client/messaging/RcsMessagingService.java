package com.google.android.rcs.client.messaging;

import android.content.Context;
import android.os.RemoteException;
import defpackage.csjy;
import defpackage.diyv;
import defpackage.diyy;
import defpackage.ehxc;
import defpackage.ehxg;
import defpackage.ehxi;
import defpackage.eibx;
import defpackage.eiby;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class RcsMessagingService extends ehxc<IMessaging> implements eibx {
    public static final diyy h = diyv.b("rcs_messaging_service_connection_deprecated");

    public RcsMessagingService(Context context, ehxi ehxiVar) {
        super(IMessaging.class, context, ehxiVar, 1, Optional.empty());
    }

    @Override // defpackage.eibx
    public AddUserToGroupResponse addUserToGroup(AddUserToGroupRequest addUserToGroupRequest) {
        b();
        try {
            return h().addUserToGroup(addUserToGroupRequest);
        } catch (RemoteException | IllegalStateException e) {
            csjy.f("RcsClientLib", "Error while calling addUserToGroup: ".concat(String.valueOf(e.getMessage())));
            throw new eiby("Error while calling addUserToGroup: ".concat(String.valueOf(e.getMessage())));
        }
    }

    @Override // defpackage.ehxc
    protected final void b() {
        try {
            super.b();
        } catch (ehxg e) {
            throw new eiby(e.getMessage(), e);
        }
    }

    @Override // defpackage.eibx
    public CreateGroupResponse createGroup(CreateGroupRequest createGroupRequest) {
        b();
        try {
            return h().createGroup(createGroupRequest);
        } catch (RemoteException | IllegalStateException e) {
            csjy.f("RcsClientLib", "Error while calling createGroup: ".concat(String.valueOf(e.getMessage())));
            throw new eiby("Error while calling createGroup: ".concat(String.valueOf(e.getMessage())));
        }
    }

    @Override // defpackage.ehxc
    protected final boolean f() {
        return ((Boolean) h.a()).booleanValue();
    }

    public GetGroupNotificationsResponse getGroupNotifications(GetGroupNotificationsRequest getGroupNotificationsRequest) {
        b();
        try {
            return h().getGroupNotifications(getGroupNotificationsRequest);
        } catch (RemoteException | IllegalStateException e) {
            csjy.f("RcsClientLib", "Error while calling getGroupNotifications: ".concat(String.valueOf(e.getMessage())));
            throw new eiby("Error while calling getGroupNotifications: ".concat(String.valueOf(e.getMessage())));
        }
    }

    public GetMessagesResponse getMessages(GetMessagesRequest getMessagesRequest) {
        b();
        try {
            return h().getMessages(getMessagesRequest);
        } catch (RemoteException | IllegalStateException e) {
            csjy.f("RcsClientLib", "Error while calling getMessages: ".concat(String.valueOf(e.getMessage())));
            throw new eiby("Error while calling getMessages: ".concat(String.valueOf(e.getMessage())));
        }
    }

    @Override // defpackage.ehxc
    public String getRcsServiceMetaDataKey() {
        return "MessagingSessionServiceVersions";
    }

    protected final IMessaging h() {
        try {
            return (IMessaging) super.a();
        } catch (ehxg e) {
            throw new eiby(e.getMessage(), e);
        }
    }

    public JoinGroupResponse joinGroup(JoinGroupRequest joinGroupRequest) {
        b();
        try {
            return h().joinGroup(joinGroupRequest);
        } catch (RemoteException | IllegalStateException e) {
            csjy.f("RcsClientLib", "Error while calling joinGroup: ".concat(String.valueOf(e.getMessage())));
            throw new eiby("Error while calling joinGroup: ".concat(String.valueOf(e.getMessage())));
        }
    }

    @Override // defpackage.eibx
    public RemoveUserFromGroupResponse removeUserFromGroup(RemoveUserFromGroupRequest removeUserFromGroupRequest) {
        b();
        try {
            return h().removeUserFromGroup(removeUserFromGroupRequest);
        } catch (RemoteException | IllegalStateException e) {
            csjy.f("RcsClientLib", "Error while calling removeUserFromGroup: ".concat(String.valueOf(e.getMessage())));
            throw new eiby("Error while calling removeUserFromGroup: ".concat(String.valueOf(e.getMessage())));
        }
    }

    @Override // defpackage.eibx
    public RevokeMessageResponse revokeMessage(RevokeMessageRequest revokeMessageRequest) {
        b();
        try {
            return h().revokeMessage(revokeMessageRequest);
        } catch (RemoteException | IllegalStateException e) {
            csjy.f("RcsClientLib", "Error while calling revokeMessage: ".concat(String.valueOf(e.getMessage())));
            throw new eiby("Error while calling revokeMessage: ".concat(String.valueOf(e.getMessage())));
        }
    }

    public SendMessageResponse sendMessage(SendMessageRequest sendMessageRequest) {
        b();
        try {
            return h().sendMessage(sendMessageRequest);
        } catch (RemoteException | IllegalStateException e) {
            csjy.f("RcsClientLib", "Error while calling sendMessage: ".concat(String.valueOf(e.getMessage())));
            throw new eiby("Error while calling sendMessage: ".concat(String.valueOf(e.getMessage())));
        }
    }

    @Override // defpackage.eibx
    public TriggerGroupNotificationResponse triggerGroupNotification(TriggerGroupNotificationRequest triggerGroupNotificationRequest) {
        b();
        try {
            return h().triggerGroupNotification(triggerGroupNotificationRequest);
        } catch (RemoteException | IllegalStateException e) {
            csjy.f("RcsClientLib", "Error while calling triggerGroupNotification: ".concat(String.valueOf(e.getMessage())));
            throw new eiby("Error while calling triggerGroupNotification: ".concat(String.valueOf(e.getMessage())));
        }
    }

    @Override // defpackage.eibx
    public UpdateGroupResponse updateGroup(UpdateGroupRequest updateGroupRequest) {
        b();
        try {
            return h().updateGroup(updateGroupRequest);
        } catch (RemoteException | IllegalStateException e) {
            csjy.f("RcsClientLib", "Error while calling updateGroup: ".concat(String.valueOf(e.getMessage())));
            throw new eiby("Error while calling updateGroup: ".concat(String.valueOf(e.getMessage())));
        }
    }
}
