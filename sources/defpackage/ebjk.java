package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ebjk {
    public final String a;
    public final String b;
    public int c;
    public int d;
    public boolean e;

    public ebjk(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ebjk)) {
            return false;
        }
        ebjk ebjkVar = (ebjk) obj;
        return this.c == ebjkVar.c && this.d == ebjkVar.d && this.e == ebjkVar.e && emxb.a(this.a, ebjkVar.a) && emxb.a(this.b, ebjkVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(this.c), Integer.valueOf(this.d), Boolean.valueOf(this.e)});
    }

    public final String toString() {
        emwz b = emxa.b(this);
        b.b("educationName", this.a);
        b.b("highlightId", this.b);
        b.f("numImpressions", this.c);
        b.f("numInteractions", this.d);
        b.h("completed", this.e);
        return b.toString();
    }
}
