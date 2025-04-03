package defpackage;

import com.google.android.rcs.client.messaging.data.RcsDestinationId;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eied extends eifn {
    private final String a;
    private final RcsDestinationId b;
    private final Optional c;
    private final eifm d;
    private final Optional e;
    private final Optional f;

    public eied(String str, RcsDestinationId rcsDestinationId, Optional optional, eifm eifmVar, Optional optional2, Optional optional3) {
        this.a = str;
        this.b = rcsDestinationId;
        this.c = optional;
        this.d = eifmVar;
        this.e = optional2;
        this.f = optional3;
    }

    @Override // defpackage.eifn
    public final eifm a() {
        return this.d;
    }

    @Override // defpackage.eifn
    public final RcsDestinationId b() {
        return this.b;
    }

    @Override // defpackage.eifn
    public final Optional c() {
        return this.f;
    }

    @Override // defpackage.eifn
    public final Optional d() {
        return this.c;
    }

    @Override // defpackage.eifn
    public final Optional e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eifn) {
            eifn eifnVar = (eifn) obj;
            if (this.a.equals(eifnVar.f()) && this.b.equals(eifnVar.b()) && this.c.equals(eifnVar.d()) && this.d.equals(eifnVar.a()) && this.e.equals(eifnVar.e()) && this.f.equals(eifnVar.c())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.eifn
    public final String f() {
        return this.a;
    }

    public final int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode();
    }
}
