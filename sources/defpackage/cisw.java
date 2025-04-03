package defpackage;

import android.os.Bundle;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cisw extends ciwd {
    public final cixf a;
    public final Optional b;
    private final Bundle c;
    private final boolean d;

    public cisw(cixf cixfVar, Optional optional, Bundle bundle, boolean z) {
        if (cixfVar == null) {
            throw new NullPointerException("Null notificationType");
        }
        this.a = cixfVar;
        this.b = optional;
        if (bundle == null) {
            throw new NullPointerException("Null notificationBundle");
        }
        this.c = bundle;
        this.d = z;
    }

    @Override // defpackage.ciwd
    public final Bundle a() {
        return this.c;
    }

    @Override // defpackage.ciwd
    public final cixf b() {
        return this.a;
    }

    @Override // defpackage.ciwd
    public final Optional c() {
        return this.b;
    }

    @Override // defpackage.ciwd
    public final boolean d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ciwd) {
            ciwd ciwdVar = (ciwd) obj;
            if (this.a.equals(ciwdVar.b()) && this.b.equals(ciwdVar.c()) && this.c.equals(ciwdVar.a()) && this.d == ciwdVar.d()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (true != this.d ? 1237 : 1231);
    }

    public final String toString() {
        Bundle bundle = this.c;
        Optional optional = this.b;
        return "NotificationData{notificationType=" + this.a.toString() + ", notificationTag=" + optional.toString() + ", notificationBundle=" + bundle.toString() + ", isSummaryNotification=" + this.d + "}";
    }
}
