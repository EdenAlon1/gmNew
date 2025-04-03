package defpackage;

import android.content.Context;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bcxo {
    private final Context a;

    public bcxo(Context context) {
        this.a = context;
    }

    public static final bcxr c(engw engwVar, bcxq bcxqVar) {
        int i = engw.d;
        return new bcxr(engwVar, bcxqVar, enou.a);
    }

    public static final bcxr d() {
        int i = engw.d;
        return c(enou.a, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    public final bcxr a(engw engwVar) {
        int i = engw.d;
        engr engrVar = new engr();
        int size = engwVar.size();
        bcxq bcxqVar = null;
        for (int i2 = 0; i2 < size; i2++) {
            aztg aztgVar = (aztg) engwVar.get(i2);
            Context context = this.a;
            emxf.a(aztgVar.i());
            bcxq h = bcxq.h(context, aztgVar.c(), aztgVar.h(), aztgVar.f(), aztgVar.e(), aztgVar.g(), (String) aztgVar.b().map(new Function() { // from class: bcxp
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((aoku) obj).G().a;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).orElse(null));
            if (aztgVar.j()) {
                bcxqVar = h;
            } else {
                engrVar.h(h);
            }
        }
        engw g = engrVar.g();
        if (ctid.c && bcxqVar == null && ((enou) g).c > 1) {
            bcxqVar = (bcxq) g.get(0);
        }
        return c(g, bcxqVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final bcxr b(engw engwVar) {
        int i = engw.d;
        engr engrVar = new engr();
        int i2 = 0;
        while (i2 < engwVar.size()) {
            aqux aquxVar = (aqux) engwVar.get(i2);
            int i3 = i2 + 1;
            Context context = this.a;
            emxf.a(aquxVar.t());
            engrVar.h(bcxq.h(context, i3, aquxVar.o(), aquxVar.a(), aquxVar.b(), aquxVar.g(), aquxVar.n()));
            i2 = i3;
        }
        engw g = engrVar.g();
        return new bcxr(g, !g.isEmpty() ? (bcxq) g.get(0) : null, engwVar);
    }
}
