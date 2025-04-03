package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rnr extends rnq {
    public float a = 0.0f;
    final /* synthetic */ rns b;

    public rnr(rns rnsVar) {
        this.b = rnsVar;
    }

    @Override // defpackage.rnq
    public final void a(String str) {
        this.a += this.b.d.d.measureText(str);
    }
}
