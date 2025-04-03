package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aamr implements zsu {
    public final appw a;
    public final boolean b;
    public final boolean c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final zwb l;
    public final alxz m;
    public final ffix n;
    public final ffix o;
    public final boolean p;
    public final byyt q;
    public final MessageId r;
    public final dnwi s;
    public final dofn t;
    public final boolean u;
    private final boolean v;
    private final String w;

    public /* synthetic */ aamr(appw appwVar, boolean z, boolean z2, String str, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, zwb zwbVar, alxz alxzVar, ffix ffixVar, ffix ffixVar2, boolean z11, byyt byytVar, MessageId messageId, dnwi dnwiVar, dofn dofnVar, boolean z12, int i) {
        ffix ffixVar3 = (i & 16384) != 0 ? new ffix() { // from class: aamp
            @Override // defpackage.ffix
            public final Object invoke() {
                return ffcu.a;
            }
        } : ffixVar;
        ffix ffixVar4 = (32768 & i) != 0 ? new ffix() { // from class: aamq
            @Override // defpackage.ffix
            public final Object invoke() {
                return ffcu.a;
            }
        } : ffixVar2;
        boolean z13 = ((65536 & i) == 0) & z11;
        byyt byytVar2 = (131072 & i) != 0 ? byyt.UNARCHIVED : byytVar;
        int i2 = i & 4096;
        boolean z14 = (i & 16) == 0;
        zwb zwbVar2 = i2 != 0 ? null : zwbVar;
        boolean z15 = z14 & z3;
        dnwi dnwiVar2 = (524288 & i) != 0 ? null : dnwiVar;
        String str2 = (1048576 & i) != 0 ? "" : null;
        dofn dofnVar2 = (2097152 & i) == 0 ? dofnVar : null;
        boolean z16 = (i & 4194304) == 0;
        ffixVar3.getClass();
        ffixVar4.getClass();
        byytVar2.getClass();
        str2.getClass();
        this.a = appwVar;
        this.b = z;
        this.c = z2;
        this.d = str;
        this.v = z15;
        this.e = z4;
        this.f = z5;
        this.g = z6;
        this.h = z7;
        this.i = z8;
        this.j = z9;
        this.k = z10;
        this.l = zwbVar2;
        this.m = alxzVar;
        this.n = ffixVar3;
        this.o = ffixVar4;
        this.p = z13;
        this.q = byytVar2;
        this.r = messageId;
        this.s = dnwiVar2;
        this.w = str2;
        this.t = dofnVar2;
        this.u = z16 & z12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aamr)) {
            return false;
        }
        aamr aamrVar = (aamr) obj;
        return ffkj.e(this.a, aamrVar.a) && this.b == aamrVar.b && this.c == aamrVar.c && ffkj.e(this.d, aamrVar.d) && this.v == aamrVar.v && this.e == aamrVar.e && this.f == aamrVar.f && this.g == aamrVar.g && this.h == aamrVar.h && this.i == aamrVar.i && this.j == aamrVar.j && this.k == aamrVar.k && ffkj.e(this.l, aamrVar.l) && ffkj.e(this.m, aamrVar.m) && ffkj.e(this.n, aamrVar.n) && ffkj.e(this.o, aamrVar.o) && this.p == aamrVar.p && this.q == aamrVar.q && ffkj.e(this.r, aamrVar.r) && ffkj.e(this.s, aamrVar.s) && ffkj.e(this.w, aamrVar.w) && ffkj.e(this.t, aamrVar.t) && this.u == aamrVar.u;
    }

    public final int hashCode() {
        int hashCode = (((((this.a.hashCode() * 31) + aamo.a(this.b)) * 31) + aamo.a(this.c)) * 31) + this.d.hashCode();
        zwb zwbVar = this.l;
        int hashCode2 = zwbVar == null ? 0 : zwbVar.hashCode();
        boolean z = this.v;
        boolean z2 = this.e;
        int a = ((hashCode * 31) + aamo.a(z)) * 31;
        boolean z3 = this.f;
        int a2 = (a + aamo.a(z2)) * 31;
        boolean z4 = this.g;
        int a3 = (a2 + aamo.a(z3)) * 31;
        boolean z5 = this.h;
        int a4 = (a3 + aamo.a(z4)) * 31;
        boolean z6 = this.i;
        int a5 = (((((((((a4 + aamo.a(z5)) * 31) + aamo.a(z6)) * 31) + aamo.a(this.j)) * 31) + aamo.a(this.k)) * 31) + hashCode2) * 31;
        alxz alxzVar = this.m;
        int hashCode3 = (((((((((((a5 + (alxzVar == null ? 0 : alxzVar.hashCode())) * 31) + this.n.hashCode()) * 31) + this.o.hashCode()) * 31) + aamo.a(this.p)) * 31) + this.q.hashCode()) * 31) + this.r.hashCode()) * 31;
        dnwi dnwiVar = this.s;
        int hashCode4 = (((hashCode3 + (dnwiVar == null ? 0 : dnwiVar.hashCode())) * 31) + this.w.hashCode()) * 31;
        dofn dofnVar = this.t;
        return ((hashCode4 + (dofnVar != null ? dofnVar.hashCode() : 0)) * 31) + aamo.a(this.u);
    }

    public final String toString() {
        return "TextBubbleArgs(content=" + this.a + ", isHighlighted=" + this.b + ", isOutgoing=" + this.c + ", contentDescription=" + this.d + ", isGroupConversation=" + this.v + ", isRichType=" + this.e + ", isScheduled=" + this.f + ", isContact=" + this.g + ", isSpamRecipient=" + this.h + ", isUserMarkedNotSpamRecipient=" + this.i + ", isBusinessRecipient=" + this.j + ", isBusinessRecipientVerified=" + this.k + ", searchData=" + this.l + ", preview=" + this.m + ", onTapToLoadLinkPreview=" + this.n + ", onAnimatedEmojiShown=" + this.o + ", isReply=" + this.p + ", archiveStatus=" + this.q + ", messageId=" + this.r + ", statusUiData=" + this.s + ", readReceiptsTestTag=" + this.w + ", messageReplySnippetUiData=" + this.t + ", hasSuggestionShortcut=" + this.u + ")";
    }
}
