package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmng {
    public final dmrq a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public dmng() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmng)) {
            return false;
        }
        dmng dmngVar = (dmng) obj;
        return this.a == dmngVar.a && this.b == dmngVar.b && this.c == dmngVar.c && this.d == dmngVar.d;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        boolean z = this.d;
        return ((((hashCode + dmnf.a(this.b)) * 31) + dmnf.a(this.c)) * 31) + dmnf.a(z);
    }

    public final String toString() {
        return "Flags(voiceButtonBackground=" + this.a + ", hideGalleryButtonOnFocus=" + this.b + ", animateInputButtonStateChanges=" + this.c + ", enableOnDisabledClickBehavior=" + this.d + ")";
    }

    public dmng(dmrq dmrqVar, boolean z, boolean z2, boolean z3) {
        dmrqVar.getClass();
        this.a = dmrqVar;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    public /* synthetic */ dmng(byte[] bArr) {
        this(dmrq.VOICE_BUTTON_BACKGROUND_DEFAULT, false, false, false);
    }
}
