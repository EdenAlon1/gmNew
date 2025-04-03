package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class akmj {
    public final Context a;
    private final AtomicBoolean b;
    private final ffbz c;

    public akmj(Context context) {
        context.getClass();
        this.a = context;
        this.b = new AtomicBoolean(false);
        this.c = ffca.a(new ffix() { // from class: akmi
            @Override // defpackage.ffix
            public final Object invoke() {
                return Boolean.valueOf(akmj.this.a.getPackageManager().hasSystemFeature("com.samsung.feature.SAMSUNG_EXPERIENCE_AM"));
            }
        });
    }

    public final boolean a() {
        return this.b.get() || ((Boolean) this.c.a()).booleanValue();
    }
}
