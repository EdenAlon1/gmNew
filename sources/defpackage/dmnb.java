package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmnb implements dmmq {
    public final String a;
    public final String b;
    public final ffix c;
    public final ffix d;

    public dmnb(String str, String str2, ffix ffixVar, ffix ffixVar2) {
        this.a = str;
        this.b = str2;
        this.c = ffixVar;
        this.d = ffixVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmnb)) {
            return false;
        }
        dmnb dmnbVar = (dmnb) obj;
        return ffkj.e(this.a, dmnbVar.a) && ffkj.e(this.b, dmnbVar.b) && ffkj.e(this.c, dmnbVar.c) && ffkj.e(this.d, dmnbVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        ffix ffixVar = this.c;
        return ((hashCode2 + (ffixVar != null ? ffixVar.hashCode() : 0)) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "ComposeRowHeaderUiData(headerText=" + this.a + ", onClick=<redacted>, onDismiss=<redacted>)";
    }

    public /* synthetic */ dmnb(String str, String str2, ffix ffixVar, ffix ffixVar2, int i) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : ffixVar, ffixVar2);
    }
}
