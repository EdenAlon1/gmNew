package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmof {
    public final dmzz a;
    public final ffix b;
    public final ffix c;
    public final String d;
    public final String e;
    public final boolean f;
    public final dmoe g;

    public dmof(dmzz dmzzVar, ffix ffixVar, ffix ffixVar2, String str, String str2, boolean z, dmoe dmoeVar) {
        dmzzVar.getClass();
        ffixVar2.getClass();
        dmoeVar.getClass();
        this.a = dmzzVar;
        this.b = ffixVar;
        this.c = ffixVar2;
        this.d = str;
        this.e = str2;
        this.f = z;
        this.g = dmoeVar;
    }

    public static /* synthetic */ dmof a(dmof dmofVar, dmzz dmzzVar, ffix ffixVar, ffix ffixVar2, String str, String str2, boolean z, dmoe dmoeVar, int i) {
        if ((i & 1) != 0) {
            dmzzVar = dmofVar.a;
        }
        dmzz dmzzVar2 = dmzzVar;
        if ((i & 2) != 0) {
            ffixVar = dmofVar.b;
        }
        ffix ffixVar3 = ffixVar;
        if ((i & 4) != 0) {
            ffixVar2 = dmofVar.c;
        }
        ffix ffixVar4 = ffixVar2;
        if ((i & 8) != 0) {
            str = dmofVar.d;
        }
        String str3 = str;
        if ((i & 16) != 0) {
            str2 = dmofVar.e;
        }
        String str4 = str2;
        if ((i & 32) != 0) {
            z = dmofVar.f;
        }
        boolean z2 = z;
        if ((i & 64) != 0) {
            dmoeVar = dmofVar.g;
        }
        dmoe dmoeVar2 = dmoeVar;
        dmzzVar2.getClass();
        ffixVar3.getClass();
        ffixVar4.getClass();
        dmoeVar2.getClass();
        return new dmof(dmzzVar2, ffixVar3, ffixVar4, str3, str4, z2, dmoeVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmof)) {
            return false;
        }
        dmof dmofVar = (dmof) obj;
        return this.a == dmofVar.a && ffkj.e(this.b, dmofVar.b) && ffkj.e(this.c, dmofVar.c) && ffkj.e(this.d, dmofVar.d) && ffkj.e(this.e, dmofVar.e) && this.f == dmofVar.f && ffkj.e(this.g, dmofVar.g);
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        String str = this.d;
        int hashCode2 = ((hashCode * 31) + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return ((((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + (true != this.f ? 1237 : 1231)) * 31) + this.g.hashCode();
    }

    public final String toString() {
        return "ComposeRowSendButtonUiData(icon=" + this.a + ", onSend=" + this.b + ", onScheduledSend=" + this.c + ", contentDescription=" + this.d + ", iconBottomLabel=" + this.e + ", enabled=" + this.f + ", flags=" + this.g + ")";
    }

    public /* synthetic */ dmof(dmzz dmzzVar, ffix ffixVar, ffix ffixVar2, String str, boolean z, dmoe dmoeVar, int i) {
        this(dmzzVar, ffixVar, (i & 4) != 0 ? new ffix() { // from class: dmoc
            @Override // defpackage.ffix
            public final Object invoke() {
                return ffcu.a;
            }
        } : ffixVar2, (i & 8) != 0 ? null : str, (String) null, (!((i & 32) == 0)) | z, (i & 64) != 0 ? new dmoe(3) : dmoeVar);
    }
}
