package defpackage;

import com.google.android.apps.aicore.aidl.IDownloadListener2;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sca extends IDownloadListener2.Stub {
    final /* synthetic */ saq a;
    final /* synthetic */ kfb b;
    final /* synthetic */ sci c;
    final /* synthetic */ emdl d;

    public sca(sci sciVar, emdl emdlVar, saq saqVar, kfb kfbVar) {
        this.d = emdlVar;
        this.a = saqVar;
        this.b = kfbVar;
        this.c = sciVar;
    }

    @Override // com.google.android.apps.aicore.aidl.IDownloadListener2
    public final void onDownloadCompleted(String str) {
        final emdl emdlVar = this.d;
        final saq saqVar = this.a;
        this.c.e.execute(new Runnable() { // from class: sby
            @Override // java.lang.Runnable
            public final void run() {
                emdl.this.a(saqVar);
            }
        });
        this.b.b(null);
    }

    @Override // com.google.android.apps.aicore.aidl.IDownloadListener2
    public final void onDownloadFailed(String str, final int i, String str2) {
        final sao saoVar = new sao(1, i == 1 ? 501 : 0, String.format(Locale.ENGLISH, "Feature %s failed with failure status %d and error %s.", str, Integer.valueOf(i), str2), null);
        final emdl emdlVar = this.d;
        final saq saqVar = this.a;
        this.c.e.execute(new Runnable() { // from class: sbw
            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i != 1 ? 0 : 1;
                emdl.this.b(saqVar, i2, saoVar);
            }
        });
        this.b.c(saoVar);
    }

    @Override // com.google.android.apps.aicore.aidl.IDownloadListener2
    public final void onDownloadProgress(String str, final long j) {
        final emdl emdlVar = this.d;
        final saq saqVar = this.a;
        this.c.e.execute(new Runnable() { // from class: sbz
            @Override // java.lang.Runnable
            public final void run() {
                emdl.this.c(saqVar, j);
            }
        });
    }

    @Override // com.google.android.apps.aicore.aidl.IDownloadListener2
    public final void onDownloadStarted(String str, final long j) {
        final emdl emdlVar = this.d;
        final saq saqVar = this.a;
        this.c.e.execute(new Runnable() { // from class: sbx
            @Override // java.lang.Runnable
            public final void run() {
                emdl.this.d(saqVar, j);
            }
        });
    }
}
