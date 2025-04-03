package defpackage;

import android.content.Context;
import j$.util.concurrent.ConcurrentMap;
import j$.util.function.BiFunction$CC;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xgl implements dqlt {
    private static final enru a = enru.c("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/analytics/attachment/EmojiUsageLogger");
    private final Context b;
    private final ConcurrentMap c;
    private final aldw d;

    public xgl(Context context, ConcurrentMap concurrentMap, aldw aldwVar) {
        context.getClass();
        concurrentMap.getClass();
        this.b = context;
        this.c = concurrentMap;
        this.d = aldwVar;
    }

    private final void a(int i, xgf xgfVar, Integer num) {
        Integer num2;
        epog a2 = epof.a((eppq) eppr.a.createBuilder());
        xgm.b(a2, xgfVar.b);
        xgd.a(a2, xgfVar.b, Boolean.valueOf(xgfVar.a));
        eppr a3 = a2.a();
        if (num != null) {
            num.intValue();
            if (xgfVar.b != 3) {
                num2 = num;
                aldw.b(this.d, i, a3, null, num2, 20);
            }
        }
        num2 = null;
        aldw.b(this.d, i, a3, null, num2, 20);
    }

    @Override // defpackage.dqlt
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        dqrp dqrpVar = (dqrp) obj;
        final xgf a2 = xge.a(dqrpVar, algx.a(this.b));
        ensk f = a.f();
        f.Y(ente.a, "BugleComposeRow2");
        ((enrr) f.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/analytics/attachment/EmojiUsageLogger", "onAddedToDraft", 34, "EmojiUsageLogger.kt")).t("EmojiUsageLogger.onAddedToDraft %s", a2);
        final ffjm ffjmVar = new ffjm() { // from class: xgj
            @Override // defpackage.ffjm
            public final Object a(Object obj2, Object obj3) {
                Integer num = (Integer) obj2;
                Integer num2 = (Integer) obj3;
                num.getClass();
                num2.getClass();
                if (num.intValue() > 0) {
                    return Integer.valueOf(num.intValue() + num2.intValue());
                }
                throw new IllegalArgumentException("EmojiUsage added to draft but has non-positive cache value " + num + ": " + xgf.this);
            }
        };
        ConcurrentMap.EL.merge(this.c, a2, 1, new BiFunction() { // from class: xgk
            public final /* synthetic */ BiFunction andThen(Function function) {
                return BiFunction$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj2, Object obj3) {
                return ffjm.this.a(obj2, obj3);
            }
        });
        a(2, a2, dqrpVar.c);
    }

    @Override // defpackage.dqlt
    public final /* bridge */ /* synthetic */ void e(Object obj) {
        dqrp dqrpVar = (dqrp) obj;
        final xgf a2 = xge.a(dqrpVar, algx.a(this.b));
        enru enruVar = a;
        ensk f = enruVar.f();
        f.Y(ente.a, "BugleComposeRow2");
        ((enrr) f.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/analytics/attachment/EmojiUsageLogger", "onRemovedFromDraft", 47, "EmojiUsageLogger.kt")).t("EmojiUsageLogger.onRemovedFromDraft %s", a2);
        final ffkx ffkxVar = new ffkx();
        final ffjm ffjmVar = new ffjm() { // from class: xgh
            @Override // defpackage.ffjm
            public final Object a(Object obj2, Object obj3) {
                int intValue = ((Integer) obj3).intValue();
                if (intValue > 0) {
                    ffkx.this.a = true;
                    Integer valueOf = Integer.valueOf(intValue - 1);
                    if (valueOf.intValue() > 0) {
                        return valueOf;
                    }
                    return null;
                }
                throw new IllegalArgumentException("EmojiUsage removed from draft but has non-positive cache value " + intValue + ": " + a2);
            }
        };
        ConcurrentMap.EL.computeIfPresent(this.c, a2, new BiFunction() { // from class: xgi
            public final /* synthetic */ BiFunction andThen(Function function) {
                return BiFunction$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj2, Object obj3) {
                return ffjm.this.a(obj2, obj3);
            }
        });
        if (!ffkxVar.a) {
            ensk j = enruVar.j();
            j.Y(ente.a, "BugleComposeRow2");
            ((enrr) j.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/analytics/attachment/EmojiUsageLogger", "onRemovedFromDraft", 58, "EmojiUsageLogger.kt")).t("EmojiUsage removed from draft but was not in cache: %s", a2);
        }
        a(4, a2, dqrpVar.c);
    }

    @Override // defpackage.dqlt
    public final void d(List list) {
    }
}
