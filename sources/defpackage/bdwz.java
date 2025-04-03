package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Optional;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bdwz extends ceut {
    public static final cskc a = cskc.g("Bugle", "RequestLinkPreviewAction");
    public static final cfup b = cfvl.q(155131104);
    public static final ecda c = new ecda("LinkPreviewFetchLatency");
    public final ffbr d;
    public final bdwr e;
    public final cqoh f;
    public final cbgf g;
    public final bdvi h;
    private final errl i;
    private final ffbr j;
    private final cbvt k;
    private final bdtd l;
    private final ahor m;
    private final ecrj n;

    public bdwz(errl errlVar, ffbr ffbrVar, ffbr ffbrVar2, bdwr bdwrVar, cbvt cbvtVar, bdtd bdtdVar, cqoh cqohVar, cbgf cbgfVar, bdvi bdviVar, ahor ahorVar, ecrj ecrjVar) {
        this.i = errlVar;
        this.d = ffbrVar;
        this.j = ffbrVar2;
        this.e = bdwrVar;
        this.k = cbvtVar;
        this.l = bdtdVar;
        this.f = cqohVar;
        this.g = cbgfVar;
        this.h = bdviVar;
        this.m = ahorVar;
        this.n = ecrjVar;
    }

    private final void o(MessageCoreData messageCoreData, String str) {
        bdtd bdtdVar = this.l;
        long o = messageCoreData.o();
        aztg e = bdtdVar.e();
        List singletonList = Collections.singletonList(e.a());
        this.k.j(Optional.empty(), messageCoreData.z(), e, e.a(), singletonList, 210, 1 + o, -1L);
        p(messageCoreData, str);
        if (this.m.a() == -1) {
            this.m.a.e(o);
        }
    }

    private final void p(MessageCoreData messageCoreData, String str) {
        String[] strArr = btqq.a;
        btos btosVar = new btos();
        btosVar.m(messageCoreData.B());
        btosVar.n(str);
        btosVar.e(messageCoreData.o());
        ((bdvu) this.d.b()).b(btosVar.a(), messageCoreData.z());
    }

    private final void q(ConversationIdType conversationIdType, MessageIdType messageIdType, String str) {
        String[] strArr = btqq.a;
        btos btosVar = new btos();
        btosVar.m(messageIdType);
        btosVar.n(str);
        btosVar.e(Long.MAX_VALUE);
        btosVar.k(true);
        ((bdvu) this.d.b()).b(btosVar.a(), conversationIdType);
    }

    @Override // defpackage.ceut, defpackage.ceve
    public final cety a() {
        cetx l = cety.l();
        l.c(4);
        poh pohVar = new poh();
        pohVar.c = true;
        pohVar.c(2);
        ceti cetiVar = (ceti) l;
        cetiVar.a = pohVar.a();
        l.b(cevc.WORKMANAGER_ONLY);
        cetiVar.c = eogt.REQUEST_LINK_PREVIEW_ACTION;
        return l.h();
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("RequestLinkPreviewHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        return cesa.a.getParserForType();
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x01df, code lost:
    
        if (defpackage.bdvu.d(r7.aA()) < ((java.lang.Integer) defpackage.cful.x.e()).intValue()) goto L69;
     */
    @Override // defpackage.ceut
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final /* synthetic */ defpackage.elfl j(defpackage.ceuw r11, defpackage.eyhs r12) {
        /*
            Method dump skipped, instructions count: 799
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bdwz.j(ceuw, eyhs):elfl");
    }

    public final void k(ecri ecriVar, ecrh ecrhVar) {
        if (ecriVar != null) {
            this.n.f(ecriVar, c, null, ecrhVar);
        }
    }

    public final void l(ConversationIdType conversationIdType, MessageIdType messageIdType, String str) {
        String[] strArr = btqq.a;
        btos btosVar = new btos();
        btosVar.m(messageIdType);
        btosVar.n(str);
        btosVar.e(Long.MAX_VALUE);
        btosVar.j(true);
        ((bdvu) this.d.b()).b(btosVar.a(), conversationIdType);
    }

    public final boolean m(MessageIdType messageIdType) {
        Optional c2 = bdvu.c(messageIdType);
        return c2.isPresent() && this.e.f((bton) c2.get());
    }

    public final void n(MessageIdType messageIdType, int i, int i2) {
        MessageCoreData v = ((bdmq) this.j.b()).v(messageIdType);
        if (v == null) {
            return;
        }
        this.e.i(v, i, i2);
    }
}
