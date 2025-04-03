package defpackage;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.droidguard.internal.IDroidGuardHandle;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dgbh implements dgau {
    public final dgbk a;
    public volatile IDroidGuardHandle b;
    public volatile byte[] c;
    private final Context d;
    private final long e;
    private final dgci f;

    public dgbh(Context context, dgbk dgbkVar, IDroidGuardHandle iDroidGuardHandle, long j, dgci dgciVar) {
        this.d = context;
        this.a = dgbkVar;
        this.b = iDroidGuardHandle;
        this.e = j;
        this.f = dgciVar;
    }

    @Override // defpackage.dgau
    public final String a(final Map map) {
        byte[] c;
        dgci clone = this.f.clone();
        clone.c(14, dgch.COARSE);
        if (this.c != null) {
            c = this.c;
        } else {
            final dgcb dgcbVar = new dgcb();
            this.a.d(new Runnable() { // from class: dgbf
                @Override // java.lang.Runnable
                public final void run() {
                    byte[] bArr;
                    dgbh dgbhVar = dgbh.this;
                    try {
                        bArr = dgbhVar.b != null ? dgbhVar.b.snapshot(map) : null;
                        if (bArr == null) {
                            dgbhVar.c = dgcg.b("Received null");
                            bArr = dgbhVar.c;
                        }
                    } catch (Exception e) {
                        dgbhVar.c = dgcg.c("Snapshot failed: ".concat(e.toString()), e);
                        bArr = dgbhVar.c;
                        dgbhVar.close();
                    }
                    dgcbVar.b(bArr);
                }
            });
            try {
                c = (byte[]) dgcbVar.a(this.e);
                if (c == null) {
                    c = dgcg.b("Snapshot timeout: " + this.e + " ms");
                }
            } catch (InterruptedException e) {
                c = dgcg.c("Results transfer failed: ".concat(e.toString()), e);
            }
        }
        clone.c(15, dgch.COARSE);
        return dgcg.a(dgce.b(dgce.a(this.d, c, clone.b())));
    }

    @Override // defpackage.dgau, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.d(new Runnable() { // from class: dgbg
            @Override // java.lang.Runnable
            public final void run() {
                dgbh dgbhVar = dgbh.this;
                if (dgbhVar.b == null) {
                    return;
                }
                try {
                    dgbhVar.b.close();
                } catch (Exception unused) {
                    Log.e("DGHandleImpl", "Error while closing handle.");
                }
                dgbhVar.b = null;
                r0.a--;
                dgbhVar.a.c();
            }
        });
    }

    public dgbh(Context context, dgbk dgbkVar, String str, dgci dgciVar) {
        this.d = context;
        this.a = dgbkVar;
        this.f = dgciVar;
        this.c = dgcg.b(str);
        this.e = 0L;
    }

    public dgbh(Context context, dgbk dgbkVar, String str, dgci dgciVar, Throwable th) {
        this.d = context;
        this.a = dgbkVar;
        this.f = dgciVar;
        this.c = dgcg.c(str, th);
        this.e = 0L;
    }
}
