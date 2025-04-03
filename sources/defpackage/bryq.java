package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bryq extends dtrr {
    public long a;
    public MessageIdType b;
    public int c;
    public String d;
    public String e;
    public String f;
    public bdhg g;
    public bdhg h;
    public boolean i;
    public long j;

    public bryq() {
        super(bsam.d());
        this.b = bdhb.a;
        this.c = 0;
        bdhg bdhgVar = bdhg.a;
        this.g = bdhgVar;
        this.h = bdhgVar;
        this.i = false;
        this.j = 0L;
    }

    public final bryo a() {
        bryp brypVar = new bryp();
        brypVar.aC(aB());
        brypVar.a = this.a;
        brypVar.b = this.b;
        brypVar.c = this.c;
        brypVar.d = this.d;
        brypVar.e = this.e;
        brypVar.f = this.f;
        brypVar.g = this.g;
        brypVar.h = this.h;
        brypVar.i = this.i;
        brypVar.j = this.j;
        brypVar.cK = aC();
        return brypVar;
    }

    public final void b(int i) {
        aE(2);
        this.c = i;
    }

    public final void c(String str) {
        aE(4);
        this.e = str;
    }

    public final void d(String str) {
        aE(5);
        this.f = str;
    }

    public final void e(String str) {
        aE(3);
        this.d = str;
    }

    public final void f(bdhg bdhgVar) {
        int i = this.aB;
        if (i < 11001) {
            dtub.w("rcs_message_id", i);
        }
        aE(6);
        this.g = bdhgVar;
    }

    public final void g(boolean z) {
        int i = this.aB;
        if (i < 12000) {
            dtub.w("read", i);
        }
        aE(8);
        this.i = z;
    }

    public final void h(long j) {
        int i = this.aB;
        if (i < 12000) {
            dtub.w("received_timestamp", i);
        }
        aE(9);
        this.j = j;
    }

    public final void i(MessageIdType messageIdType) {
        aE(1);
        this.b = messageIdType;
    }

    public final void j(bdhg bdhgVar) {
        int i = this.aB;
        if (i < 12000) {
            dtub.w("target_rcs_message_id", i);
        }
        aE(7);
        this.h = bdhgVar;
    }
}
