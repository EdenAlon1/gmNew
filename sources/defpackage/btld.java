package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class btld extends dtrr {
    public long a;
    public ConversationIdType b;
    public String c;
    public String d;
    public boolean e;
    public boolean f;
    public cgiz g;
    public long h;
    public long i;

    public btld() {
        super(btmu.g());
        this.b = bdgq.a;
        this.e = true;
        this.h = 0L;
        this.i = 0L;
    }

    public final btlb a() {
        btlc btlcVar = new btlc();
        btlcVar.aC(aB());
        btlcVar.a = this.a;
        btlcVar.b = this.b;
        btlcVar.c = this.c;
        btlcVar.d = this.d;
        btlcVar.e = this.e;
        btlcVar.f = this.f;
        btlcVar.g = this.g;
        btlcVar.h = this.h;
        btlcVar.i = this.i;
        btlcVar.cK = aC();
        return btlcVar;
    }

    public final void b(String str) {
        aE(2);
        this.c = str;
    }

    public final void c(ConversationIdType conversationIdType) {
        aE(1);
        this.b = conversationIdType;
    }

    public final void d(boolean z) {
        int i = this.aB;
        if (i < 58810) {
            dtub.w("is_last_message_outgoing", i);
        }
        aE(5);
        this.f = z;
    }

    public final void e(String str) {
        aE(3);
        this.d = str;
    }

    public final void f(boolean z) {
        int i = this.aB;
        if (i < 58700) {
            dtub.w("read", i);
        }
        aE(4);
        this.e = z;
    }

    public final void g(long j) {
        int i = this.aB;
        if (i < 59100) {
            dtub.w("sync_timestamp_ms", i);
        }
        aE(8);
        this.i = j;
    }
}
