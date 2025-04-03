package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bswp extends dtrr {
    public ConversationIdType a;
    public String b;
    public ydv c;
    public String d;
    public boolean e;
    public String f;
    public boolean g;

    public bswp() {
        super(bsyb.e());
        this.a = bdgq.a;
        this.e = false;
        this.g = false;
    }

    public final bswn a() {
        bswo bswoVar = new bswo();
        bswoVar.aC(aB());
        bswoVar.a = this.a;
        bswoVar.b = this.b;
        bswoVar.c = this.c;
        bswoVar.d = this.d;
        bswoVar.e = this.e;
        bswoVar.f = this.f;
        bswoVar.g = this.g;
        bswoVar.cK = aC();
        return bswoVar;
    }

    public final void b(ydv ydvVar) {
        int i = this.aB;
        if (i < 59420) {
            dtub.w("attachments", i);
        }
        aE(2);
        this.c = ydvVar;
    }

    public final void c(ConversationIdType conversationIdType) {
        aE(0);
        this.a = conversationIdType;
    }

    public final void d(boolean z) {
        int i = this.aB;
        if (i < 59720) {
            dtub.w("is_encrypted", i);
        }
        aE(6);
        this.g = z;
    }

    public final void e(boolean z) {
        int i = this.aB;
        if (i < 59170) {
            dtub.w("is_urgent", i);
        }
        aE(4);
        this.e = z;
    }

    public final void f(String str) {
        int i = this.aB;
        if (i < 59540) {
            dtub.w("replied_to_message_id", i);
        }
        aE(5);
        this.f = str;
    }

    public final void g(String str) {
        int i = this.aB;
        if (i < 59170) {
            dtub.w("subject", i);
        }
        aE(3);
        this.d = str;
    }

    public final void h(String str) {
        aE(1);
        this.b = str;
    }
}
