package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ebhw extends eays {
    final /* synthetic */ ebhx a;

    public ebhw(ebhx ebhxVar) {
        this.a = ebhxVar;
    }

    @Override // defpackage.eays
    public final void c(engw engwVar) {
        final ebic ebicVar = this.a.a;
        ebicVar.d = engwVar;
        efbd.e(new Runnable() { // from class: ebia
            @Override // java.lang.Runnable
            public final void run() {
                ebic ebicVar2 = ebic.this;
                ebicVar2.a(ebicVar2.c);
            }
        });
    }
}
