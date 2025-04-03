package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enun extends entm {
    final /* synthetic */ Set a;
    private final entz b;

    public enun(Set set) {
        this.a = set;
        this.b = enuc.a(set);
    }

    @Override // defpackage.entm
    public final String a(entl entlVar, enuj enujVar) {
        if (!enuo.b(entlVar, enujVar, this.a)) {
            return enuo.a(entlVar);
        }
        StringBuilder sb = new StringBuilder();
        entg.c(entlVar, sb);
        enuo.c(enujVar, this.b, sb);
        return sb.toString();
    }
}
