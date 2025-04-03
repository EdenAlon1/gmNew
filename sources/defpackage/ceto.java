package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ceto extends ceyt {
    public final boolean a;
    public final boolean b;
    public final engw c;
    public final Exception d;
    public final boolean e;
    public final Bundle f;

    public ceto(boolean z, boolean z2, engw engwVar, Exception exc, boolean z3, Bundle bundle) {
        this.a = z;
        this.b = z2;
        this.c = engwVar;
        this.d = exc;
        this.e = z3;
        this.f = bundle;
    }

    @Override // defpackage.ceyt
    public final Bundle a() {
        return this.f;
    }

    @Override // defpackage.ceyt
    public final ceys b() {
        return new cetn(this);
    }

    @Override // defpackage.ceyt
    public final engw c() {
        return this.c;
    }

    @Override // defpackage.ceyt
    public final Exception d() {
        return this.d;
    }

    @Override // defpackage.ceyt
    public final boolean e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        engw engwVar;
        Exception exc;
        Bundle bundle;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ceyt) {
            ceyt ceytVar = (ceyt) obj;
            if (this.a == ceytVar.e() && this.b == ceytVar.f() && ((engwVar = this.c) != null ? enkr.h(engwVar, ceytVar.c()) : ceytVar.c() == null) && ((exc = this.d) != null ? exc.equals(ceytVar.d()) : ceytVar.d() == null) && this.e == ceytVar.g() && ((bundle = this.f) != null ? bundle.equals(ceytVar.a()) : ceytVar.a() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ceyt
    public final boolean f() {
        return this.b;
    }

    @Override // defpackage.ceyt
    public final boolean g() {
        return this.e;
    }

    public final int hashCode() {
        engw engwVar = this.c;
        int hashCode = (engwVar == null ? 0 : engwVar.hashCode()) ^ (((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003);
        Exception exc = this.d;
        int hashCode2 = ((((hashCode * 1000003) ^ (exc == null ? 0 : exc.hashCode())) * 1000003) ^ (true == this.e ? 1231 : 1237)) * 1000003;
        Bundle bundle = this.f;
        return hashCode2 ^ (bundle != null ? bundle.hashCode() : 0);
    }

    public final String toString() {
        Bundle bundle = this.f;
        Exception exc = this.d;
        return "WorkQueueResult{completed=" + this.a + ", retryable=" + this.b + ", newRequests=" + String.valueOf(this.c) + ", error=" + String.valueOf(exc) + ", skipped=" + this.e + ", extras=" + String.valueOf(bundle) + "}";
    }
}
