package defpackage;

import android.os.Bundle;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cisr extends ciuw {
    private final ciux a;
    private final Bundle b;
    private final boolean c;
    private final CharSequence d;
    private final boolean e;
    private final boolean f;
    private final Optional g;
    private final Optional h;
    private final Optional i;
    private final Optional j;
    private final Optional k;
    private final Optional l;

    public cisr(ciux ciuxVar, Bundle bundle, boolean z, CharSequence charSequence, boolean z2, boolean z3, Optional optional, Optional optional2, Optional optional3, Optional optional4, Optional optional5, Optional optional6) {
        this.a = ciuxVar;
        this.b = bundle;
        this.c = z;
        this.d = charSequence;
        this.e = z2;
        this.f = z3;
        this.g = optional;
        this.h = optional2;
        this.i = optional3;
        this.j = optional4;
        this.k = optional5;
        this.l = optional6;
    }

    @Override // defpackage.ciuw
    public final Bundle a() {
        return this.b;
    }

    @Override // defpackage.ciuw
    public final ciux b() {
        return this.a;
    }

    @Override // defpackage.ciuw
    public final Optional c() {
        return this.h;
    }

    @Override // defpackage.ciuw
    public final Optional d() {
        return this.j;
    }

    @Override // defpackage.ciuw
    public final Optional e() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ciuw) {
            ciuw ciuwVar = (ciuw) obj;
            if (this.a.equals(ciuwVar.b()) && this.b.equals(ciuwVar.a()) && this.c == ciuwVar.l() && this.d.equals(ciuwVar.i()) && this.e == ciuwVar.k() && this.f == ciuwVar.j() && this.g.equals(ciuwVar.f()) && this.h.equals(ciuwVar.c()) && this.i.equals(ciuwVar.e()) && this.j.equals(ciuwVar.d()) && this.k.equals(ciuwVar.h()) && this.l.equals(ciuwVar.g())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ciuw
    public final Optional f() {
        return this.g;
    }

    @Override // defpackage.ciuw
    public final Optional g() {
        return this.l;
    }

    @Override // defpackage.ciuw
    public final Optional h() {
        return this.k;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ this.d.hashCode()) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ (true == this.f ? 1231 : 1237)) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l.hashCode();
    }

    @Override // defpackage.ciuw
    public final CharSequence i() {
        return this.d;
    }

    @Override // defpackage.ciuw
    public final boolean j() {
        return this.f;
    }

    @Override // defpackage.ciuw
    public final boolean k() {
        return this.e;
    }

    @Override // defpackage.ciuw
    public final boolean l() {
        return this.c;
    }

    public final String toString() {
        Optional optional = this.l;
        Optional optional2 = this.k;
        Optional optional3 = this.j;
        Optional optional4 = this.i;
        Optional optional5 = this.h;
        Optional optional6 = this.g;
        CharSequence charSequence = this.d;
        Bundle bundle = this.b;
        return "NotificationActionInfo{actionType=" + this.a.toString() + ", callbackBundle=" + bundle.toString() + ", shouldAddParentStack=" + this.c + ", title=" + charSequence.toString() + ", openActivityOnWear=" + this.e + ", isMainActivityWearAction=" + this.f + ", intentToRun=" + String.valueOf(optional6) + ", activityIntent=" + String.valueOf(optional5) + ", icon=" + String.valueOf(optional4) + ", allowGeneratedReplies=" + String.valueOf(optional3) + ", semanticAction=" + String.valueOf(optional2) + ", remoteInputs=" + String.valueOf(optional) + "}";
    }
}
