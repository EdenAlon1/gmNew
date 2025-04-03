package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aza extends bbt {
    final /* synthetic */ aze a;

    public aza(aze azeVar) {
        this.a = azeVar;
    }

    @Override // defpackage.bbt
    public final void d(int i) {
        bjm.a().execute(new Runnable() { // from class: ayz
            @Override // java.lang.Runnable
            public final void run() {
                bad badVar = aza.this.a.a;
                if (badVar != null) {
                    badVar.l.e();
                }
            }
        });
    }
}
