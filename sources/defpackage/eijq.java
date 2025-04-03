package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import com.google.android.rcs.client.messaging.data.ContentType;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eijq {
    public static final ContentType a;
    public static final ContentType b;
    public static final ContentType c;
    public static final ContentType d;
    public static final ContentType e;
    public static final ContentType f;
    public static final ContentType g;
    public static final ContentType h;
    public static final ContentType i;
    public static final ContentType j;

    static {
        eifc d2 = ContentType.d();
        d2.f("application");
        d2.e("im-iscomposing+xml");
        a = d2.g();
        eifc d3 = ContentType.d();
        d3.f("application");
        d3.e("vnd.gsma.rcs-ft-http+xml");
        b = d3.g();
        eifc d4 = ContentType.d();
        d4.f("application");
        d4.e("vnd.gsma.rcspushlocation+xml");
        c = d4.g();
        eifc d5 = ContentType.d();
        d5.f("message");
        d5.e("imdn+xml");
        d = d5.g();
        eifc d6 = ContentType.d();
        d6.f(ConversationSuggestion.SUGGESTION_PROPERTY_TEXT);
        d6.e("plain");
        e = d6.g();
        eifc d7 = ContentType.d();
        d7.f("application");
        d7.e("vnd.gsma.botmessage.v1.0+json");
        f = d7.g();
        eifc d8 = ContentType.d();
        d8.f("application");
        d8.e("vnd.gsma.botsuggestion.v1.0+json");
        g = d8.g();
        eifc d9 = ContentType.d();
        d9.f("image");
        d9.e("jpeg");
        h = d9.g();
        eifc d10 = ContentType.d();
        d10.f("application");
        d10.e("octet-stream");
        i = d10.g();
        eifc d11 = ContentType.d();
        d11.f("application");
        d11.e("txt");
        j = d11.g();
    }
}
