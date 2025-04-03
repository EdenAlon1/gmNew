package defpackage;

import android.util.Base64;
import com.google.android.rcs.client.messaging.data.ContentType;
import com.google.android.rcs.client.messaging.data.MessageReceipt;
import j$.time.Instant;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eijw implements eiko {
    public static final ContentType a = eijq.d;

    public static final MessageReceipt c(eijp eijpVar) {
        try {
            eies eiesVar = new eies();
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            newInstance.setNamespaceAware(true);
            XmlPullParser newPullParser = newInstance.newPullParser();
            newPullParser.setInput(eijpVar.b().m(), StandardCharsets.UTF_8.name());
            eikn.b(newPullParser);
            while (eikn.b(newPullParser) == 2) {
                String name = newPullParser.getName();
                if ("message-id".equals(name)) {
                    eiesVar.g(eikn.d(newPullParser));
                } else if ("datetime".equals(name)) {
                    eiesVar.i(Instant.ofEpochMilli(dktc.c(eikn.d(newPullParser)).a));
                } else if ("delivery-notification".equals(name)) {
                    eiesVar.j(eigx.DELIVERY);
                    eikn.b(newPullParser);
                    eikn.b(newPullParser);
                    eiesVar.h(newPullParser.getName());
                    eikn.b(newPullParser);
                    eikn.b(newPullParser);
                    eikn.b(newPullParser);
                } else if ("display-notification".equals(name)) {
                    eiesVar.j(eigx.DISPLAY);
                    eikn.b(newPullParser);
                    eikn.b(newPullParser);
                    eiesVar.h(newPullParser.getName());
                    eikn.b(newPullParser);
                    eikn.b(newPullParser);
                    eikn.b(newPullParser);
                } else if ("interworking-notification".equals(name)) {
                    eiesVar.j(eigx.INTERWORKING);
                    eikn.b(newPullParser);
                    eikn.b(newPullParser);
                    eiesVar.h(newPullParser.getName());
                    eikn.b(newPullParser);
                    eikn.b(newPullParser);
                    eikn.b(newPullParser);
                } else if ("processing-notification".equals(name)) {
                    eiesVar.j(eigx.PROCESSING);
                    eikn.b(newPullParser);
                    eikn.b(newPullParser);
                    eiesVar.h(newPullParser.getName());
                    eikn.b(newPullParser);
                    eikn.b(newPullParser);
                    eikn.b(newPullParser);
                } else if ("google".equals(name)) {
                    eikn.b(newPullParser);
                    byte[] decode = Base64.decode(eikn.d(newPullParser), 2);
                    if (decode == null) {
                        throw new eikm("Encounter a null encrypted data");
                    }
                    eiesVar.e(eyee.x(decode));
                    eikn.b(newPullParser);
                } else {
                    try {
                        dkty.c("Skipping unknown elements with name=%s", name);
                        String namespace = newPullParser.getNamespace();
                        newPullParser.require(2, namespace, name);
                        int i = 1;
                        while (true) {
                            newPullParser.next();
                            int eventType = newPullParser.getEventType();
                            if (eventType == 2) {
                                i++;
                            } else if (eventType == 3) {
                                i--;
                                emxf.b(i >= 0, "Encounter more END_TAG than START_TAG while parsing unknown elements");
                            }
                            if (newPullParser.getEventType() == 3 && newPullParser.getName().equals(name) && i == 0) {
                                break;
                            }
                        }
                        newPullParser.require(3, namespace, name);
                    } catch (IllegalArgumentException e) {
                        e = e;
                        throw new eikm("Error: ".concat(String.valueOf(e.getMessage())), e);
                    } catch (IllegalStateException e2) {
                        e = e2;
                        throw new eikm("Error: ".concat(String.valueOf(e.getMessage())), e);
                    } catch (XmlPullParserException e3) {
                        e = e3;
                        throw new eikm("Error: ".concat(String.valueOf(e.getMessage())), e);
                    }
                }
            }
            return eiesVar.k();
        } catch (IOException | IllegalArgumentException | IllegalStateException | XmlPullParserException e4) {
            e = e4;
        }
    }

    public static final eijp d(MessageReceipt messageReceipt) {
        boolean z = false;
        emxf.a(messageReceipt.a() != eigx.UNKNOWN);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            XmlSerializer newSerializer = XmlPullParserFactory.newInstance().newSerializer();
            newSerializer.setOutput(byteArrayOutputStream, StandardCharsets.UTF_8.name());
            newSerializer.setPrefix("", "urn:ietf:params:xml:ns:imdn");
            newSerializer.setPrefix("cpm", "urn:oma:xml:cpm:imdn-extensions:1.0");
            if ((eigx.DELIVERY.equals(messageReceipt.a()) || (((Boolean) dizk.a().a.a.a()).booleanValue() && eigx.DISPLAY.equals(messageReceipt.a()))) && messageReceipt.c().isPresent()) {
                z = true;
            }
            if (z) {
                newSerializer.setPrefix("enc", "urn:google:am-imdn-xml-encryption");
            }
            newSerializer.startDocument(StandardCharsets.UTF_8.name(), null);
            newSerializer.startTag("urn:ietf:params:xml:ns:imdn", "imdn");
            eikn.f(newSerializer, "urn:ietf:params:xml:ns:imdn", "message-id", messageReceipt.d());
            eikn.f(newSerializer, "urn:ietf:params:xml:ns:imdn", "datetime", messageReceipt.b().toString());
            int ordinal = messageReceipt.a().ordinal();
            if (ordinal == 1) {
                newSerializer.startTag("urn:ietf:params:xml:ns:imdn", "delivery-notification");
                newSerializer.startTag("urn:ietf:params:xml:ns:imdn", "status");
                newSerializer.startTag("urn:ietf:params:xml:ns:imdn", messageReceipt.e());
                newSerializer.endTag("urn:ietf:params:xml:ns:imdn", messageReceipt.e());
                newSerializer.endTag("urn:ietf:params:xml:ns:imdn", "status");
                newSerializer.endTag("urn:ietf:params:xml:ns:imdn", "delivery-notification");
                if (z) {
                    newSerializer.startTag("urn:google:am-imdn-xml-encryption", "google");
                    newSerializer.startTag("urn:google:am-imdn-xml-encryption", "encrypted-data");
                    newSerializer.text(Base64.encodeToString(((eyee) messageReceipt.c().get()).I(), 2));
                    newSerializer.endTag("urn:google:am-imdn-xml-encryption", "encrypted-data");
                    newSerializer.endTag("urn:google:am-imdn-xml-encryption", "google");
                }
            } else if (ordinal == 2) {
                newSerializer.startTag("urn:ietf:params:xml:ns:imdn", "display-notification");
                newSerializer.startTag("urn:ietf:params:xml:ns:imdn", "status");
                newSerializer.startTag("urn:ietf:params:xml:ns:imdn", messageReceipt.e());
                newSerializer.endTag("urn:ietf:params:xml:ns:imdn", messageReceipt.e());
                newSerializer.endTag("urn:ietf:params:xml:ns:imdn", "status");
                newSerializer.endTag("urn:ietf:params:xml:ns:imdn", "display-notification");
                if (z) {
                    newSerializer.startTag("urn:google:am-imdn-xml-encryption", "google");
                    newSerializer.startTag("urn:google:am-imdn-xml-encryption", "encrypted-data");
                    newSerializer.text(Base64.encodeToString(((eyee) messageReceipt.c().get()).I(), 2));
                    newSerializer.endTag("urn:google:am-imdn-xml-encryption", "encrypted-data");
                    newSerializer.endTag("urn:google:am-imdn-xml-encryption", "google");
                }
            } else if (ordinal == 3) {
                newSerializer.startTag("urn:ietf:params:xml:ns:imdn", "processing-notification");
                newSerializer.startTag("urn:ietf:params:xml:ns:imdn", "status");
                newSerializer.startTag("urn:ietf:params:xml:ns:imdn", messageReceipt.e());
                newSerializer.endTag("urn:ietf:params:xml:ns:imdn", messageReceipt.e());
                newSerializer.endTag("urn:ietf:params:xml:ns:imdn", "status");
                newSerializer.endTag("urn:ietf:params:xml:ns:imdn", "processing-notification");
            } else {
                if (ordinal != 4) {
                    throw new IllegalArgumentException("Receipt type: " + messageReceipt.a().toString() + " not supported.");
                }
                newSerializer.startTag("urn:ietf:params:xml:ns:imdn", "interworking-notification");
                newSerializer.startTag("urn:ietf:params:xml:ns:imdn", "status");
                newSerializer.startTag("urn:oma:xml:cpm:imdn-extensions:1.0", messageReceipt.e());
                newSerializer.endTag("urn:oma:xml:cpm:imdn-extensions:1.0", messageReceipt.e());
                newSerializer.endTag("urn:ietf:params:xml:ns:imdn", "status");
                newSerializer.endTag("urn:ietf:params:xml:ns:imdn", "interworking-notification");
            }
            newSerializer.endTag("urn:ietf:params:xml:ns:imdn", "imdn");
            newSerializer.endDocument();
            newSerializer.flush();
            eijj eijjVar = new eijj();
            eijjVar.b(eyee.x(byteArrayOutputStream.toByteArray()));
            eijjVar.c(a);
            return eijjVar.a();
        } catch (IOException | XmlPullParserException e) {
            throw new eikm("Error: ".concat(String.valueOf(e.getMessage())), e);
        }
    }

    @Override // defpackage.eiko
    public final /* bridge */ /* synthetic */ eihn a(eijp eijpVar) {
        return c(eijpVar);
    }

    @Override // defpackage.eiko
    public final /* bridge */ /* synthetic */ eijp b(eihn eihnVar) {
        return d((MessageReceipt) eihnVar);
    }
}
