package defpackage;

import java.io.Serializable;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class emwr extends emwb implements Serializable {
    private static final long serialVersionUID = 0;
    private final Pattern a;

    public emwr(Pattern pattern) {
        pattern.getClass();
        this.a = pattern;
    }

    @Override // defpackage.emwb
    public final emwa a(CharSequence charSequence) {
        return new emwq(this.a.matcher(charSequence));
    }

    public final String toString() {
        return this.a.toString();
    }
}
