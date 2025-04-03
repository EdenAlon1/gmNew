package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzng extends dzqb {
    private final byte[] a;
    private final int b;
    private final int c;
    private final emxc d;
    private final String e;

    public dzng(byte[] bArr, int i, int i2, emxc emxcVar, String str) {
        this.a = bArr;
        this.b = i;
        this.c = i2;
        this.d = emxcVar;
        this.e = str;
    }

    @Override // defpackage.dzqb
    public final int a() {
        return this.c;
    }

    @Override // defpackage.dzqb
    public final int b() {
        return this.b;
    }

    @Override // defpackage.dzqb
    public final emxc c() {
        return this.d;
    }

    @Override // defpackage.dzqb
    public final String d() {
        return this.e;
    }

    @Override // defpackage.dzqb
    public final byte[] e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dzqb) {
            dzqb dzqbVar = (dzqb) obj;
            if (Arrays.equals(this.a, dzqbVar instanceof dzng ? ((dzng) dzqbVar).a : dzqbVar.e()) && this.b == dzqbVar.b() && this.c == dzqbVar.a() && this.d.equals(dzqbVar.c()) && this.e.equals(dzqbVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((Arrays.hashCode(this.a) ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        emxc emxcVar = this.d;
        return "LighterIcon{icon=" + Arrays.toString(this.a) + ", width=" + this.b + ", height=" + this.c + ", color=" + String.valueOf(emxcVar) + ", talkBackDescription=" + this.e + "}";
    }
}
