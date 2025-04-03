package defpackage;

import java.util.function.BiConsumer;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cufx implements alhi {
    @Override // defpackage.alhi
    public final eolt a() {
        return eolt.SPAM_FOLDER_EVENT;
    }

    @Override // defpackage.alhi
    public final BiConsumer b() {
        return new cugc(cufw.a);
    }

    @Override // defpackage.alhi
    public final Supplier c() {
        return new Supplier() { // from class: cufv
            @Override // java.util.function.Supplier
            public final Object get() {
                return (erdp) erdq.a.createBuilder();
            }
        };
    }
}
