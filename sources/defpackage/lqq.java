package defpackage;

import android.net.Uri;
import j$.util.Objects;
import java.util.Arrays;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lqq {
    public final UUID a;
    public final Uri b;
    public final enhk c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final engw g;
    public final byte[] h;

    static {
        lvf.N(0);
        lvf.N(1);
        lvf.N(2);
        lvf.N(3);
        lvf.N(4);
        lvf.N(5);
        lvf.N(6);
        lvf.N(7);
    }

    public lqq(lqp lqpVar) {
        lti.c(true);
        UUID uuid = lqpVar.a;
        lti.f(uuid);
        this.a = uuid;
        this.b = null;
        this.c = lqpVar.c;
        this.d = false;
        this.f = false;
        this.e = true;
        this.g = lqpVar.d;
        byte[] bArr = lqpVar.e;
        this.h = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lqq)) {
            return false;
        }
        lqq lqqVar = (lqq) obj;
        if (this.a.equals(lqqVar.a)) {
            Uri uri = lqqVar.b;
            int i = lvf.a;
            if (Objects.equals(null, null) && Objects.equals(this.c, lqqVar.c)) {
                boolean z = lqqVar.d;
                boolean z2 = lqqVar.f;
                boolean z3 = lqqVar.e;
                if (enkr.h(this.g, lqqVar.g) && Arrays.equals(this.h, lqqVar.h)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 961) + this.c.hashCode()) * 29791) + 1) * 31) + this.g.hashCode()) * 31) + Arrays.hashCode(this.h);
    }
}
