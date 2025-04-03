package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class akui extends akup {
    private final String a;
    private final int b;
    private final Supplier c;

    public akui(String str, int i, Supplier supplier) {
        this.a = str;
        this.b = i;
        this.c = supplier;
    }

    @Override // defpackage.akup
    public final int a() {
        return this.b;
    }

    @Override // defpackage.akup
    public final String b() {
        return this.a;
    }

    @Override // defpackage.akup
    public final Supplier c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        boolean equals;
        if (obj == this) {
            return true;
        }
        if (obj instanceof akup) {
            akup akupVar = (akup) obj;
            if (this.a.equals(akupVar.b()) && this.b == akupVar.a()) {
                equals = this.c.equals(akupVar.c());
                if (equals) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() ^ 1000003;
        Supplier supplier = this.c;
        int i = ((hashCode2 * 1000003) ^ this.b) * 1000003;
        hashCode = supplier.hashCode();
        return i ^ hashCode;
    }

    public final String toString() {
        return "SettingsSearchEntry{className=" + this.a + ", xmlResId=" + this.b + ", enabled=" + this.c.toString() + "}";
    }
}
