package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jun {
    public jvu a = new jvu(jlp.a, jpm.a, (jpm) null);
    public juo b;

    public jun() {
        jvu jvuVar = this.a;
        this.b = new juo(jvuVar.b, jvuVar.c);
    }

    public final jvu a(List list) {
        juk jukVar;
        juk jukVar2 = null;
        try {
            int size = list.size();
            int i = 0;
            juk jukVar3 = null;
            while (i < size) {
                try {
                    jukVar = (juk) list.get(i);
                } catch (Exception e) {
                    e = e;
                    jukVar2 = jukVar3;
                }
                try {
                    jukVar.a(this.b);
                    i++;
                    jukVar3 = jukVar;
                } catch (Exception e2) {
                    e = e2;
                    jukVar2 = jukVar;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Error while applying EditCommand batch to buffer (length=" + this.b.c() + ", composition=" + this.b.e() + ", selection=" + ((Object) jpm.f(this.b.d())) + "):");
                    sb.append('\n');
                    ffdx.aD(list, sb, new jum(jukVar2), 60);
                    throw new RuntimeException(sb.toString(), e);
                }
            }
            jlm jlmVar = new jlm(this.b.toString());
            long d = this.b.d();
            jpm jpmVar = true != jpm.j(this.a.c) ? new jpm(d) : null;
            jvu jvuVar = new jvu(jlmVar, jpmVar != null ? jpmVar.b : jpn.a(jpm.c(d), jpm.d(d)), this.b.e());
            this.a = jvuVar;
            return jvuVar;
        } catch (Exception e3) {
            e = e3;
        }
    }
}
