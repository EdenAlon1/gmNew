package defpackage;

import android.content.Context;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aapt {
    public final Context a;
    public final String b;
    public final String c;
    public final abct d;
    public final aigz e;
    public final aolr f;
    private final ffbz g;

    public aapt(Context context, String str, String str2, abct abctVar, aigz aigzVar, aolr aolrVar) {
        context.getClass();
        aigzVar.getClass();
        aolrVar.getClass();
        this.a = context;
        this.b = str;
        this.c = str2;
        this.d = abctVar;
        this.e = aigzVar;
        this.f = aolrVar;
        this.g = ffca.a(new ffix() { // from class: aapo
            @Override // defpackage.ffix
            public final Object invoke() {
                return new ffpa("\\d{1}-\\d{3}-\\d{3}-\\d{4}");
            }
        });
    }

    public final String a(String str) {
        return this.f.p(str).G().toString();
    }

    public final List b(String str) {
        ffpa ffpaVar = (ffpa) this.g.a();
        if (str.length() >= 0) {
            return ffno.g(ffno.i(new ffnk(new ffoy(ffpaVar, str), ffoz.a), new ffji() { // from class: aapq
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    final ffos ffosVar = (ffos) obj;
                    ffosVar.getClass();
                    dlus dlusVar = dlus.c;
                    int i = ffosVar.b().a;
                    int i2 = ffosVar.b().b + 1;
                    String a = ffosVar.a();
                    final aapt aaptVar = aapt.this;
                    return new dlto(dlusVar, i, i2, a, new ffji() { // from class: aapr
                        @Override // defpackage.ffji
                        public final Object invoke(Object obj2) {
                            aapt aaptVar2 = aapt.this;
                            aaptVar2.e.h(new aijf(aaptVar2.f.p(ffosVar.a()), null));
                            return true;
                        }
                    });
                }
            }));
        }
        throw new IndexOutOfBoundsException("Start index out of bounds: 0, input length: " + str.length());
    }
}
