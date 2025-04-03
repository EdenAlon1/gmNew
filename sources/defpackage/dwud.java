package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwud implements erqj {
    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        dxth.b("%s: Succeeded commitToFlagSnapshot.", "MobileDataDownloadBuilder");
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        dxth.o("%s: Failed to commitToFlagSnapshot: %s", "MobileDataDownloadBuilder", th);
    }
}
