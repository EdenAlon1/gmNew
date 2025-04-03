package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import java.util.ArrayList;
import java.util.Arrays;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dime extends ArrayList {
    private static final long serialVersionUID = 5193682565287307651L;
    public final dimb a;

    public dime(dimb dimbVar) {
        dimbVar.getClass();
        this.a = dimbVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static dime a(XmlPullParser xmlPullParser) {
        char c;
        String name = xmlPullParser.getName();
        String attributeValue = xmlPullParser.getAttributeValue("", "state");
        dime dimeVar = new dime(attributeValue == null ? dimb.FULL : dimb.a(attributeValue));
        int nextTag = xmlPullParser.nextTag();
        String namespace = xmlPullParser.getNamespace();
        String name2 = xmlPullParser.getName();
        while (true) {
            if (nextTag == 3 && name2.equals(name)) {
                return dimeVar;
            }
            if ("urn:ietf:params:xml:ns:conference-info".equals(namespace)) {
                if (name2.equals("entry")) {
                    String name3 = xmlPullParser.getName();
                    int nextTag2 = xmlPullParser.nextTag();
                    String namespace2 = xmlPullParser.getNamespace();
                    String name4 = xmlPullParser.getName();
                    dilu diluVar = null;
                    String str = "";
                    String str2 = str;
                    String str3 = str2;
                    while (true) {
                        if (nextTag2 == 3 && name4.equals(name3)) {
                            dimeVar.add(new dimd(str, str2, str3, diluVar));
                        } else {
                            if ("urn:ietf:params:xml:ns:conference-info".equals(namespace2)) {
                                switch (name4.hashCode()) {
                                    case -615513399:
                                        if (name4.equals("modified")) {
                                            c = 3;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -220463842:
                                        if (name4.equals("purpose")) {
                                            c = 2;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 116076:
                                        if (name4.equals(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI)) {
                                            c = 0;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1569093464:
                                        if (name4.equals("display-text")) {
                                            c = 1;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    default:
                                        c = 65535;
                                        break;
                                }
                                if (c == 0) {
                                    str = xmlPullParser.nextText();
                                } else if (c == 1) {
                                    str2 = xmlPullParser.nextText();
                                } else if (c == 2) {
                                    str3 = xmlPullParser.nextText();
                                } else if (c == 3) {
                                    diluVar = dilu.a(xmlPullParser);
                                }
                            }
                            nextTag2 = xmlPullParser.nextTag();
                            namespace2 = xmlPullParser.getNamespace();
                            name4 = xmlPullParser.getName();
                        }
                    }
                } else if (dilh.a()) {
                    dkwd.e(xmlPullParser);
                }
            }
            nextTag = xmlPullParser.nextTag();
            namespace = xmlPullParser.getNamespace();
            name2 = xmlPullParser.getName();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(XmlSerializer xmlSerializer, String str) {
        xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", str);
        dimb dimbVar = this.a;
        if (dimbVar != dimb.NONE && dimbVar != dimb.FULL) {
            xmlSerializer.attribute("", "state", dimbVar.e);
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            dimd dimdVar = (dimd) get(i);
            xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "entry");
            if (!dimdVar.a.isEmpty()) {
                xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI);
                xmlSerializer.text(dimdVar.a);
                xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI);
            }
            if (!dimdVar.b.isEmpty()) {
                xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "display-text");
                xmlSerializer.text(dimdVar.b);
                xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "display-text");
            }
            if (!dimdVar.c.isEmpty()) {
                xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "purpose");
                xmlSerializer.text(dimdVar.c);
                xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "purpose");
            }
            dilu diluVar = dimdVar.d;
            if (diluVar != null) {
                diluVar.b(xmlSerializer, "modified");
            }
            xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "entry");
        }
        xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", str);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof dime)) {
            return false;
        }
        dime dimeVar = (dime) obj;
        if (this.a == dimeVar.a) {
            return super.equals(dimeVar);
        }
        return false;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "State: " + String.valueOf(this.a) + " " + Arrays.toString(toArray());
    }
}
