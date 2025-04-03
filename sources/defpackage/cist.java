package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cist extends civl {
    private final Optional a;
    private final Optional b;
    private final Optional c;
    private final ciwt d;
    private final ciwm e;
    private final Optional f;
    private final Optional g;
    private final boolean h;
    private final boolean i;
    private final Optional j;
    private final Optional k;
    private final boolean l;
    private final Optional m;

    public cist(Optional optional, Optional optional2, Optional optional3, ciwt ciwtVar, ciwm ciwmVar, Optional optional4, Optional optional5, boolean z, boolean z2, Optional optional6, Optional optional7, boolean z3, Optional optional8) {
        this.a = optional;
        this.b = optional2;
        this.c = optional3;
        this.d = ciwtVar;
        this.e = ciwmVar;
        this.f = optional4;
        this.g = optional5;
        this.h = z;
        this.i = z2;
        this.j = optional6;
        this.k = optional7;
        this.l = z3;
        this.m = optional8;
    }

    @Override // defpackage.civl
    public final ciwm a() {
        return this.e;
    }

    @Override // defpackage.civl
    public final ciwt b() {
        return this.d;
    }

    @Override // defpackage.civl
    public final Optional c() {
        return this.c;
    }

    @Override // defpackage.civl
    public final Optional d() {
        return this.m;
    }

    @Override // defpackage.civl
    public final Optional e() {
        return this.j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof civl) {
            civl civlVar = (civl) obj;
            if (this.a.equals(civlVar.g()) && this.b.equals(civlVar.f()) && this.c.equals(civlVar.c()) && this.d.equals(civlVar.b()) && this.e.equals(civlVar.a()) && this.f.equals(civlVar.i()) && this.g.equals(civlVar.h()) && this.h == civlVar.m() && this.i == civlVar.k() && this.j.equals(civlVar.e()) && this.k.equals(civlVar.j()) && this.l == civlVar.l() && this.m.equals(civlVar.d())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.civl
    public final Optional f() {
        return this.b;
    }

    @Override // defpackage.civl
    public final Optional g() {
        return this.a;
    }

    @Override // defpackage.civl
    public final Optional h() {
        return this.g;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ (true != this.h ? 1237 : 1231)) * 1000003) ^ (true != this.i ? 1237 : 1231)) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003) ^ (true == this.l ? 1231 : 1237)) * 1000003) ^ this.m.hashCode();
    }

    @Override // defpackage.civl
    public final Optional i() {
        return this.f;
    }

    @Override // defpackage.civl
    public final Optional j() {
        return this.k;
    }

    @Override // defpackage.civl
    public final boolean k() {
        return this.i;
    }

    @Override // defpackage.civl
    public final boolean l() {
        return this.l;
    }

    @Override // defpackage.civl
    public final boolean m() {
        return this.h;
    }

    public final String toString() {
        Optional optional = this.m;
        Optional optional2 = this.k;
        Optional optional3 = this.j;
        Optional optional4 = this.g;
        Optional optional5 = this.f;
        ciwm ciwmVar = this.e;
        ciwt ciwtVar = this.d;
        Optional optional6 = this.c;
        Optional optional7 = this.b;
        return "NotificationBuilderInfo{notificationTag=" + String.valueOf(this.a) + ", notificationExtras=" + String.valueOf(optional7) + ", conversationSpecificInfo=" + String.valueOf(optional6) + ", notificationStyleInfo=" + ciwtVar.toString() + ", clickInteractionInfo=" + ciwmVar.toString() + ", swipeInteractionInfo=" + String.valueOf(optional5) + ", numberPerNotification=" + String.valueOf(optional4) + ", shouldBridgeNotificationToOtherDevices=" + this.h + ", allowSystemGeneratedActions=" + this.i + ", notificationActions=" + String.valueOf(optional3) + ", wearableSpecificNotificationInfo=" + String.valueOf(optional2) + ", shouldAlert=" + this.l + ", eventTime=" + String.valueOf(optional) + "}";
    }
}
