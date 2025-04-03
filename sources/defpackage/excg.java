package defpackage;

import android.text.style.BackgroundColorSpan;
import android.text.style.CharacterStyle;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class excg extends BackgroundColorSpan {
    private static final CharacterStyle a = new excf();

    public excg(int i) {
        super(i);
    }

    @Override // android.text.style.CharacterStyle
    public final CharacterStyle getUnderlying() {
        return a;
    }
}
