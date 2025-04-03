package defpackage;

import android.telephony.TelephonyManager;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class akyw {
    public final ctwb a;
    public final dkpp b;
    public final TelephonyManager c;
    public final cort d;
    public final ffbr e;
    private final emzl f = new emzf().b(new akyv(this));

    public akyw(ctwb ctwbVar, dkpp dkppVar, TelephonyManager telephonyManager, cort cortVar, ffbr ffbrVar) {
        this.a = ctwbVar;
        this.b = dkppVar;
        this.c = telephonyManager;
        this.d = cortVar;
        this.e = ffbrVar;
    }

    public final eoqk a(int i) {
        try {
            return (eoqk) this.f.a(Integer.valueOf(i));
        } catch (ExecutionException e) {
            throw new RuntimeException(a.h(i, "Failed to create BugleMobileCode for subId: "), e.getCause());
        }
    }
}
