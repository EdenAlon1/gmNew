package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmpj {
    public final dmms a;
    public final dmov b;
    public final dmnh c;
    public final dmpg d;
    public final float e;
    public final boolean f;
    public final dmpi g;

    public /* synthetic */ dmpj(dmms dmmsVar, dmov dmovVar, dmnh dmnhVar, dmpg dmpgVar, float f, boolean z, dmpi dmpiVar, int i) {
        dmpgVar = (i & 8) != 0 ? dmpg.a : dmpgVar;
        f = (i & 16) != 0 ? 1.0f : f;
        boolean z2 = (i & 32) == 0;
        dmpgVar.getClass();
        this.a = dmmsVar;
        this.b = dmovVar;
        this.c = dmnhVar;
        this.d = dmpgVar;
        this.e = f;
        this.f = z & z2;
        this.g = dmpiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmpj)) {
            return false;
        }
        dmpj dmpjVar = (dmpj) obj;
        return ffkj.e(this.a, dmpjVar.a) && ffkj.e(this.b, dmpjVar.b) && ffkj.e(this.c, dmpjVar.c) && this.d == dmpjVar.d && Float.compare(this.e, dmpjVar.e) == 0 && this.f == dmpjVar.f && ffkj.e(this.g, dmpjVar.g);
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        dmnh dmnhVar = this.c;
        return (((((((((hashCode * 31) + (dmnhVar == null ? 0 : dmnhVar.hashCode())) * 31) + this.d.hashCode()) * 31) + Float.floatToIntBits(this.e)) * 31) + (true != this.f ? 1237 : 1231)) * 31) + this.g.hashCode();
    }

    public final String toString() {
        return "ComposeRowUiData(draft=" + this.a + ", simSelector=" + this.b + ", inputs=" + this.c + ", backgroundStyle=" + this.d + ", backgroundAlpha=" + this.e + ", showEmotiveNotificationDot=" + this.f + ", flags=" + this.g + ")";
    }
}
