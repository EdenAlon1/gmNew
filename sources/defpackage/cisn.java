package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cisn extends citk {
    private final Optional a;
    private final ciwt b;
    private final ciwm c;
    private final Optional d;
    private final Optional e;
    private final boolean f;

    public cisn(Optional optional, ciwt ciwtVar, ciwm ciwmVar, Optional optional2, Optional optional3, boolean z) {
        this.a = optional;
        this.b = ciwtVar;
        this.c = ciwmVar;
        this.d = optional2;
        this.e = optional3;
        this.f = z;
    }

    @Override // defpackage.citk
    public final ciwm a() {
        return this.c;
    }

    @Override // defpackage.citk
    public final ciwt b() {
        return this.b;
    }

    @Override // defpackage.citk
    public final Optional c() {
        return this.e;
    }

    @Override // defpackage.citk
    public final Optional d() {
        return this.a;
    }

    @Override // defpackage.citk
    public final Optional e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof citk) {
            citk citkVar = (citk) obj;
            if (this.a.equals(citkVar.d()) && this.b.equals(citkVar.b()) && this.c.equals(citkVar.a()) && this.d.equals(citkVar.e()) && this.e.equals(citkVar.c()) && this.f == citkVar.f()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.citk
    public final boolean f() {
        return this.f;
    }

    public final int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ (true != this.f ? 1237 : 1231);
    }

    public final String toString() {
        Optional optional = this.e;
        Optional optional2 = this.d;
        ciwm ciwmVar = this.c;
        ciwt ciwtVar = this.b;
        return "BasicNotificationBuilderInfo{notificationExtras=" + String.valueOf(this.a) + ", notificationStyleInfo=" + ciwtVar.toString() + ", clickInteractionInfo=" + ciwmVar.toString() + ", swipeInteractionInfo=" + String.valueOf(optional2) + ", notificationActions=" + String.valueOf(optional) + ", shouldAlert=" + this.f + "}";
    }
}
