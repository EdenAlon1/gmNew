package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.widget.PopupWindow;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.inputmethod.emoji.picker.EmojiPickerBodyRecyclerView;
import com.google.android.libraries.inputmethod.emoji.view.EmojiView;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dusv implements duvr {
    final /* synthetic */ dutb a;

    public dusv(dutb dutbVar) {
        this.a = dutbVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        duwz.a(view.getContext()).d(view);
        if (!(view instanceof EmojiView)) {
            ((enrr) ((enrr) dutb.a.i()).h("com/google/android/libraries/inputmethod/emoji/picker/EmojiPickerController$2", "onClick", 298, "EmojiPickerController.java")).t("Clicked view is not EmojiView: %s", view);
            return;
        }
        dutb dutbVar = this.a;
        duvq duvqVar = ((EmojiView) view).c;
        dusu dusuVar = (dusu) dutbVar.B;
        dutb dutbVar2 = dusuVar.a;
        if (dutbVar2.n) {
            engw engwVar = dutbVar2.g;
            for (int i = 0; i < ((enou) engwVar).c; i++) {
                ((dura) engwVar.get(i)).d(duvf.a(((duvi) duvqVar).a));
            }
        }
        dusd dusdVar = dusuVar.a.z;
        if (dusdVar != null) {
            dusdVar.I(duvqVar, false);
        }
        dusz duszVar = dusuVar.a.c;
        if (duszVar != null) {
            duszVar.a(duvqVar);
        }
    }

    @Override // android.view.View.OnHoverListener
    public final boolean onHover(View view, MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        boolean z;
        final dusu dusuVar = (dusu) this.a.B;
        dusz duszVar = dusuVar.a.c;
        if (duszVar != null) {
            duszVar.d(view);
            z = true;
        } else {
            z = false;
        }
        EmojiView emojiView = (EmojiView) view.findViewById(R.id.emoji_view);
        if (emojiView != null && dusuVar.a.x != null) {
            engw engwVar = emojiView.b;
            if (!engwVar.isEmpty()) {
                dutb dutbVar = dusuVar.a;
                duma.a(dutbVar.b).b(R.string.open_popup_content_desc);
                EmojiPickerBodyRecyclerView emojiPickerBodyRecyclerView = dutbVar.x;
                if (emojiPickerBodyRecyclerView != null) {
                    emojiPickerBodyRecyclerView.a(false);
                }
                dusuVar.a.s.b();
                int[] iArr = {0, dusuVar.a.b.getResources().getDisplayMetrics().widthPixels};
                dutb dutbVar2 = dusuVar.a;
                dutbVar2.s.c(view, dutbVar2.x, engwVar, new PopupWindow.OnDismissListener() { // from class: dust
                    @Override // android.widget.PopupWindow.OnDismissListener
                    public final void onDismiss() {
                        dutb dutbVar3 = dusu.this.a;
                        duma.a(dutbVar3.b).b(R.string.close_popup_content_desc);
                        EmojiPickerBodyRecyclerView emojiPickerBodyRecyclerView2 = dutbVar3.x;
                        if (emojiPickerBodyRecyclerView2 != null) {
                            emojiPickerBodyRecyclerView2.a(true);
                        }
                    }
                }, dusuVar.a.A, view.getWidth(), view.getHeight(), iArr[0], iArr[1], emojiView.c, dusuVar.a.d.h());
                return true;
            }
        }
        return z;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (((dusu) this.a.B).a.c == null) {
            return false;
        }
        view.getClass();
        motionEvent.getClass();
        return false;
    }
}
