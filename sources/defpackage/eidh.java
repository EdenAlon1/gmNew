package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eidh extends eidr {
    public final eyee a;
    public final Optional b;
    private final engw d;

    public eidh(engw engwVar, eyee eyeeVar, Optional optional) {
        this.d = engwVar;
        this.a = eyeeVar;
        this.b = optional;
    }

    @Override // defpackage.eidr
    public final engw a() {
        return this.d;
    }

    @Override // defpackage.eidr
    public final eyee b() {
        return this.a;
    }

    @Override // defpackage.eidr
    public final Optional c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eidr) {
            eidr eidrVar = (eidr) obj;
            if (enkr.h(this.d, eidrVar.a()) && this.a.equals(eidrVar.b()) && this.b.equals(eidrVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.d.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        Optional optional = this.b;
        eyee eyeeVar = this.a;
        return "CpimMessageContent{headers=" + String.valueOf(this.d) + ", content=" + eyeeVar.toString() + ", messageContent=" + String.valueOf(optional) + "}";
    }
}
