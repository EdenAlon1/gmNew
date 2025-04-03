package defpackage;

import com.google.android.apps.aicore.aidl.IDownloadListener;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class scf extends IDownloadListener.Stub {
    final /* synthetic */ saq a;
    final /* synthetic */ kfb b;
    final /* synthetic */ sci c;
    final /* synthetic */ emdl d;

    public scf(sci sciVar, emdl emdlVar, saq saqVar, kfb kfbVar) {
        this.d = emdlVar;
        this.a = saqVar;
        this.b = kfbVar;
        this.c = sciVar;
    }

    @Override // com.google.android.apps.aicore.aidl.IDownloadListener
    public final void onDownloadCompleted(String str) {
        final emdl emdlVar = this.d;
        final saq saqVar = this.a;
        this.c.e.execute(new Runnable() { // from class: scd
            @Override // java.lang.Runnable
            public final void run() {
                emdl.this.a(saqVar);
            }
        });
        this.b.b(null);
    }

    @Override // com.google.android.apps.aicore.aidl.IDownloadListener
    public final void onDownloadFailed(String str, String str2) {
        final sao saoVar = new sao(1, 0, String.format(Locale.ENGLISH, "Feature %s failed with failure %s.", str, str2), null);
        final emdl emdlVar = this.d;
        final saq saqVar = this.a;
        this.c.e.execute(new Runnable() { // from class: sce
            @Override // java.lang.Runnable
            public final void run() {
                emdl.this.b(saqVar, 0, saoVar);
            }
        });
        this.b.c(saoVar);
    }

    @Override // com.google.android.apps.aicore.aidl.IDownloadListener
    public final void onDownloadProgress(String str, final long j) {
        final emdl emdlVar = this.d;
        final saq saqVar = this.a;
        this.c.e.execute(new Runnable() { // from class: scc
            @Override // java.lang.Runnable
            public final void run() {
                emdl.this.c(saqVar, j);
            }
        });
    }

    @Override // com.google.android.apps.aicore.aidl.IDownloadListener
    public final void onDownloadStarted(String str, final long j) {
        final emdl emdlVar = this.d;
        final saq saqVar = this.a;
        this.c.e.execute(new Runnable() { // from class: scb
            @Override // java.lang.Runnable
            public final void run() {
                emdl.this.d(saqVar, j);
            }
        });
    }
}
