package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class azcy extends dtrr {
    public azcr a;
    public String b;
    public azcg c;

    public azcy() {
        super(azdt.a().P());
        this.a = null;
    }

    public final azcw a() {
        azcx azcxVar = new azcx();
        azcxVar.aC(aB());
        azcxVar.a = this.a;
        azcxVar.b = this.b;
        azcxVar.c = this.c;
        azcxVar.cK = aC();
        return azcxVar;
    }

    public final void b(String str) {
        aE(1);
        this.b = str;
    }

    public final void c(azcg azcgVar) {
        aE(2);
        this.c = azcgVar;
    }

    public final void d(azcr azcrVar) {
        aE(0);
        this.a = azcrVar;
    }
}
