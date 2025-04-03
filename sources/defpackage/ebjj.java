package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ebjj implements Cloneable {
    public final String a;
    public boolean b;
    public int c;
    public int d;
    public long e;
    public long f;
    public long g;
    public boolean h;

    public ebjj(String str) {
        this.a = str;
    }

    public final Object clone() {
        return super.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ebjj)) {
            return false;
        }
        ebjj ebjjVar = (ebjj) obj;
        return this.b == ebjjVar.b && this.c == ebjjVar.c && this.d == ebjjVar.d && this.e == ebjjVar.e && this.f == ebjjVar.f && this.g == ebjjVar.g && this.h == ebjjVar.h && emxb.a(this.a, ebjjVar.a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Boolean.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), Long.valueOf(this.e), Long.valueOf(this.f), Long.valueOf(this.g), Boolean.valueOf(this.h)});
    }

    public final String toString() {
        emwz b = emxa.b(this);
        b.b("name", this.a);
        b.h("enabled", this.b);
        b.f("numImpressions", this.c);
        b.f("numInteractions", this.d);
        b.g("activatedTimestampMs", this.e);
        b.g("lastImpressionTimestampMs", this.f);
        b.g("lastInteractionTimestampMs", this.g);
        b.h("completed", this.h);
        return b.toString();
    }
}
