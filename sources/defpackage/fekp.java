package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fekp implements Runnable {
    final /* synthetic */ fdxn a;
    final /* synthetic */ febo b;
    final /* synthetic */ felb c;

    public fekp(felb felbVar, fdxn fdxnVar, febo feboVar) {
        this.a = fdxnVar;
        this.b = feboVar;
        this.c = felbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.b.a(this.a, this.b);
    }
}
