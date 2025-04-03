package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lnb implements Runnable {
    final /* synthetic */ lkk a;
    final /* synthetic */ lnd b;

    public lnb(lkk lkkVar, lnd lndVar) {
        this.a = lkkVar;
        this.b = lndVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.d(this.b);
    }
}
