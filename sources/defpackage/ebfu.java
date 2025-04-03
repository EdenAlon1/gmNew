package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ebfu extends ebfw {
    public final boolean a;

    public ebfu(boolean z) {
        this.a = z;
    }

    @Override // defpackage.ebfw
    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ebfw) {
            ebfw ebfwVar = (ebfw) obj;
            if (this.a == ebfwVar.a()) {
                ebfwVar.b();
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ 1237;
    }

    public final String toString() {
        return "Configuration{showSwitchProfileAction=" + this.a + ", disableDecorationFeatures=false}";
    }

    @Override // defpackage.ebfw
    public final void b() {
    }
}
