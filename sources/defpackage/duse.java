package defpackage;

import com.google.android.libraries.inputmethod.emoji.picker.EmojiPickerBodyRecyclerView;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class duse extends tx {
    final /* synthetic */ durk c;
    final /* synthetic */ EmojiPickerBodyRecyclerView d;

    public duse(EmojiPickerBodyRecyclerView emojiPickerBodyRecyclerView, durk durkVar) {
        this.c = durkVar;
        this.d = emojiPickerBodyRecyclerView;
    }

    @Override // defpackage.tx
    public final int b(int i) {
        vk vkVar = this.d.n;
        if (vkVar == null) {
            return 1;
        }
        int dE = vkVar.dE(i);
        if (dE == durh.a || dE == dutx.a || dE == duuj.a || dE == duty.a) {
            return this.c.a;
        }
        return 1;
    }
}
