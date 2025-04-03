package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final /* synthetic */ class elgq implements ebrw {
    public final /* synthetic */ elgr a;
    public final /* synthetic */ String b;
    public final /* synthetic */ ebrw c;

    public /* synthetic */ elgq(elgr elgrVar, String str, ebrw ebrwVar) {
        this.a = elgrVar;
        this.b = str;
        this.c = ebrwVar;
    }

    @Override // defpackage.ebrw
    public final void a(emxc emxcVar) {
        ebrw ebrwVar = this.c;
        ekzm b = this.a.a.b(this.b);
        try {
            ebrwVar.a(emxcVar);
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
