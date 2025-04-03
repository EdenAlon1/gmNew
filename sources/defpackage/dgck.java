package defpackage;

import android.os.Bundle;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgck extends dgcn {
    public final Duration a;
    public final Duration b;
    public final boolean c;
    public final Bundle d;

    public dgck(Duration duration, Duration duration2, boolean z, Bundle bundle) {
        this.a = duration;
        this.b = duration2;
        this.c = z;
        this.d = bundle;
    }

    @Override // defpackage.dgcn
    public final Bundle a() {
        return this.d;
    }

    @Override // defpackage.dgcn
    public final Duration b() {
        return this.a;
    }

    @Override // defpackage.dgcn
    public final Duration c() {
        return this.b;
    }

    @Override // defpackage.dgcn
    public final boolean d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dgcn) {
            dgcn dgcnVar = (dgcn) obj;
            if (this.a.equals(dgcnVar.b()) && this.b.equals(dgcnVar.c()) && this.c == dgcnVar.d() && this.d.equals(dgcnVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        Bundle bundle = this.d;
        Duration duration = this.b;
        return "DroidGuardClientOptions{initTimeout=" + String.valueOf(this.a) + ", snapshotTimeout=" + String.valueOf(duration) + ", reinitializeHandleOnGetSnapshot=" + this.c + ", extras=" + String.valueOf(bundle) + "}";
    }
}
