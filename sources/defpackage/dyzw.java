package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyzw extends dzat {
    public final Set a;
    private final String b;
    private final boolean c;
    private final boolean d;

    public dyzw(String str, boolean z, boolean z2, Set set) {
        this.b = str;
        this.c = z;
        this.d = z2;
        this.a = set;
    }

    @Override // defpackage.dzat
    public final String a() {
        return this.b;
    }

    @Override // defpackage.dzat
    public final Set b() {
        return this.a;
    }

    @Override // defpackage.dzat
    public final boolean c() {
        return this.d;
    }

    @Override // defpackage.dzat
    public final boolean d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dzat) {
            dzat dzatVar = (dzat) obj;
            if (this.b.equals(dzatVar.a()) && this.c == dzatVar.d() && this.d == dzatVar.c() && this.a.equals(dzatVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.b.hashCode() ^ 1000003) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ (true == this.d ? 1231 : 1237)) * 1000003) ^ this.a.hashCode();
    }

    public final String toString() {
        return "GroupMetadata{handlerId=" + this.b + ", supportsBlocking=" + this.c + ", isBlocked=" + this.d + ", importantParticipants=" + this.a.toString() + "}";
    }
}
