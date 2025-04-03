package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abmi {
    public final String a;
    public final dmzz b;
    public final boolean c;
    public final boolean d;
    public final ffix e;

    public abmi(String str, dmzz dmzzVar, boolean z, boolean z2, ffix ffixVar) {
        ffixVar.getClass();
        this.a = str;
        this.b = dmzzVar;
        this.c = z;
        this.d = z2;
        this.e = ffixVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof abmi)) {
            return false;
        }
        abmi abmiVar = (abmi) obj;
        return ffkj.e(this.a, abmiVar.a) && this.b == abmiVar.b && this.c == abmiVar.c && this.d == abmiVar.d && ffkj.e(this.e, abmiVar.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        dmzz dmzzVar = this.b;
        return ((((((hashCode + (dmzzVar == null ? 0 : dmzzVar.hashCode())) * 31) + abmh.a(this.c)) * 31) + abmh.a(this.d)) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "BackBehaviorUiData(title=" + this.a + ", icon=" + this.b + ", overrideSystemBack=" + this.c + ", canExecute=" + this.d + ", execute=" + this.e + ")";
    }

    public /* synthetic */ abmi(String str, dmzz dmzzVar, ffix ffixVar) {
        this(str, dmzzVar, true, true, ffixVar);
    }
}
