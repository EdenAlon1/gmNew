package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehyw extends eibe {
    private final Optional a;
    private final Optional b;
    private final int c;

    public ehyw(int i, Optional optional, Optional optional2) {
        this.c = i;
        this.a = optional;
        this.b = optional2;
    }

    @Override // defpackage.eibe
    public final Optional a() {
        return this.a;
    }

    @Override // defpackage.eibe
    public final Optional b() {
        return this.b;
    }

    @Override // defpackage.eibe
    public final int c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eibe) {
            eibe eibeVar = (eibe) obj;
            if (this.c == eibeVar.c() && this.a.equals(eibeVar.a()) && this.b.equals(eibeVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.c ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String str = this.c != 1 ? "STOP" : "START";
        Optional optional = this.a;
        Optional optional2 = this.b;
        return "IsComposingMessage{state=" + str + ", refresh=" + optional.toString() + ", timestamp=" + optional2.toString() + "}";
    }
}
