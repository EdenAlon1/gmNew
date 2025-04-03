package defpackage;

import android.content.Context;
import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.MarkAsReadAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class baih implements bbfd {
    private final ffbr a;
    private final ffbr b;
    private final ffbr c;
    private final ffbr d;
    private final ffbr e;
    private final ffbr f;
    private final ffbr g;
    private final ffbr h;
    private final ffbr i;
    private final ffbr j;
    private final ffbr k;
    private final ffbr l;
    private final ffbr m;
    private final ffbr n;
    private final ffbr o;
    private final ffbr p;
    private final ffbr q;
    private final ffbr r;

    public baih(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9, ffbr ffbrVar10, ffbr ffbrVar11, ffbr ffbrVar12, ffbr ffbrVar13, ffbr ffbrVar14, ffbr ffbrVar15, ffbr ffbrVar16, ffbr ffbrVar17, ffbr ffbrVar18, ffbr ffbrVar19) {
        ffbrVar.getClass();
        this.a = ffbrVar;
        this.b = ffbrVar2;
        ffbrVar3.getClass();
        this.c = ffbrVar3;
        ffbrVar4.getClass();
        this.d = ffbrVar4;
        ffbrVar5.getClass();
        this.e = ffbrVar5;
        ffbrVar6.getClass();
        this.f = ffbrVar6;
        ffbrVar7.getClass();
        this.g = ffbrVar7;
        ffbrVar8.getClass();
        this.h = ffbrVar8;
        ffbrVar9.getClass();
        this.i = ffbrVar9;
        ffbrVar10.getClass();
        this.j = ffbrVar10;
        ffbrVar11.getClass();
        this.k = ffbrVar11;
        ffbrVar12.getClass();
        this.l = ffbrVar12;
        ffbrVar13.getClass();
        this.m = ffbrVar13;
        ffbrVar14.getClass();
        this.n = ffbrVar14;
        ffbrVar15.getClass();
        this.o = ffbrVar15;
        ffbrVar16.getClass();
        this.p = ffbrVar16;
        ffbrVar17.getClass();
        this.q = ffbrVar17;
        ffbrVar18.getClass();
        ffbrVar19.getClass();
        this.r = ffbrVar19;
    }

    @Override // defpackage.bbfd
    public final /* synthetic */ elfl a(ConversationIdType conversationIdType) {
        return elfl.g(bbfc.a(this, conversationIdType, bdhb.a, true, false, -1).s());
    }

    @Override // defpackage.bbfd
    public final /* synthetic */ elfl b(ConversationIdType conversationIdType, MessageIdType messageIdType) {
        return elfl.g(bbfc.a(this, conversationIdType, messageIdType, true, false, -1).s());
    }

    @Override // defpackage.bbck
    public final /* bridge */ /* synthetic */ Action c(Parcel parcel) {
        Context context = (Context) this.a.b();
        context.getClass();
        cqoh cqohVar = (cqoh) this.b.b();
        cqohVar.getClass();
        ctvb ctvbVar = (ctvb) this.c.b();
        ctvbVar.getClass();
        akzt akztVar = (akzt) this.d.b();
        akztVar.getClass();
        altk altkVar = (altk) this.e.b();
        altkVar.getClass();
        coxk coxkVar = (coxk) this.f.b();
        coxkVar.getClass();
        dtuu dtuuVar = (dtuu) this.g.b();
        dtuuVar.getClass();
        cpdg cpdgVar = (cpdg) this.h.b();
        cpdgVar.getClass();
        axmw axmwVar = (axmw) this.i.b();
        axmwVar.getClass();
        cbek cbekVar = (cbek) this.j.b();
        cbekVar.getClass();
        cipm cipmVar = (cipm) this.k.b();
        cipmVar.getClass();
        parcel.getClass();
        return new MarkAsReadAction(context, cqohVar, ctvbVar, akztVar, altkVar, coxkVar, dtuuVar, cpdgVar, axmwVar, cbekVar, cipmVar, this.l, this.m, this.n, this.o, this.p, this.q, this.r, parcel);
    }

    @Override // defpackage.bbfd
    public final /* synthetic */ void d(ConversationIdType conversationIdType) {
        bbfc.b(this, conversationIdType, true);
    }

    @Override // defpackage.bbfd
    public final /* synthetic */ void e(ConversationIdType conversationIdType) {
        Action a = bbfc.a(this, conversationIdType, bdhb.a, true, false, 2);
        a.t();
        ((MarkAsReadAction) a).c.f().a(conversationIdType);
    }

    @Override // defpackage.bbfd
    public final /* synthetic */ Action f(ConversationIdType conversationIdType, MessageIdType messageIdType, boolean z) {
        return bbfc.a(this, conversationIdType, messageIdType, true, z, -1);
    }

    @Override // defpackage.bbfd
    public final /* synthetic */ Action g(ConversationIdType[] conversationIdTypeArr, MessageIdType messageIdType) {
        return i(conversationIdTypeArr, messageIdType, true, false, -1);
    }

    @Override // defpackage.bbfd
    public final /* synthetic */ Action h(ConversationIdType conversationIdType, MessageIdType messageIdType) {
        return bbfc.a(this, conversationIdType, messageIdType, true, false, -1);
    }

    public final MarkAsReadAction i(ConversationIdType[] conversationIdTypeArr, MessageIdType messageIdType, boolean z, boolean z2, int i) {
        Context context = (Context) this.a.b();
        context.getClass();
        cqoh cqohVar = (cqoh) this.b.b();
        cqohVar.getClass();
        ctvb ctvbVar = (ctvb) this.c.b();
        ctvbVar.getClass();
        akzt akztVar = (akzt) this.d.b();
        akztVar.getClass();
        altk altkVar = (altk) this.e.b();
        altkVar.getClass();
        coxk coxkVar = (coxk) this.f.b();
        coxkVar.getClass();
        dtuu dtuuVar = (dtuu) this.g.b();
        dtuuVar.getClass();
        cpdg cpdgVar = (cpdg) this.h.b();
        cpdgVar.getClass();
        axmw axmwVar = (axmw) this.i.b();
        axmwVar.getClass();
        cbek cbekVar = (cbek) this.j.b();
        cbekVar.getClass();
        cipm cipmVar = (cipm) this.k.b();
        cipmVar.getClass();
        conversationIdTypeArr.getClass();
        messageIdType.getClass();
        return new MarkAsReadAction(context, cqohVar, ctvbVar, akztVar, altkVar, coxkVar, dtuuVar, cpdgVar, axmwVar, cbekVar, cipmVar, this.l, this.m, this.n, this.o, this.p, this.q, this.r, conversationIdTypeArr, messageIdType, z, z2, i);
    }

    @Override // defpackage.bbfd
    public final /* synthetic */ void j(ConversationIdType conversationIdType, MessageIdType messageIdType) {
        bbfc.c(this, conversationIdType, messageIdType, true);
    }

    @Override // defpackage.bbfd
    public final /* synthetic */ void k(ConversationIdType conversationIdType) {
        bbfc.b(this, conversationIdType, false);
    }

    @Override // defpackage.bbfd
    public final /* synthetic */ Action l() {
        return i(new ConversationIdType[0], bdhb.a, true, false, 1);
    }
}
