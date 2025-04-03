package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzac extends dzbb {
    public final int a;
    public final String b;
    public final List c;
    public final dzpg d;
    public final dzpt e;

    public dzac(int i, String str, List list, dzpg dzpgVar, dzpt dzptVar) {
        this.a = i;
        this.b = str;
        this.c = list;
        this.d = dzpgVar;
        this.e = dzptVar;
    }

    @Override // defpackage.dzbb
    public final int a() {
        return this.a;
    }

    @Override // defpackage.dzbb
    public final dzpg b() {
        return this.d;
    }

    @Override // defpackage.dzbb
    public final dzpt c() {
        return this.e;
    }

    @Override // defpackage.dzbb
    public final String d() {
        return this.b;
    }

    @Override // defpackage.dzbb
    public final List e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dzbb) {
            dzbb dzbbVar = (dzbb) obj;
            if (this.a == dzbbVar.a() && this.b.equals(dzbbVar.d()) && this.c.equals(dzbbVar.e()) && this.d.equals(dzbbVar.b()) && this.e.equals(dzbbVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        dzpt dzptVar = this.e;
        dzpg dzpgVar = this.d;
        return "Receipt{receiptType=" + this.a + ", receiptId=" + this.b + ", messageIds=" + this.c.toString() + ", recipient=" + dzpgVar.toString() + ", conversationId=" + dzptVar.toString() + "}";
    }
}
