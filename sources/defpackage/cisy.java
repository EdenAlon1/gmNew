package defpackage;

import android.os.Bundle;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cisy extends ciwn {
    public final Optional a;
    public final Bundle b;

    public cisy(Optional optional, Bundle bundle) {
        this.a = optional;
        if (bundle == null) {
            throw new NullPointerException("Null callbackBundle");
        }
        this.b = bundle;
    }

    @Override // defpackage.ciwn
    public final Bundle a() {
        return this.b;
    }

    @Override // defpackage.ciwn
    public final Optional b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ciwn) {
            ciwn ciwnVar = (ciwn) obj;
            if (this.a.equals(ciwnVar.b()) && this.b.equals(ciwnVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        Bundle bundle = this.b;
        return "NotificationInteractionInfo{intentToRun=" + this.a.toString() + ", callbackBundle=" + bundle.toString() + "}";
    }
}
