package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class dzik extends dzjd {
    public final emxc a;
    public final Set b;
    public final emxc c;
    public final String d;

    public dzik(emxc emxcVar, Set set, emxc emxcVar2, String str) {
        if (emxcVar == null) {
            throw new NullPointerException("Null gaiaEmail");
        }
        this.a = emxcVar;
        this.b = set;
        if (emxcVar2 == null) {
            throw new NullPointerException("Null deviceId");
        }
        this.c = emxcVar2;
        if (str == null) {
            throw new NullPointerException("Null tachyonAppName");
        }
        this.d = str;
    }

    @Override // defpackage.dzjd
    public final emxc a() {
        return this.c;
    }

    @Override // defpackage.dzjd
    public final emxc b() {
        return this.a;
    }

    @Override // defpackage.dzjd
    public final String c() {
        return this.d;
    }

    @Override // defpackage.dzjd
    public final Set d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dzjd) {
            dzjd dzjdVar = (dzjd) obj;
            if (this.a.equals(dzjdVar.b()) && this.b.equals(dzjdVar.d()) && this.c.equals(dzjdVar.a()) && this.d.equals(dzjdVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        emxc emxcVar = this.c;
        Set set = this.b;
        return "AccountUsers{gaiaEmail=" + this.a.toString() + ", phoneNumbers=" + set.toString() + ", deviceId=" + emxcVar.toString() + ", tachyonAppName=" + this.d + "}";
    }
}
