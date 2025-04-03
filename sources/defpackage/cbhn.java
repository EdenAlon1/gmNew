package defpackage;

import android.app.Service;
import com.google.android.apps.messaging.shared.datamodel.resizing.ResizingServiceAndroidV;

/* compiled from: PG */
/* loaded from: classes7.dex */
public abstract class cbhn extends Service implements fbat {
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
    public void onCreate() {
        if (!this.c) {
            this.c = true;
            ResizingServiceAndroidV resizingServiceAndroidV = (ResizingServiceAndroidV) this;
            akis akisVar = ((akhb) aX()).b;
            akkp akkpVar = akisVar.a;
            resizingServiceAndroidV.b = akkpVar.jc;
            resizingServiceAndroidV.c = akkpVar.pH;
            resizingServiceAndroidV.d = akisVar.aJ;
        }
        super.onCreate();
    }
}
