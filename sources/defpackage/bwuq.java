package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bwuq extends dtrr {
    public String a;
    public MessageIdType b;
    public long c;
    public long d;
    public long e;
    public Optional f;

    public bwuq() {
        super(bwvy.f());
        this.b = bdhb.a;
        this.d = 0L;
        this.e = 0L;
        this.f = bdhe.b(-1L);
    }

    public final bwuo a() {
        bwup bwupVar = new bwup();
        bwupVar.aC(aB());
        bwupVar.a = this.a;
        bwupVar.b = this.b;
        bwupVar.c = this.c;
        bwupVar.d = this.d;
        bwupVar.e = this.e;
        bwupVar.f = this.f;
        bwupVar.cK = aC();
        return bwupVar;
    }

    public final void b(Optional optional) {
        int i = this.aB;
        if (i < 58880) {
            dtub.w("ftd_time", i);
        }
        aE(5);
        this.f = optional;
    }

    public final void c(String str) {
        aE(0);
        this.a = str;
    }

    public final void d(MessageIdType messageIdType) {
        aE(1);
        this.b = messageIdType;
    }

    public final void e(long j) {
        aE(2);
        this.c = j;
    }

    public final void f(long j) {
        aE(4);
        this.e = j;
    }

    public final void g(long j) {
        aE(3);
        this.d = j;
    }
}
