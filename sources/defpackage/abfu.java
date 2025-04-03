package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abfu implements dmfn {
    public final List a;
    public final int b;
    public final String c;
    public final String d;
    private final ffix e;
    private final boolean f = true;

    public abfu(List list, int i, String str, String str2, ffix ffixVar) {
        this.a = list;
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = ffixVar;
    }

    @Override // defpackage.dmfn
    public final /* bridge */ /* synthetic */ dmfn a(ffix ffixVar) {
        return new abfu(this.a, this.b, this.c, this.d, ffixVar);
    }

    @Override // defpackage.dmfn
    public final ffix b() {
        return this.e;
    }

    @Override // defpackage.dmfn
    public final boolean c() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof abfu)) {
            return false;
        }
        abfu abfuVar = (abfu) obj;
        if (!ffkj.e(this.a, abfuVar.a) || this.b != abfuVar.b || !ffkj.e(this.c, abfuVar.c) || !ffkj.e(this.d, abfuVar.d) || !ffkj.e(this.e, abfuVar.e)) {
            return false;
        }
        boolean z = abfuVar.f;
        return true;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.c;
        int hashCode2 = (((hashCode + this.b) * 31) + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return ((((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.e.hashCode()) * 31) + 1231;
    }

    public final String toString() {
        return "RadioButtonsListUiData(listItems=" + this.a + ", selectedListItemIndex=" + this.b + ", title=" + this.c + ", subtitle=" + this.d + ", onDismiss=" + this.e + ", includeScrim=true)";
    }
}
