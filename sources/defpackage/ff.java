package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ff implements adf {
    final /* synthetic */ fr a;

    public ff(fr frVar) {
        this.a = frVar;
    }

    @Override // defpackage.adf
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ade adeVar = (ade) obj;
        fk fkVar = (fk) this.a.t.pollLast();
        if (fkVar == null) {
            toString();
            Log.w("FragmentManager", "No Activities were started for result for ".concat(toString()));
            return;
        }
        ge geVar = this.a.b;
        String str = fkVar.a;
        ea c = geVar.c(str);
        if (c == null) {
            Log.w("FragmentManager", "Activity result delivered for unknown Fragment ".concat(String.valueOf(str)));
        } else {
            c.af(fkVar.b, adeVar.a, adeVar.b);
        }
    }
}
