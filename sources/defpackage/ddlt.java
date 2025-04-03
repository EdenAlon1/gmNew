package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ddlt implements erqj {
    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            return;
        }
        ddlv.a.r("The reminder was not set successfully by reminder snackbar");
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        ddlv.a.n("Failed to set reminder by reminder snackbar");
    }
}
