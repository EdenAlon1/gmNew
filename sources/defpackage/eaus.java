package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eaus {
    public static final easy a(eaur eaurVar) {
        int i = eaurVar.b;
        int i2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? 0 : 5 : 4 : 3 : 2 : 1 : 6;
        if (i2 == 0) {
            throw null;
        }
        int i3 = i2 - 1;
        if (i3 == 0) {
            String str = (i == 1 ? (eaum) eaurVar.c : eaum.a).b;
            str.getClass();
            return new eatf(str);
        }
        if (i3 == 1) {
            return eaua.a;
        }
        if (i3 == 2) {
            return eaty.a;
        }
        if (i3 == 3) {
            String str2 = (i == 4 ? (eaui) eaurVar.c : eaui.a).b;
            str2.getClass();
            return new eatb(str2);
        }
        if (i3 != 4) {
            if (i3 != 5) {
                throw new ffcd();
            }
            throw new IllegalStateException("Account not set in account representation proto");
        }
        String str3 = (i == 5 ? (eauk) eaurVar.c : eauk.a).b;
        str3.getClass();
        return new eatd(str3, (eaurVar.b == 5 ? (eauk) eaurVar.c : eauk.a).c);
    }
}
