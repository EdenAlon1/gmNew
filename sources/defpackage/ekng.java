package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final /* synthetic */ class ekng implements ffbr {
    public final /* synthetic */ eknh a;
    public final /* synthetic */ ffbr b;

    public /* synthetic */ ekng(eknh eknhVar, ffbr ffbrVar) {
        this.a = eknhVar;
        this.b = ffbrVar;
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final Object b() {
        elav a = this.a.a.a("GlideApp.with");
        ffbr ffbrVar = this.b;
        try {
            elav k = ekyf.k();
            try {
                qqs qqsVar = (qqs) ffbrVar.b();
                k.close();
                a.close();
                return qqsVar;
            } finally {
            }
        } catch (Throwable th) {
            try {
                a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
