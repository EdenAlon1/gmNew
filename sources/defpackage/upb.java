package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class upb extends upf {
    public final int a;
    public final String b;
    public final boolean c;

    public upb(int i, String str, boolean z) {
        this.a = i;
        this.b = str;
        this.c = z;
    }

    @Override // defpackage.upf
    public final int a() {
        return this.a;
    }

    @Override // defpackage.upf
    public final String b() {
        return this.b;
    }

    @Override // defpackage.upf
    public final boolean c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof upf) {
            upf upfVar = (upf) obj;
            if (this.a == upfVar.a() && ((str = this.b) != null ? str.equals(upfVar.b()) : upfVar.b() == null) && this.c == upfVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.b;
        return (((str == null ? 0 : str.hashCode()) ^ ((this.a ^ 1000003) * 1000003)) * 1000003) ^ (true != this.c ? 1237 : 1231);
    }

    public final String toString() {
        return "SnackbarActionConfigExtras{conversationJoinState=" + this.a + ", globalRcsGroupName=" + this.b + ", isE2ee=" + this.c + "}";
    }
}
