package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emdl {
    public final /* synthetic */ emdw a;

    public emdl(emdw emdwVar) {
        this.a = emdwVar;
    }

    public final void a(saq saqVar) {
        saqVar.getClass();
        ((enrr) this.a.d.h().h("com/google/chat/smartmessaging/penpal/server/v3/PenpalOnDeviceClientImpl$downloadCallback$1", "onDownloadCompleted", 550, "PenpalOnDeviceClientImpl.kt")).r("Feature %d downloaded successfully", saqVar.a());
        emdj emdjVar = (emdj) this.a.e.get();
        emdjVar.e.g(false, true);
        emdjVar.a();
    }

    public final void b(saq saqVar, int i, sao saoVar) {
        saqVar.getClass();
        ((enrr) ((enrr) this.a.d.i()).g(saoVar).h("com/google/chat/smartmessaging/penpal/server/v3/PenpalOnDeviceClientImpl$downloadCallback$1", "onDownloadFailed", 531, "PenpalOnDeviceClientImpl.kt")).u("Feature %d download failed: status = %s", saqVar.a(), i);
        if (i == 1) {
            emdj emdjVar = (emdj) this.a.e.get();
            emdjVar.b.g(false, true);
            emdjVar.j = emdjVar.a.a();
            emdjVar.a();
        }
        ((emdj) this.a.e.get()).a();
    }

    public final void c(saq saqVar, long j) {
        saqVar.getClass();
        ((enrr) this.a.d.g().h("com/google/chat/smartmessaging/penpal/server/v3/PenpalOnDeviceClientImpl$downloadCallback$1", "onDownloadProgress", 541, "PenpalOnDeviceClientImpl.kt")).v("Feature %d download progress: %d bytes downloaded", saqVar.a(), j);
        emdj emdjVar = (emdj) this.a.e.get();
        emdjVar.d.f(Long.valueOf(j));
        emdjVar.a();
    }

    public final void d(saq saqVar, long j) {
        saqVar.getClass();
        ((enrr) this.a.d.i().h("com/google/chat/smartmessaging/penpal/server/v3/PenpalOnDeviceClientImpl$downloadCallback$1", "onDownloadStarted", 515, "PenpalOnDeviceClientImpl.kt")).v("Feature %d not available; download started: size = %d bytes", saqVar.a(), j);
        emdj emdjVar = (emdj) this.a.e.get();
        emdjVar.c.f(Long.valueOf(j));
        emdjVar.a();
    }
}
