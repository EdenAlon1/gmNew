package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abjf implements dmfn {
    public final ffix a;
    public final ffix b;

    public abjf(ffix ffixVar, ffix ffixVar2) {
        this.a = ffixVar;
        this.b = ffixVar2;
    }

    @Override // defpackage.dmfn
    public final dmfn a(ffix ffixVar) {
        return new abjf(ffixVar, this.b);
    }

    @Override // defpackage.dmfn
    public final ffix b() {
        return this.a;
    }

    @Override // defpackage.dmfn
    public final boolean c() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof abjf)) {
            return false;
        }
        abjf abjfVar = (abjf) obj;
        return ffkj.e(this.a, abjfVar.a) && ffkj.e(this.b, abjfVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "DuoKitStartSetupQuestionUiData(onDismiss=" + this.a + ", onStartSetup=" + this.b + ")";
    }
}
