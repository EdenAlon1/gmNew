package defpackage;

import com.google.android.libraries.compose.photos.api.callback.PhotosApiCallbackService;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class drue extends lkx implements fbat {
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

    @Override // defpackage.lkx, android.app.Service
    public void onCreate() {
        if (!this.c) {
            this.c = true;
            ((PhotosApiCallbackService) this).a = new drug(new cjhe(new cjhf(((akhb) aX()).b.b.a.a.cc)));
        }
        super.onCreate();
    }
}
