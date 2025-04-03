package defpackage;

import android.app.Activity;
import defpackage.fazz;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fbab implements fbas {
    private final Activity a;
    private volatile fazk b;
    private final Object c = new Object();

    public fbab(Activity activity) {
        this.a = activity;
    }

    @Override // defpackage.fbas
    public final /* bridge */ /* synthetic */ Object aX() {
        if (this.b == null) {
            synchronized (this.c) {
                if (this.b == null) {
                    if (this.b == null) {
                        Object lastNonConfigurationInstance = this.a.getLastNonConfigurationInstance();
                        if (lastNonConfigurationInstance != null) {
                            this.b = (fazk) lastNonConfigurationInstance;
                        } else {
                            akgc iG = ((fazz.a) fazi.a(this.a, fazz.a.class)).iG();
                            iG.a = new fbai(null);
                            this.b = iG.a();
                        }
                    }
                    this.b = this.b;
                }
            }
        }
        return this.b;
    }
}
