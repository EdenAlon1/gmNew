package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import j$.util.Objects;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class edzo extends edzi {
    private String d;
    private edzn e;
    private String f;

    public edzo() {
        super("message/imdn+xml", "utf-8");
        o("imdn", "urn:ietf:params:imdn");
        n("urn:ietf:params:imdn", "Message-ID", eeja.a());
    }

    public static void u(edzo edzoVar, OutputStream outputStream) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            XmlSerializer newSerializer = XmlPullParserFactory.newInstance().newSerializer();
            newSerializer.setOutput(byteArrayOutputStream, "utf-8");
            newSerializer.setPrefix("", "urn:ietf:params:xml:ns:imdn");
            newSerializer.startDocument("utf-8", null);
            newSerializer.startTag("urn:ietf:params:xml:ns:imdn", "imdn");
            newSerializer.startTag("urn:ietf:params:xml:ns:imdn", "message-id");
            newSerializer.text(edzoVar.d);
            newSerializer.endTag("urn:ietf:params:xml:ns:imdn", "message-id");
            newSerializer.startTag("urn:ietf:params:xml:ns:imdn", "datetime");
            newSerializer.text(new dktc(0L).toString());
            newSerializer.endTag("urn:ietf:params:xml:ns:imdn", "datetime");
            switch (edzoVar.e) {
                case DELIVERED:
                case DELIVERY_FAILED:
                case DELIVERY_FORBIDDEN:
                case DELIVERY_ERROR:
                    newSerializer.startTag("urn:ietf:params:xml:ns:imdn", "delivery-notification");
                    newSerializer.startTag("urn:ietf:params:xml:ns:imdn", "status");
                    newSerializer.startTag("urn:ietf:params:xml:ns:imdn", edzoVar.e.o);
                    newSerializer.endTag("urn:ietf:params:xml:ns:imdn", edzoVar.e.o);
                    newSerializer.endTag("urn:ietf:params:xml:ns:imdn", "status");
                    newSerializer.endTag("urn:ietf:params:xml:ns:imdn", "delivery-notification");
                    break;
                case DISPLAYED:
                case DISPLAY_ERROR:
                case DISPLAY_FORBIDDEN:
                    newSerializer.startTag("urn:ietf:params:xml:ns:imdn", "display-notification");
                    newSerializer.startTag("urn:ietf:params:xml:ns:imdn", "status");
                    newSerializer.startTag("urn:ietf:params:xml:ns:imdn", edzoVar.e.o);
                    newSerializer.endTag("urn:ietf:params:xml:ns:imdn", edzoVar.e.o);
                    newSerializer.endTag("urn:ietf:params:xml:ns:imdn", "status");
                    newSerializer.endTag("urn:ietf:params:xml:ns:imdn", "display-notification");
                    break;
                case PROCESSED:
                case STORED:
                case PROCESSING_ERROR:
                case PROCESSING_FORBIDDEN:
                    newSerializer.startTag("urn:ietf:params:xml:ns:imdn", "processing-notification");
                    newSerializer.startTag("urn:ietf:params:xml:ns:imdn", "status");
                    newSerializer.startTag("urn:ietf:params:xml:ns:imdn", edzoVar.e.o);
                    newSerializer.endTag("urn:ietf:params:xml:ns:imdn", edzoVar.e.o);
                    newSerializer.endTag("urn:ietf:params:xml:ns:imdn", "status");
                    newSerializer.endTag("urn:ietf:params:xml:ns:imdn", "processing-notification");
                    break;
                case INTERWORKING_SMS:
                case INTERWORKING_MMS:
                case INTERWORKING_ERROR:
                    newSerializer.setPrefix("cpmimdn", "urn:oma:xml:cpm:imdn-extensions:1.0");
                    newSerializer.startTag("urn:oma:xml:cpm:imdn-extensions:1.0", "interworking-notification");
                    newSerializer.startTag("urn:oma:xml:cpm:imdn-extensions:1.0", "status");
                    newSerializer.startTag("urn:oma:xml:cpm:imdn-extensions:1.0", edzoVar.e.o);
                    newSerializer.endTag("urn:oma:xml:cpm:imdn-extensions:1.0", edzoVar.e.o);
                    newSerializer.endTag("urn:oma:xml:cpm:imdn-extensions:1.0", "status");
                    newSerializer.endTag("urn:oma:xml:cpm:imdn-extensions:1.0", "interworking-notification");
                    break;
            }
            newSerializer.endTag("urn:ietf:params:xml:ns:imdn", "imdn");
            newSerializer.endDocument();
            newSerializer.flush();
            edzoVar.k(fhpi.c, "notification");
            edzoVar.j(byteArrayOutputStream.toByteArray());
            edzoVar.q(outputStream);
        } catch (XmlPullParserException e) {
            throw new IOException("Error while writing document: ".concat(String.valueOf(e.getMessage())));
        }
    }

    @Override // defpackage.edzi
    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof edzo)) {
            return false;
        }
        edzo edzoVar = (edzo) obj;
        if (TextUtils.equals(this.d, edzoVar.d) && TextUtils.equals(this.f, edzoVar.f) && TextUtils.equals(null, null) && TextUtils.equals(null, null) && TextUtils.equals(null, (String) edzoVar.b.get("Subject")) && this.e == edzoVar.e && Objects.equals(null, null)) {
            return super.equals(obj);
        }
        return false;
    }

    @Override // defpackage.edzi
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{0L, this.d, this.f, null, null, null, this.e, null});
    }

    @Override // defpackage.edzi
    public final String toString() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            u(this, byteArrayOutputStream);
            return new String(byteArrayOutputStream.toByteArray(), "utf-8");
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

    public edzo(String str, String str2, String str3, String str4, edzn edznVar) {
        super("message/imdn+xml", "utf-8");
        o("imdn", "urn:ietf:params:imdn");
        l(str2);
        p(str3);
        this.e = edznVar;
        this.f = str;
        this.d = str4;
        n("urn:ietf:params:imdn", "Message-ID", str);
        m("DateTime", new dktc(SystemClock.currentThreadTimeMillis()).toString());
    }
}
