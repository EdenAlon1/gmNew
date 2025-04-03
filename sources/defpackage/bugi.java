package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.UUID;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bugi extends dtrr {
    public UUID a;
    public MessageIdType b;
    public long c;
    public long d;
    public byzj e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public String m;

    public bugi() {
        super(buik.a().P());
        this.a = bdhh.b();
        this.b = bdhb.a;
    }

    public final buge a(Supplier supplier) {
        Object obj;
        obj = supplier.get();
        buge bugeVar = (buge) obj;
        bugeVar.aC(aB());
        bugeVar.a = this.a;
        bugeVar.b = this.b;
        bugeVar.c = this.c;
        bugeVar.d = this.d;
        bugeVar.e = this.e;
        bugeVar.f = this.f;
        bugeVar.g = this.g;
        bugeVar.h = this.h;
        bugeVar.i = this.i;
        bugeVar.j = this.j;
        bugeVar.k = this.k;
        bugeVar.l = this.l;
        bugeVar.m = this.m;
        bugeVar.cK = aC();
        return bugeVar;
    }

    public final void b(String str) {
        aE(7);
        this.h = str;
    }

    public final void c(String str) {
        aE(6);
        this.g = str;
    }

    public final void d(String str) {
        aE(5);
        this.f = str;
    }

    public final void e(String str) {
        aE(12);
        this.m = str;
    }

    public final void f(String str) {
        aE(9);
        this.j = str;
    }

    public final void g(String str) {
        aE(11);
        this.l = str;
    }

    public final void h(UUID uuid) {
        aE(0);
        this.a = uuid;
    }

    public final void i(String str) {
        aE(10);
        this.k = str;
    }

    public final void j(MessageIdType messageIdType) {
        aE(1);
        this.b = messageIdType;
    }

    public final void k(long j) {
        aE(3);
        this.d = j;
    }

    public final void l(String str) {
        aE(8);
        this.i = str;
    }

    public final void m(long j) {
        aE(2);
        this.c = j;
    }

    public final void n(byzj byzjVar) {
        aE(4);
        this.e = byzjVar;
    }
}
