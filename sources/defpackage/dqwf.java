package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.inputmethod.emoji.picker.EmojiPickerBodyRecyclerView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqwf {
    public final EmojiPickerBodyRecyclerView a;
    public final View b;
    public final RecyclerView c;
    public final ImageButton d;

    public dqwf(ViewGroup viewGroup) {
        View findViewById = viewGroup.findViewById(R.id.emoji_gallery_container);
        findViewById.getClass();
        View findViewById2 = viewGroup.findViewById(R.id.emoji_gallery_recycler_view);
        findViewById2.getClass();
        this.a = (EmojiPickerBodyRecyclerView) findViewById2;
        View findViewById3 = viewGroup.findViewById(R.id.recycler_view_bottom_border_view);
        findViewById3.getClass();
        this.b = findViewById3;
        View findViewById4 = viewGroup.findViewById(R.id.emoji_categories_list);
        findViewById4.getClass();
        this.c = (RecyclerView) findViewById4;
        View findViewById5 = viewGroup.findViewById(R.id.emoji_bar_backspace);
        findViewById5.getClass();
        this.d = (ImageButton) findViewById5;
    }
}
