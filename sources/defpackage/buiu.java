package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class buiu extends dtrr {
    public long a;
    public MessageIdType b;
    public ConversationIdType c;
    public int d;
    public float e;
    public erer f;
    public String g;
    public long h;
    public erdy i;
    public fbcx j;
    public int k;
    public eres l;
    public int m;

    public buiu() {
        super(buld.g());
        this.b = bdhb.a;
        this.c = bdgq.a;
        this.d = 0;
        this.e = 0.0f;
        this.f = erer.SPAM;
        this.g = "";
        this.h = 0L;
        this.i = erdy.UNKNOWN_DETECTION_TRIGGER_TYPE;
        this.j = fbcx.UNKNOWN_SPAM_VERDICT_ENFORCEMENT_ACTION;
        this.k = 0;
        this.l = eres.UNKNOWN_SPAM_ERROR;
        this.m = 0;
    }

    public final buis a() {
        buit buitVar = new buit();
        buitVar.aC(aB());
        buitVar.a = this.a;
        buitVar.b = this.b;
        buitVar.c = this.c;
        buitVar.d = this.d;
        buitVar.e = this.e;
        buitVar.f = this.f;
        buitVar.g = this.g;
        buitVar.h = this.h;
        buitVar.i = this.i;
        buitVar.j = this.j;
        buitVar.k = this.k;
        buitVar.l = this.l;
        buitVar.m = this.m;
        buitVar.cK = aC();
        return buitVar;
    }

    public final void b(int i) {
        int i2 = this.aB;
        if (i2 < 59460) {
            dtub.w("action_contributors", i2);
        }
        aE(10);
        this.k = i;
    }

    public final void c(fbcx fbcxVar) {
        int i = this.aB;
        if (i < 59460) {
            dtub.w("action_type", i);
        }
        aE(9);
        this.j = fbcxVar;
    }

    public final void d(String str) {
        int i = this.aB;
        if (i < 58100) {
            dtub.w("ares_initiated_by", i);
        }
        aE(6);
        this.g = str;
    }

    public final void e(long j) {
        int i = this.aB;
        if (i < 59190) {
            dtub.w("classification_timestamp", i);
        }
        aE(7);
        this.h = j;
    }

    public final void f(ConversationIdType conversationIdType) {
        int i = this.aB;
        if (i < 59460) {
            dtub.w("conversation_id", i);
        }
        aE(2);
        this.c = conversationIdType;
    }

    public final void g(eres eresVar) {
        int i = this.aB;
        if (i < 59460) {
            dtub.w("error_code", i);
        }
        aE(11);
        this.l = eresVar;
    }

    public final void h(MessageIdType messageIdType) {
        aE(1);
        this.b = messageIdType;
    }

    public final void i(erer ererVar) {
        int i = this.aB;
        if (i < 58030) {
            dtub.w("outcome", i);
        }
        aE(5);
        this.f = ererVar;
    }

    public final void j(int i) {
        int i2 = this.aB;
        if (i2 < 59460) {
            dtub.w("reclassification_index", i2);
        }
        aE(12);
        this.m = i;
    }

    public final void k(float f) {
        int i = this.aB;
        if (i < 45040) {
            dtub.w("score", i);
        }
        aE(4);
        this.e = f;
    }

    public final void l(int i) {
        aE(3);
        this.d = i;
    }

    public final void m(erdy erdyVar) {
        int i = this.aB;
        if (i < 59460) {
            dtub.w("trigger", i);
        }
        aE(8);
        this.i = erdyVar;
    }
}
