package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abfn implements dmfn {
    public final ffix a;
    public final ffix b;
    public final ffix c;
    public final ffix d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final String i;
    public final boolean j;
    public final boolean k;
    private final ffix l;
    private final boolean m = true;

    public abfn(ffix ffixVar, ffix ffixVar2, ffix ffixVar3, ffix ffixVar4, ffix ffixVar5, boolean z, boolean z2, boolean z3, boolean z4, String str, boolean z5, boolean z6) {
        this.l = ffixVar;
        this.a = ffixVar2;
        this.b = ffixVar3;
        this.c = ffixVar4;
        this.d = ffixVar5;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.i = str;
        this.j = z5;
        this.k = z6;
    }

    @Override // defpackage.dmfn
    public final /* bridge */ /* synthetic */ dmfn a(ffix ffixVar) {
        return new abfn(ffixVar, this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k);
    }

    @Override // defpackage.dmfn
    public final ffix b() {
        return this.l;
    }

    @Override // defpackage.dmfn
    public final boolean c() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof abfn)) {
            return false;
        }
        abfn abfnVar = (abfn) obj;
        if (!ffkj.e(this.l, abfnVar.l)) {
            return false;
        }
        boolean z = abfnVar.m;
        return ffkj.e(this.a, abfnVar.a) && ffkj.e(this.b, abfnVar.b) && ffkj.e(this.c, abfnVar.c) && ffkj.e(this.d, abfnVar.d) && this.e == abfnVar.e && this.f == abfnVar.f && this.g == abfnVar.g && this.h == abfnVar.h && ffkj.e(this.i, abfnVar.i) && this.j == abfnVar.j && this.k == abfnVar.k;
    }

    public final int hashCode() {
        int hashCode = this.l.hashCode() * 31;
        ffix ffixVar = this.a;
        int a = (((hashCode + abfm.a(true)) * 31) + (ffixVar == null ? 0 : ffixVar.hashCode())) * 31;
        ffix ffixVar2 = this.b;
        int hashCode2 = (a + (ffixVar2 == null ? 0 : ffixVar2.hashCode())) * 31;
        ffix ffixVar3 = this.c;
        int hashCode3 = (hashCode2 + (ffixVar3 == null ? 0 : ffixVar3.hashCode())) * 31;
        ffix ffixVar4 = this.d;
        int hashCode4 = (((((((((hashCode3 + (ffixVar4 == null ? 0 : ffixVar4.hashCode())) * 31) + abfm.a(this.e)) * 31) + abfm.a(this.f)) * 31) + abfm.a(this.g)) * 31) + abfm.a(this.h)) * 31;
        String str = this.i;
        return ((((hashCode4 + (str != null ? str.hashCode() : 0)) * 31) + abfm.a(this.j)) * 31) + abfm.a(this.k);
    }

    public final String toString() {
        return "MessageActionsUiData(onDismiss=" + this.l + ", includeScrim=true, onOpenSettings=" + this.a + ", onResend=" + this.b + ", onResendAsFallback=" + this.c + ", onDelete=" + this.d + ", isRcs=" + this.e + ", isEncrypted=" + this.f + ", isSending=" + this.g + ", isSent=" + this.h + ", recipientDisplayName=" + this.i + ", hasSendingConnection=" + this.j + ", hasDataConnection=" + this.k + ")";
    }
}
