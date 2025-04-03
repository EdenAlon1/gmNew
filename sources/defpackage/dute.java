package defpackage;

import android.content.Context;
import android.os.Trace;
import android.support.v7.widget.AppCompatTextView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
class dute extends duue {
    public static final enru g = enru.c("com/google/android/libraries/inputmethod/emoji/picker/EmojiPickerCoreBodyAdapter");
    private CharSequence a;
    private final duqj d;
    private final int e;
    private final Map f;
    protected final engw h;
    protected final int i;
    protected final float j;
    protected final int k;
    protected final int l;
    public int m;
    public Set n;
    public final duqh o;
    protected final duvr p;
    protected duug q;
    protected final LayoutInflater r;

    protected dute(Context context, dutt duttVar, engw engwVar, duvr duvrVar, duqj duqjVar, duqh duqhVar) {
        super(context);
        this.m = -1;
        this.n = new HashSet();
        new HashSet();
        this.f = new HashMap();
        ((enrr) ((enrr) g.f()).h("com/google/android/libraries/inputmethod/emoji/picker/EmojiPickerCoreBodyAdapter", "<init>", 115, "EmojiPickerCoreBodyAdapter.java")).t("Initializing EmojiPickerCoreBodyAdapter with options: %s", duttVar.toString());
        this.i = duttVar.c();
        this.j = duttVar.a();
        this.k = duttVar.g();
        this.l = duttVar.e();
        duttVar.n();
        this.a = duttVar.h();
        duttVar.s();
        duttVar.p();
        duttVar.m();
        duttVar.x();
        this.h = engwVar;
        this.p = duvrVar;
        this.d = duqjVar;
        this.o = duqhVar;
        int i = engw.d;
        engr engrVar = new engr();
        for (int i2 = 0; i2 < ((enou) engwVar).c; i2++) {
            engrVar.h(enou.a);
        }
        this.q = new duug(engrVar.g(), duttVar.e(), duttVar.c());
        duttVar.t();
        this.e = this.q.e;
        this.r = LayoutInflater.from(context);
    }

    final int F(int i) {
        return this.q.b(i);
    }

    final int G(int i) {
        duug duugVar = this.q;
        if (i < duugVar.b) {
            return duugVar.d[i];
        }
        ((enrr) duug.a.a(duwj.a).h("com/google/android/libraries/inputmethod/emoji/picker/ItemViewDataFlatList", "getCategoryStartPosition", 152, "ItemViewDataFlatList.java")).u("Too large categoryIndex (%s vs %s)", i, duugVar.b);
        return 0;
    }

    protected final int H() {
        return this.q.b;
    }

    protected final void I(duvq duvqVar, boolean z) {
        int i;
        if (z) {
            String str = ((duvi) duvqVar).a;
            if (this.o.c(str).isEmpty()) {
                return;
            }
            dutd dutdVar = (dutd) this.f.get(this.o.d(str));
            if (dutdVar != null) {
                if (this.d.e() == 2) {
                    u(G(dutdVar.a), this.q.b(dutdVar.a));
                    return;
                }
                if (this.d.e() != 1) {
                    p();
                    return;
                }
                int i2 = dutdVar.a;
                int G = (i2 < this.q.e && (i = dutdVar.b) >= 0 && i < F(i2)) ? G(i2) + i : -1;
                if (G != -1) {
                    q(G);
                }
            }
        }
    }

    @Override // defpackage.vk
    public final int a() {
        int i = this.q.e;
        if (i == this.e) {
            return 0;
        }
        return i;
    }

    @Override // defpackage.vk
    public final int dE(int i) {
        return this.q.get(i).a();
    }

    @Override // defpackage.vk
    public wr e(ViewGroup viewGroup, int i) {
        View view;
        wr dutwVar;
        ozg.a("EmojiPickerCoreBodyAdapter.onCreateViewHolder");
        try {
            if (i == durh.a) {
                view = this.r.inflate(R.layout.category_text_view, viewGroup, false);
                view.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            } else if (i == dutx.a) {
                View inflate = this.r.inflate(R.layout.emoji_picker_empty_category_text_view, viewGroup, false);
                inflate.setMinimumHeight(this.j > 0.0f ? (int) (viewGroup.getMeasuredHeight() / this.j) : this.k);
                view = inflate;
            } else {
                if (i == dutv.a) {
                    dutwVar = new dutw(viewGroup, this.r, L(viewGroup) / this.i, this.j < 0.0f ? this.k : (int) (viewGroup.getMeasuredHeight() / this.j), this.p);
                    return dutwVar;
                }
                if (i == durj.a) {
                    view = new View(this.s);
                    view.setLayoutParams(new ViewGroup.LayoutParams(L(viewGroup) / this.i, this.j < 0.0f ? this.k : (int) (viewGroup.getMeasuredHeight() / this.j)));
                } else {
                    ((enrr) ((enrr) g.i()).h("com/google/android/libraries/inputmethod/emoji/picker/EmojiPickerCoreBodyAdapter", "onCreateViewHolder", 183, "EmojiPickerCoreBodyAdapter.java")).q("EmojiPickerCoreBodyAdapter gets unsupported view type.");
                    view = new View(this.s);
                    view.setLayoutParams(new ViewGroup.LayoutParams(L(viewGroup) / this.i, this.k));
                }
            }
            dutwVar = new dutc(view);
            return dutwVar;
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vk
    public void g(wr wrVar, int i) {
        boolean z;
        int i2 = wrVar.f;
        View view = wrVar.a;
        if (i2 == durh.a) {
            int a = this.q.a(i);
            String str = ((durh) this.q.get(i)).b;
            if (str.isEmpty()) {
                str = (String) this.h.get(a);
            }
            if (!str.isEmpty()) {
                duma.e(view, str);
            }
            AppCompatTextView appCompatTextView = (AppCompatTextView) view.findViewById(R.id.category_name);
            if (a == 0) {
                Context context = this.s;
                enru enruVar = duoo.a;
                appCompatTextView.setText(context.getString(R.string.emoji_category_recent));
                appCompatTextView.setVisibility(0);
                return;
            }
            if (str.isEmpty()) {
                appCompatTextView.setVisibility(8);
                return;
            } else {
                appCompatTextView.setText(str);
                appCompatTextView.setVisibility(0);
                return;
            }
        }
        if (i2 == dutx.a) {
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) view.findViewById(R.id.emoji_picker_empty_category_view);
            String str2 = ((dutx) this.q.get(i)).c;
            if (str2.isEmpty()) {
                str2 = this.s.getString(m(i) == 0 ? R.string.emoji_empty_recent_category : R.string.emoji_empty_non_recent_category);
            }
            appCompatTextView2.setText(str2);
            return;
        }
        if (i2 == dutv.a) {
            dutv dutvVar = (dutv) this.q.get(i);
            dutw dutwVar = (dutw) wrVar;
            int m = m(i);
            int G = i - G(m);
            if (m != 0) {
                z = false;
            } else if (dutvVar.b(null)) {
                m = 0;
                z = true;
            } else {
                m = 0;
                z = false;
            }
            Set set = this.n;
            Integer valueOf = Integer.valueOf(i);
            boolean z2 = set.contains(valueOf) || dutvVar.b(this.a) || z;
            if (z2) {
                if (z) {
                    this.m = wrVar.fq();
                }
                this.n.add(valueOf);
            }
            duvh duvhVar = new duvh(duum.a(dutvVar, G, m, F(m), this.d));
            duvhVar.f(z2);
            dutwVar.C(duvhVar.a(), dutvVar.e);
            if (m > 0 && !this.o.c(dutvVar.d).isEmpty()) {
                this.f.put(this.o.d(dutvVar.d), new dutd(m, i - G(m)));
            }
            J(view, dutvVar);
        }
    }

    @Override // defpackage.vk
    public final long hb(int i) {
        return this.q.get(i).h;
    }

    final int m(int i) {
        return this.q.a(i);
    }
}
