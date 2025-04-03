package defpackage;

import android.content.Context;
import android.support.v7.widget.AppCompatTextView;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import j$.util.Collection;
import j$.util.function.Predicate$CC;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class durw extends duue {
    private static final enru a = enru.c("com/google/android/libraries/inputmethod/emoji/picker/EmojiListHolderAdapter");
    private engw d;
    private final int e;
    private final int f;
    private final duqi g;
    private final duvr h;
    private final View.OnClickListener i;
    private final duur j;
    private final LayoutInflater k;
    private final CharSequence l;

    public durw(int i, int i2, duqi duqiVar, duvr duvrVar, Context context, View.OnClickListener onClickListener, duur duurVar, CharSequence charSequence) {
        super(context);
        this.e = i;
        this.f = i2;
        this.g = duqiVar;
        this.h = duvrVar;
        this.i = onClickListener;
        this.j = duurVar;
        this.l = charSequence;
        int i3 = engw.d;
        this.d = enou.a;
        this.k = LayoutInflater.from(context);
    }

    @Override // defpackage.vk
    public final int a() {
        return ((enou) this.d).c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vk
    public final int dE(int i) {
        return ((duuf) this.d.get(i)).a();
    }

    @Override // defpackage.vk
    public final wr e(ViewGroup viewGroup, int i) {
        View view;
        if (i == dutv.a) {
            return new dutw(viewGroup, this.k, L(viewGroup) / this.e, this.f, this.h);
        }
        if (i == duuc.a) {
            return new duud(viewGroup, L(viewGroup) / this.e, this.f, this.i, this.h);
        }
        if (i == dutx.a) {
            view = this.k.inflate(R.layout.emoji_picker_empty_category_text_view, viewGroup, false);
        } else if (i == duuj.a) {
            view = this.k.inflate(R.layout.loading_category_view_holder, viewGroup, false);
        } else if (i == duty.a) {
            view = this.k.inflate(R.layout.error_category_view_holder, viewGroup, false);
        } else {
            ((enrr) ((enrr) a.i()).h("com/google/android/libraries/inputmethod/emoji/picker/EmojiListHolderAdapter", "onCreateViewHolder", 135, "EmojiListHolderAdapter.java")).q("Update emoji list contains unsupported Item input.");
            View view2 = new View(this.s);
            view2.setLayoutParams(new ViewGroup.LayoutParams(L(viewGroup) / this.e, this.f));
            view = view2;
        }
        return new durv(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vk
    public final void g(wr wrVar, int i) {
        int dE = dE(i);
        if (dE == dutv.a) {
            dutv dutvVar = (dutv) this.d.get(i);
            dutw dutwVar = (dutw) wrVar;
            final CharSequence charSequence = this.l;
            boolean z = false;
            if (charSequence != null && (dutvVar.d.contentEquals(charSequence) || Collection.EL.stream(dutvVar.e).anyMatch(new Predicate() { // from class: duru
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
                    return ((String) obj).contentEquals(charSequence);
                }
            }))) {
                z = true;
            }
            duvh duvhVar = new duvh(duum.a(dutvVar, dutvVar.c, dutvVar.b, -1, this.g));
            duvhVar.f(z);
            dutwVar.C(duvhVar.a(), dutvVar.e);
            K(-1, this.e, dutwVar.a);
            J(dutwVar.a, dutvVar);
            return;
        }
        if (dE == duuc.a) {
            throw null;
        }
        if (dE == dutx.a) {
            AppCompatTextView appCompatTextView = (AppCompatTextView) wrVar.a.findViewById(R.id.emoji_picker_empty_category_view);
            if (appCompatTextView != null) {
                appCompatTextView.setText(((dutx) this.d.get(i)).c);
                return;
            }
            return;
        }
        if (dE == duty.a) {
            TextView textView = (TextView) wrVar.a.findViewById(R.id.error_category_text);
            textView.setText((CharSequence) null);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    public final void m(engw engwVar) {
        this.d = duui.a(this.g.a(), engwVar, -1, this.j, true, true);
        p();
    }
}
