package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class amcs extends amdg {
    public final MessageIdType a;
    public final int b;
    private final Optional c;
    private final Optional d;
    private final Optional e;
    private final Optional f;
    private final Optional g;
    private final boolean h;
    private final epdh i;
    private final Optional j;
    private final Optional k;
    private final Optional l;
    private final boolean m;
    private final Optional n;

    public amcs(MessageIdType messageIdType, Optional optional, Optional optional2, Optional optional3, Optional optional4, Optional optional5, boolean z, epdh epdhVar, int i, Optional optional6, Optional optional7, Optional optional8, boolean z2, Optional optional9) {
        this.a = messageIdType;
        this.c = optional;
        this.d = optional2;
        this.e = optional3;
        this.f = optional4;
        this.g = optional5;
        this.h = z;
        this.i = epdhVar;
        this.b = i;
        this.j = optional6;
        this.k = optional7;
        this.l = optional8;
        this.m = z2;
        this.n = optional9;
    }

    @Override // defpackage.amdg
    public final int a() {
        return this.b;
    }

    @Override // defpackage.amdg
    public final MessageIdType b() {
        return this.a;
    }

    @Override // defpackage.amdg
    public final epdh c() {
        return this.i;
    }

    @Override // defpackage.amdg
    public final Optional d() {
        return this.f;
    }

    @Override // defpackage.amdg
    public final Optional e() {
        return this.k;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof amdg) {
            amdg amdgVar = (amdg) obj;
            if (this.a.equals(amdgVar.b()) && this.c.equals(amdgVar.h()) && this.d.equals(amdgVar.g()) && this.e.equals(amdgVar.i()) && this.f.equals(amdgVar.d()) && this.g.equals(amdgVar.l()) && this.h == amdgVar.n() && this.i.equals(amdgVar.c())) {
                amdgVar.o();
                if (this.b == amdgVar.a() && this.j.equals(amdgVar.k()) && this.k.equals(amdgVar.e()) && this.l.equals(amdgVar.j()) && this.m == amdgVar.m() && this.n.equals(amdgVar.f())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.amdg
    public final Optional f() {
        return this.n;
    }

    @Override // defpackage.amdg
    public final Optional g() {
        return this.d;
    }

    @Override // defpackage.amdg
    public final Optional h() {
        return this.c;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ (true != this.h ? 1237 : 1231)) * 1000003) ^ this.i.hashCode()) * 1000003) ^ 1) * 1000003) ^ this.b) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l.hashCode()) * 1000003) ^ (true == this.m ? 1231 : 1237)) * 1000003) ^ this.n.hashCode();
    }

    @Override // defpackage.amdg
    public final Optional i() {
        return this.e;
    }

    @Override // defpackage.amdg
    public final Optional j() {
        return this.l;
    }

    @Override // defpackage.amdg
    public final Optional k() {
        return this.j;
    }

    @Override // defpackage.amdg
    public final Optional l() {
        return this.g;
    }

    @Override // defpackage.amdg
    public final boolean m() {
        return this.m;
    }

    @Override // defpackage.amdg
    public final boolean n() {
        return this.h;
    }

    public final String toString() {
        Optional optional = this.n;
        Optional optional2 = this.l;
        Optional optional3 = this.k;
        Optional optional4 = this.j;
        epdh epdhVar = this.i;
        Optional optional5 = this.g;
        Optional optional6 = this.f;
        Optional optional7 = this.e;
        Optional optional8 = this.d;
        Optional optional9 = this.c;
        return "MessageFailureContext{messageId=" + this.a.toString() + ", rcsMessageId=" + String.valueOf(optional9) + ", rawTelephonyStatus=" + String.valueOf(optional8) + ", resultCode=" + String.valueOf(optional7) + ", errorCode=" + String.valueOf(optional6) + ", xmsTransport=" + String.valueOf(optional5) + ", notified=" + this.h + ", reason=" + epdhVar.toString() + ", canFallback=" + epdf.a(1) + ", terminalStatus=" + this.b + ", timestamp=" + String.valueOf(optional4) + ", hidden=" + String.valueOf(optional3) + ", sendCount=" + String.valueOf(optional2) + ", logEnabled=" + this.m + ", logContent=" + String.valueOf(optional) + "}";
    }

    @Override // defpackage.amdg
    public final void o() {
    }
}
