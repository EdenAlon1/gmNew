package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class finc extends fiqt {
    private final fimu a = new fimu();
    private final List b;
    private final List c;
    private boolean d;

    public finc(List list, fiqr fiqrVar) {
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        this.d = true;
        this.c = list;
        arrayList.add(fiqrVar);
    }

    public static List a(fiqr fiqrVar) {
        CharSequence charSequence = fiqrVar.a;
        int d = fipd.d(charSequence, 0, charSequence.length());
        int length = charSequence.length();
        if (charSequence.charAt(d) == '|') {
            d++;
            length = fipd.e(charSequence, charSequence.length() - 1, d) + 1;
        }
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        int i = d;
        while (d < length) {
            char charAt = charSequence.charAt(d);
            if (charAt == '\\') {
                int i2 = d + 1;
                if (i2 >= length || charSequence.charAt(i2) != '|') {
                    sb.append('\\');
                } else {
                    sb.append('|');
                    d = i2;
                }
            } else if (charAt != '|') {
                sb.append(charAt);
            } else {
                String sb2 = sb.toString();
                fiqrVar.a(i, d);
                arrayList.add(new fiqr(sb2, null));
                sb.setLength(0);
                i = d + 1;
            }
            d++;
        }
        if (sb.length() > 0) {
            String sb3 = sb.toString();
            fiqrVar.a(i, fiqrVar.a.length());
            arrayList.add(new fiqr(sb3, null));
        }
        return arrayList;
    }

    private final fimx i(fiqr fiqrVar, int i, fiql fiqlVar) {
        fimx fimxVar = new fimx();
        fiqf fiqfVar = fiqrVar.b;
        if (i < this.c.size()) {
        }
        CharSequence charSequence = fiqrVar.a;
        int d = fipd.d(charSequence, 0, charSequence.length());
        fiqlVar.a(fiqs.c(fiqrVar.a(d, fipd.e(charSequence, charSequence.length() - 1, d) + 1)), fimxVar);
        return fimxVar;
    }

    @Override // defpackage.fiqw
    public final fipf b() {
        return this.a;
    }

    @Override // defpackage.fiqw
    public final fiqv c(fiqz fiqzVar) {
        finn finnVar = (finn) fiqzVar;
        CharSequence charSequence = finnVar.c.a;
        int b = fipd.b('|', charSequence, finnVar.f);
        if (b == -1) {
            return null;
        }
        if (b != finnVar.f || fipd.d(charSequence, b + 1, charSequence.length()) != charSequence.length()) {
            return new fine(finnVar.d, -1, false);
        }
        this.d = false;
        return null;
    }

    @Override // defpackage.fiqt, defpackage.fiqw
    public final void d(fiqr fiqrVar) {
        this.b.add(fiqrVar);
    }

    @Override // defpackage.fiqt, defpackage.fiqw
    public final void e(fiql fiqlVar) {
        List e = this.a.e();
        fiqf fiqfVar = !e.isEmpty() ? (fiqf) e.get(0) : null;
        fimy fimyVar = new fimy();
        if (fiqfVar != null) {
            fimyVar.f(fiqfVar);
        }
        this.a.g(fimyVar);
        fimz fimzVar = new fimz();
        fimzVar.i(fimyVar.e());
        fimyVar.g(fimzVar);
        List a = a((fiqr) this.b.get(0));
        int size = a.size();
        for (int i = 0; i < size; i++) {
            fimzVar.g(i((fiqr) a.get(i), i, fiqlVar));
        }
        int i2 = 2;
        fimv fimvVar = null;
        while (i2 < this.b.size()) {
            fiqr fiqrVar = (fiqr) this.b.get(i2);
            fiqf fiqfVar2 = i2 < e.size() ? (fiqf) e.get(i2) : null;
            List a2 = a(fiqrVar);
            fimz fimzVar2 = new fimz();
            if (fiqfVar2 != null) {
                fimzVar2.f(fiqfVar2);
            }
            int i3 = 0;
            while (i3 < size) {
                fimzVar2.g(i(i3 < a2.size() ? (fiqr) a2.get(i3) : new fiqr("", null), i3, fiqlVar));
                i3++;
            }
            if (fimvVar == null) {
                fimvVar = new fimv();
                this.a.g(fimvVar);
            }
            fimvVar.g(fimzVar2);
            fimvVar.f(fiqfVar2);
            i2++;
        }
    }

    @Override // defpackage.fiqt, defpackage.fiqw
    public final boolean f() {
        return this.d;
    }
}
