package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdgd {
    public static final bqkm a(final bqiv bqivVar) {
        bqkn a = bqkv.a();
        a.z("+matchingDeadLetterExists");
        a.c(new Function() { // from class: cdgc
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bqku bqkuVar = (bqku) obj;
                bqkuVar.getClass();
                bqiv bqivVar2 = bqiv.this;
                bqkw bqkwVar = bqivVar2.d;
                bqkuVar.aq(new dtwe("cms_dead_letter_queue.abandoned_action", 1, Integer.valueOf(bqkwVar == null ? 0 : bqkwVar.ordinal())));
                bqkuVar.c(bqivVar2.f);
                int i = bqivVar2.i;
                int intValue = bqkv.c().intValue();
                if (intValue < 57090) {
                    dtub.w("backup_flags", intValue);
                }
                bqkuVar.aq(new dtwe("cms_dead_letter_queue.backup_flags", 1, Integer.valueOf(i)));
                epeg epegVar = bqivVar2.e;
                bqkuVar.aq(new dtwe("cms_dead_letter_queue.failure_reason", 1, Integer.valueOf(epegVar != null ? epegVar.bs : 0)));
                int i2 = bqivVar2.j;
                int intValue2 = bqkv.c().intValue();
                if (intValue2 < 57090) {
                    dtub.w("backup_dependency_table_type", intValue2);
                }
                bqkuVar.aq(new dtwe("cms_dead_letter_queue.backup_dependency_table_type", 1, Integer.valueOf(i2)));
                String str = bqivVar2.k;
                int intValue3 = bqkv.c().intValue();
                if (intValue3 < 57090) {
                    dtub.w("backup_dependency_bugle_id", intValue3);
                }
                bqkuVar.aq(new dtrt("cms_dead_letter_queue.backup_dependency_bugle_id", 1, String.valueOf(str)));
                bqkw bqkwVar2 = bqivVar2.d;
                bqkwVar2.getClass();
                if (cdgd.b(bqkwVar2)) {
                    String str2 = bqivVar2.b;
                    str2.getClass();
                    ffpc.J(str2);
                    bqkuVar.aq(new dtrt("cms_dead_letter_queue.cms_id", 1, String.valueOf(bqivVar2.b)));
                    return bqkuVar;
                }
                String str3 = bqivVar2.g;
                str3.getClass();
                ffpc.J(str3);
                String str4 = bqivVar2.g;
                int intValue4 = bqkv.c().intValue();
                if (intValue4 < 57090) {
                    dtub.w("bugle_id", intValue4);
                }
                bqkuVar.aq(new dtrt("cms_dead_letter_queue.bugle_id", 1, String.valueOf(str4)));
                return bqkuVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        return a.b();
    }

    public static final boolean b(bqkw bqkwVar) {
        int ordinal = bqkwVar.ordinal();
        return ordinal == 0 || ordinal == 1 || ordinal == 4;
    }

    public static final void c(csjb csjbVar, bqiv bqivVar) {
        csjbVar.y("tableType", bqivVar.f);
        csjbVar.A("id", bqivVar.g);
        csjbVar.A("cmsId", bqivVar.b);
        csjbVar.y("flags", bqivVar.i);
        csjbVar.A("failureReason", bqivVar.e);
        csjbVar.y("dependencyType", bqivVar.j);
        csjbVar.A("dependencyId", bqivVar.k);
    }
}
