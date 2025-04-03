package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjnj {
    public final axad a;
    public final awui b;
    public final Instant c;
    public final avkl d;
    public final cjlu e;
    public final fayv f;
    public final bdhg g;
    public final awzn h;
    public final bdhg i;
    public final boolean j;
    public final cfmh k;
    public final awul l;
    public final ConversationIdType m;
    public final awzd n;
    public final ckdq o;

    public cjnj(axad axadVar, awui awuiVar, Instant instant, avkl avklVar, cjlu cjluVar, fayv fayvVar, bdhg bdhgVar, awzn awznVar, bdhg bdhgVar2, boolean z, cfmh cfmhVar, awul awulVar, ConversationIdType conversationIdType, awzd awzdVar, ckdq ckdqVar) {
        awuiVar.getClass();
        instant.getClass();
        fayvVar.getClass();
        awznVar.getClass();
        cfmhVar.getClass();
        this.a = axadVar;
        this.b = awuiVar;
        this.c = instant;
        this.d = avklVar;
        this.e = cjluVar;
        this.f = fayvVar;
        this.g = bdhgVar;
        this.h = awznVar;
        this.i = bdhgVar2;
        this.j = z;
        this.k = cfmhVar;
        this.l = awulVar;
        this.m = conversationIdType;
        this.n = awzdVar;
        this.o = ckdqVar;
        String str = axadVar.c;
        str.getClass();
        if (str.length() <= 0) {
            throw new IllegalStateException("Check failed.");
        }
        int i = awuiVar.c;
        awuh b = awuh.b(i);
        b = b == null ? awuh.UNKNOWN_TYPE : b;
        awuh awuhVar = awuh.UNKNOWN_TYPE;
        if (b == awuhVar) {
            throw new IllegalStateException("Check failed.");
        }
        awuh b2 = awuh.b(i);
        if ((b2 == null ? awuhVar : b2) == awuh.GROUP) {
            throw new IllegalStateException("Check failed.");
        }
        awuh b3 = awuh.b(i);
        if ((b3 != null ? b3 : awuhVar) == awuh.BOT) {
            throw new IllegalStateException("Check failed.");
        }
        String str2 = awuiVar.d;
        str2.getClass();
        if (str2.length() <= 0) {
            throw new IllegalStateException("Check failed.");
        }
        if (avklVar != null) {
            if (!avklVar.d()) {
                String str3 = avklVar.a().d;
                str3.getClass();
                if (str3.length() <= 0) {
                    throw new IllegalStateException("Check failed.");
                }
            } else if ((avklVar.b().b & 1) == 0) {
                throw new IllegalStateException("Check failed.");
            }
        }
        if (ffkj.e(bdhgVar, bdhg.a)) {
            throw new IllegalStateException("Check failed.");
        }
        if (augy.a()) {
            if (awznVar != awzn.DELIVERY && awznVar != awzn.DISPLAYED && awznVar != awzn.DELIVERY_FAILED) {
                throw new IllegalStateException("Check failed.");
            }
        } else if (awznVar != awzn.DELIVERY && awznVar != awzn.DISPLAYED) {
            throw new IllegalStateException("Check failed.");
        }
        if (ffkj.e(bdhgVar2, bdhg.a)) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public static /* synthetic */ cjnj a(cjnj cjnjVar, fayv fayvVar, awul awulVar, awzd awzdVar, ckdq ckdqVar, int i) {
        axad axadVar = (i & 1) != 0 ? cjnjVar.a : null;
        awui awuiVar = (i & 2) != 0 ? cjnjVar.b : null;
        Instant instant = (i & 4) != 0 ? cjnjVar.c : null;
        avkl avklVar = (i & 8) != 0 ? cjnjVar.d : null;
        cjlu cjluVar = (i & 16) != 0 ? cjnjVar.e : null;
        fayv fayvVar2 = (i & 32) != 0 ? cjnjVar.f : fayvVar;
        bdhg bdhgVar = (i & 64) != 0 ? cjnjVar.g : null;
        awzn awznVar = (i & 128) != 0 ? cjnjVar.h : null;
        bdhg bdhgVar2 = (i & 256) != 0 ? cjnjVar.i : null;
        boolean z = (i & 512) != 0 ? cjnjVar.j : false;
        cfmh cfmhVar = (i & 1024) != 0 ? cjnjVar.k : null;
        awul awulVar2 = (i & 2048) != 0 ? cjnjVar.l : awulVar;
        ConversationIdType conversationIdType = (i & 4096) != 0 ? cjnjVar.m : null;
        awzd awzdVar2 = (i & 8192) != 0 ? cjnjVar.n : awzdVar;
        ckdq ckdqVar2 = (i & 16384) != 0 ? cjnjVar.o : ckdqVar;
        axadVar.getClass();
        awuiVar.getClass();
        instant.getClass();
        fayvVar2.getClass();
        bdhgVar.getClass();
        awznVar.getClass();
        bdhgVar2.getClass();
        cfmhVar.getClass();
        conversationIdType.getClass();
        return new cjnj(axadVar, awuiVar, instant, avklVar, cjluVar, fayvVar2, bdhgVar, awznVar, bdhgVar2, z, cfmhVar, awulVar2, conversationIdType, awzdVar2, ckdqVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cjnj)) {
            return false;
        }
        cjnj cjnjVar = (cjnj) obj;
        return ffkj.e(this.a, cjnjVar.a) && ffkj.e(this.b, cjnjVar.b) && ffkj.e(this.c, cjnjVar.c) && ffkj.e(this.d, cjnjVar.d) && ffkj.e(this.e, cjnjVar.e) && ffkj.e(this.f, cjnjVar.f) && ffkj.e(this.g, cjnjVar.g) && this.h == cjnjVar.h && ffkj.e(this.i, cjnjVar.i) && this.j == cjnjVar.j && ffkj.e(this.k, cjnjVar.k) && ffkj.e(this.l, cjnjVar.l) && ffkj.e(this.m, cjnjVar.m) && ffkj.e(this.n, cjnjVar.n) && ffkj.e(this.o, cjnjVar.o);
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        avkl avklVar = this.d;
        int hashCode2 = ((hashCode * 31) + (avklVar == null ? 0 : avklVar.hashCode())) * 31;
        cjlu cjluVar = this.e;
        int hashCode3 = (((((((((((((hashCode2 + (cjluVar == null ? 0 : cjluVar.hashCode())) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + (true != this.j ? 1237 : 1231)) * 31) + this.k.hashCode()) * 31;
        awul awulVar = this.l;
        int hashCode4 = (((hashCode3 + (awulVar == null ? 0 : awulVar.hashCode())) * 31) + this.m.hashCode()) * 31;
        awzd awzdVar = this.n;
        int hashCode5 = (hashCode4 + (awzdVar == null ? 0 : awzdVar.hashCode())) * 31;
        ckdq ckdqVar = this.o;
        return hashCode5 + (ckdqVar != null ? ckdqVar.hashCode() : 0);
    }

    public final String toString() {
        return "SendRcsReportData(traceId=" + this.a + ", self=" + this.b + ", sentTimestamp=" + this.c + ", destination=" + this.d + ", destinationTokens=" + this.e + ", customHeaders=" + this.f + ", receivedMessageId=" + this.g + ", receiptType=" + this.h + ", reportId=" + this.i + ", encrypted=" + this.j + ", encryptionProtocol=" + this.k + ", serializedContent=" + this.l + ", bugleConversationId=" + this.m + ", result=" + this.n + ", resultAndDiagnostics=" + this.o + ")";
    }
}
