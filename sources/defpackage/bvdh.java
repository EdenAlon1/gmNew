package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bvdh extends dtrr {
    public String a;
    public MessageIdType b;
    public long c;
    public eoqz d;
    public epjp e;
    public fbqx f;
    public fbqp g;
    public int h;
    public int i;
    public String j;
    public String k;
    public String l;

    public bvdh() {
        super(bvfh.g());
        this.b = bdhb.a;
        this.c = 0L;
        this.d = eoqz.b(0);
        this.e = epjp.b(0);
        this.f = fbqx.b(0);
        this.g = fbqp.b(0);
    }

    public final bvdf a() {
        bvdg bvdgVar = new bvdg();
        bvdgVar.aC(aB());
        bvdgVar.a = this.a;
        bvdgVar.b = this.b;
        bvdgVar.c = this.c;
        bvdgVar.d = this.d;
        bvdgVar.e = this.e;
        bvdgVar.f = this.f;
        bvdgVar.g = this.g;
        bvdgVar.h = this.h;
        bvdgVar.i = this.i;
        bvdgVar.j = this.j;
        bvdgVar.k = this.k;
        bvdgVar.l = this.l;
        bvdgVar.cK = aC();
        return bvdgVar;
    }

    public final void b(fbqp fbqpVar) {
        aE(6);
        this.g = fbqpVar;
    }

    public final void c(int i) {
        aE(8);
        this.i = i;
    }

    public final void d(eoqz eoqzVar) {
        aE(3);
        this.d = eoqzVar;
    }

    public final void e(String str) {
        aE(9);
        this.j = str;
    }

    public final void f(MessageIdType messageIdType) {
        int i = this.aB;
        if (i < 51030) {
            dtub.w("message_id", i);
        }
        aE(1);
        this.b = messageIdType;
    }

    public final void g(String str) {
        int i = this.aB;
        if (i < 42030) {
            dtub.w("model_output_label", i);
        }
        aE(11);
        this.l = str;
    }

    public final void h(int i) {
        aE(7);
        this.h = i;
    }

    public final void i(fbqx fbqxVar) {
        aE(5);
        this.f = fbqxVar;
    }

    public final void j(epjp epjpVar) {
        aE(4);
        this.e = epjpVar;
    }

    public final void k(String str) {
        aE(10);
        this.k = str;
    }

    public final void l(long j) {
        aE(2);
        this.c = j;
    }
}
