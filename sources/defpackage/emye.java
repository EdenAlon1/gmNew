package defpackage;

import androidx.car.app.model.Alert;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emye {
    public final emvz a;
    public final boolean b;
    public final emyd c;
    public final int d;

    public emye(emyd emydVar, boolean z, emvz emvzVar, int i) {
        this.c = emydVar;
        this.b = z;
        this.a = emvzVar;
        this.d = i;
    }

    public static emye b(char c) {
        return c(new emvp(c));
    }

    public static emye c(final emvz emvzVar) {
        return new emye(new emyd() { // from class: emxv
            @Override // defpackage.emyd
            public final Iterator a(emye emyeVar, CharSequence charSequence) {
                return new emxx(emyeVar, charSequence, emvz.this);
            }
        });
    }

    public static emye d(final String str) {
        emxf.b(str.length() != 0, "The separator may not be the empty string.");
        return str.length() == 1 ? b(str.charAt(0)) : new emye(new emyd() { // from class: emxu
            @Override // defpackage.emyd
            public final Iterator a(emye emyeVar, CharSequence charSequence) {
                return new emxy(emyeVar, charSequence, str);
            }
        });
    }

    public static emye e(String str) {
        final emwr emwrVar = new emwr(Pattern.compile(str));
        emxf.f(!((emwq) emwrVar.a("")).a.matches(), "The pattern may not match the empty string: %s", emwrVar);
        return new emye(new emyd() { // from class: emxw
            @Override // defpackage.emyd
            public final Iterator a(emye emyeVar, CharSequence charSequence) {
                return new emxz(emyeVar, charSequence, emwb.this.a(charSequence));
            }
        });
    }

    public final emye a() {
        return new emye(this.c, true, this.a, this.d);
    }

    public final emye f() {
        emvz emvzVar = emvy.b;
        emvzVar.getClass();
        return new emye(this.c, this.b, emvzVar, this.d);
    }

    public final Iterable g(CharSequence charSequence) {
        charSequence.getClass();
        return new emya(this, charSequence);
    }

    public final Iterator h(CharSequence charSequence) {
        return this.c.a(this, charSequence);
    }

    public final List i(CharSequence charSequence) {
        charSequence.getClass();
        Iterator h = h(charSequence);
        ArrayList arrayList = new ArrayList();
        while (h.hasNext()) {
            arrayList.add((String) h.next());
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    private emye(emyd emydVar) {
        this(emydVar, false, emvw.a, Alert.DURATION_SHOW_INDEFINITELY);
    }
}
