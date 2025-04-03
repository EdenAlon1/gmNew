package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class di implements Runnable {
    final /* synthetic */ dn a;

    public di(dn dnVar) {
        this.a = dnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dn dnVar = this.a;
        dnVar.a.onDismiss(dnVar.d);
    }
}
