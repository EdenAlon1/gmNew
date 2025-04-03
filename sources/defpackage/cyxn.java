package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyxn {
    public final ConversationId a;
    public final ffbr b;
    public final ffbr c;
    public final ffxx d;
    private final Context e;
    private final ffbr f;
    private final String g;

    public cyxn(Context context, ConversationId conversationId, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffxx ffxxVar) {
        context.getClass();
        conversationId.getClass();
        ffbrVar.getClass();
        ffxxVar.getClass();
        this.e = context;
        this.a = conversationId;
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.f = ffbrVar3;
        this.d = ffxxVar;
        this.g = ((cjdk) ffbrVar3.b()).s();
    }

    private final dnld b(final String str, int i, int i2) {
        return new dnld(1, ffdx.b(new dltp(str, i, i2, new ffji() { // from class: cyxj
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                aigz aigzVar = (aigz) cyxn.this.c.b();
                Uri parse = Uri.parse(str);
                parse.getClass();
                aigzVar.h(new aile(parse));
                return true;
            }
        }, 24)));
    }

    private static final dnld c(int i) {
        return new dnld(1, ffdx.b(new dlto(dlus.d, 0, i, (ffji) null, 24)));
    }

    public final cypq a(boolean z) {
        if (!z) {
            return new cypq((byte[]) null);
        }
        String string = this.e.getString(R.string.penpal_contact_details_page_description_header1, this.g);
        string.getClass();
        String string2 = this.e.getString(R.string.penpal_contact_details_page_description_body1, this.g);
        string2.getClass();
        String string3 = this.e.getString(R.string.penpal_contact_details_page_description_header2, this.g);
        string3.getClass();
        String string4 = this.e.getString(R.string.penpal_contact_details_page_faq, this.g);
        string4.getClass();
        String string5 = this.e.getString(R.string.penpal_contact_details_page_description_body2, this.g, string4);
        string5.getClass();
        String string6 = this.e.getString(R.string.penpal_contact_details_page_description_header3, this.g);
        string6.getClass();
        String string7 = this.e.getString(R.string.penpal_in_message_learn_more, this.g);
        string7.getClass();
        String string8 = this.e.getString(R.string.penpal_contact_details_page_description_body3, this.g, string7);
        string8.getClass();
        int Q = ffpc.Q(string8, string7, 0, false, 6);
        String uri = ((cjdk) this.f.b()).b().toString();
        uri.getClass();
        int Q2 = ffpc.Q(string5, string4, 0, false, 6);
        String string9 = this.e.getString(R.string.penpal_contact_details_page_faq_link);
        string9.getClass();
        engw w = engw.w(new dnlz(string, null, null, ffdx.b(c(string.length())), null, null, null, new ffix() { // from class: cyxd
            @Override // defpackage.ffix
            public final Object invoke() {
                return ffcu.a;
            }
        }, 118), new dnlz(string2, null, null, ffel.a, null, null, null, new ffix() { // from class: cyxe
            @Override // defpackage.ffix
            public final Object invoke() {
                return ffcu.a;
            }
        }, 118), new dnlz(string3, null, null, ffdx.b(c(string3.length())), null, null, null, new ffix() { // from class: cyxf
            @Override // defpackage.ffix
            public final Object invoke() {
                return ffcu.a;
            }
        }, 118), new dnlz(string5, null, null, ffdx.b(b(string9, Q2, string4.length() + Q2)), null, null, null, new ffix() { // from class: cyxg
            @Override // defpackage.ffix
            public final Object invoke() {
                return ffcu.a;
            }
        }, 118), new dnlz(string6, null, null, ffdx.b(c(string6.length())), null, null, null, new ffix() { // from class: cyxh
            @Override // defpackage.ffix
            public final Object invoke() {
                return ffcu.a;
            }
        }, 118), new dnlz(string8, null, null, ffdx.b(b(uri, Q, Q + string7.length())), null, null, null, new ffix() { // from class: cyxi
            @Override // defpackage.ffix
            public final Object invoke() {
                return ffcu.a;
            }
        }, 118));
        w.getClass();
        return new cypq(w);
    }
}
