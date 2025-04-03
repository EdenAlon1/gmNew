package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class evar implements Runnable {
    final /* synthetic */ evat a;

    public evar(evat evatVar) {
        this.a = evatVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a.cancel(false);
    }
}
