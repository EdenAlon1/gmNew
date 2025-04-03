package defpackage;

import android.util.LruCache;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axcp extends LruCache {
    private final ffbr a;

    public axcp(ffbr ffbrVar) {
        super(5);
        this.a = ffbrVar;
    }

    @Override // android.util.LruCache
    public final /* synthetic */ Object create(Object obj) {
        byte[] bArr;
        final int intValue = ((Number) obj).intValue();
        ekzz f = eleg.f("CmsDatabaseOperations#getCmsKeyForIndex");
        try {
            bqwn a = bqws.a();
            a.z("getCmsKeyForIndex");
            a.e(new Function() { // from class: cryc
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj2) {
                    bqwr bqwrVar = (bqwr) obj2;
                    bqwrVar.c(intValue);
                    bqwrVar.e(1);
                    return bqwrVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bqvz bqvzVar = (bqvz) a.b().o();
            try {
                if (bqvzVar.moveToNext()) {
                    byte[] e = bqvzVar.e();
                    bqvzVar.close();
                    f.close();
                    bArr = e;
                } else {
                    csjb e2 = cryg.a.e();
                    e2.y("keyIndex", intValue);
                    e2.y("keyType", 1);
                    e2.I("No key found.");
                    e2.r();
                    bqvzVar.close();
                    f.close();
                    bArr = null;
                }
                if (bArr != null) {
                    return bArr;
                }
                throw new axco(a.h(intValue, "Failed to get encryption key at keyIndex "));
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
