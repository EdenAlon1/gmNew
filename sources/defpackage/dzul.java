package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzul extends dzvg {
    private final byte[] a;
    private final dzqb b;
    private final String c;
    private final dzjn d;

    public dzul(byte[] bArr, dzqb dzqbVar, String str, dzjn dzjnVar) {
        this.a = bArr;
        this.b = dzqbVar;
        this.c = str;
        this.d = dzjnVar;
    }

    @Override // defpackage.dzvg
    public final dzjn a() {
        return this.d;
    }

    @Override // defpackage.dzvg
    public final dzqb b() {
        return this.b;
    }

    @Override // defpackage.dzvg
    public final String c() {
        return this.c;
    }

    @Override // defpackage.dzvg
    @Deprecated
    public final byte[] d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dzvg) {
            dzvg dzvgVar = (dzvg) obj;
            if (Arrays.equals(this.a, dzvgVar instanceof dzul ? ((dzul) dzvgVar).a : dzvgVar.d()) && this.b.equals(dzvgVar.b()) && this.c.equals(dzvgVar.c()) && this.d.equals(dzvgVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((Arrays.hashCode(this.a) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        dzjn dzjnVar = this.d;
        dzqb dzqbVar = this.b;
        return "VerticalLayoutButton{icon=" + Arrays.toString(this.a) + ", lighterIcon=" + dzqbVar.toString() + ", displayText=" + this.c + ", action=" + dzjnVar.toString() + "}";
    }
}
