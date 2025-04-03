package defpackage;

import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fins extends fiqu {
    @Override // defpackage.fiqx
    public final fiqy a(fiqz fiqzVar, finl finlVar) {
        finn finnVar = (finn) fiqzVar;
        int i = finnVar.f;
        CharSequence charSequence = finnVar.c.a;
        if (finnVar.g >= 4 || charSequence.charAt(i) != '<') {
            return null;
        }
        int i2 = 1;
        while (true) {
            int i3 = 7;
            if (i2 > 7) {
                return null;
            }
            if (i2 == 7) {
                if (!(finlVar.a.b() instanceof fiqd) && !fiqzVar.a().f()) {
                    i2 = 7;
                }
                i2 = i3 + 1;
            }
            Pattern pattern = fint.a[i2][0];
            Pattern pattern2 = fint.a[i2][1];
            if (pattern.matcher(charSequence.subSequence(i, charSequence.length())).find()) {
                finh finhVar = new finh(new fint(pattern2));
                finhVar.b = finnVar.d;
                return finhVar;
            }
            i3 = i2;
            i2 = i3 + 1;
        }
    }
}
