package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fioi extends fiqu {
    @Override // defpackage.fiqx
    public final fiqy a(fiqz fiqzVar, finl finlVar) {
        finn finnVar = (finn) fiqzVar;
        if (finnVar.g >= 4) {
            return null;
        }
        CharSequence charSequence = finnVar.c.a;
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = finnVar.f; i4 < length; i4++) {
            char charAt = charSequence.charAt(i4);
            if (charAt != '\t' && charAt != ' ') {
                if (charAt == '*') {
                    i3++;
                } else if (charAt == '-') {
                    i++;
                } else {
                    if (charAt != '_') {
                        return null;
                    }
                    i2++;
                }
            }
        }
        if (i >= 3 && i2 == 0) {
            if (i3 != 0) {
                i2 = 0;
            }
            finh finhVar = new finh(new fioj());
            finhVar.b = charSequence.length();
            return finhVar;
        }
        if ((i2 < 3 || i != 0 || i3 != 0) && (i3 < 3 || i != 0 || i2 != 0)) {
            return null;
        }
        finh finhVar2 = new finh(new fioj());
        finhVar2.b = charSequence.length();
        return finhVar2;
    }
}
