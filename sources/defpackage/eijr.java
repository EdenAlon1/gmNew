package defpackage;

import android.util.Base64;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;
import com.google.android.rcs.client.messaging.data.ContentType;
import com.google.android.rcs.client.messaging.data.FileInformation;
import com.google.android.rcs.client.messaging.data.FileTransferInformation;
import j$.time.DateTimeException;
import j$.time.Duration;
import j$.util.Optional;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eijr implements eiko {
    public static final ContentType a = eijq.b;

    public static final FileTransferInformation c(eijp eijpVar) {
        ContentType contentType = a;
        if (contentType.f(eijpVar.a())) {
            return f(eijpVar);
        }
        throw new eikq(eijpVar.a(), "Supported type for this serializer is: ".concat(String.valueOf(String.valueOf(contentType))));
    }

    public static final eijp d(FileTransferInformation fileTransferInformation) {
        String g = g(fileTransferInformation);
        eijj eijjVar = new eijj();
        eijjVar.c(a);
        eijjVar.b(eyee.A(g));
        return eijjVar.a();
    }

    private static FileInformation e(XmlPullParser xmlPullParser, eifj eifjVar) {
        int a2 = eikn.a(xmlPullParser);
        String name = xmlPullParser.getName();
        eieb eiebVar = new eieb();
        eiebVar.d(eifjVar);
        String str = null;
        String str2 = name;
        int i = a2;
        String str3 = null;
        while (true) {
            if (i == 3) {
                if ("file-info".equals(str2)) {
                    return eiebVar.i();
                }
                i = 3;
            }
            if (i == 1) {
                throw new eijs("Incomplete XML for:".concat(String.valueOf(FileInformation.class.getName())));
            }
            if (i == 2) {
                if ("file-size".equals(str2)) {
                    eiebVar.f(Integer.parseInt(eikn.d(xmlPullParser)));
                }
                if (str != null) {
                    eikn.g("url", str);
                    eiebVar.g(str);
                }
                if ("content-type".equals(str2)) {
                    String d = eikn.d(xmlPullParser);
                    eikn.g("content-type", d);
                    try {
                        eiebVar.c(ContentType.e(d));
                    } catch (IllegalArgumentException e) {
                        throw new eikm("Invalid content type for FileTransferInformation", e);
                    }
                }
                if ("file-name".equals(str2)) {
                    eiebVar.e(eikn.d(xmlPullParser));
                }
                if (str3 != null) {
                    eikn.g("until", str3);
                    eiebVar.h(eikn.c("until", str3));
                }
            }
            i = eikn.a(xmlPullParser);
            str2 = xmlPullParser.getName();
            String attributeValue = xmlPullParser.getAttributeValue("", "url");
            str3 = xmlPullParser.getAttributeValue("", "until");
            str = attributeValue;
        }
    }

    private static FileTransferInformation f(eijp eijpVar) {
        try {
            InputStream m = eijpVar.b().m();
            try {
                XmlPullParser e = eikn.e();
                e.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
                e.setInput(m, "UTF-8");
                int a2 = eikn.a(e);
                String name = e.getName();
                if (!"file".equals(name)) {
                    throw new eijs("Invalid start tag for XML:" + FileTransferInformation.class.getName());
                }
                eieg eiegVar = new eieg();
                while (true) {
                    if (a2 == 3) {
                        if ("file".equals(name)) {
                            FileTransferInformation a3 = eiegVar.a();
                            m.close();
                            return a3;
                        }
                        a2 = 3;
                    }
                    if (a2 == 1) {
                        throw new eijs("Incomplete XML for:" + FileTransferInformation.class.getName());
                    }
                    if (a2 == 2) {
                        if ("file-info".equals(name)) {
                            String attributeValue = e.getAttributeValue("", BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE);
                            if ("thumbnail".equals(attributeValue)) {
                                eiegVar.e(e(e, eifj.THUMBNAIL));
                            } else if ("file".equals(attributeValue)) {
                                eiegVar.c(e(e, eifj.FILE));
                            }
                        } else if ("encrypted-data".equals(name)) {
                            String d = eikn.d(e);
                            eikn.g("encrypted-data", d);
                            eiegVar.b(eyee.x(Base64.decode(d, 0)));
                        } else if ("mls-file".equals(name)) {
                            String d2 = eikn.d(e);
                            eikn.g("mls-file", d2);
                            eiegVar.d(eyee.x(Base64.decode(d2, 0)));
                        }
                    }
                    a2 = eikn.a(e);
                    name = e.getName();
                }
            } catch (Throwable th) {
                try {
                    m.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (DateTimeException | IOException | IllegalStateException | NumberFormatException | XmlPullParserException e2) {
            throw new eikm("Error deserializing FileTransferInformation", e2);
        }
    }

    private static String g(FileTransferInformation fileTransferInformation) {
        try {
            StringWriter stringWriter = new StringWriter();
            try {
                XmlSerializer newSerializer = XmlPullParserFactory.newInstance().newSerializer();
                newSerializer.setOutput(stringWriter);
                newSerializer.setPrefix("", "urn:gsma:params:xml:ns:rcs:rcs:fthttp");
                boolean isPresent = fileTransferInformation.b().isPresent();
                if (isPresent) {
                    newSerializer.setPrefix("enc", "urn:google:am-ftpush-xml-encryption");
                }
                if (fileTransferInformation.a().e().isPresent()) {
                    newSerializer.setPrefix("am", "urn:gsma:params:xml:ns:rcs:rcs:rram");
                }
                newSerializer.startDocument("UTF-8", true);
                newSerializer.startTag("urn:gsma:params:xml:ns:rcs:rcs:fthttp", "file");
                Optional d = fileTransferInformation.d();
                if (d.isPresent()) {
                    h((FileInformation) d.get(), newSerializer, "thumbnail");
                }
                h(fileTransferInformation.a(), newSerializer, "file");
                if (isPresent) {
                    eikn.f(newSerializer, "urn:google:am-ftpush-xml-encryption", "encrypted-data", Base64.encodeToString(((eyee) fileTransferInformation.b().get()).I(), 2));
                }
                if (fileTransferInformation.c().isPresent()) {
                    eikn.f(newSerializer, null, "mls-file", Base64.encodeToString(((eyee) fileTransferInformation.c().get()).I(), 2));
                }
                newSerializer.endTag("urn:gsma:params:xml:ns:rcs:rcs:fthttp", "file");
                newSerializer.endDocument();
                String stringWriter2 = stringWriter.toString();
                stringWriter.close();
                return stringWriter2;
            } catch (Throwable th) {
                try {
                    stringWriter.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException | XmlPullParserException e) {
            throw new eikm("Error serializing message.", e);
        }
    }

    private static void h(FileInformation fileInformation, XmlSerializer xmlSerializer, String str) {
        boolean isPresent = fileInformation.e().isPresent();
        xmlSerializer.startTag(null, "file-info");
        xmlSerializer.attribute(null, BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, str);
        if (isPresent) {
            xmlSerializer.attribute(null, "file-disposition", "render");
        }
        eikn.f(xmlSerializer, null, "file-size", String.valueOf(fileInformation.a()));
        Optional h = fileInformation.h();
        if (h.isPresent()) {
            eikn.f(xmlSerializer, null, "file-name", (String) h.get());
        }
        eikn.f(xmlSerializer, null, "content-type", fileInformation.b().toString());
        if (isPresent) {
            eikn.f(xmlSerializer, "urn:gsma:params:xml:ns:rcs:rcs:rram", "playing-length", Long.toString(((Duration) fileInformation.e().get()).toSeconds()));
        }
        xmlSerializer.startTag(null, GroupManagementRequest.DATA_TAG);
        xmlSerializer.attribute(null, "url", fileInformation.i());
        xmlSerializer.attribute(null, "until", fileInformation.d().toString());
        xmlSerializer.endTag(null, GroupManagementRequest.DATA_TAG);
        xmlSerializer.endTag(null, "file-info");
    }

    @Override // defpackage.eiko
    public final /* bridge */ /* synthetic */ eihn a(eijp eijpVar) {
        return c(eijpVar);
    }

    @Override // defpackage.eiko
    public final /* bridge */ /* synthetic */ eijp b(eihn eihnVar) {
        return d((FileTransferInformation) eihnVar);
    }
}
