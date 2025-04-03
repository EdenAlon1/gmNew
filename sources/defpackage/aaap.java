package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaap {
    public final alxr a;
    public final appj b;
    public final boolean c;
    public final zwb d;
    public final boolean e;
    public final byyt f;
    public final dnor g;
    public final String h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;

    public aaap(alxr alxrVar, appj appjVar, boolean z, zwb zwbVar, boolean z2, byyt byytVar, dnor dnorVar, String str, boolean z3, boolean z4, boolean z5, boolean z6) {
        alxrVar.getClass();
        dnorVar.getClass();
        this.a = alxrVar;
        this.b = appjVar;
        this.c = z;
        this.d = zwbVar;
        this.e = z2;
        this.f = byytVar;
        this.g = dnorVar;
        this.h = str;
        this.i = z3;
        this.j = z4;
        this.k = z5;
        this.l = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aaap)) {
            return false;
        }
        aaap aaapVar = (aaap) obj;
        return ffkj.e(this.a, aaapVar.a) && ffkj.e(this.b, aaapVar.b) && this.c == aaapVar.c && ffkj.e(this.d, aaapVar.d) && this.e == aaapVar.e && this.f == aaapVar.f && this.g == aaapVar.g && ffkj.e(this.h, aaapVar.h) && this.i == aaapVar.i && this.j == aaapVar.j && this.k == aaapVar.k && this.l == aaapVar.l;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        zwb zwbVar = this.d;
        return (((((((((((((((((((hashCode * 31) + aaao.a(this.c)) * 31) + (zwbVar == null ? 0 : zwbVar.hashCode())) * 31) + aaao.a(this.e)) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + aaao.a(this.i)) * 31) + aaao.a(this.j)) * 31) + aaao.a(this.k)) * 31) + aaao.a(this.l);
    }

    public final String toString() {
        return "MessageBubbleContentArgs(message=" + this.a + ", content=" + this.b + ", isHighlighted=" + this.c + ", searchData=" + this.d + ", isGroupConversation=" + this.e + ", archiveStatus=" + this.f + ", horizontalAlignment=" + this.g + ", contentDescription=" + this.h + ", hasBottomSheetAction=" + this.i + ", isSpatulaSettingsEnabled=" + this.j + ", shouldShowDeliveryStatus=" + this.k + ", hasSuggestionShortcut=" + this.l + ")";
    }

    public /* synthetic */ aaap(alxr alxrVar, appj appjVar, boolean z, zwb zwbVar, boolean z2, byyt byytVar, dnor dnorVar, String str) {
        this(alxrVar, appjVar, z, zwbVar, z2, byytVar, dnorVar, str, false, false, true, false);
    }
}
