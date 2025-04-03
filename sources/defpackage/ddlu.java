package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ddlu implements erqj {
    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            return;
        }
        ddlv.a.r("The reminder was not updated successfully by reminder snackbar");
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        ddlv.a.o("Failed to update reminder by reminder snackbar", th);
    }
}
