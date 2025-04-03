package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xfm implements xfb {
    public final ffbr a;
    public final ffbr b;
    public final ffbr c;
    public final ffbr d;
    public final abam e;
    public final atfm f;
    public final dqza g;
    public final dltj h;
    private final ffsk i;
    private final fgdj j;
    private final fgdj k;
    private final fgdj l;

    public xfm(ffsk ffskVar, xsc xscVar, yxk yxkVar, ypb ypbVar, xre xreVar, fgcq fgcqVar, ConversationId conversationId, final zej zejVar, cftn cftnVar, Optional optional, asvn asvnVar, final xez xezVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, abam abamVar, atfm atfmVar, dltj dltjVar) {
        fgdj axqfVar;
        char c;
        Object obj;
        ffskVar.getClass();
        xscVar.getClass();
        yxkVar.getClass();
        ypbVar.getClass();
        xreVar.getClass();
        fgcqVar.getClass();
        conversationId.getClass();
        zejVar.getClass();
        asvnVar.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        abamVar.getClass();
        dltjVar.getClass();
        this.i = ffskVar;
        this.a = ffbrVar;
        this.b = ffbrVar2;
        this.c = ffbrVar3;
        this.d = ffbrVar4;
        this.e = abamVar;
        this.f = atfmVar;
        this.h = dltjVar;
        xfk xfkVar = new xfk(new xfh(fgcqVar));
        int i = fgcz.a;
        fgdj b = fgbn.b(xfkVar, ffskVar, fgcy.b, false);
        this.j = b;
        dqza dqzaVar = (dqza) fflm.b(optional);
        this.g = dqzaVar;
        fgdj a = (!ctjd.d() || dqzaVar == null) ? fgdm.a(false) : fgbn.b(new fgch(new fgcp(new xfd(this, null)), fgbn.b(new cftk(cftnVar.c.b()), cftnVar.a, fgcy.b, false), new xfe(null)), ffskVar, fgcy.b, false);
        this.k = a;
        fgcz fgczVar = fgcy.b;
        fgdj a2 = xscVar.a();
        fgdj a3 = yxkVar.a();
        fgdj d = ypbVar.d();
        fgdj a4 = xreVar.a();
        ffjq ffjqVar = new ffjq() { // from class: xfc
            @Override // defpackage.ffjq
            public final Object a(Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
                dmms dmmsVar = (dmms) obj2;
                dmov dmovVar = (dmov) obj3;
                ypa ypaVar = (ypa) obj4;
                xsb xsbVar = (xsb) obj5;
                boolean booleanValue = ((Boolean) obj6).booleanValue();
                boolean booleanValue2 = ((Boolean) obj7).booleanValue();
                dmmsVar.getClass();
                dmovVar.getClass();
                ypaVar.getClass();
                dmpg dmpgVar = booleanValue ? dmpg.b : dmpg.a;
                xfm xfmVar = xfm.this;
                boolean c2 = cubs.c();
                Object e = ((cfup) ctjd.ah.get()).e();
                e.getClass();
                boolean booleanValue3 = ((Boolean) e).booleanValue();
                boolean z = false;
                if (((atbo) xfmVar.a.b()).a() && ((atbq) xfmVar.b.b()).a()) {
                    z = true;
                }
                boolean z2 = z;
                zej zejVar2 = zejVar;
                return new xfa(new dmpj(dmmsVar, dmovVar, ypaVar.b, dmpgVar, 0.0f, booleanValue2, new dmpi(xezVar.a(), booleanValue3, true, z2, ((avaf) xfmVar.c.b()).a(), ((aval) xfmVar.d.b()).a(), c2), 16), ypaVar.a, new xfl(xfmVar), zejVar2.b, xsbVar);
            }
        };
        a2.getClass();
        a3.getClass();
        d.getClass();
        a4.getClass();
        a.getClass();
        char c2 = 5;
        fgdj[] fgdjVarArr = {a2, a3, d, a4, b, a};
        int i2 = 0;
        while (true) {
            if (i2 >= 6) {
                axqfVar = new axqf(new axtu(fgdjVarArr, ffjqVar));
                break;
            }
            fgdj fgdjVar = fgdjVarArr[i2];
            if (fgdjVar == null || (fgdjVar instanceof axqf)) {
                i2++;
                ffjqVar = ffjqVar;
                c2 = c2;
            } else {
                fgdj[] fgdjVarArr2 = (fgdj[]) ffdo.J(fgdjVarArr).toArray(new fgdj[0]);
                axtd axtdVar = new axtd((ffxx[]) Arrays.copyOf(fgdjVarArr2, fgdjVarArr2.length), fgdjVarArr, ffjqVar);
                ArrayList arrayList = new ArrayList(6);
                int i3 = 0;
                while (i3 < 6) {
                    fgdj fgdjVar2 = fgdjVarArr[i3];
                    if (fgdjVar2 != null) {
                        c = c2;
                        obj = fgdjVar2.c();
                    } else {
                        c = c2;
                        obj = null;
                    }
                    arrayList.add(obj);
                    i3++;
                    c2 = c;
                }
                Object[] array = arrayList.toArray(new Object[0]);
                axqfVar = fgbn.b(axtdVar, ffskVar, fgczVar, ffjqVar.a(array[0], array[1], array[2], array[3], array[4], array[c2]));
            }
        }
        this.l = axqfVar;
    }

    @Override // defpackage.xfb
    public final fgdj a() {
        return this.l;
    }
}
