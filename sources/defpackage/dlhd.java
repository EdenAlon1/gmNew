package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlhd extends dlhe {
    public final dlkz a;
    public final eyee b;
    public final eyee c;
    public final List d;
    public final boolean e;
    public final String f;
    public final eyee g;

    public dlhd(dlkz dlkzVar, eyee eyeeVar, eyee eyeeVar2, List list, boolean z, String str, eyee eyeeVar3) {
        dlkzVar.getClass();
        eyeeVar2.getClass();
        list.getClass();
        this.a = dlkzVar;
        this.b = eyeeVar;
        this.c = eyeeVar2;
        this.d = list;
        this.e = z;
        this.f = str;
        this.g = eyeeVar3;
    }

    @Override // defpackage.dlhe
    public final eyee a() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlhd)) {
            return false;
        }
        dlhd dlhdVar = (dlhd) obj;
        return ffkj.e(this.a, dlhdVar.a) && ffkj.e(this.b, dlhdVar.b) && ffkj.e(this.c, dlhdVar.c) && ffkj.e(this.d, dlhdVar.d) && this.e == dlhdVar.e && ffkj.e(this.f, dlhdVar.f) && ffkj.e(this.g, dlhdVar.g);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        eyee eyeeVar = this.b;
        int hashCode2 = (((((((hashCode + (eyeeVar == null ? 0 : eyeeVar.hashCode())) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + (true != this.e ? 1237 : 1231)) * 31;
        String str = this.f;
        return ((hashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.g.hashCode();
    }
}
