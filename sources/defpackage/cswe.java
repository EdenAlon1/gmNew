package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteConstraintException;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cswe {
    private static final cskc d = cskc.g("BugleDataModel", "GifDatabaseOperations");
    public final Context a;
    public final cqoh b;
    public final dtuu c;

    public cswe(Context context, cqoh cqohVar, dtuu dtuuVar) {
        this.a = context;
        this.b = cqohVar;
        this.c = dtuuVar;
    }

    static /* synthetic */ Object a(bwyo bwyoVar, cbwn cbwnVar) {
        try {
            final dtve a = bxad.a();
            dtub.b(bxad.a(), "recent_gifs", bwyoVar, new Function() { // from class: bwym
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return Long.valueOf(dtve.this.T("recent_gifs", (ContentValues) obj, 4));
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }, new Consumer() { // from class: bwyn
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        } catch (SQLiteConstraintException e) {
            d.o("Invalid SQLite constraint while attempting to insert a recent gif item.", e);
            cbwnVar.a(new Object());
        }
        return new Object();
    }
}
