package defpackage;

import com.google.android.gms.common.Feature;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class dfty {
    public final dftp a;
    public final Feature[] b;
    public final boolean c;
    public final int d;

    protected dfty(dftp dftpVar, Feature[] featureArr, boolean z, int i) {
        this.a = dftpVar;
        this.b = featureArr;
        this.c = z;
        this.d = i;
    }

    public final dftn a() {
        return this.a.b;
    }

    protected abstract void b(dfqk dfqkVar, dhri dhriVar);
}
