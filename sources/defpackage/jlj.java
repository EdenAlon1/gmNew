package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jlj implements Appendable {
    public final List a;
    private final StringBuilder b;
    private final List c;

    public jlj() {
        this((byte[]) null);
    }

    public final int a(jou jouVar) {
        jli jliVar = new jli(jouVar, this.b.length(), 0, null, 12);
        this.c.add(jliVar);
        this.a.add(jliVar);
        return this.c.size() - 1;
    }

    @Override // java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(char c) {
        this.b.append(c);
        return this;
    }

    public final jlm b() {
        String sb = this.b.toString();
        List list = this.a;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((jli) list.get(i)).a(this.b.length()));
        }
        return new jlm(sb, arrayList);
    }

    public final void c(jmk jmkVar, int i, int i2) {
        this.a.add(new jli(jmkVar, i, i2, null, 8));
    }

    public final void d(jou jouVar, int i, int i2) {
        this.a.add(new jli(jouVar, i, i2, null, 8));
    }

    public final void e(jlm jlmVar) {
        StringBuilder sb = this.b;
        int length = sb.length();
        sb.append(jlmVar.b);
        List list = jlmVar.a;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                jlk jlkVar = (jlk) list.get(i);
                this.a.add(new jli(jlkVar.a, jlkVar.b + length, jlkVar.c + length, jlkVar.d));
            }
        }
    }

    public final void f(String str) {
        this.b.append(str);
    }

    public final void g() {
        if (this.c.isEmpty()) {
            jwo.c("Nothing to pop.");
        }
        ((jli) this.c.remove(r0.size() - 1)).a = this.b.length();
    }

    public final void h(int i) {
        if (i >= this.c.size()) {
            jwo.c(i + " should be less than " + this.c.size());
        }
        while (this.c.size() - 1 >= i) {
            g();
        }
    }

    public final void i(String str, String str2) {
        jli jliVar = new jli(new jox(str2), this.b.length(), 0, str, 4);
        this.c.add(jliVar);
        this.a.add(jliVar);
        this.c.size();
    }

    public /* synthetic */ jlj(byte[] bArr) {
        this.b = new StringBuilder(16);
        this.c = new ArrayList();
        this.a = new ArrayList();
        new ArrayList();
    }

    @Override // java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence) {
        if (charSequence instanceof jlm) {
            e((jlm) charSequence);
            return this;
        }
        this.b.append(charSequence);
        return this;
    }

    @Override // java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence, int i, int i2) {
        if (charSequence instanceof jlm) {
            jlm jlmVar = (jlm) charSequence;
            StringBuilder sb = this.b;
            String str = jlmVar.b;
            int length = sb.length();
            sb.append((CharSequence) str, i, i2);
            List a = jlp.a(jlmVar, i, i2, null);
            if (a != null) {
                int size = a.size();
                for (int i3 = 0; i3 < size; i3++) {
                    jlk jlkVar = (jlk) a.get(i3);
                    this.a.add(new jli(jlkVar.a, jlkVar.b + length, jlkVar.c + length, jlkVar.d));
                }
            }
            return this;
        }
        this.b.append(charSequence, i, i2);
        return this;
    }

    public jlj(jlm jlmVar) {
        this((byte[]) null);
        e(jlmVar);
    }

    public jlj(String str) {
        this((byte[]) null);
        f(str);
    }
}
