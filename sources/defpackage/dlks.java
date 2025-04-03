package defpackage;

import com.google.android.libraries.abuse.hades.tartarus.core.TartarusKt;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlks {
    public static final /* synthetic */ int a = 0;

    static {
        Object a2;
        try {
            System.loadLibrary("tartarus_core");
        } catch (UnsatisfiedLinkError e) {
            try {
                a2 = Class.forName("android.app.Application", false, null);
            } catch (Throwable th) {
                a2 = ffci.a(th);
            }
            if (ffch.d(a2)) {
                throw e;
            }
            TartarusKt.l();
        }
    }
}
