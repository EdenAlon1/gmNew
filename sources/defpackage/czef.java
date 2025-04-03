package defpackage;

import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.ui.AsyncImageView;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class czef extends wr implements View.OnClickListener, View.OnLongClickListener {
    public final AsyncImageView s;
    public final View t;
    final /* synthetic */ czeh u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public czef(czeh czehVar, View view) {
        super(view);
        this.u = czehVar;
        this.s = (AsyncImageView) view.findViewById(R.id.emoji_image);
        this.t = view.findViewById(R.id.variants_available_indicator);
    }

    private final czeb F() {
        int fr = fr();
        if (fr > 0 && fr < this.u.o.size()) {
            return (czeb) this.u.o.get(fr);
        }
        ensk i = czeh.a.i();
        i.Y(ente.a, "Bugle");
        ((enrr) ((enrr) i).h("com/google/android/apps/messaging/ui/conversation/emoji/EmojiRecyclerViewAdapter$EmojiViewHolder", "getCurrentItem", 610, "EmojiRecyclerViewAdapter.java")).q("EmojiRecyclerViewAdapter#getAdapterPosition failed");
        return null;
    }

    public final String C() {
        czeb F = F();
        if (F != null) {
            return F.a;
        }
        return null;
    }

    public final void D(String str) {
        czeh czehVar = this.u;
        czfz czfzVar = czehVar.w;
        if (czfzVar != null) {
            String a = czehVar.h.a(str);
            czga czgaVar = czfzVar.a;
            czgaVar.s.p(a);
            czgaVar.b.e(czga.a, -1);
            czgaVar.c++;
        }
        czeb F = F();
        if (F == null || F.b > 0) {
            czeh czehVar2 = this.u;
            String a2 = czehVar2.i.a(str);
            int G = czehVar2.G();
            int indexOf = czehVar2.p.indexOf(a2);
            if (indexOf == -1 || indexOf >= G) {
                if (czehVar2.p.isEmpty()) {
                    czehVar2.w(0, 2);
                } else {
                    czehVar2.s(1);
                }
                if (czehVar2.p.size() >= G) {
                    czehVar2.y(G + 1);
                }
            } else if (indexOf > 0) {
                czehVar2.t(indexOf + 1, 1);
            }
            czehVar2.l.b(a2);
        }
        if (!this.u.i.b(str).equals(str)) {
            this.u.i.f(str);
            this.u.q(fr());
        }
        this.u.g.aO();
    }

    public final boolean E(String str) {
        if (this.u.i.c(str).size() <= 1) {
            return false;
        }
        Stream stream = Collection.EL.stream(this.u.i.c(str));
        final czdp czdpVar = this.u.h;
        czdpVar.getClass();
        Stream map = stream.map(new Function() { // from class: czec
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return czdp.this.a((String) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        final cstx cstxVar = this.u.j;
        cstxVar.getClass();
        return map.allMatch(new Predicate() { // from class: czed
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo439negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return cstx.this.h((String) obj);
            }
        });
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.u.m.isShowing()) {
            this.u.m.dismiss();
            return;
        }
        String C = C();
        if (C == null) {
            return;
        }
        D(this.u.i.b(C));
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        if (this.u.m.isShowing()) {
            this.u.m.dismiss();
            return true;
        }
        String C = C();
        if (C == null || !E(C)) {
            return false;
        }
        List c = this.u.i.c(C);
        czeh czehVar = this.u;
        czee czeeVar = new czee(this);
        czer czerVar = (czer) czehVar.m;
        czerVar.d.clear();
        czerVar.d.addAll(c);
        czerVar.e.p();
        if (c.size() % 2 == 0) {
            czerVar.f.r(6);
        } else {
            czerVar.f.r(5);
        }
        czerVar.showAsDropDown(view, 0, 0, 48);
        czerVar.j = view;
        if (czerVar.b()) {
            czerVar.a();
        }
        czerVar.n = czeeVar;
        return true;
    }
}
