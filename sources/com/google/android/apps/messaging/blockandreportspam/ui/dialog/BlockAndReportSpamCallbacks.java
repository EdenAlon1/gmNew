package com.google.android.apps.messaging.blockandreportspam.ui.dialog;

import android.os.Parcelable;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import defpackage.bdgq;
import defpackage.crrr;
import defpackage.crrt;
import defpackage.crse;
import defpackage.crsf;
import defpackage.cubs;
import defpackage.ejlr;
import defpackage.elfl;
import defpackage.emwl;
import defpackage.eoko;
import defpackage.erpp;
import defpackage.errl;
import defpackage.ffbr;
import defpackage.sxy;
import defpackage.szu;
import defpackage.szv;
import defpackage.szw;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class BlockAndReportSpamCallbacks {
    public final ffbr a;
    public final ffbr b;
    public final ffbr c;
    public final ffbr d;
    public final ffbr e;
    public final ffbr f;
    public final ffbr g;
    public final errl h;
    public Supplier k = null;
    public final ejlr i = new szu(this);
    public final ejlr j = new szv(this);

    /* compiled from: PG */
    public static abstract class ParticipantBlockAndSpamStatus implements Parcelable {
        public abstract int a();

        public abstract String b();

        public abstract boolean c();

        public abstract boolean d();
    }

    public BlockAndReportSpamCallbacks(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, errl errlVar) {
        this.a = ffbrVar;
        this.b = ffbrVar2;
        this.c = ffbrVar3;
        this.d = ffbrVar4;
        this.e = ffbrVar5;
        this.f = ffbrVar6;
        this.g = ffbrVar7;
        this.h = errlVar;
    }

    public final elfl a(szw szwVar, int i, int i2, int i3) {
        if (!cubs.a().booleanValue()) {
            crrt crrtVar = (crrt) this.b.b();
            sxy sxyVar = (sxy) szwVar;
            String str = sxyVar.c;
            crse o = crsf.o();
            crrr crrrVar = (crrr) o;
            crrrVar.d = bdgq.b(str);
            crrrVar.a = sxyVar.e ? r1 : null;
            crrrVar.b = sxyVar.f ? true : null;
            crrrVar.h = sxyVar.e ? eoko.CONVERSATION_FROM_UNBLOCK_ACTION : eoko.CONVERSATION_FROM_UNSPAM_ACTION;
            crrrVar.j = i;
            crrrVar.k = i2;
            crrrVar.l = i3;
            return crrtVar.a(o.a().n()).h(new emwl() { // from class: szq
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    crsn crsnVar = (crsn) obj;
                    return crsnVar == null ? crsn.a : crsnVar;
                }
            }, erpp.a);
        }
        crrt crrtVar2 = (crrt) this.b.b();
        sxy sxyVar2 = (sxy) szwVar;
        String str2 = sxyVar2.c;
        crse o2 = crsf.o();
        BugleConversationId bugleConversationId = new BugleConversationId(str2);
        crrr crrrVar2 = (crrr) o2;
        crrrVar2.e = bugleConversationId;
        crrrVar2.a = sxyVar2.e ? r1 : null;
        crrrVar2.b = sxyVar2.f ? true : null;
        crrrVar2.h = sxyVar2.e ? eoko.CONVERSATION_FROM_UNBLOCK_ACTION : eoko.CONVERSATION_FROM_UNSPAM_ACTION;
        crrrVar2.j = i;
        crrrVar2.k = i2;
        crrrVar2.l = i3;
        return crrtVar2.a(o2.a().n()).h(new emwl() { // from class: szp
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                crsn crsnVar = (crsn) obj;
                return crsnVar == null ? crsn.a : crsnVar;
            }
        }, erpp.a);
    }
}
