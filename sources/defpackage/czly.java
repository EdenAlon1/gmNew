package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import androidx.emoji.widget.EmojiAppCompatTextView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class czly extends EmojiAppCompatTextView implements fbat {
    private ekkz a;
    private boolean b;

    public czly(Context context) {
        super(context);
        if (isInEditMode()) {
            return;
        }
        b();
    }

    @Override // defpackage.fbat
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ekkz aW() {
        if (this.a == null) {
            this.a = new ekkz(this);
        }
        return this.a;
    }

    @Override // defpackage.fbas
    public final Object aX() {
        return aW().aX();
    }

    protected final void b() {
        if (this.b) {
            return;
        }
        this.b = true;
        ((czhh) aX()).as();
    }

    public czly(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        b();
    }

    public czly(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        b();
    }
}
