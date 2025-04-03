package defpackage;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.google.android.libraries.inputmethod.emoji.picker.EmojiPickerBodyRecyclerView;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dusf extends wc {
    private static final enru a = enru.c("com/google/android/libraries/inputmethod/emoji/picker/EmojiPickerBodyScrollListener");
    private final dusz b;
    private int c = -1;

    public dusf(dusz duszVar) {
        this.b = duszVar;
    }

    @Override // defpackage.wc
    public final void a(RecyclerView recyclerView, int i, int i2) {
        int K;
        if (!(recyclerView instanceof EmojiPickerBodyRecyclerView)) {
            ((enrr) a.a(duwj.a).h("com/google/android/libraries/inputmethod/emoji/picker/EmojiPickerBodyScrollListener", "onScrolled", 28, "EmojiPickerBodyScrollListener.java")).q("Scroll listener not attached to EmojiPickerBodyRecyclerView.");
            return;
        }
        EmojiPickerBodyRecyclerView emojiPickerBodyRecyclerView = (EmojiPickerBodyRecyclerView) recyclerView;
        vk vkVar = emojiPickerBodyRecyclerView.n;
        if (!(vkVar instanceof dusd)) {
            ((enrr) a.a(duwj.a).h("com/google/android/libraries/inputmethod/emoji/picker/EmojiPickerBodyScrollListener", "onScrolled", 36, "EmojiPickerBodyScrollListener.java")).q("EmojiPickerBodyRecyclerView's adapter is not an EmojiPickerBodyAdapter.");
            return;
        }
        dusd dusdVar = (dusd) vkVar;
        vx vxVar = emojiPickerBodyRecyclerView.o;
        if (vxVar instanceof GridLayoutManager) {
            K = ((GridLayoutManager) vxVar).K();
        } else {
            ((enrr) ((enrr) EmojiPickerBodyRecyclerView.ac.i()).h("com/google/android/libraries/inputmethod/emoji/picker/EmojiPickerBodyRecyclerView", "findFirstCompletelyVisibleItemPosition", 193, "EmojiPickerBodyRecyclerView.java")).q("findFirstCompletelyVisibleItemPosition() : Cannot find layout manager.");
            K = -1;
        }
        int i3 = this.c;
        if (i3 == K || K == -1) {
            return;
        }
        int m = i3 == -1 ? 0 : dusdVar.m(i3);
        int m2 = dusdVar.m(K);
        int i4 = emojiPickerBodyRecyclerView.ae;
        dusdVar.G(m2);
        if ((m != m2 || m2 != i4) && (i != 0 || i2 != 0)) {
            this.b.c(m2, 5);
            emojiPickerBodyRecyclerView.ae = m2;
        }
        this.c = K;
    }
}
