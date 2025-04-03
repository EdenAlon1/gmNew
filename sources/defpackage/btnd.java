package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class btnd extends dtrr {
    public String a;
    public long b;
    public long c;

    public btnd() {
        super(btob.b());
        this.c = 0L;
    }

    public final btnb a() {
        btnc btncVar = new btnc();
        btncVar.aC(aB());
        btncVar.a = this.a;
        btncVar.b = this.b;
        btncVar.c = this.c;
        btncVar.cK = aC();
        return btncVar;
    }

    public final void b(long j) {
        aE(2);
        this.c = j;
    }

    public final void c(long j) {
        aE(1);
        this.b = j;
    }
}
