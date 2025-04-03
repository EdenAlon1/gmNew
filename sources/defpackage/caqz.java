package defpackage;

import android.content.ContentValues;
import j$.util.DesugarArrays;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class caqz {
    private final ffbr a;

    public caqz(ffbr ffbrVar) {
        this.a = ffbrVar;
    }

    public static List a(String str) {
        csix.h();
        String[] strArr = bwyj.a;
        bwyg bwygVar = new bwyg(bwyj.a);
        bwygVar.z("+queryRecentExpressiveStickers");
        bwygVar.C((String) DesugarArrays.stream(new bwyd[]{new bwyd(bwyj.b.f)}).map(new Function() { // from class: bwyf
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((bwyd) obj).a();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.joining(", ")));
        bwygVar.y(str);
        return bwygVar.b().y();
    }

    public static final List c() {
        ekzz f = eleg.f("RecentExpressiveStickerDatabaseOperations#getRecentExpressiveStickers");
        try {
            List a = a(String.valueOf(cful.O.e()));
            f.close();
            return a;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void b(bwwz bwwzVar) {
        ekzz f = eleg.f("RecentExpressiveStickerDatabaseOperations#insertOrReplaceRecentExpressiveSticker");
        try {
            csix.h();
            final dtve a = bwyj.a();
            dtub.b(bwyj.a(), "recent_expressive_stickers", bwwzVar, new Function() { // from class: bwwx
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return Long.valueOf(dtve.this.T("recent_expressive_stickers", (ContentValues) obj, 5));
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }, new Consumer() { // from class: bwwy
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            cbgf cbgfVar = (cbgf) this.a.b();
            ekzz f2 = eleg.f("DataChangeNotifier#notifyExpressiveStickersChanged");
            try {
                cbgfVar.c.e(bcqc.n(cbgfVar.b));
                f2.close();
                f.close();
            } finally {
            }
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
