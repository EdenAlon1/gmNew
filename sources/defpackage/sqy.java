package defpackage;

import android.app.Service;
import android.content.Context;
import android.util.Log;
import com.google.android.apps.messaging.backup.g1.GoogleOneRestoreService;
import com.google.android.libraries.subscriptions.restore.G1Restore;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class sqy extends Service implements fbat {
    private volatile fbaj a;
    private final Object b = new Object();
    private boolean c = false;

    @Override // defpackage.fbat
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final fbaj aW() {
        if (this.a == null) {
            synchronized (this.b) {
                if (this.a == null) {
                    this.a = new fbaj(this);
                }
            }
        }
        return this.a;
    }

    @Override // defpackage.fbas
    public final Object aX() {
        return aW().aX();
    }

    @Override // android.app.Service
    public final void onCreate() {
        if (!this.c) {
            this.c = true;
            GoogleOneRestoreService googleOneRestoreService = (GoogleOneRestoreService) this;
            akhb akhbVar = (akhb) aX();
            akko akkoVar = akhbVar.b.b;
            Context context = (Context) akkoVar.a.q.b();
            final dfqg c = dfqg.c((Context) akkoVar.a.q.b());
            c.getClass();
            googleOneRestoreService.b = new G1Restore(context, new eflt() { // from class: eflu
                @Override // defpackage.eflt
                public final void a(int i) {
                    dfqg dfqgVar = dfqg.this;
                    try {
                        dfqgVar.b(i).c();
                    } catch (SecurityException e) {
                        dfqgVar.b(i).c();
                        Log.e("GoogleSignatureVerifier", "flaky result", e);
                    }
                }
            }, (efls) emxc.j(new sqw()).d(new emyl() { // from class: eflv
                @Override // defpackage.emyl
                public final Object get() {
                    return G1Restore.defaultConfig();
                }
            }));
            googleOneRestoreService.c = (akzt) akhbVar.b.a.f.b();
            googleOneRestoreService.d = akhbVar.b.a.fJ;
        }
        super.onCreate();
    }
}
