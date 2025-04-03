package defpackage;

import android.net.Uri;
import android.util.Log;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.regex.Pattern;

/* compiled from: PG */
@Deprecated
/* loaded from: classes8.dex */
public final class csjb extends csls {
    public static final ThreadLocal a = new ThreadLocal();
    private static final emyl e = emys.a(new emyl() { // from class: csiz
        @Override // defpackage.emyl
        public final Object get() {
            ThreadLocal threadLocal = csjb.a;
            return Pattern.compile("[^\\p{Punct}\\d+]+");
        }
    });
    private static final emyl f = emys.a(new emyl() { // from class: csja
        @Override // defpackage.emyl
        public final Object get() {
            ThreadLocal threadLocal = csjb.a;
            return Pattern.compile("\\d+");
        }
    });

    @Deprecated
    public static String a(String str) {
        return ((Pattern) f.get()).matcher(((Pattern) e.get()).matcher(str).replaceAll("x")).replaceAll("d");
    }

    @Deprecated
    public final void b(long j) {
        F("conversation", "id", Long.valueOf(j));
    }

    @Deprecated
    public final void c(ConversationIdType conversationIdType) {
        F("conversation", "id", conversationIdType);
    }

    @Deprecated
    public final void d(MessageIdType messageIdType) {
        F("message", "id", messageIdType);
    }

    @Deprecated
    public final void e(String str) {
        F("part", "id", str);
    }

    @Deprecated
    public final void f(String str) {
        F("participant", "id", str);
    }

    @Deprecated
    public final void g(String str) {
        F("rcsConversation", "id", str);
    }

    @Deprecated
    public final void h(bdhg bdhgVar) {
        if (bdhg.j(bdhgVar)) {
            return;
        }
        F("rcsMessage", "id", bdhg.d(bdhgVar));
    }

    @Deprecated
    public final void i(long j) {
        F("rcsSessionId", "id", Long.valueOf(j));
    }

    @Deprecated
    public final void j(CharSequence charSequence) {
        D("DisplayName", charSequence);
    }

    @Deprecated
    public final void k(String str) {
        if (this.d) {
            I("MSISDN{");
            if (Log.isLoggable(this.c, 3)) {
                v(str);
            } else if (str == null) {
                v(null);
            } else {
                v(a(str));
            }
            u('}');
        }
    }

    @Deprecated
    public final void l(Uri uri) {
        if (this.d) {
            I("URI{");
            if (Log.isLoggable(this.c, 3)) {
                v(uri);
            } else {
                v(uri.getScheme());
                v("://");
                v(uri.getAuthority());
                v("/...Redacted...");
            }
            u('}');
        }
    }

    @Deprecated
    public final void m(int i) {
        E("subscription", "id", i);
    }

    @Deprecated
    public final void n(cpxu cpxuVar) {
        F("telephonyThreadId", "id", cpxuVar);
    }

    @Deprecated
    public final void o(MessageIdType messageIdType, ConversationIdType conversationIdType) {
        d(messageIdType);
        I("in");
        c(conversationIdType);
    }

    @Deprecated
    public final void p(aoku aokuVar) {
        k(aokuVar != null ? aokuVar.toString() : null);
    }
}
