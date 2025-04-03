package defpackage;

import com.google.android.gms.common.Feature;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class dfuo {
    public final Feature[] b;
    public final boolean c;
    public final int d;

    @Deprecated
    public dfuo() {
        this.b = null;
        this.c = false;
        this.d = 0;
    }

    protected abstract void a(dfqk dfqkVar, dhri dhriVar);

    protected dfuo(Feature[] featureArr, boolean z, int i) {
        this.b = featureArr;
        boolean z2 = false;
        if (featureArr != null && z) {
            z2 = true;
        }
        this.c = z2;
        this.d = i;
    }
}
