package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class doqa implements dlut {
    public final String a;
    public final dmzz b;
    private final List c;
    private final String d;
    private final String e;

    public /* synthetic */ doqa(String str, List list, dmzz dmzzVar, int i) {
        list = (i & 2) != 0 ? ffel.a : list;
        dmzzVar = (i & 8) != 0 ? null : dmzzVar;
        str.getClass();
        list.getClass();
        this.a = str;
        this.c = list;
        this.d = null;
        this.b = dmzzVar;
        this.e = null;
    }

    @Override // defpackage.dlut
    public final String a() {
        return null;
    }

    @Override // defpackage.dlut
    public final String e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof doqa)) {
            return false;
        }
        doqa doqaVar = (doqa) obj;
        if (!ffkj.e(this.a, doqaVar.a) || !ffkj.e(this.c, doqaVar.c)) {
            return false;
        }
        String str = doqaVar.d;
        if (!ffkj.e(null, null) || this.b != doqaVar.b) {
            return false;
        }
        String str2 = doqaVar.e;
        return ffkj.e(null, null);
    }

    @Override // defpackage.dlut
    public final List f() {
        return this.c;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() * 31) + this.c.hashCode();
        dmzz dmzzVar = this.b;
        return ((hashCode * 961) + (dmzzVar == null ? 0 : dmzzVar.hashCode())) * 31;
    }

    public final String toString() {
        return "TombstoneLine(text=" + this.a + ", annotations=" + this.c + ", contentDescription=null, icon=" + this.b + ", iconContentDescription=null)";
    }
}
