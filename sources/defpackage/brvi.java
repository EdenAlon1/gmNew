package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class brvi extends dtrr {
    public String a;
    public ConversationIdType b;
    public long c;
    public boolean d;
    public awwp e;
    public bdpy f;

    public brvi() {
        super(brww.g());
        this.b = bdgq.a;
        this.d = false;
        this.e = awwp.UNKNOWN_STATE;
        this.f = bdqb.b();
    }

    public final brvg a() {
        brvh brvhVar = new brvh();
        brvhVar.aC(aB());
        brvhVar.a = this.a;
        brvhVar.b = this.b;
        brvhVar.c = this.c;
        brvhVar.d = this.d;
        brvhVar.e = this.e;
        brvhVar.f = this.f;
        brvhVar.cK = aC();
        return brvhVar;
    }

    public final void b(ConversationIdType conversationIdType) {
        aE(1);
        this.b = conversationIdType;
    }

    public final void c(long j) {
        aE(2);
        this.c = j;
    }

    public final void d(awwp awwpVar) {
        int i = this.aB;
        if (i < 58570) {
            dtub.w("rcs_group_join_status", i);
        }
        aE(4);
        this.e = awwpVar;
    }
}
