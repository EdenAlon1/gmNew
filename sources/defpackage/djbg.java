package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djbg extends djeb {
    private final Optional a;
    private final Optional b;

    public djbg(Optional optional, Optional optional2) {
        this.a = optional;
        this.b = optional2;
    }

    @Override // defpackage.djeb
    public final Optional a() {
        return this.a;
    }

    @Override // defpackage.djeb
    public final Optional b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof djeb) {
            djeb djebVar = (djeb) obj;
            if (this.a.equals(djebVar.a()) && this.b.equals(djebVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        Optional optional = this.b;
        return "ReceiveMessageRequest{message=" + String.valueOf(this.a) + ", session=" + String.valueOf(optional) + "}";
    }
}
