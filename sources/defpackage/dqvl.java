package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
final /* synthetic */ class dqvl extends ffkh implements ffji {
    public dqvl(Object obj) {
        super(1, obj, dqvo.class, "createSearchRenderer", "createSearchRenderer(Lcom/google/android/libraries/compose/emoji/search/EmojiSearch;)Lcom/google/android/libraries/compose/emoji/ui/screen/search/EmojiSearchRenderer;", 0);
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        dqru dqruVar = (dqru) obj;
        dqruVar.getClass();
        final dqvo dqvoVar = (dqvo) this.g;
        int i = dqvo.aj;
        dqwk dqwkVar = dqvoVar.c;
        if (dqwkVar == null) {
            ffkj.c("emojiSearchRendererFactory");
            dqwkVar = null;
        }
        return dqwkVar.a(dqruVar, (dqsv) dqvoVar.bA(), new ffjm() { // from class: dqvh
            @Override // defpackage.ffjm
            public final Object a(Object obj2, Object obj3) {
                Iterable iterable = (Iterable) obj2;
                dqwa b = dqvo.this.b();
                iterable.getClass();
                Object obj4 = b.m;
                if (!(obj4 instanceof durt)) {
                    if (obj4 instanceof dutb) {
                        ((dutb) obj4).b();
                    }
                    durt durtVar = new durt(b.d, b.e, b.j, b.f.a, (dury) b.k.a());
                    durtVar.h = 1.0f;
                    b.m = durtVar;
                    obj4 = durtVar;
                }
                durt durtVar2 = (durt) obj4;
                int i2 = engw.d;
                engr engrVar = new engr();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    engrVar.h(duvf.a(((dqrt) it.next()).a.a().a().toString()));
                }
                erqt.r(durtVar2.c.b(), new durq(durtVar2, engrVar.g()), duoc.b);
                b.f.a.ak(0);
                b.a(false);
                return ffcu.a;
            }
        }, new ffix() { // from class: dqvi
            @Override // defpackage.ffix
            public final Object invoke() {
                dqvo.this.b().c();
                return ffcu.a;
            }
        });
    }
}
