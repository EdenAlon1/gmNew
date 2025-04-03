package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zst {
    public final zvp a;
    public final boolean b;
    public final byyt c;
    public final aawt d;
    public final zwb e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final ffji l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final boolean u;

    public /* synthetic */ zst(zvp zvpVar, boolean z, byyt byytVar, aawt aawtVar, zwb zwbVar, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, ffji ffjiVar, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, int i) {
        byyt byytVar2 = (i & 4) != 0 ? byyt.UNARCHIVED : byytVar;
        aawt aawtVar2 = (i & 8) != 0 ? new aawt(null) : aawtVar;
        zwb zwbVar2 = (i & 16) != 0 ? null : zwbVar;
        boolean z13 = ((i & 32) == 0) & z2;
        boolean z14 = (!((i & 64) == 0)) | z3;
        boolean z15 = ((i & 128) == 0) & z4;
        boolean z16 = ((i & 256) == 0) & z5;
        boolean z17 = (i & 512) != 0;
        boolean z18 = ((i & 1024) == 0) & z6;
        ffji ffjiVar2 = (i & 2048) == 0 ? ffjiVar : null;
        boolean z19 = ((i & 4096) == 0) & z7;
        boolean z20 = ((i & 8192) == 0) & z8;
        boolean z21 = ((i & 16384) == 0) & z9;
        boolean z22 = (i & 32768) != 0;
        boolean z23 = (i & 65536) != 0;
        boolean z24 = ((i & 131072) == 0) & z10;
        boolean z25 = ((i & 262144) == 0) & z11;
        boolean z26 = (i & 524288) != 0;
        boolean z27 = (i & 1048576) == 0;
        zvpVar.getClass();
        byytVar2.getClass();
        aawtVar2.getClass();
        this.a = zvpVar;
        this.b = z;
        this.c = byytVar2;
        this.d = aawtVar2;
        this.e = zwbVar2;
        this.f = z13;
        this.g = z14;
        this.h = z15;
        this.i = z16;
        this.j = z17;
        this.k = z18;
        this.l = ffjiVar2;
        this.m = z19;
        this.n = z20;
        this.o = z21;
        this.p = z22;
        this.q = z23;
        this.r = z24;
        this.s = z25;
        this.t = z26;
        this.u = z27 & z12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zst)) {
            return false;
        }
        zst zstVar = (zst) obj;
        return ffkj.e(this.a, zstVar.a) && this.b == zstVar.b && this.c == zstVar.c && ffkj.e(this.d, zstVar.d) && ffkj.e(this.e, zstVar.e) && this.f == zstVar.f && this.g == zstVar.g && this.h == zstVar.h && this.i == zstVar.i && this.j == zstVar.j && this.k == zstVar.k && ffkj.e(this.l, zstVar.l) && this.m == zstVar.m && this.n == zstVar.n && this.o == zstVar.o && this.p == zstVar.p && this.q == zstVar.q && this.r == zstVar.r && this.s == zstVar.s && this.t == zstVar.t && this.u == zstVar.u;
    }

    public final int hashCode() {
        int hashCode = (((((this.a.hashCode() * 31) + zss.a(this.b)) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
        zwb zwbVar = this.e;
        int hashCode2 = ((((((((((((((hashCode * 31) + (zwbVar == null ? 0 : zwbVar.hashCode())) * 31) + zss.a(this.f)) * 31) + zss.a(this.g)) * 31) + zss.a(this.h)) * 31) + zss.a(this.i)) * 31) + zss.a(this.j)) * 31) + zss.a(this.k)) * 31;
        ffji ffjiVar = this.l;
        return ((((((((((((((((((hashCode2 + (ffjiVar != null ? ffjiVar.hashCode() : 0)) * 31) + zss.a(this.m)) * 31) + zss.a(this.n)) * 31) + zss.a(this.o)) * 31) + zss.a(this.p)) * 31) + zss.a(this.q)) * 31) + zss.a(this.r)) * 31) + zss.a(this.s)) * 31) + zss.a(this.t)) * 31) + zss.a(this.u);
    }

    public final String toString() {
        return "MessageBubbleArgs(messageWithMetadata=" + this.a + ", isGroupConversation=" + this.b + ", archiveStats=" + this.c + ", selectionData=" + this.d + ", searchData=" + this.e + ", canSwipeToReply=" + this.f + ", canLongPress=" + this.g + ", shouldShowSimName=" + this.h + ", shouldShowE2eeStatusChangeNotice=" + this.i + ", shouldShowSeparators=" + this.j + ", hasLastReadMarker=" + this.k + ", onReplySnippetClick=" + this.l + ", shouldCreateLazyUiData=" + this.m + ", isPenpalConversation=" + this.n + ", isScreenEffectTargetedMessageBubble=" + this.o + ", shouldShowMetatext=" + this.p + ", isInteractive=" + this.q + ", isSpatulaSettingsEnabled=" + this.r + ", isCenterAligned=" + this.s + ", shouldShowDeliveryStatus=" + this.t + ", hasSuggestionShortcut=" + this.u + ")";
    }
}
