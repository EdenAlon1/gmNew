package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fino extends fiqu {
    @Override // defpackage.fiqx
    public final fiqy a(fiqz fiqzVar, finl finlVar) {
        finp finpVar;
        finn finnVar = (finn) fiqzVar;
        int i = finnVar.g;
        if (i >= 4) {
            return null;
        }
        int i2 = finnVar.f;
        CharSequence charSequence = finnVar.c.a;
        int length = charSequence.length();
        int i3 = 0;
        int i4 = 0;
        for (int i5 = i2; i5 < length; i5++) {
            char charAt = charSequence.charAt(i5);
            if (charAt == '`') {
                i3++;
            } else {
                if (charAt != '~') {
                    break;
                }
                i4++;
            }
        }
        if (i3 < 3 || i4 != 0) {
            if (i4 >= 3 && i3 == 0) {
                finpVar = new finp('~', i4, i);
            }
            finpVar = null;
        } else {
            if (fipd.b('`', charSequence, i2 + i3) == -1) {
                finpVar = new finp('`', i3, i);
            }
            finpVar = null;
        }
        if (finpVar == null) {
            return null;
        }
        finh finhVar = new finh(finpVar);
        finhVar.b = i2 + finpVar.a.b;
        return finhVar;
    }
}
