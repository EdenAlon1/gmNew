package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkyr implements dkwc {
    public String a;
    public final List b = new ArrayList();
    public final ffbr c;

    public dkyr(ffbr ffbrVar) {
        this.c = ffbrVar;
    }

    @Override // defpackage.dkwc
    public final void c(XmlSerializer xmlSerializer) {
        xmlSerializer.startTag("urn:ietf:params:xml:ns:rlmi", "resource");
        xmlSerializer.attribute("", ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, this.a);
        if (!this.b.isEmpty()) {
            for (Object obj : this.b) {
                if (obj instanceof dkyq) {
                    ((dkyq) obj).c(xmlSerializer);
                } else if (obj instanceof dkyn) {
                    ((dkyn) obj).c(xmlSerializer);
                }
            }
        }
        xmlSerializer.endTag("urn:ietf:params:xml:ns:rlmi", "resource");
    }
}
