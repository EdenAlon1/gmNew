package defpackage;

import android.content.Context;
import com.google.android.rcs.client.messaging.AddUserToGroupRequest;
import com.google.android.rcs.client.messaging.CreateGroupRequest;
import com.google.android.rcs.client.messaging.RemoveUserFromGroupRequest;
import com.google.android.rcs.client.messaging.SendMessageRequest;
import com.google.android.rcs.client.messaging.TriggerGroupNotificationRequest;
import com.google.android.rcs.client.messaging.UpdateGroupRequest;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djbt implements fbbf {
    private final djbu a;
    private final int b;

    public djbt(djbu djbuVar, int i) {
        this.a = djbuVar;
        this.b = i;
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final Object b() {
        switch (this.b) {
            case 0:
                return fbco.a(this.a.g, fbbh.a);
            case 1:
                djbu djbuVar = this.a;
                diyy diyyVar = djeq.a;
                SendMessageRequest sendMessageRequest = (SendMessageRequest) djbuVar.a;
                sendMessageRequest.getClass();
                return sendMessageRequest;
            case 2:
                djbu djbuVar2 = this.a;
                return new djfv(djbuVar2.b, (dkgw) ((fbbb) djbuVar2.k).a, new eijy(new eikl()), new edzf((Context) ((fbbb) this.a.c).a));
            case 3:
                djbu djbuVar3 = this.a;
                return new djcr(djbuVar3.c, djbuVar3.r);
            case 4:
                return new djfw();
            case 5:
                eiaa eiaaVar = (eiaa) this.a.a;
                eiaaVar.getClass();
                return eiaaVar;
            case 6:
                djbu djbuVar4 = this.a;
                return new djch(djbuVar4.H, djbuVar4.k, djbuVar4.I, djbuVar4.J, djbuVar4.K);
            case 7:
                eicl eiclVar = (eicl) this.a.a;
                eiclVar.getClass();
                return eiclVar;
            case 8:
                AddUserToGroupRequest addUserToGroupRequest = (AddUserToGroupRequest) this.a.a;
                addUserToGroupRequest.getClass();
                return addUserToGroupRequest;
            case 9:
                CreateGroupRequest createGroupRequest = (CreateGroupRequest) this.a.a;
                createGroupRequest.getClass();
                return createGroupRequest;
            case 10:
                RemoveUserFromGroupRequest removeUserFromGroupRequest = (RemoveUserFromGroupRequest) this.a.a;
                removeUserFromGroupRequest.getClass();
                return removeUserFromGroupRequest;
            case 11:
                TriggerGroupNotificationRequest triggerGroupNotificationRequest = (TriggerGroupNotificationRequest) this.a.a;
                triggerGroupNotificationRequest.getClass();
                return triggerGroupNotificationRequest;
            case 12:
                djbu djbuVar5 = this.a;
                int i = djfd.b;
                UpdateGroupRequest updateGroupRequest = (UpdateGroupRequest) djbuVar5.a;
                updateGroupRequest.getClass();
                return updateGroupRequest;
            default:
                djbu djbuVar6 = this.a;
                return new djff(djbuVar6.av, djbuVar6.r);
        }
    }
}
