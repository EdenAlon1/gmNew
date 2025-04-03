package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.ContextThemeWrapper;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.inputmethod.emoji.picker.EmojiPickerLayoutManager;
import com.google.android.libraries.inputmethod.emoji.view.CustomImageView;
import com.google.android.libraries.inputmethod.emoji.view.EmojiView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class durt implements AutoCloseable {
    public static final enru a = enru.c("com/google/android/libraries/inputmethod/emoji/picker/EmojiListController");
    public final Context b;
    public final duqi c;
    public final duua d;
    public final RecyclerView e;
    public final durr f;
    public final durw g;
    public float h;
    public final dura i;

    public durt(duqi duqiVar, dura duraVar, durr durrVar, RecyclerView recyclerView, dury duryVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(recyclerView.getContext(), R.style.EmojiPicker);
        this.b = contextThemeWrapper;
        this.c = duqiVar;
        this.i = duraVar;
        this.f = durrVar;
        duryVar.g();
        boolean d = duryVar.d();
        duryVar.h();
        dutr dutrVar = new dutr(contextThemeWrapper, d);
        this.d = dutrVar;
        dutrVar.c = new View.OnClickListener() { // from class: durl
            /* JADX WARN: Type inference failed for: r2v2, types: [duqz, dura] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (!(view instanceof EmojiView)) {
                    ((enrr) ((enrr) durt.a.i()).h("com/google/android/libraries/inputmethod/emoji/picker/EmojiListController", "createEmojiVariantClickListener", 125, "EmojiListController.java")).t("Clicked view is not EmojiView: %s", view);
                    return;
                }
                durt durtVar = durt.this;
                EmojiView emojiView = (EmojiView) view;
                durtVar.c.d(((duvi) emojiView.c).a);
                duqy.b(durtVar.i, duvf.a(((duvi) emojiView.c).a));
                durtVar.f.b(emojiView.c);
                durtVar.g.q(((duvi) emojiView.c).b);
            }
        };
        int a2 = duryVar.a();
        int b = duryVar.b();
        duro duroVar = new duro(this);
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: durn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                duwz.a(view.getContext()).d(view);
                if (view instanceof CustomImageView) {
                    duvu duvuVar = ((CustomImageView) view).a;
                    throw null;
                }
                ((enrr) ((enrr) durt.a.i()).h("com/google/android/libraries/inputmethod/emoji/picker/EmojiListController", "createImageClickListener", 59, "EmojiListController.java")).t("Clicked view is not CustomImageView: %s", view);
            }
        };
        duur duurVar = duut.instance.j;
        duryVar.f();
        duryVar.e();
        durw durwVar = new durw(a2, b, duqiVar, duroVar, contextThemeWrapper, onClickListener, duurVar, duryVar.c());
        this.g = durwVar;
        recyclerView.am(durwVar);
        EmojiPickerLayoutManager emojiPickerLayoutManager = new EmojiPickerLayoutManager(duryVar.a());
        emojiPickerLayoutManager.g = new durp(this, duryVar);
        recyclerView.ap(emojiPickerLayoutManager);
        recyclerView.al(new durs(this, recyclerView));
        this.e = recyclerView;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.d.a();
    }
}
