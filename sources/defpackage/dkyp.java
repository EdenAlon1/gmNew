package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import j$.util.Objects;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import javax.xml.namespace.QName;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkyp {
    private final ffbr a;

    public dkyp(ffbr ffbrVar) {
        this.a = ffbrVar;
    }

    public final dkyo a(Reader reader) {
        Document c;
        XmlPullParser newPullParser;
        boolean z;
        String str;
        String str2;
        String str3;
        String str4;
        dkys dkysVar;
        String str5 = "name";
        String str6 = "urn:ietf:params:xml:ns:rlmi";
        try {
            c = dkwd.c();
            newPullParser = XmlPullParserFactory.newInstance().newPullParser();
            z = true;
            newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
            newPullParser.setInput(reader);
            newPullParser.nextTag();
        } catch (ParserConfigurationException | XmlPullParserException e) {
            e = e;
        }
        try {
            dkyo dkyoVar = (dkyo) this.a.b();
            String attributeValue = newPullParser.getAttributeValue("", ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI);
            if (Objects.isNull(attributeValue)) {
                throw new XmlPullParserException("RLMI document missing uri required element.");
            }
            dkyoVar.a = attributeValue;
            String attributeValue2 = newPullParser.getAttributeValue("", BusinessInfoDatabaseConstants.BusinessInfoMetadataTableConstants.Columns.VERSION);
            if (Objects.isNull(attributeValue2)) {
                throw new XmlPullParserException("RLMI document missing version required element.");
            }
            dkyoVar.b = Integer.parseInt(attributeValue2);
            String attributeValue3 = newPullParser.getAttributeValue("", "fullState");
            if (Objects.isNull(attributeValue3)) {
                throw new XmlPullParserException("RLMI document missing fullState required element.");
            }
            dkyoVar.c = Boolean.parseBoolean(attributeValue3);
            dkyoVar.d = newPullParser.getAttributeValue("", "cid");
            String name = newPullParser.getName();
            int nextTag = newPullParser.nextTag();
            String namespace = newPullParser.getNamespace();
            String name2 = newPullParser.getName();
            while (true) {
                int i = 3;
                if ((nextTag == 3 ? z : false) && name2.equals(name)) {
                    return dkyoVar;
                }
                if (str6.equals(namespace)) {
                    if (str5.equals(name2)) {
                        dkyq dkyqVar = new dkyq();
                        dkyqVar.a(newPullParser);
                        dkyoVar.a().add(dkyqVar);
                    } else if ("resource".equals(name2)) {
                        dkyr dkyrVar = (dkyr) dkyoVar.e.b();
                        String attributeValue4 = newPullParser.getAttributeValue("", ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI);
                        if (attributeValue4 == null) {
                            throw new XmlPullParserException("Missing required attribute [uri]", newPullParser, new Exception("Missing required attribute"));
                        }
                        dkyrVar.a = attributeValue4;
                        String name3 = newPullParser.getName();
                        int nextTag2 = newPullParser.nextTag();
                        String namespace2 = newPullParser.getNamespace();
                        String name4 = newPullParser.getName();
                        while (true) {
                            if ((nextTag2 == i) && name4.equals(name3)) {
                                str = str5;
                                str2 = str6;
                                dkyoVar.a().add(dkyrVar);
                                break;
                            }
                            if (str6.equals(namespace2)) {
                                if (str5.equals(name4)) {
                                    dkyq dkyqVar2 = new dkyq();
                                    dkyqVar2.a(newPullParser);
                                    dkyrVar.b.add(dkyqVar2);
                                } else if ("instance".equals(name4)) {
                                    dkyn dkynVar = (dkyn) dkyrVar.c.b();
                                    String attributeValue5 = newPullParser.getAttributeValue("", "id");
                                    if (Objects.isNull(attributeValue5)) {
                                        throw new XmlPullParserException("RLMI document missing 'id' required element.");
                                    }
                                    dkynVar.a = attributeValue5;
                                    String attributeValue6 = newPullParser.getAttributeValue("", "state");
                                    if (attributeValue6 != null) {
                                        dkys[] values = dkys.values();
                                        int length = values.length;
                                        str3 = str5;
                                        int i2 = 0;
                                        while (true) {
                                            if (i2 >= length) {
                                                str4 = str6;
                                                dkysVar = null;
                                                break;
                                            }
                                            int i3 = i2;
                                            dkysVar = values[i3];
                                            str4 = str6;
                                            if (dkysVar.d.equalsIgnoreCase(attributeValue6)) {
                                                break;
                                            }
                                            i2 = i3 + 1;
                                            str6 = str4;
                                        }
                                        if (Objects.isNull(dkysVar)) {
                                            throw new XmlPullParserException("RLMI document was invalid value for 'state'element: ".concat(attributeValue6));
                                        }
                                        dkynVar.b = dkysVar;
                                    } else {
                                        str3 = str5;
                                        str4 = str6;
                                    }
                                    dkynVar.c = newPullParser.getAttributeValue("", "reason");
                                    dkynVar.d = newPullParser.getAttributeValue("", "cid");
                                    String name5 = newPullParser.getName();
                                    int nextTag3 = newPullParser.nextTag();
                                    String namespace3 = newPullParser.getNamespace();
                                    String name6 = newPullParser.getName();
                                    while (true) {
                                        if ((nextTag3 == 3) && name6.equals(name5)) {
                                            break;
                                        }
                                        if (dkynVar.e == null) {
                                            dkynVar.e = new ArrayList();
                                        }
                                        dkynVar.e.add(((dkwo) dkynVar.f.b()).a(c, new QName(namespace3, name6), newPullParser));
                                        nextTag3 = newPullParser.nextTag();
                                        namespace3 = newPullParser.getNamespace();
                                        name6 = newPullParser.getName();
                                        name5 = name5;
                                    }
                                    dkyrVar.b.add(dkynVar);
                                    nextTag2 = newPullParser.nextTag();
                                    namespace2 = newPullParser.getNamespace();
                                    name4 = newPullParser.getName();
                                    str5 = str3;
                                    str6 = str4;
                                    i = 3;
                                }
                            }
                            str3 = str5;
                            str4 = str6;
                            nextTag2 = newPullParser.nextTag();
                            namespace2 = newPullParser.getNamespace();
                            name4 = newPullParser.getName();
                            str5 = str3;
                            str6 = str4;
                            i = 3;
                        }
                    }
                }
                str = str5;
                str2 = str6;
                nextTag = newPullParser.nextTag();
                namespace = newPullParser.getNamespace();
                name2 = newPullParser.getName();
                str5 = str;
                str6 = str2;
                z = true;
            }
        } catch (ParserConfigurationException e2) {
            e = e2;
            throw new IOException(e.getMessage());
        } catch (XmlPullParserException e3) {
            e = e3;
            throw new IOException(e.getMessage());
        }
    }
}
