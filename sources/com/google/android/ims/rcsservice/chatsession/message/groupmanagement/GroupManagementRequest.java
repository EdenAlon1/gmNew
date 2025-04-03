package com.google.android.ims.rcsservice.chatsession.message.groupmanagement;

import android.text.TextUtils;
import defpackage.dkty;
import defpackage.emuz;
import defpackage.emxf;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class GroupManagementRequest {
    public static final String ACTION_TAG = "action";
    public static final String DATA_TAG = "data";
    public static final String TARGET_ATTRIBUTE = "target";
    public static final String XML_TAG = "request";

    /* compiled from: PG */
    public enum Action {
        SET,
        DELETE,
        MOVE;

        public static Action fromString(String str) {
            return valueOf(emuz.d(str));
        }

        @Override // java.lang.Enum
        public String toString() {
            return emuz.c(name());
        }
    }

    /* compiled from: PG */
    public enum Target {
        SUBJECT,
        ICON,
        BULLETIN,
        ROLE;

        public static Target fromString(String str) {
            return valueOf(emuz.d(str));
        }

        public String getElementTag() {
            return toString();
        }

        @Override // java.lang.Enum
        public String toString() {
            return emuz.c(name());
        }
    }

    static GroupManagementRequest deserialize(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue("", TARGET_ATTRIBUTE);
        if (TextUtils.isEmpty(attributeValue)) {
            throw new IllegalArgumentException("Request target is empty.");
        }
        if (Target.fromString(attributeValue).equals(SubjectGroupManagementRequest.TARGET)) {
            return SubjectGroupManagementRequest.deserializeRequest(xmlPullParser);
        }
        dkty.q("Only 'subject' request target is supported", new Object[0]);
        return null;
    }

    public abstract Action getAction();

    public abstract Target getTarget();

    public void serialize(XmlSerializer xmlSerializer) {
        boolean z = true;
        if (getAction().equals(Action.MOVE) && !getTarget().equals(Target.ROLE)) {
            z = false;
        }
        emxf.m(z, "Request with a 'move' action but not a 'role' target.");
        xmlSerializer.startTag(CpmGroupManagement.NAMESPACE, XML_TAG);
        xmlSerializer.attribute("", TARGET_ATTRIBUTE, getTarget().toString());
        xmlSerializer.startTag(CpmGroupManagement.NAMESPACE, ACTION_TAG);
        xmlSerializer.text(getAction().toString());
        xmlSerializer.endTag(CpmGroupManagement.NAMESPACE, ACTION_TAG);
        if (shouldSerializeData()) {
            xmlSerializer.startTag(CpmGroupManagement.NAMESPACE, DATA_TAG);
            xmlSerializer.startTag(CpmGroupManagement.NAMESPACE, getTarget().getElementTag());
            serializeData(xmlSerializer);
            xmlSerializer.endTag(CpmGroupManagement.NAMESPACE, getTarget().getElementTag());
            xmlSerializer.endTag(CpmGroupManagement.NAMESPACE, DATA_TAG);
        }
        xmlSerializer.endTag(CpmGroupManagement.NAMESPACE, XML_TAG);
    }

    public abstract void serializeData(XmlSerializer xmlSerializer);

    public abstract boolean shouldSerializeData();
}
