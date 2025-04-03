package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class ffgp implements ffhb {
    private final ffji a;
    private final ffhb b;

    public ffgp(ffhb ffhbVar, ffji ffjiVar) {
        this.a = ffjiVar;
        this.b = ffhbVar instanceof ffgp ? ((ffgp) ffhbVar).b : ffhbVar;
    }

    public final ffha a(ffha ffhaVar) {
        return (ffha) this.a.invoke(ffhaVar);
    }

    public final boolean b(ffhb ffhbVar) {
        ffhbVar.getClass();
        return ffhbVar == this || this.b == ffhbVar;
    }
}
