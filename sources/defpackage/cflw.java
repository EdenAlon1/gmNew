package defpackage;

import android.content.Context;
import android.telephony.SmsMessage;
import androidx.car.app.model.Alert;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cflw {
    public final AtomicInteger a;
    public final Context b;
    private final AtomicBoolean c = new AtomicBoolean();
    private final AtomicInteger d = new AtomicInteger();
    private final AtomicInteger e = new AtomicInteger();
    private final AtomicInteger f;
    private final ffbr g;
    private final ffbr h;
    private final ffbr i;

    public cflw(Context context, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        AtomicInteger atomicInteger = new AtomicInteger();
        this.a = atomicInteger;
        AtomicInteger atomicInteger2 = new AtomicInteger();
        this.f = atomicInteger2;
        this.b = context;
        this.g = ffbrVar;
        this.h = ffbrVar2;
        this.i = ffbrVar3;
        atomicInteger.set(Alert.DURATION_SHOW_INDEFINITELY);
        atomicInteger2.set(Alert.DURATION_SHOW_INDEFINITELY);
    }

    public final int a() {
        return this.d.get();
    }

    public final void b(int i, String str) {
        csix.h();
        boolean z = false;
        int[] calculateLength = SmsMessage.calculateLength(str, ((cpbw) this.h.b()).e(i) && ((cpaz) this.g.b()).b(str));
        this.d.set(calculateLength[0]);
        this.e.set(calculateLength[1]);
        this.a.set(calculateLength[2]);
        cpbn a = ((cpbs) this.i.b()).a(i);
        int a2 = ((cpbw) this.h.b()).a(i);
        AtomicBoolean atomicBoolean = this.c;
        if (a2 > 0 && this.d.get() > a2) {
            z = true;
        }
        atomicBoolean.set(z);
        AtomicInteger atomicInteger = this.f;
        if (a2 <= 0) {
            a2 = Alert.DURATION_SHOW_INDEFINITELY;
        }
        atomicInteger.set(a2);
        int h = a.h();
        if (h > 0) {
            int i2 = calculateLength[1];
            if (this.a.get() + i2 < 140) {
                h >>= 1;
            }
            if (i2 > h) {
                this.c.set(true);
            }
        }
    }

    public final boolean c() {
        return this.c.get();
    }
}
