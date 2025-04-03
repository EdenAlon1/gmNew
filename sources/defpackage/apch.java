package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apch implements alxr, apco {
    private final MessageId a;
    private final ConversationId b;
    private final appj c;
    private final String d;
    private final alya e;
    private final Instant f;
    private final Long g;
    private final boolean h;
    private final boolean i;
    private final boolean j;
    private final alxz k;
    private final apyd l;
    private final aqge m;
    private final Instant n;
    private final aqcm o;
    private final alyu p;
    private final fjay q;
    private final int r;
    private final alxq s;
    private final String t;
    private final apxv u;
    private final aorg v;
    private final int w;
    private final int x;

    public /* synthetic */ apch(MessageId messageId, ConversationId conversationId, appj appjVar, String str, alya alyaVar, Instant instant, Long l, boolean z, alyu alyuVar, fjay fjayVar, int i, aorg aorgVar, int i2) {
        aqgf aqgfVar = new aqgf(0);
        Instant instant2 = Instant.EPOCH;
        instant2.getClass();
        this.a = messageId;
        this.b = conversationId;
        this.c = appjVar;
        this.d = (i2 & 8) != 0 ? null : str;
        this.e = alyaVar;
        this.f = instant;
        this.g = (i2 & 64) != 0 ? null : l;
        this.h = false;
        this.i = z;
        this.j = false;
        this.w = 1;
        this.k = null;
        this.l = null;
        this.m = aqgfVar;
        this.u = null;
        this.x = 1;
        this.n = instant2;
        this.o = null;
        this.p = alyuVar;
        this.q = fjayVar;
        this.r = i;
        this.v = aorgVar;
        alxq a = apvq.a(i);
        a.getClass();
        this.s = a;
        this.t = MessageData.aq(i);
    }

    @Override // defpackage.alxr
    public final apxv A() {
        return null;
    }

    @Override // defpackage.alxr
    public final int B() {
        return 1;
    }

    @Override // defpackage.alxr
    public final int C() {
        return 1;
    }

    @Override // defpackage.apco
    public final int D() {
        return this.r;
    }

    @Override // defpackage.apco
    public final fjay F() {
        return this.q;
    }

    @Override // defpackage.alxr
    public final alxq a() {
        return this.s;
    }

    @Override // defpackage.alxr
    public final /* synthetic */ MessageId b() {
        return this.a;
    }

    @Override // defpackage.alxr
    public final alxz c() {
        return null;
    }

    @Override // defpackage.alxr
    public final alya d() {
        return this.e;
    }

    @Override // defpackage.alxr
    public final alyu e() {
        return this.p;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof apch)) {
            return false;
        }
        apch apchVar = (apch) obj;
        if (!ffkj.e(this.a, apchVar.a) || !ffkj.e(this.b, apchVar.b) || !ffkj.e(this.c, apchVar.c) || !ffkj.e(this.d, apchVar.d) || !ffkj.e(this.e, apchVar.e) || !ffkj.e(this.f, apchVar.f) || !ffkj.e(this.g, apchVar.g)) {
            return false;
        }
        boolean z = apchVar.h;
        if (this.i != apchVar.i) {
            return false;
        }
        boolean z2 = apchVar.j;
        int i = apchVar.w;
        alxz alxzVar = apchVar.k;
        if (!ffkj.e(null, null)) {
            return false;
        }
        apyd apydVar = apchVar.l;
        if (!ffkj.e(null, null) || !ffkj.e(this.m, apchVar.m)) {
            return false;
        }
        apxv apxvVar = apchVar.u;
        if (!ffkj.e(null, null)) {
            return false;
        }
        int i2 = apchVar.x;
        if (!ffkj.e(this.n, apchVar.n)) {
            return false;
        }
        aqcm aqcmVar = apchVar.o;
        return ffkj.e(null, null) && ffkj.e(this.p, apchVar.p) && ffkj.e(this.q, apchVar.q) && this.r == apchVar.r && ffkj.e(this.v, apchVar.v);
    }

    @Override // defpackage.alxr
    public final ConversationId f() {
        return this.b;
    }

    @Override // defpackage.alxr
    public final /* synthetic */ appj g() {
        return this.c;
    }

    @Override // defpackage.alxr
    public final /* synthetic */ appu h() {
        return null;
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        String str = this.d;
        int hashCode2 = ((((((hashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31;
        Long l = this.g;
        int hashCode3 = ((((((((((hashCode2 + (l == null ? 0 : l.hashCode())) * 31) + apcg.a(false)) * 31) + apcg.a(this.i)) * 31) + apcg.a(false)) * 31) + 1) * 29791) + this.m.hashCode();
        apeo.a(1);
        int hashCode4 = (((hashCode3 * 961) + 1) * 31) + this.n.hashCode();
        alyu alyuVar = this.p;
        int hashCode5 = ((hashCode4 * 961) + (alyuVar == null ? 0 : alyuVar.hashCode())) * 31;
        fjay fjayVar = this.q;
        return ((((hashCode5 + (fjayVar != null ? fjayVar.hashCode() : 0)) * 31) + this.r) * 31) + this.v.hashCode();
    }

    @Override // defpackage.alxr
    public final apyd i() {
        return null;
    }

    @Override // defpackage.alxr
    public final aqcm j() {
        return null;
    }

    @Override // defpackage.alxr
    public final aqge k(int i) {
        int i2 = engw.d;
        return new aqgf(enou.a);
    }

    @Override // defpackage.alxr
    public final aqge l() {
        return this.m;
    }

    @Override // defpackage.alxr
    public final elfl m() {
        elfl e = elfo.e("Message details not available for this message");
        e.getClass();
        return e;
    }

    @Override // defpackage.alxr
    public final Instant n() {
        return this.f;
    }

    @Override // defpackage.alxr
    public final Instant o() {
        return this.n;
    }

    @Override // defpackage.alxr
    public final Long p() {
        return this.g;
    }

    @Override // defpackage.alxr
    public final String q() {
        return this.d;
    }

    @Override // defpackage.alxr
    public final String r() {
        return this.t;
    }

    @Override // defpackage.alxr
    public final boolean s(aqux aquxVar) {
        return false;
    }

    @Override // defpackage.alxr
    public final boolean t() {
        return aorg.a(this);
    }

    public final String toString() {
        return "TemporaryMessage(id=" + this.a + ", conversationId=" + this.b + ", content=" + this.c + ", caption=" + this.d + ", provenance=" + this.e + ", receivedTimestamp=" + this.f + ", analyticsStableId=" + this.g + ", isStarred=false, isEncrypted=" + this.i + ", isRead=false, interactability=NONE, preview=null, reactions=null, replyCount=" + this.m + ", editStatus=null, category=NORMAL, sentTimestamp=" + this.n + ", status=null, repliedTo=" + this.p + ", traceId=" + this.q + ", protocol=" + this.r + ", canForwardMessageUtil=" + this.v + ")";
    }

    @Override // defpackage.alxr
    public final boolean u(aqux aquxVar) {
        return false;
    }

    @Override // defpackage.alxr
    public final boolean v() {
        return this.i;
    }

    @Override // defpackage.alxr
    public final /* synthetic */ boolean w() {
        return false;
    }

    @Override // defpackage.alxr
    public final boolean x() {
        return false;
    }

    @Override // defpackage.alxr
    public final boolean y() {
        return false;
    }

    @Override // defpackage.alxr
    public final /* synthetic */ aqdr z() {
        return null;
    }
}
