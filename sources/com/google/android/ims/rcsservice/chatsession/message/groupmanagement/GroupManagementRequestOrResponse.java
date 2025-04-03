package com.google.android.ims.rcsservice.chatsession.message.groupmanagement;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class GroupManagementRequestOrResponse {

    /* compiled from: PG */
    public enum Kind {
        REQUEST,
        RESPONSE
    }

    static GroupManagementRequestOrResponse ofRequest(GroupManagementRequest groupManagementRequest) {
        return AutoOneOf_GroupManagementRequestOrResponse.request(groupManagementRequest);
    }

    static GroupManagementRequestOrResponse ofResponse(GroupManagementResponse groupManagementResponse) {
        return AutoOneOf_GroupManagementRequestOrResponse.response(groupManagementResponse);
    }

    public abstract Kind getKind();

    public abstract GroupManagementRequest request();

    public abstract GroupManagementResponse response();
}
