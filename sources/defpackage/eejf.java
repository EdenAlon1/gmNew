package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class eejf {
    public eejb a;

    protected final eejc a() {
        String str;
        this.a.a(4095);
        eejb eejbVar = this.a;
        eejj eejjVar = eejbVar.e;
        eejbVar.h();
        try {
            boolean z = false;
            if (this.a.o(0) != '=') {
                return new eejc(eejjVar.a, null);
            }
            this.a.q(1);
            this.a.h();
            if (this.a.o(0) == '\"') {
                str = this.a.e();
                z = true;
            } else {
                this.a.a(4095);
                str = this.a.e.a;
            }
            eejc eejcVar = new eejc(eejjVar.a, str);
            if (z) {
                eejcVar.b();
            }
            return eejcVar;
        } catch (eeje unused) {
            return new eejc(eejjVar.a, null);
        }
    }
}
