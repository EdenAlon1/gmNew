package defpackage;

import com.google.android.rcs.client.messaging.AddUserToGroupRequest;
import com.google.android.rcs.client.messaging.AddUserToGroupResponse;
import com.google.android.rcs.client.messaging.CreateGroupRequest;
import com.google.android.rcs.client.messaging.CreateGroupResponse;
import com.google.android.rcs.client.messaging.RemoveUserFromGroupRequest;
import com.google.android.rcs.client.messaging.RemoveUserFromGroupResponse;
import com.google.android.rcs.client.messaging.RevokeMessageRequest;
import com.google.android.rcs.client.messaging.RevokeMessageResponse;
import com.google.android.rcs.client.messaging.TriggerGroupNotificationRequest;
import com.google.android.rcs.client.messaging.TriggerGroupNotificationResponse;
import com.google.android.rcs.client.messaging.UpdateGroupRequest;
import com.google.android.rcs.client.messaging.UpdateGroupResponse;

/* compiled from: PG */
/* loaded from: classes5.dex */
public interface eibx {
    AddUserToGroupResponse addUserToGroup(AddUserToGroupRequest addUserToGroupRequest);

    CreateGroupResponse createGroup(CreateGroupRequest createGroupRequest);

    RemoveUserFromGroupResponse removeUserFromGroup(RemoveUserFromGroupRequest removeUserFromGroupRequest);

    RevokeMessageResponse revokeMessage(RevokeMessageRequest revokeMessageRequest);

    TriggerGroupNotificationResponse triggerGroupNotification(TriggerGroupNotificationRequest triggerGroupNotificationRequest);

    UpdateGroupResponse updateGroup(UpdateGroupRequest updateGroupRequest);
}
