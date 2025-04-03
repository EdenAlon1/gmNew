package defpackage;

import android.widget.photopicker.EmbeddedPhotoPickerClient;
import android.widget.photopicker.EmbeddedPhotoPickerSession;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqcn implements EmbeddedPhotoPickerClient {
    final /* synthetic */ ffji a;
    final /* synthetic */ ffji b;
    final /* synthetic */ ffji c;
    final /* synthetic */ ffji d;
    final /* synthetic */ ffix e;

    public dqcn(ffji ffjiVar, ffji ffjiVar2, ffji ffjiVar3, ffji ffjiVar4, ffix ffixVar) {
        this.a = ffjiVar;
        this.b = ffjiVar2;
        this.c = ffjiVar3;
        this.d = ffjiVar4;
        this.e = ffixVar;
    }

    public final void onSelectionComplete() {
        this.e.invoke();
    }

    public final void onSessionError(Throwable th) {
        th.getClass();
        this.b.invoke(th);
    }

    public final void onSessionOpened(EmbeddedPhotoPickerSession embeddedPhotoPickerSession) {
        embeddedPhotoPickerSession.getClass();
        this.a.invoke(embeddedPhotoPickerSession);
    }

    public final void onUriPermissionGranted(List list) {
        list.getClass();
        this.c.invoke(list);
    }

    public final void onUriPermissionRevoked(List list) {
        list.getClass();
        this.d.invoke(list);
    }
}
