package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class alqo extends alrk {
    public final MessageCoreData a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final Optional f;
    public final int g;
    public final Optional h;
    public final Optional i;
    public final Optional j;
    public final int k;

    public alqo(MessageCoreData messageCoreData, int i, int i2, int i3, int i4, Optional optional, int i5, int i6, Optional optional2, Optional optional3, Optional optional4) {
        this.a = messageCoreData;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = optional;
        this.k = i5;
        this.g = i6;
        this.h = optional2;
        this.i = optional3;
        this.j = optional4;
    }

    @Override // defpackage.alrk
    public final int a() {
        return this.e;
    }

    @Override // defpackage.alrk
    public final int b() {
        return this.d;
    }

    @Override // defpackage.alrk
    public final int c() {
        return this.g;
    }

    @Override // defpackage.alrk
    public final int d() {
        return this.c;
    }

    @Override // defpackage.alrk
    public final int e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof alrk) {
            alrk alrkVar = (alrk) obj;
            if (this.a.equals(alrkVar.f()) && this.b == alrkVar.e() && this.c == alrkVar.d() && this.d == alrkVar.b() && this.e == alrkVar.a() && this.f.equals(alrkVar.i()) && this.k == alrkVar.k() && this.g == alrkVar.c() && this.h.equals(alrkVar.g()) && this.i.equals(alrkVar.h()) && this.j.equals(alrkVar.j())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.alrk
    public final MessageCoreData f() {
        return this.a;
    }

    @Override // defpackage.alrk
    public final Optional g() {
        return this.h;
    }

    @Override // defpackage.alrk
    public final Optional h() {
        return this.i;
    }

    public final int hashCode() {
        int hashCode = ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ this.f.hashCode();
        int i = this.k;
        eopg.c(i);
        return (((((((((hashCode * 1000003) ^ i) * 1000003) ^ this.g) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode();
    }

    @Override // defpackage.alrk
    public final Optional i() {
        return this.f;
    }

    @Override // defpackage.alrk
    public final Optional j() {
        return this.j;
    }

    @Override // defpackage.alrk
    public final int k() {
        return this.k;
    }

    public final String toString() {
        Optional optional = this.j;
        Optional optional2 = this.i;
        Optional optional3 = this.h;
        int i = this.k;
        Optional optional4 = this.f;
        return "MessageFailureParameters{messageSnapshot=" + this.a.toString() + ", subId=" + this.b + ", resultCode=" + this.c + ", httpStatusCode=" + this.d + ", errorCode=" + this.e + ", rcsDiagnostics=" + String.valueOf(optional4) + ", mmsApi=" + eopg.b(i) + ", lastConnectionFailureCauseCode=" + this.g + ", formatType=" + String.valueOf(optional3) + ", outgoingFailureReason=" + String.valueOf(optional2) + ", satelliteMessageSubType=" + String.valueOf(optional) + "}";
    }
}
