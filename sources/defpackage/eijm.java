package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import com.google.android.rcs.client.messaging.data.BasicTextMessage;
import com.google.android.rcs.client.messaging.data.ContentType;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.charset.UnsupportedCharsetException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eijm implements eiko {
    public static final ContentType a;
    private final Charset b = StandardCharsets.UTF_8;

    static {
        eifc d = ContentType.d();
        d.f(ConversationSuggestion.SUGGESTION_PROPERTY_TEXT);
        d.e("plain");
        d.h(enhk.l("charset", "UTF-8"));
        a = d.g();
    }

    public static final BasicTextMessage c(eijp eijpVar) {
        try {
            ContentType a2 = eijpVar.a();
            ContentType contentType = a;
            if (contentType.f(a2)) {
                String D = eijpVar.b().D(Charset.forName((String) a2.a().getOrDefault(emuz.c("charset"), "UTF-8")));
                eidx eidxVar = new eidx();
                eidxVar.b(D);
                return eidxVar.a();
            }
            throw new eikq(a2, "Supported type for this serializer is: " + String.valueOf(contentType));
        } catch (UnsupportedCharsetException e) {
            throw new eikm("Error deserializing BasicTextMessage", e);
        }
    }

    @Override // defpackage.eiko
    public final /* bridge */ /* synthetic */ eihn a(eijp eijpVar) {
        return c(eijpVar);
    }

    @Override // defpackage.eiko
    public final /* bridge */ /* synthetic */ eijp b(eihn eihnVar) {
        eifc d = ContentType.d();
        d.f(ConversationSuggestion.SUGGESTION_PROPERTY_TEXT);
        d.e("plain");
        d.h(enhk.l("charset", this.b.name()));
        ContentType g = d.g();
        eijj eijjVar = new eijj();
        eijjVar.c(g);
        eijjVar.b(eyee.y(((BasicTextMessage) eihnVar).a(), this.b));
        return eijjVar.a();
    }
}
