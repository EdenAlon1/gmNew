package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class ecps implements Runnable {
    public final /* synthetic */ ecpv a;

    public /* synthetic */ ecps(ecpv ecpvVar) {
        this.a = ecpvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final ecpv ecpvVar = this.a;
        ecpvVar.g = ecpvVar.a.e().toMillis();
        ecpvVar.d.post(new Runnable() { // from class: ecpu
            @Override // java.lang.Runnable
            public final void run() {
                ecpv ecpvVar2 = ecpv.this;
                ecpvVar2.h = ecpvVar2.a.e().toMillis();
            }
        });
        ecpvVar.a(new ecpt(ecpvVar), ecpvVar.c.d());
    }
}
