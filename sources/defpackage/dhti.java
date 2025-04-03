package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhti extends dfra implements dhtp {
    static final dfqt a;
    public static final /* synthetic */ int o = 0;
    private static final dfqs p;
    private static final dfqj q;
    public final Object b;
    public dhre m;
    public boolean n;

    static {
        dfqs dfqsVar = new dfqs();
        p = dfqsVar;
        dhte dhteVar = new dhte();
        q = dhteVar;
        a = new dfqt("TrustedTime.API", dhteVar, dfqsVar);
    }

    public dhti(Context context) {
        super(context, a, dfqp.q, dfqz.a);
        this.b = new Object();
    }

    @Override // defpackage.dhtp
    public final dhre a() {
        synchronized (this.b) {
            if (this.n) {
                return dhrt.c(null);
            }
            this.n = true;
            this.m = null;
            return dhrt.c(null);
        }
    }

    public final String toString() {
        String str;
        synchronized (this.b) {
            str = "BasicInternalTimeSignalSupplierInitializer{task=" + String.valueOf(this.m) + ", disposed=" + this.n + "}";
        }
        return str;
    }
}
