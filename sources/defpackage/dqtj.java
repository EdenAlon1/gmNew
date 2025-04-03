package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final /* synthetic */ class dqtj extends ffkh implements ffji {
    public dqtj(Object obj) {
        super(1, obj, dqtz.class, "createSearchRenderer", "createSearchRenderer(Lcom/google/android/libraries/compose/emoji/search/EmojiSearch;)Lcom/google/android/libraries/compose/emoji/ui/screen/search/EmojiSearchRenderer;", 0);
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        dqru dqruVar = (dqru) obj;
        dqruVar.getClass();
        final dqtz dqtzVar = (dqtz) this.g;
        int i = dqtz.ar;
        dqwk dqwkVar = dqtzVar.ai;
        if (dqwkVar == null) {
            ffkj.c("emojiSearchRendererFactory");
            dqwkVar = null;
        }
        return dqwkVar.a(dqruVar, (dqsv) dqtzVar.bA(), new ffjm() { // from class: dqsw
            @Override // defpackage.ffjm
            public final Object a(Object obj2, Object obj3) {
                dqtz dqtzVar2 = dqtz.this;
                Iterable iterable = (Iterable) obj2;
                String str = (String) obj3;
                dquz q = dqtzVar2.q();
                iterable.getClass();
                str.getClass();
                List list = q.i;
                ArrayList arrayList = new ArrayList(ffdx.n(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(new dqus(((dqrt) it.next()).a, 0));
                }
                dqth dqthVar = null;
                List a = dqie.a(list, arrayList, null, null, 28);
                q.n = str;
                q.L(arrayList);
                int i2 = q.h;
                dqie.b(a, i2 + i2, q);
                dqtzVar2.bb(dqtzVar2.q());
                dqth dqthVar2 = dqtzVar2.aq;
                if (dqthVar2 == null) {
                    ffkj.c("views");
                } else {
                    dqthVar = dqthVar2;
                }
                dqthVar.a.ak(0);
                return ffcu.a;
            }
        }, new ffix() { // from class: dqsy
            @Override // defpackage.ffix
            public final Object invoke() {
                dqtz dqtzVar2 = dqtz.this;
                if (dqtzVar2.ag != null) {
                    dqtzVar2.bb(dqtzVar2.p());
                }
                return ffcu.a;
            }
        });
    }
}
