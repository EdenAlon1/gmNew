package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zgv {
    public final Map a;
    public final List b;
    public final boolean c;
    public final fgdj d;
    public final hho e;
    private final ffsk f;

    public zgv(ffsk ffskVar, Map map, List list, boolean z, fgdj fgdjVar, hho hhoVar) {
        this.f = ffskVar;
        this.a = map;
        this.b = list;
        this.c = z;
        this.d = fgdjVar;
        this.e = hhoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zgv)) {
            return false;
        }
        zgv zgvVar = (zgv) obj;
        return ffkj.e(this.f, zgvVar.f) && ffkj.e(this.a, zgvVar.a) && ffkj.e(this.b, zgvVar.b) && this.c == zgvVar.c && ffkj.e(this.d, zgvVar.d) && ffkj.e(this.e, zgvVar.e);
    }

    public final int hashCode() {
        return (((((((((this.f.hashCode() * 31) + this.a.hashCode()) * 31) + this.b.hashCode()) * 31) + (true != this.c ? 1237 : 1231)) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "MessageListUiData(coroutineScope=" + this.f + ", mediaViewerUiDataMap=" + this.a + ", attachmentRendererUiDataList=" + this.b + ", dynamicallyOffsetPages=" + this.c + ", footerUiDataFlow=" + this.d + ", pagingState=" + this.e + ")";
    }
}
