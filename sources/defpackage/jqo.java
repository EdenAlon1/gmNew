package defpackage;

import java.text.BreakIterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jqo extends jqm {
    private final CharSequence a;
    private final BreakIterator b;

    public jqo(CharSequence charSequence) {
        this.a = charSequence;
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(charSequence.toString());
        this.b = characterInstance;
    }

    @Override // defpackage.jqm
    public final int a(int i) {
        return this.b.following(i);
    }

    @Override // defpackage.jqm
    public final int d(int i) {
        return this.b.preceding(i);
    }
}
