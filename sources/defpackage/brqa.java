package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class brqa extends dtrr {
    public long a;
    public ConversationIdType b;
    public int c;
    public MessageIdType d;
    public String e;
    public Uri f;
    public String g;
    public int h;
    public boolean i;
    public long j;
    public int k;
    public int l;

    public brqa() {
        super(brsd.g());
        this.b = bdgq.a;
        this.d = bdhb.a;
        this.h = 0;
        this.i = false;
        this.j = 0L;
        this.k = 0;
        this.l = 0;
    }

    public final brpy a() {
        brpz brpzVar = new brpz();
        brpzVar.aC(aB());
        brpzVar.a = this.a;
        brpzVar.b = this.b;
        brpzVar.c = this.c;
        brpzVar.d = this.d;
        brpzVar.e = this.e;
        brpzVar.f = this.f;
        brpzVar.g = this.g;
        brpzVar.h = this.h;
        brpzVar.i = this.i;
        brpzVar.j = this.j;
        brpzVar.k = this.k;
        brpzVar.l = this.l;
        brpzVar.cK = aC();
        return brpzVar;
    }

    public final void b(ConversationIdType conversationIdType) {
        aE(1);
        this.b = conversationIdType;
    }

    public final void c(int i) {
        int i2 = this.aB;
        if (i2 < 53020) {
            dtub.w(ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LABEL, i2);
        }
        aE(2);
        this.c = i;
    }

    public final void d(MessageIdType messageIdType) {
        aE(3);
        this.d = messageIdType;
    }

    public final void e(String str) {
        int i = this.aB;
        if (i < 55040) {
            dtub.w("preview_content_type", i);
        }
        aE(6);
        this.g = str;
    }

    public final void f(Uri uri) {
        int i = this.aB;
        if (i < 55040) {
            dtub.w("preview_uri", i);
        }
        aE(5);
        this.f = uri;
    }

    public final void g(int i) {
        int i2 = this.aB;
        if (i2 < 57050) {
            dtub.w("message_protocol", i2);
        }
        aE(10);
        this.k = i;
    }

    public final void h(int i) {
        int i2 = this.aB;
        if (i2 < 57050) {
            dtub.w("raw_telephony_status", i2);
        }
        aE(11);
        this.l = i;
    }

    public final void i(long j) {
        int i = this.aB;
        if (i < 57050) {
            dtub.w("received_timestamp", i);
        }
        aE(9);
        this.j = j;
    }

    public final void j(String str) {
        int i = this.aB;
        if (i < 53010) {
            dtub.w("snippet_text", i);
        }
        aE(4);
        if (!this.aC) {
            str = cuxs.a(str);
        }
        this.e = str;
    }

    public final void k(int i) {
        int i2 = this.aB;
        if (i2 < 57050) {
            dtub.w("message_status", i2);
        }
        aE(7);
        this.h = i;
    }
}
