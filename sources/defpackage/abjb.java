package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abjb implements dmfn {
    public final String a;
    public final ffix b;
    public final ffix c;

    public abjb(String str, ffix ffixVar, ffix ffixVar2) {
        this.a = str;
        this.b = ffixVar;
        this.c = ffixVar2;
    }

    @Override // defpackage.dmfn
    public final dmfn a(ffix ffixVar) {
        return new abjb(this.a, ffixVar, this.c);
    }

    @Override // defpackage.dmfn
    public final ffix b() {
        return this.b;
    }

    @Override // defpackage.dmfn
    public final boolean c() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof abjb)) {
            return false;
        }
        abjb abjbVar = (abjb) obj;
        return ffkj.e(this.a, abjbVar.a) && ffkj.e(this.b, abjbVar.b) && ffkj.e(this.c, abjbVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "DuoKitInviteLinkQuestionUiData(recipientDisplayName=" + this.a + ", onDismiss=" + this.b + ", onSendInvite=" + this.c + ")";
    }
}
