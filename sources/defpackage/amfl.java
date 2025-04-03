package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.DefaultConversation;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class amfl extends ffhv implements ffjm {
    int a;
    final /* synthetic */ BugleConversation b;
    final /* synthetic */ amfm c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amfl(BugleConversation bugleConversation, amfm amfmVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = bugleConversation;
        this.c = amfmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((amfl) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object b;
        int i;
        int a;
        ffhh ffhhVar = ffhh.a;
        int i2 = this.a;
        ffci.b(obj);
        if (i2 != 0) {
            b = obj;
        } else {
            elfl b2 = ((DefaultConversation) this.b).f.b();
            b2.getClass();
            elfl b3 = ((DefaultConversation) this.b).d.b();
            b3.getClass();
            elfl b4 = this.b.a().c().b();
            b4.getClass();
            ffss[] ffssVarArr = {axol.e(b2), axol.e(b3), axol.e(b4)};
            this.a = 1;
            b = ffqv.b(ffssVarArr, this);
            if (b == ffhhVar) {
                return ffhhVar;
            }
        }
        List list = (List) b;
        Object obj2 = list.get(0);
        obj2.getClass();
        amfx amfxVar = (amfx) obj2;
        Object obj3 = list.get(1);
        obj3.getClass();
        engw engwVar = (engw) obj3;
        Object obj4 = list.get(2);
        obj4.getClass();
        alyx e = ((alxg) obj4).e();
        boolean z = e.g;
        boolean z2 = ((Boolean) ((cfup) ctjd.ak.get()).e()).booleanValue() && engwVar.size() == 1 && ((ResolvedRecipient) ffdx.K(engwVar)).g().A();
        altk altkVar = (altk) this.c.a.b();
        BugleConversation bugleConversation = this.b;
        eoko eokoVar = eoko.UNKNOWN_BUGLE_CONVERSATION_ORIGIN;
        int size = engwVar.size();
        boolean p = amfxVar.p();
        Boolean valueOf = Boolean.valueOf(amfxVar.E() == eoxn.SEND_MODE_XMS_LATCH);
        int v = amfxVar.v();
        aljt aljtVar = (aljt) this.c.b.b();
        ArrayList arrayList = new ArrayList(ffdx.n(engwVar, 10));
        Iterator<E> it = engwVar.iterator();
        while (it.hasNext()) {
            arrayList.add(((ResolvedRecipient) it.next()).g());
        }
        engw a2 = aljtVar.a(engq.a(arrayList));
        boolean J = amfxVar.J();
        if (amfxVar.b() == alxi.GROUP) {
            a = cvfc.a(cvei.a(engwVar));
        } else {
            if (amfxVar.b() != alxi.ONE_ON_ONE || engwVar.size() != 1) {
                i = 7;
                altkVar.ax(((DefaultConversation) bugleConversation).a.a, eokoVar, 0, size, p, valueOf, z, z2, v, a2, J, i, e.h, byyt.i(amfxVar.g()));
                return null;
            }
            a = cvfc.a(((aqrv) ((ResolvedRecipient) ffdx.T(engwVar)).m()).d);
        }
        i = a;
        altkVar.ax(((DefaultConversation) bugleConversation).a.a, eokoVar, 0, size, p, valueOf, z, z2, v, a2, J, i, e.h, byyt.i(amfxVar.g()));
        return null;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new amfl(this.b, this.c, ffguVar);
    }
}
