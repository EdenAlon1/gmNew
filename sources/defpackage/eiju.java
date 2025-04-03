package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import com.google.android.rcs.client.messaging.data.ContentType;
import com.google.android.rcs.client.messaging.data.IsComposingMessage;
import j$.time.Duration;
import j$.time.Instant;
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
public final class eiju implements eiko {
    public static final ContentType a = eijq.a;
    private static final ContentType b;

    static {
        eifc d = ContentType.d();
        d.f(ConversationSuggestion.SUGGESTION_PROPERTY_TEXT);
        d.e("plain");
        b = d.g();
    }

    public static final IsComposingMessage c(eijp eijpVar) {
        ContentType contentType = a;
        if (!contentType.f(eijpVar.a())) {
            throw new eikq(eijpVar.a(), "Supported type for this serializer is: ".concat(String.valueOf(String.valueOf(contentType))));
        }
        try {
            InputStream m = eijpVar.b().m();
            try {
                XmlPullParser e = eikn.e();
                e.setInput(m, "UTF-8");
                int a2 = eikn.a(e);
                String name = e.getName();
                if (!"isComposing".equals(name)) {
                    throw new eijs("Invalid start tag for XML:".concat(String.valueOf(IsComposingMessage.class.getName())));
                }
                eiem eiemVar = new eiem();
                while (true) {
                    if (a2 == 3) {
                        if ("isComposing".equals(name)) {
                            IsComposingMessage a3 = eiemVar.a();
                            m.close();
                            return a3;
                        }
                        a2 = 3;
                    }
                    if (a2 == 1) {
                        throw new eijs("Incomplete XML for:".concat(String.valueOf(IsComposingMessage.class.getName())));
                    }
                    if (a2 == 2) {
                        if ("refresh".equals(name)) {
                            long parseLong = Long.parseLong(eikn.d(e));
                            if (parseLong < 0) {
                                throw new eijt("refresh");
                            }
                            eiemVar.b(Duration.ofSeconds(parseLong));
                        } else if ("lastactive".equals(name)) {
                            eiemVar.d(eikn.c("lastactive", eikn.d(e)));
                        } else if ("state".equals(name)) {
                            eiemVar.c(emuz.e(eikn.d(e), "active") ? eigd.START : eigd.STOP);
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
        } catch (IOException | IllegalStateException | NumberFormatException | XmlPullParserException e2) {
            throw new eikm("Error deserializing IsComposingMessage", e2);
        }
    }

    public static final eijp d(IsComposingMessage isComposingMessage) {
        String str;
        try {
            XmlSerializer newSerializer = XmlPullParserFactory.newInstance().newSerializer();
            StringWriter stringWriter = new StringWriter();
            try {
                newSerializer.setOutput(stringWriter);
                newSerializer.setPrefix("", "urn:ietf:params:xml:ns:im-iscomposing");
                newSerializer.startDocument("UTF-8", true);
                newSerializer.startTag("urn:ietf:params:xml:ns:im-iscomposing", "isComposing");
                eigd a2 = isComposingMessage.a();
                if (eigd.START.equals(a2)) {
                    str = "active";
                } else {
                    if (!eigd.STOP.equals(a2)) {
                        throw new eijt("state");
                    }
                    str = "idle";
                }
                eikn.f(newSerializer, "urn:ietf:params:xml:ns:im-iscomposing", "state", str);
                eikn.f(newSerializer, "urn:ietf:params:xml:ns:im-iscomposing", "contenttype", b.toString());
                Optional c = isComposingMessage.c();
                if (c.isPresent()) {
                    eikn.f(newSerializer, "urn:ietf:params:xml:ns:im-iscomposing", "lastactive", dktd.c(((Instant) c.get()).toEpochMilli()));
                }
                Optional b2 = isComposingMessage.b();
                if (b2.isPresent()) {
                    eikn.f(newSerializer, "urn:ietf:params:xml:ns:im-iscomposing", "refresh", String.valueOf(((Duration) b2.get()).getSeconds()));
                }
                newSerializer.endTag("urn:ietf:params:xml:ns:im-iscomposing", "isComposing");
                newSerializer.endDocument();
                String stringWriter2 = stringWriter.toString();
                stringWriter.close();
                eijj eijjVar = new eijj();
                eijjVar.c(a);
                eijjVar.b(eyee.A(stringWriter2));
                return eijjVar.a();
            } catch (Throwable th) {
                try {
                    stringWriter.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException | XmlPullParserException e) {
            throw new eikm("Error serializing IsComposingMessage.", e);
        }
    }

    @Override // defpackage.eiko
    public final /* bridge */ /* synthetic */ eihn a(eijp eijpVar) {
        return c(eijpVar);
    }

    @Override // defpackage.eiko
    public final /* bridge */ /* synthetic */ eijp b(eihn eihnVar) {
        return d((IsComposingMessage) eihnVar);
    }
}
