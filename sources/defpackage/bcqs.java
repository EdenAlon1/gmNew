package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoData;
import j$.util.Optional;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bcqs extends bcpr {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/datamodel/data/ConversationData");
    public final ffbr b;
    public final bcxo c;
    public tys d;
    public final ConversationIdType e;
    public boolean f;
    public bctw g;
    public final bdtd h;

    @Deprecated
    public final bcrs i;
    public bcxr j;
    public BusinessInfoData k;
    public bcyl l;
    public boolean m;
    public SelfIdentityId n;
    public avji o;

    @Deprecated
    public ampg p;
    private final ffbr q;

    public bcqs(ffbr ffbrVar, bdtd bdtdVar, ffbr ffbrVar2, bctx bctxVar, bcxo bcxoVar, ConversationIdType conversationIdType, bcyl bcylVar, ffbr ffbrVar3) {
        tyr x = tys.x();
        x.b(byyt.UNARCHIVED);
        tyo tyoVar = (tyo) x;
        tyoVar.a = bdgq.a;
        x.e(0);
        x.h(false);
        x.i(false);
        x.k(0);
        x.l(false);
        x.n(0L);
        x.o(0);
        x.p(false);
        x.j(false);
        tyoVar.f = "";
        tyoVar.g = "";
        x.m(Optional.empty());
        x.c(false);
        x.f(ayhd.NONE);
        x.g(false);
        x.d(amny.b);
        this.d = x.a();
        this.m = false;
        this.o = avji.NOT_SET;
        this.p = ampg.NONE;
        this.e = conversationIdType;
        this.h = bdtdVar;
        this.b = ffbrVar2;
        this.c = bcxoVar;
        this.q = ffbrVar3;
        this.f = false;
        int i = engw.d;
        this.g = bctxVar.a(enou.a);
        this.j = bcxo.d();
        this.i = (bcrs) ffbrVar.b();
        this.l = bcylVar;
    }

    public static tys c(bcrs bcrsVar, ConversationIdType conversationIdType) {
        byyt R = bcrsVar.R();
        tyr x = tys.x();
        tyo tyoVar = (tyo) x;
        tyoVar.a = conversationIdType;
        if (R == null) {
            R = byyt.UNARCHIVED;
        }
        x.b(R);
        x.e(bcrsVar.L());
        x.p(bcrsVar.K());
        x.h(bcrsVar.W());
        x.i(bcrsVar.V());
        x.k(bcrsVar.a());
        tyoVar.b = bcrsVar.t();
        bejf bejfVar = bcrsVar.d;
        bejfVar.az(63, "full_name");
        String str = bejfVar.al;
        bejf bejfVar2 = bcrsVar.d;
        bejfVar2.az(64, "first_name");
        boolean z = (TextUtils.isEmpty(str) && TextUtils.isEmpty(bejfVar2.am)) ? false : true;
        bejf bejfVar3 = bcrsVar.d;
        bejfVar3.az(65, "display_name");
        String str2 = bejfVar3.an;
        String str3 = null;
        if (!z && !TextUtils.isEmpty(str2)) {
            str3 = cjze.a(str2);
        }
        tyoVar.c = str3;
        bejf bejfVar4 = bcrsVar.d;
        bejfVar4.az(3, "name_is_automatic");
        x.l(bejfVar4.d == byyy.NAME_IS_AUTOMATIC);
        x.n(bcrsVar.e());
        x.o(bcrsVar.d());
        tyoVar.f = bcrsVar.x();
        tyoVar.g = bcrsVar.w();
        x.q(bcrsVar.j());
        bejf bejfVar5 = bcrsVar.d;
        bejfVar5.az(40, "awaiting_reverse_sync");
        x.c(bejfVar5.O);
        bejf bejfVar6 = bcrsVar.d;
        bejfVar6.az(41, "error_state");
        x.f(bejfVar6.P);
        bejf bejfVar7 = bcrsVar.d;
        bejfVar7.az(42, "rcs_group_last_sync_timestamp");
        x.m(bejfVar7.Q);
        x.g(bcrsVar.U());
        tyoVar.d = bcrsVar.s();
        x.d(bcrsVar.P());
        if (bcrsVar.p().isPresent()) {
            tyoVar.e = Optional.of((aoku) bcrsVar.p().get());
        }
        return x.a();
    }

    public final int a(Context context) {
        bcyl bcylVar;
        Integer num;
        if (!this.f && (bcylVar = this.l) != null && (num = bcylVar.a) != null) {
            return num.intValue();
        }
        bctw bctwVar = this.g;
        int i = ((cttz) bctwVar.a.b()).g().a;
        ArrayList f = bctwVar.f();
        return !f.isEmpty() ? f.size() == 1 ? ((cttz) bctwVar.a.b()).b() : context.getResources().getColor(R.color.action_bar_background_color) : i;
    }

    public final int b(SelfIdentityId selfIdentityId) {
        aztg d = d(selfIdentityId);
        if (d == null) {
            return -1;
        }
        return d.e();
    }

    public final aztg d(SelfIdentityId selfIdentityId) {
        if (selfIdentityId == null) {
            return null;
        }
        return this.h.d(selfIdentityId);
    }

    public final bcxq e(SelfIdentityId selfIdentityId) {
        return this.j.a(selfIdentityId);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsDataImpl k(defpackage.eooi r15, long r16) {
        /*
            r14 = this;
            java.lang.String r0 = "ConversationData::getMessageUsageStatisticsData"
            ekzz r1 = defpackage.eleg.f(r0)
            com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsDataImpl r2 = new com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsDataImpl     // Catch: java.lang.Throwable -> La6
            tys r0 = r14.d     // Catch: java.lang.Throwable -> La6
            typ r0 = (defpackage.typ) r0     // Catch: java.lang.Throwable -> La6
            int r5 = r0.c     // Catch: java.lang.Throwable -> La6
            emyl r0 = com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData.b     // Catch: java.lang.Throwable -> La6
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> La6
            cfup r0 = (defpackage.cfup) r0     // Catch: java.lang.Throwable -> La6
            java.lang.Object r0 = r0.e()     // Catch: java.lang.Throwable -> La6
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> La6
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> La6
            if (r0 == 0) goto L26
            eoog r0 = defpackage.eoog.FIRST_ATTEMPT_TO_SEND     // Catch: java.lang.Throwable -> La6
        L24:
            r6 = r0
            goto L2d
        L26:
            bcrs r0 = r14.i     // Catch: java.lang.Throwable -> La6
            eoog r0 = r0.l()     // Catch: java.lang.Throwable -> La6
            goto L24
        L2d:
            eonv r7 = defpackage.eonv.UNKNOWN_INSTANT_MESSAGING_ALWAYS_ON     // Catch: java.lang.Throwable -> La6
            bcrs r0 = r14.i     // Catch: java.lang.Throwable -> La6
            eooo r8 = r0.m()     // Catch: java.lang.Throwable -> La6
            boolean r0 = r14.f     // Catch: java.lang.Throwable -> La6
            if (r0 == 0) goto L49
            bcrs r0 = r14.i     // Catch: java.lang.Throwable -> La6
            boolean r0 = r0.G()     // Catch: java.lang.Throwable -> La6
            if (r0 != 0) goto L42
            goto L49
        L42:
            bcrs r0 = r14.i     // Catch: java.lang.Throwable -> La6
            eooe r0 = r0.k()     // Catch: java.lang.Throwable -> La6
            goto L4b
        L49:
            eooe r0 = defpackage.eooe.CONVERSATION_DATA_NOT_LOADED     // Catch: java.lang.Throwable -> La6
        L4b:
            r9 = r0
            bcrs r0 = r14.i     // Catch: java.lang.Throwable -> La6
            eoxo r0 = r0.n()     // Catch: java.lang.Throwable -> La6
            eyfq r0 = r0.toBuilder()     // Catch: java.lang.Throwable -> La6
            eoxk r0 = (defpackage.eoxk) r0     // Catch: java.lang.Throwable -> La6
            boolean r3 = r14.f     // Catch: java.lang.Throwable -> La6
            r4 = 3
            r10 = 1
            r11 = 2
            if (r10 == r3) goto L61
            r3 = r11
            goto L62
        L61:
            r3 = r4
        L62:
            r0.copyOnWrite()     // Catch: java.lang.Throwable -> La6
            MessageType extends eyfy<MessageType, BuilderType> r12 = r0.instance     // Catch: java.lang.Throwable -> La6
            eoxo r12 = (defpackage.eoxo) r12     // Catch: java.lang.Throwable -> La6
            int r3 = r3 + (-1)
            r12.d = r3     // Catch: java.lang.Throwable -> La6
            int r3 = r12.b     // Catch: java.lang.Throwable -> La6
            r3 = r3 | r11
            r12.b = r3     // Catch: java.lang.Throwable -> La6
            bcrs r3 = r14.i     // Catch: java.lang.Throwable -> La6
            boolean r3 = r3.G()     // Catch: java.lang.Throwable -> La6
            if (r10 == r3) goto L7b
            r4 = r11
        L7b:
            r0.copyOnWrite()     // Catch: java.lang.Throwable -> La6
            MessageType extends eyfy<MessageType, BuilderType> r3 = r0.instance     // Catch: java.lang.Throwable -> La6
            eoxo r3 = (defpackage.eoxo) r3     // Catch: java.lang.Throwable -> La6
            int r4 = r4 + (-1)
            r3.e = r4     // Catch: java.lang.Throwable -> La6
            int r4 = r3.b     // Catch: java.lang.Throwable -> La6
            r4 = r4 | 4
            r3.b = r4     // Catch: java.lang.Throwable -> La6
            eyfy r0 = r0.build()     // Catch: java.lang.Throwable -> La6
            r10 = r0
            eoxo r10 = (defpackage.eoxo) r10     // Catch: java.lang.Throwable -> La6
            bcrs r0 = r14.i     // Catch: java.lang.Throwable -> La6
            eqwf r0 = r0.o()     // Catch: java.lang.Throwable -> La6
            int r11 = r0.N     // Catch: java.lang.Throwable -> La6
            r4 = 0
            r3 = r15
            r12 = r16
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> La6
            r1.close()
            return r2
        La6:
            r0 = move-exception
            r15 = r0
            r1.close()     // Catch: java.lang.Throwable -> Lac
            goto Lb0
        Lac:
            r0 = move-exception
            r15.addSuppressed(r0)
        Lb0:
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bcqs.k(eooi, long):com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsDataImpl");
    }

    public final String l() {
        bcyl bcylVar;
        String str;
        typ typVar = (typ) this.d;
        return (typVar.n || (bcylVar = this.l) == null || (str = bcylVar.b) == null) ? typVar.h : str;
    }

    public final String m() {
        String str;
        if (this.f) {
            ParticipantsTable.BindData a2 = this.g.a();
            if (a2 != null) {
                return a2.U();
            }
            return null;
        }
        bcyl bcylVar = this.l;
        if (bcylVar == null || (str = bcylVar.c) == null) {
            return null;
        }
        return str;
    }

    public final boolean n() {
        if (this.g.i()) {
            ensk h = a.h();
            h.Y(ente.a, "BugleDataModel");
            enrr enrrVar = (enrr) h;
            enrrVar.Y(csux.p, this.e);
            ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/datamodel/data/ConversationData", "allowReply", 259, "ConversationData.java")).q("ConversationData: Reply not allowed because this is an incoming conversation.");
            return false;
        }
        int b = b(this.n);
        boolean z = b != -1 && ((djrv) this.q.b()).x(b);
        if (this.d.A() && !z) {
            ensk h2 = a.h();
            h2.Y(ente.a, "BugleDataModel");
            enrr enrrVar2 = (enrr) h2;
            enrrVar2.Y(csux.p, this.e);
            ((enrr) enrrVar2.h("com/google/android/apps/messaging/shared/datamodel/data/ConversationData", "allowReply", 271, "ConversationData.java")).q("ConversationData: Reply not allowed because this is a RCS group conversation and RCS is not available.");
            return false;
        }
        if (this.p == ampg.NONE) {
            return o(true);
        }
        ensk h3 = a.h();
        h3.Y(ente.a, "BugleDataModel");
        enrr enrrVar3 = (enrr) h3;
        enrrVar3.Y(csux.p, this.e);
        ((enrr) enrrVar3.h("com/google/android/apps/messaging/shared/datamodel/data/ConversationData", "allowReply", 280, "ConversationData.java")).t("ConversationData: Reply not allowed because of conversation disable mode %s", this.p);
        return false;
    }

    public final boolean o(boolean z) {
        int i = ((typ) this.d).g;
        if (i == 0 || i == 1) {
            return true;
        }
        if (!z) {
            return false;
        }
        ensk h = a.h();
        h.Y(ente.a, "BugleDataModel");
        enrr enrrVar = (enrr) h;
        enrrVar.Y(csux.p, this.e);
        ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/datamodel/data/ConversationData", "allowReplyBasedOnJoinState", 299, "ConversationData.java")).r("ConversationData: Reply not allowed because conversation state disallows replies. joinState: %s", ((typ) this.d).g);
        return false;
    }

    public final boolean p() {
        return this.f ? this.g.g() : ((typ) this.d).e;
    }

    public final boolean q() {
        tys tysVar = this.d;
        int i = ((typ) tysVar).m;
        if (tysVar.A() || p()) {
            return true;
        }
        return aqgi.g(aqgi.a(i)) && this.m;
    }

    @Override // defpackage.bcpr
    protected final void h() {
    }
}
