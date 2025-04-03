package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class eemq extends eejf {
    protected final eeje f(String str) {
        String str2 = this.a.f + ":" + str;
        int i = this.a.g;
        return new eeje(str2);
    }

    protected final String g() {
        eejj eejjVar = (eejj) this.a.g(1).elementAt(0);
        int i = eejjVar.b;
        if (i != 2053 && i != 2054 && i != 2056 && i != 2055 && i != 2052 && i != 2057 && i != 2101 && i != 2102 && i != 4095) {
            throw f("Invalid Method");
        }
        eejb eejbVar = this.a;
        eejbVar.g = eejbVar.h;
        return eejjVar.a;
    }

    protected final void h() {
        if (!this.a.a(2051).a.equals("SIP")) {
            f("Expecting SIP");
        }
        this.a.a(47);
        if (this.a.a(4095).a.equals("2.0")) {
            return;
        }
        f("Expecting SIP/2.0");
    }
}
