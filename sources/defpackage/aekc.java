package defpackage;

import android.net.Uri;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.label.data.classification.SuperSortLabel;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Optional;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aekc extends aekh {
    public axcl A;
    public Optional B = Optional.empty();
    private byyt C;
    private int D;
    private boolean E;
    private ConversationIdType F;
    private emyl G;
    private boolean H;
    private ckte I;
    private boolean J;
    private int K;
    private int L;
    private int M;
    private long N;
    private boolean O;
    private long P;
    private long Q;
    private boolean R;
    private boolean S;
    private int T;
    private int U;
    private long V;
    private int W;
    private int X;
    private long Y;
    private SuperSortLabel Z;
    public String a;
    private boolean aa;
    private int ab;
    private boolean ac;
    private int ad;
    private boolean ae;
    private int af;
    private amny ag;
    private boolean ah;
    private int ai;
    public String b;
    public ardn c;
    public String d;
    public String e;
    public Uri f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public MessageIdType l;
    public String m;
    public String n;
    public String o;
    public String p;
    public String q;
    public String r;
    public String s;
    public String t;
    public Uri u;
    public String v;
    public String w;
    public String x;
    public Function y;
    public fbwv z;

    @Override // defpackage.aekh
    public final void A(int i) {
        this.U = i;
        this.ai |= 16384;
    }

    @Override // defpackage.aekh
    public final void B(long j) {
        this.V = j;
        this.ai |= 32768;
    }

    @Override // defpackage.aekh
    public final void C(int i) {
        this.ab = i;
        this.ai |= 1048576;
    }

    @Override // defpackage.aekh
    public final void D(int i) {
        this.W = i;
        this.ai |= 65536;
    }

    @Override // defpackage.aekh
    public final void E(int i) {
        this.X = i;
        this.ai |= 131072;
    }

    @Override // defpackage.aekh
    public final void F(long j) {
        this.Y = j;
        this.ai |= 262144;
    }

    @Override // defpackage.aekh
    public final void G(int i) {
        this.ad = i;
        this.ai |= 4194304;
    }

    @Override // defpackage.aekh
    public final aeki a() {
        byyt byytVar;
        ConversationIdType conversationIdType;
        emyl emylVar;
        MessageIdType messageIdType;
        ckte ckteVar;
        Function function;
        SuperSortLabel superSortLabel;
        amny amnyVar;
        if (this.ai == 67108863 && (byytVar = this.C) != null && (conversationIdType = this.F) != null && (emylVar = this.G) != null && (messageIdType = this.l) != null && (ckteVar = this.I) != null && (function = this.y) != null && (superSortLabel = this.Z) != null && (amnyVar = this.ag) != null) {
            return new aekd(byytVar, this.a, this.b, this.c, this.D, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.E, conversationIdType, emylVar, this.k, messageIdType, this.H, this.m, ckteVar, this.n, this.o, this.p, this.J, this.K, this.q, this.r, this.s, this.t, this.u, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, this.S, this.T, this.v, this.U, this.w, this.V, this.W, this.X, this.x, this.Y, function, superSortLabel, this.aa, this.ab, this.z, this.A, this.B, this.ac, this.ad, this.ae, this.af, amnyVar, this.ah);
        }
        StringBuilder sb = new StringBuilder();
        if (this.C == null) {
            sb.append(" archiveStatus");
        }
        if ((this.ai & 1) == 0) {
            sb.append(" conversationType");
        }
        if ((this.ai & 2) == 0) {
            sb.append(" hasRbmBotRecipient");
        }
        if (this.F == null) {
            sb.append(" id_conversations");
        }
        if (this.G == null) {
            sb.append(" mapiConversationId");
        }
        if (this.l == null) {
            sb.append(" id_messages");
        }
        if ((this.ai & 4) == 0) {
            sb.append(" isEnterprise");
        }
        if (this.I == null) {
            sb.append(" groupUpgradeStatus");
        }
        if ((this.ai & 8) == 0) {
            sb.append(" notificationEnabled");
        }
        if ((this.ai & 16) == 0) {
            sb.append(" participantCount");
        }
        if ((this.ai & 32) == 0) {
            sb.append(" protocol");
        }
        if ((this.ai & 64) == 0) {
            sb.append(" rawTelephonyStatus");
        }
        if ((this.ai & 128) == 0) {
            sb.append(" rcsSessionId");
        }
        if ((this.ai & 256) == 0) {
            sb.append(" read");
        }
        if ((this.ai & 512) == 0) {
            sb.append(" receivedTimestamp");
        }
        if ((this.ai & 1024) == 0) {
            sb.append(" sentTimestamp");
        }
        if ((this.ai & 2048) == 0) {
            sb.append(" rcsSessionAllowsRevocation");
        }
        if ((this.ai & 4096) == 0) {
            sb.append(" showDraft");
        }
        if ((this.ai & 8192) == 0) {
            sb.append(" smsErrorCode");
        }
        if ((this.ai & 16384) == 0) {
            sb.append(" smsPriority");
        }
        if ((this.ai & 32768) == 0) {
            sb.append(" sortTimestamp");
        }
        if ((this.ai & 65536) == 0) {
            sb.append(" status");
        }
        if ((this.ai & 131072) == 0) {
            sb.append(" subId");
        }
        if ((this.ai & 262144) == 0) {
            sb.append(" triggerTime");
        }
        if (this.y == null) {
            sb.append(" getExpressionValueFunction");
        }
        if (this.Z == null) {
            sb.append(" label");
        }
        if ((this.ai & 524288) == 0) {
            sb.append(" pinStatus");
        }
        if ((this.ai & 1048576) == 0) {
            sb.append(" sourceType");
        }
        if ((this.ai & 2097152) == 0) {
            sb.append(" markedAsUnread");
        }
        if ((this.ai & 4194304) == 0) {
            sb.append(" unreadMessagesCount");
        }
        if ((this.ai & VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT) == 0) {
            sb.append(" hasMatrixParticipants");
        }
        if ((this.ai & 16777216) == 0) {
            sb.append(" joinState");
        }
        if (this.ag == null) {
            sb.append(" parentalApprovalStatus");
        }
        if ((this.ai & VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING) == 0) {
            sb.append(" hasEmailDestination");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.aekh
    public final void b(byyt byytVar) {
        if (byytVar == null) {
            throw new NullPointerException("Null archiveStatus");
        }
        this.C = byytVar;
    }

    @Override // defpackage.aekh
    public final void c(int i) {
        this.D = i;
        this.ai |= 1;
    }

    @Override // defpackage.aekh
    public final void d(ckte ckteVar) {
        if (ckteVar == null) {
            throw new NullPointerException("Null groupUpgradeStatus");
        }
        this.I = ckteVar;
    }

    @Override // defpackage.aekh
    public final void e(boolean z) {
        this.ah = z;
        this.ai |= VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING;
    }

    @Override // defpackage.aekh
    public final void f(boolean z) {
        this.ae = z;
        this.ai |= VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
    }

    @Override // defpackage.aekh
    public final void g(boolean z) {
        this.E = z;
        this.ai |= 2;
    }

    @Override // defpackage.aekh
    public final void h(ConversationIdType conversationIdType) {
        if (conversationIdType == null) {
            throw new NullPointerException("Null id_conversations");
        }
        this.F = conversationIdType;
    }

    @Override // defpackage.aekh
    public final void i(boolean z) {
        this.H = z;
        this.ai |= 4;
    }

    @Override // defpackage.aekh
    public final void j(int i) {
        this.af = i;
        this.ai |= 16777216;
    }

    @Override // defpackage.aekh
    public final void k(SuperSortLabel superSortLabel) {
        if (superSortLabel == null) {
            throw new NullPointerException("Null label");
        }
        this.Z = superSortLabel;
    }

    @Override // defpackage.aekh
    public final void l(emyl emylVar) {
        if (emylVar == null) {
            throw new NullPointerException("Null mapiConversationId");
        }
        this.G = emylVar;
    }

    @Override // defpackage.aekh
    public final void m(boolean z) {
        this.ac = z;
        this.ai |= 2097152;
    }

    @Override // defpackage.aekh
    public final void n(boolean z) {
        this.J = z;
        this.ai |= 8;
    }

    @Override // defpackage.aekh
    public final void o(amny amnyVar) {
        if (amnyVar == null) {
            throw new NullPointerException("Null parentalApprovalStatus");
        }
        this.ag = amnyVar;
    }

    @Override // defpackage.aekh
    public final void p(int i) {
        this.K = i;
        this.ai |= 16;
    }

    @Override // defpackage.aekh
    public final void q(boolean z) {
        this.aa = z;
        this.ai |= 524288;
    }

    @Override // defpackage.aekh
    public final void r(int i) {
        this.L = i;
        this.ai |= 32;
    }

    @Override // defpackage.aekh
    public final void s(int i) {
        this.M = i;
        this.ai |= 64;
    }

    @Override // defpackage.aekh
    public final void t(boolean z) {
        this.R = z;
        this.ai |= 2048;
    }

    @Override // defpackage.aekh
    public final void u(long j) {
        this.N = j;
        this.ai |= 128;
    }

    @Override // defpackage.aekh
    public final void v(boolean z) {
        this.O = z;
        this.ai |= 256;
    }

    @Override // defpackage.aekh
    public final void w(long j) {
        this.P = j;
        this.ai |= 512;
    }

    @Override // defpackage.aekh
    public final void x(long j) {
        this.Q = j;
        this.ai |= 1024;
    }

    @Override // defpackage.aekh
    public final void y(boolean z) {
        this.S = z;
        this.ai |= 4096;
    }

    @Override // defpackage.aekh
    public final void z(int i) {
        this.T = i;
        this.ai |= 8192;
    }
}
