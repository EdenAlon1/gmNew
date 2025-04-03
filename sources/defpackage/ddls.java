package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ddls implements erqj {
    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            return;
        }
        ddlv.a.r("The reminder was not removed successfully by reminder snackbar");
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        ddlv.a.o("Failed to remove reminder by reminder snackbar", th);
    }
}
