package com.google.android.ims.rcsservice.chatsession.message.groupmanagement;

import android.text.TextUtils;
import defpackage.dkwd;
import j$.util.Optional;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class CpmGroupManagement {
    public static final String NAMESPACE = "urn:oma:xml:cpm:groupdata:1.0";
    public static final String XML_TAG = "cpm-group-management";
    private final Optional<GroupData> groupData;
    private final String messageId;

    public CpmGroupManagement(String str) {
        this.messageId = str;
        this.groupData = Optional.empty();
    }

    static CpmGroupManagement deserialize(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue("", "id");
        if (TextUtils.isEmpty(attributeValue)) {
            throw new IllegalArgumentException("CpmGroupManagement message missing id attribute");
        }
        int nextTag = xmlPullParser.nextTag();
        String namespace = xmlPullParser.getNamespace();
        String name = xmlPullParser.getName();
        GroupData groupData = null;
        while (true) {
            if (nextTag == 3 && name.equals(XML_TAG)) {
                break;
            }
            if (NAMESPACE.equals(namespace) && name.equals(GroupData.XML_TAG)) {
                groupData = GroupData.deserialize(xmlPullParser);
            }
            if (xmlPullParser.getEventType() == 2) {
                dkwd.e(xmlPullParser);
            }
            nextTag = xmlPullParser.nextTag();
            namespace = xmlPullParser.getNamespace();
            name = xmlPullParser.getName();
        }
        return groupData == null ? new CpmGroupManagement(attributeValue) : new CpmGroupManagement(attributeValue, groupData);
    }

    public Optional<GroupData> getGroupData() {
        return this.groupData;
    }

    public String getMessageId() {
        return this.messageId;
    }

    public void serialize(XmlSerializer xmlSerializer) {
        xmlSerializer.setPrefix("", NAMESPACE);
        xmlSerializer.startTag(NAMESPACE, XML_TAG);
        xmlSerializer.attribute("", "id", this.messageId);
        if (this.groupData.isPresent()) {
            this.groupData.get().serialize(xmlSerializer);
        }
        xmlSerializer.endTag(NAMESPACE, XML_TAG);
    }

    public CpmGroupManagement(String str, GroupData groupData) {
        this.messageId = str;
        this.groupData = Optional.of(groupData);
    }
}
