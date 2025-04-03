package com.google.android.apps.messaging.ui.conversation.toolstone;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.ui.conversation.toolstone.ConversationToolstoneView;
import defpackage.bcse;
import defpackage.bcsf;
import defpackage.cfup;
import defpackage.crly;
import defpackage.czic;
import defpackage.czid;
import defpackage.czur;
import defpackage.czww;
import defpackage.czxg;
import defpackage.czxn;
import defpackage.czxo;
import defpackage.elew;
import defpackage.ffbr;
import defpackage.ffix;
import defpackage.ffkd;
import defpackage.ffkj;
import defpackage.hic;
import defpackage.hla;
import defpackage.hpw;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ConversationToolstoneView extends czxg implements czid<ConversationToolstoneView> {
    public ffbr a;
    public ffbr b;
    public ffbr c;
    public ffbr d;
    public bcse e;
    private crly f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ConversationToolstoneView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        context.getClass();
    }

    @Override // defpackage.czid
    public final bcse c() {
        return this.e;
    }

    @Override // defpackage.czid
    public final void d(bcse bcseVar, String str, boolean z, boolean z2) {
        bcseVar.getClass();
        if (((Boolean) ((cfup) czur.b.get()).e()).booleanValue()) {
            this.e = bcseVar;
            crly crlyVar = this.f;
            czxn czxnVar = null;
            if (crlyVar == null) {
                ffkj.c("toolstoneComposeView");
                crlyVar = null;
            }
            ComposeView composeView = (ComposeView) crlyVar.b();
            ffbr ffbrVar = this.c;
            if (ffbrVar == null) {
                ffkj.c("toolstoneUiDataFactory");
                ffbrVar = null;
            }
            czxo czxoVar = (czxo) ffbrVar.b();
            int f = this.e.f();
            if (f == 232) {
                czxnVar = czxoVar.d();
            } else if (f == 251) {
                czxnVar = czxoVar.b();
            } else if (f == 254) {
                czxnVar = czxoVar.a();
            } else if (f == 265) {
                czxnVar = czxoVar.c();
            }
            if (czxnVar != null) {
                composeView.a(new hpw(-529844587, true, new czww(czxnVar, new hic(((elew) g().b()).a("Toolstone.onCloseClick", new ffix() { // from class: czwt
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        ConversationToolstoneView conversationToolstoneView = ConversationToolstoneView.this;
                        MessageIdType u = conversationToolstoneView.e.u();
                        u.getClass();
                        ffbr ffbrVar2 = conversationToolstoneView.d;
                        if (ffbrVar2 == null) {
                            ffkj.c("toolstoneDatabaseOperations");
                            ffbrVar2 = null;
                        }
                        ((crlo) ffbrVar2.b()).c(u);
                        return ffcu.a;
                    }
                }), hla.a), new hic(((elew) g().b()).a("Toolstone.onLinkClick", new ffix() { // from class: czwu
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        ConversationToolstoneView conversationToolstoneView = ConversationToolstoneView.this;
                        int f2 = conversationToolstoneView.e.f();
                        ellj.g(f2 != 232 ? f2 != 251 ? null : new cnpl() : new czvz(), conversationToolstoneView);
                        return ffcu.a;
                    }
                }), hla.a))));
            }
        }
    }

    @Override // defpackage.czid
    public final /* bridge */ /* synthetic */ void e(Object obj) {
        obj.getClass();
        throw new UnsupportedOperationException("ConversationToolstoneView does not support bindPayload().");
    }

    public final ffbr g() {
        ffbr ffbrVar = this.a;
        if (ffbrVar != null) {
            return ffbrVar;
        }
        ffkj.c("composeTraceCreation");
        return null;
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.f = new crly(this, R.id.toolstone_stub, R.id.toolstone_inflated);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationToolstoneView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        ffbr ffbrVar = this.b;
        if (ffbrVar == null) {
            ffkj.c("conversationMessageDataFactory");
            ffbrVar = null;
        }
        this.e = ((bcsf) ffbrVar.b()).a();
    }

    public /* synthetic */ ConversationToolstoneView(Context context, AttributeSet attributeSet, int i, ffkd ffkdVar) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    @Override // defpackage.czkr
    public final /* bridge */ /* synthetic */ View a() {
        return this;
    }

    @Override // defpackage.czkr
    public final void b() {
    }

    @Override // defpackage.czid
    public final void f(czic czicVar) {
    }
}
