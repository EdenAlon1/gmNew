package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.conversation.draft.ComposeRowState;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aica implements aibw {
    public final ffsk a;
    public final ffhd b;
    public final Context c;
    public final elbx d;
    public final aqkp e;
    public final ahuu f;
    public final alxl g;
    public final ahvh h;
    public final ffbr i;
    public final ffbr j;
    private final llv k;
    private final aigz l;
    private final ffbr m;
    private final fgdj n;

    public aica(ffsk ffskVar, ffhd ffhdVar, Context context, elbx elbxVar, aqkp aqkpVar, ahuu ahuuVar, alxl alxlVar, ahvh ahvhVar, llv llvVar, aigz aigzVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, aicu aicuVar) {
        ffskVar.getClass();
        ffhdVar.getClass();
        context.getClass();
        elbxVar.getClass();
        aqkpVar.getClass();
        ahuuVar.getClass();
        alxlVar.getClass();
        ahvhVar.getClass();
        llvVar.getClass();
        aigzVar.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        aicuVar.getClass();
        this.a = ffskVar;
        this.b = ffhdVar;
        this.c = context;
        this.d = elbxVar;
        this.e = aqkpVar;
        this.f = ahuuVar;
        this.g = alxlVar;
        this.h = ahvhVar;
        this.k = llvVar;
        this.l = aigzVar;
        this.i = ffbrVar;
        this.m = ffbrVar2;
        this.j = ffbrVar3;
        fgch fgchVar = new fgch(aicuVar.a, ahvhVar.a(), new aibz(this, null));
        int i = fgcz.a;
        this.n = fgbn.b(fgchVar, ffskVar, fgcy.a(0L, 3), null);
    }

    @Override // defpackage.aibw
    public final fgdj a() {
        return this.n;
    }

    public final void b(ConversationId conversationId) {
        if (((atdn) this.m.b()).a()) {
            ComposeRowState d = aygl.d(this.k);
            if (d != null) {
                this.l.h(new aijn(new aijp(conversationId, false, false, 3, d, null, null, false, true, 1990)));
                return;
            }
            return;
        }
        if (aygy.a(this.k) != null) {
            this.l.h(new aijn(new aijp(conversationId, false, false, 3, null, null, aygy.a(this.k), false, true, 1894)));
        } else {
            this.l.h(new aijn(new aijp(conversationId, false, false, 3, null, (MessageCoreData) this.k.b("draft_data"), null, false, true, 1958)));
        }
    }
}
