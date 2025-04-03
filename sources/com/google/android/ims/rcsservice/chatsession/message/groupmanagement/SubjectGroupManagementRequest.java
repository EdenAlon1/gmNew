package com.google.android.ims.rcsservice.chatsession.message.groupmanagement;

import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;
import defpackage.dkwd;
import defpackage.emxf;
import j$.util.Optional;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class SubjectGroupManagementRequest extends GroupManagementRequest {
    public static final GroupManagementRequest.Target TARGET = GroupManagementRequest.Target.SUBJECT;
    private final GroupManagementRequest.Action action;
    private final Optional<String> subject;

    private SubjectGroupManagementRequest(GroupManagementRequest.Action action) {
        this.action = action;
        this.subject = Optional.empty();
    }

    public static SubjectGroupManagementRequest createSubjectDeleteData() {
        return new SubjectGroupManagementRequest(GroupManagementRequest.Action.DELETE);
    }

    public static SubjectGroupManagementRequest createSubjectSetData(String str) {
        emxf.a(str != null);
        return new SubjectGroupManagementRequest(GroupManagementRequest.Action.SET, str);
    }

    static SubjectGroupManagementRequest deserializeRequest(XmlPullParser xmlPullParser) {
        int nextTag = xmlPullParser.nextTag();
        String namespace = xmlPullParser.getNamespace();
        String name = xmlPullParser.getName();
        GroupManagementRequest.Action action = null;
        String str = null;
        while (true) {
            if (nextTag == 3 && name.equals(GroupManagementRequest.XML_TAG)) {
                break;
            }
            if (CpmGroupManagement.NAMESPACE.equals(namespace)) {
                if (name.equals(GroupManagementRequest.ACTION_TAG)) {
                    action = GroupManagementRequest.Action.fromString(xmlPullParser.nextText());
                } else if (name.equals(GroupManagementRequest.DATA_TAG)) {
                    int nextTag2 = xmlPullParser.nextTag();
                    String namespace2 = xmlPullParser.getNamespace();
                    String name2 = xmlPullParser.getName();
                    if (nextTag2 != 3 && CpmGroupManagement.NAMESPACE.equals(namespace2) && name2.equals(TARGET.getElementTag())) {
                        str = xmlPullParser.nextText();
                    }
                    xmlPullParser.nextTag();
                }
            }
            if (xmlPullParser.getEventType() == 2) {
                dkwd.e(xmlPullParser);
            }
            nextTag = xmlPullParser.nextTag();
            namespace = xmlPullParser.getNamespace();
            name = xmlPullParser.getName();
        }
        if (action != null && action.equals(GroupManagementRequest.Action.SET) && str != null) {
            return new SubjectGroupManagementRequest(action, str);
        }
        if (action == null || !action.equals(GroupManagementRequest.Action.DELETE)) {
            throw new IllegalArgumentException(String.format("Unsupported subject request; action: %s, subject present: %b", action, Boolean.valueOf(str != null)));
        }
        return new SubjectGroupManagementRequest(action);
    }

    @Override // com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest
    public GroupManagementRequest.Action getAction() {
        return this.action;
    }

    public Optional<String> getSubject() {
        return this.subject;
    }

    @Override // com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest
    public GroupManagementRequest.Target getTarget() {
        return TARGET;
    }

    @Override // com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest
    public void serializeData(XmlSerializer xmlSerializer) {
        emxf.m(shouldSerializeData(), "Call to serializeData(XmlSerializer) when shouldSerializeData() returns false!");
        xmlSerializer.text(this.subject.get());
    }

    @Override // com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest
    public boolean shouldSerializeData() {
        return !GroupManagementRequest.Action.DELETE.equals(this.action);
    }

    private SubjectGroupManagementRequest(GroupManagementRequest.Action action, String str) {
        this.action = action;
        this.subject = Optional.of(str);
    }
}
