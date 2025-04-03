package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alie {
    public static eqad a(int i, int i2) {
        eqaa eqaaVar = (eqaa) eqad.a.createBuilder();
        eqaaVar.copyOnWrite();
        eqad eqadVar = (eqad) eqaaVar.instance;
        if (i == 0) {
            throw null;
        }
        eqadVar.c = i - 1;
        eqadVar.b |= 1;
        eqaaVar.copyOnWrite();
        eqad eqadVar2 = (eqad) eqaaVar.instance;
        eqadVar2.b |= 2;
        eqadVar2.d = i2;
        return (eqad) eqaaVar.build();
    }
}
