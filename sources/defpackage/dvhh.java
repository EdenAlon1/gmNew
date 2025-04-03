package defpackage;

import android.content.Context;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvhh implements dvgl {
    private final Context a;
    private final dvdy b;
    private final dvqv c;

    public dvhh(Context context, dvqv dvqvVar, dvdy dvdyVar) {
        this.a = context;
        this.b = dvdyVar;
        this.c = dvqvVar;
    }

    @Override // defpackage.dvgl
    public final dvgk a() {
        return dvgk.VALID_INTENT;
    }

    @Override // defpackage.emva
    public final /* synthetic */ boolean b(Object obj, Object obj2) {
        List<evxi> list;
        dvdp a = ((dvgn) obj2).a();
        evzd evzdVar = ((dvdj) a).a.f;
        if (evzdVar == null) {
            evzdVar = evzd.a;
        }
        int i = evzdVar.c;
        if (i == 2) {
            list = ((evxu) evzdVar.d).h;
        } else if (i == 6) {
            evxu evxuVar = ((evyu) evzdVar.d).d;
            if (evxuVar == null) {
                evxuVar = evxu.a;
            }
            list = evxuVar.h;
        } else if (((i == 3 ? (evzr) evzdVar.d : evzr.a).b & 1024) != 0) {
            evxi evxiVar = (evzdVar.c == 3 ? (evzr) evzdVar.d : evzr.a).p;
            if (evxiVar == null) {
                evxiVar = evxi.a;
            }
            list = engw.r(evxiVar);
        } else if (((evzdVar.c == 5 ? (ewab) evzdVar.d : ewab.a).b & 16) != 0) {
            evxi evxiVar2 = (evzdVar.c == 5 ? (ewab) evzdVar.d : ewab.a).j;
            if (evxiVar2 == null) {
                evxiVar2 = evxi.a;
            }
            list = engw.r(evxiVar2);
        } else {
            int i2 = engw.d;
            list = enou.a;
        }
        for (evxi evxiVar3 : list) {
            if (evxiVar3.c == 8 && !this.c.d(this.a, (evvx) evxiVar3.d)) {
                dvdy dvdyVar = this.b;
                evxg b = evxg.b(evxiVar3.e);
                if (b == null) {
                    b = evxg.ACTION_UNKNOWN;
                }
                dvdyVar.b(a, "Found an invalid intent target in action %s.", b.name());
                return false;
            }
        }
        return true;
    }
}
