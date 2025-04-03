package com.google.android.ims.rcsservice.chatsession.message.groupmanagement;

import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequestOrResponse;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class AutoOneOf_GroupManagementRequestOrResponse {

    /* compiled from: PG */
    private static final class Impl_request extends Parent_ {
        private final GroupManagementRequest request;

        public Impl_request(GroupManagementRequest groupManagementRequest) {
            super();
            this.request = groupManagementRequest;
        }

        public boolean equals(Object obj) {
            if (obj instanceof GroupManagementRequestOrResponse) {
                GroupManagementRequestOrResponse groupManagementRequestOrResponse = (GroupManagementRequestOrResponse) obj;
                if (getKind() == groupManagementRequestOrResponse.getKind() && this.request.equals(groupManagementRequestOrResponse.request())) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequestOrResponse
        public GroupManagementRequestOrResponse.Kind getKind() {
            return GroupManagementRequestOrResponse.Kind.REQUEST;
        }

        public int hashCode() {
            return this.request.hashCode();
        }

        @Override // com.google.android.ims.rcsservice.chatsession.message.groupmanagement.AutoOneOf_GroupManagementRequestOrResponse.Parent_, com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequestOrResponse
        public GroupManagementRequest request() {
            return this.request;
        }

        public String toString() {
            return "GroupManagementRequestOrResponse{request=" + String.valueOf(this.request) + "}";
        }
    }

    /* compiled from: PG */
    private static final class Impl_response extends Parent_ {
        private final GroupManagementResponse response;

        public Impl_response(GroupManagementResponse groupManagementResponse) {
            super();
            this.response = groupManagementResponse;
        }

        public boolean equals(Object obj) {
            if (obj instanceof GroupManagementRequestOrResponse) {
                GroupManagementRequestOrResponse groupManagementRequestOrResponse = (GroupManagementRequestOrResponse) obj;
                if (getKind() == groupManagementRequestOrResponse.getKind() && this.response.equals(groupManagementRequestOrResponse.response())) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequestOrResponse
        public GroupManagementRequestOrResponse.Kind getKind() {
            return GroupManagementRequestOrResponse.Kind.RESPONSE;
        }

        public int hashCode() {
            return this.response.hashCode();
        }

        @Override // com.google.android.ims.rcsservice.chatsession.message.groupmanagement.AutoOneOf_GroupManagementRequestOrResponse.Parent_, com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequestOrResponse
        public GroupManagementResponse response() {
            return this.response;
        }

        public String toString() {
            return "GroupManagementRequestOrResponse{response=" + String.valueOf(this.response) + "}";
        }
    }

    /* compiled from: PG */
    private static abstract class Parent_ extends GroupManagementRequestOrResponse {
        private Parent_() {
        }

        @Override // com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequestOrResponse
        public GroupManagementRequest request() {
            throw new UnsupportedOperationException(getKind().toString());
        }

        @Override // com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequestOrResponse
        public GroupManagementResponse response() {
            throw new UnsupportedOperationException(getKind().toString());
        }
    }

    private AutoOneOf_GroupManagementRequestOrResponse() {
    }

    static GroupManagementRequestOrResponse request(GroupManagementRequest groupManagementRequest) {
        groupManagementRequest.getClass();
        return new Impl_request(groupManagementRequest);
    }

    static GroupManagementRequestOrResponse response(GroupManagementResponse groupManagementResponse) {
        groupManagementResponse.getClass();
        return new Impl_response(groupManagementResponse);
    }
}
