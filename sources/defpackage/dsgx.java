package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsgx {
    public final dtac a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    private final boolean e;
    private final boolean f;

    public dsgx() {
        this(null, false, 63);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dsgx)) {
            return false;
        }
        dsgx dsgxVar = (dsgx) obj;
        if (!ffkj.e(this.a, dsgxVar.a)) {
            return false;
        }
        boolean z = dsgxVar.e;
        if (this.b != dsgxVar.b || this.c != dsgxVar.c) {
            return false;
        }
        boolean z2 = dsgxVar.f;
        return this.d == dsgxVar.d;
    }

    public final int hashCode() {
        dtac dtacVar = this.a;
        return ((((((((((dtacVar == null ? 0 : dtacVar.hashCode()) * 31) + dsgw.a(false)) * 31) + dsgw.a(this.b)) * 31) + dsgw.a(this.c)) * 31) + dsgw.a(false)) * 31) + dsgw.a(this.d);
    }

    public final String toString() {
        return "HugoHostFragmentConfiguration(hugoScreenStateListener=" + this.a + ", enableOverrideScreenConfigurationOnScreenOpen=false, reopenOpenScreenOnRestore=" + this.b + ", useProvidedDraftController=" + this.c + ", closeKeyboardAndInputOnClose=false, updateInputDisplayWhenOpeningShortcutDirectly=" + this.d + ")";
    }

    public /* synthetic */ dsgx(dtac dtacVar, boolean z, int i) {
        this.a = 1 == (i & 1) ? null : dtacVar;
        this.e = false;
        this.b = (i & 4) != 0;
        this.c = (i & 8) != 0;
        this.f = false;
        this.d = (!((i & 32) == 0)) | z;
    }
}
