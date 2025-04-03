package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dqur extends vk implements dqox {
    private static final enru n = enru.c("com/google/android/libraries/compose/emoji/ui/screen/adapter/EmojiAdapter");
    public final dqoy a;
    public final dqkk d;
    public final ffsk e;
    public dqsv f;
    public dqwl g;
    public int h;
    public int j;
    public int k;
    private final dqxh o;
    private int q;
    private final ffbz p = ffca.a(new ffix() { // from class: dque
        @Override // defpackage.ffix
        public final Object invoke() {
            final dqur dqurVar = dqur.this;
            dqig dqigVar = new dqig() { // from class: dqud
                @Override // defpackage.dqig
                public final boolean a(Object obj, int i, Object obj2) {
                    dquo dquoVar = (dquo) obj;
                    ffcu ffcuVar = null;
                    dqul dqulVar = dquoVar instanceof dqul ? (dqul) dquoVar : null;
                    if (dqulVar != null) {
                        dquu I = dqur.this.I(i);
                        I.getClass();
                        dqus dqusVar = (dqus) I;
                        ffud ffudVar = dqulVar.u;
                        if (ffudVar != null) {
                            ffudVar.t(null);
                        }
                        dqur dqurVar2 = dqulVar.x;
                        dqulVar.u = ffqy.d(dqurVar2.e, null, null, new dquk(dqurVar2, dqusVar, dqulVar, null), 3);
                        ffcuVar = ffcu.a;
                    }
                    return ffcuVar != null;
                }
            };
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int i = fflc.a;
            dqif.b(new ffkb(dqun.class), dqigVar, linkedHashMap);
            return dqif.a(linkedHashMap);
        }
    });
    public List i = ffel.a;
    public final ffjm l = new ffjm() { // from class: dquf
        @Override // defpackage.ffjm
        public final Object a(Object obj, Object obj2) {
            dqul dqulVar = (dqul) obj;
            dqqj dqqjVar = (dqqj) obj2;
            dqulVar.getClass();
            dqqjVar.getClass();
            dqur dqurVar = dqur.this;
            if (dqurVar.F().b) {
                return ffqy.d(dqurVar.e, null, null, new dquq(dqurVar, dqqjVar, dqulVar, null), 3);
            }
            dqurVar.J(dqulVar);
            return ffcu.a;
        }
    };
    public final ffjm m = new ffjm() { // from class: dqug
        @Override // defpackage.ffjm
        public final Object a(Object obj, Object obj2) {
            dqul dqulVar = (dqul) obj;
            dqqj dqqjVar = (dqqj) obj2;
            dqulVar.getClass();
            dqqjVar.getClass();
            dqur.this.N(dqulVar, dqqjVar, dqulVar.s);
            return true;
        }
    };

    public dqur(dqoy dqoyVar, dqkk dqkkVar, ffsk ffskVar, dqxh dqxhVar) {
        this.a = dqoyVar;
        this.d = dqkkVar;
        this.e = ffskVar;
        this.o = dqxhVar;
    }

    public final dqsv F() {
        dqsv dqsvVar = this.f;
        if (dqsvVar != null) {
            return dqsvVar;
        }
        ffkj.c("configuration");
        return null;
    }

    protected final dquo G(ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.standard_emoji_view_holder, viewGroup, false);
        inflate.getClass();
        return new dqul(this, inflate);
    }

    @Override // defpackage.vk
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public dquo e(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return G(viewGroup);
        }
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.standard_emoji_header_holder, viewGroup, false);
        inflate.getClass();
        return new dqum(inflate);
    }

    public dquu I(int i) {
        return (dquu) this.i.get(i);
    }

    public final void J(dqul dqulVar) {
        dqyg dqygVar = (dqyg) dqulVar.t.c();
        if (dqygVar == null) {
            ((enrr) n.j().h("com/google/android/libraries/compose/emoji/ui/screen/adapter/EmojiAdapter", "handleDirectEmojiSelection", 182, "EmojiAdapter.kt")).t("Unable to find emoji for %s. Cannot invoke listener.", null);
            return;
        }
        dqwl dqwlVar = this.g;
        if (dqwlVar != null) {
            dqwlVar.a().invoke(new dqrp(dqygVar.b, dqygVar.a, Integer.valueOf(dqulVar.fr()), m(dqulVar.fr()), false, 16));
        }
    }

    public final void K(dqsv dqsvVar) {
        dqsvVar.getClass();
        this.f = dqsvVar;
    }

    public final void L(List list) {
        list.getClass();
        this.i = list;
    }

    public void M(Context context, int i) {
        Resources resources = context.getResources();
        this.q = resources.getDimensionPixelSize(R.dimen.emoji_gallery_padding);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.emoji_item_default_width);
        int i2 = this.q;
        int i3 = i - (i2 + i2);
        int max = Math.max(1, i3 / dimensionPixelSize);
        this.h = max;
        this.j = Math.max(1, i3 / max);
        if (this.k == 0) {
            this.k = context.getResources().getDimensionPixelSize(R.dimen.emoji_item_icon_padding);
        }
        p();
    }

    public final void N(final dqul dqulVar, final dqqj dqqjVar, View view) {
        this.o.b(dqqjVar, view, F(), new ffji() { // from class: dquc
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                dqof dqofVar = (dqof) obj;
                dqofVar.getClass();
                dqur dqurVar = this;
                int fq = dqul.this.fq();
                dqurVar.q(fq);
                dqwl dqwlVar = dqurVar.g;
                if (dqwlVar != null) {
                    dqwlVar.a().invoke(new dqrp(dqqjVar, dqofVar, Integer.valueOf(fq), dqurVar.m(fq), true));
                }
                return ffcu.a;
            }
        });
    }

    @Override // defpackage.vk
    public int a() {
        return this.i.size();
    }

    @Override // defpackage.dqox
    public final void b() {
        ffqy.d(this.e, null, null, new dqup(this, null), 3);
    }

    @Override // defpackage.vk
    public final int dE(int i) {
        return I(i).b() - 1;
    }

    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ void g(wr wrVar, int i) {
        dquo dquoVar = (dquo) wrVar;
        dquoVar.getClass();
        dquoVar.C(I(i));
    }

    public abstract dqro m(int i);

    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ void z(wr wrVar, int i, List list) {
        dquo dquoVar = (dquo) wrVar;
        dquoVar.getClass();
        list.getClass();
        if (((dqih) this.p.a()).a(dquoVar, i, list)) {
            return;
        }
        g(dquoVar, i);
    }
}
