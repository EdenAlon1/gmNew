package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class brag extends dtrr {
    public long a;
    public ConversationIdType b;
    public axcl c;
    public axcj d;
    public String e;
    public long f;
    public long g;

    public brag() {
        super(brbs.e());
        this.b = bdgq.a;
        this.c = axcl.CONVERSATION_CLASSIFICATION_TYPE_UNSPECIFIED;
        this.d = axcj.CONVERSATION_CLASSIFICATION_STATE_UNSPECIFIED;
        this.f = 0L;
        this.g = 0L;
    }

    public final brae a() {
        braf brafVar = new braf();
        brafVar.aC(aB());
        brafVar.a = this.a;
        brafVar.b = this.b;
        brafVar.c = this.c;
        brafVar.d = this.d;
        brafVar.e = this.e;
        brafVar.f = this.f;
        brafVar.g = this.g;
        brafVar.cK = aC();
        return brafVar;
    }

    public final void b(axcj axcjVar) {
        int i = this.aB;
        if (i < 58690) {
            dtub.w("classification_state", i);
        }
        aE(3);
        this.d = axcjVar;
    }

    public final void c(axcl axclVar) {
        aE(2);
        this.c = axclVar;
    }

    public final void d(ConversationIdType conversationIdType) {
        aE(1);
        this.b = conversationIdType;
    }

    public final void e(String str) {
        aE(4);
        this.e = str;
    }

    public final void f(long j) {
        int i = this.aB;
        if (i < 58840) {
            dtub.w("generated_timestamp", i);
        }
        aE(6);
        this.g = j;
    }
}
