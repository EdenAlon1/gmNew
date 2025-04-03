package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enoo extends enom implements Serializable {
    static final enom a = new enoo();
    private static final long serialVersionUID = 0;

    private enoo() {
    }

    @Override // defpackage.enom, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        enop enopVar = (enop) obj;
        enop enopVar2 = (enop) obj2;
        return enem.b.c(enopVar.b, enopVar2.b).c(enopVar.c, enopVar2.c).a();
    }
}
