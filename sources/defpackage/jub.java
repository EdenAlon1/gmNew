package defpackage;

import java.text.BreakIterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jub implements juk {
    @Override // defpackage.juk
    public final void a(juo juoVar) {
        if (juoVar.k()) {
            juoVar.g(juoVar.c, juoVar.d);
            return;
        }
        if (juoVar.b() == -1) {
            int i = juoVar.a;
            int i2 = juoVar.b;
            juoVar.j(i, i);
            juoVar.g(i, i2);
            return;
        }
        if (juoVar.b() == 0) {
            return;
        }
        String juoVar2 = juoVar.toString();
        int b = juoVar.b();
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(juoVar2);
        juoVar.g(characterInstance.preceding(b), juoVar.b());
    }

    public final boolean equals(Object obj) {
        return obj instanceof jub;
    }

    public final int hashCode() {
        int i = fflc.a;
        return new ffkb(getClass()).hashCode();
    }

    public final String toString() {
        return "BackspaceCommand()";
    }
}
