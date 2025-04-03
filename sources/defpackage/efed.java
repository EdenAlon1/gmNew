package defpackage;

import java.io.OutputStream;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efed implements efbi {
    public efcf[] a;

    @Override // defpackage.efbi
    public final /* bridge */ /* synthetic */ Object a(efbh efbhVar) {
        List a = efbhVar.a(efbhVar.b.g(efbhVar.f));
        efcf[] efcfVarArr = this.a;
        if (efcfVarArr != null) {
            for (int i = 0; i <= 0; i++) {
                efcfVarArr[i].a(a);
            }
        }
        return (OutputStream) a.get(0);
    }
}
