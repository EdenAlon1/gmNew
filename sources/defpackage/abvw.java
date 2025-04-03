package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abvw extends abwc {
    public final boolean a;
    public final boolean b;
    public final double c;
    public final engw d;
    private final Bundle e;

    public abvw(boolean z, boolean z2, double d, engw engwVar, Bundle bundle) {
        this.a = z;
        this.b = z2;
        this.c = d;
        this.d = engwVar;
        this.e = bundle;
    }

    @Override // defpackage.abwc
    public final double a() {
        return this.c;
    }

    @Override // defpackage.abwc
    public final Bundle b() {
        return this.e;
    }

    @Override // defpackage.abwc
    public final engw c() {
        return this.d;
    }

    @Override // defpackage.abwc
    public final boolean d() {
        return this.a;
    }

    @Override // defpackage.abwc
    public final boolean e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof abwc) {
            abwc abwcVar = (abwc) obj;
            if (this.a == abwcVar.d()) {
                abwcVar.f();
                if (this.b == abwcVar.e() && Double.doubleToLongBits(this.c) == Double.doubleToLongBits(abwcVar.a()) && enkr.h(this.d, abwcVar.c()) && this.e.equals(abwcVar.b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((int) ((Double.doubleToLongBits(this.c) >>> 32) ^ Double.doubleToLongBits(this.c))) ^ (((((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ 1237) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003)) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        Bundle bundle = this.e;
        return "DonatableMessageRequest{includePersonalMessages=" + this.a + ", includeMessagesFromContacts=false, includeSentMessages=" + this.b + ", normalizedEditDistanceThreshold=" + this.c + ", redactors=" + this.d.toString() + ", intentExtras=" + bundle.toString() + "}";
    }

    @Override // defpackage.abwc
    public final void f() {
    }
}
