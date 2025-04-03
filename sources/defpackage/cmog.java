package defpackage;

import android.util.LruCache;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmog extends LruCache implements djrx, cskg {
    private final ffbr a;
    private final ffbr b;

    public cmog(ffbr ffbrVar, ffbr ffbrVar2) {
        super(2);
        this.a = ffbrVar;
        this.b = ffbrVar2;
    }

    @Override // android.util.LruCache
    protected final /* bridge */ /* synthetic */ Object create(Object obj) {
        return ((djry) this.a.b()).j((String) obj);
    }

    @Override // defpackage.djrx
    public final void gh(final String str, final Optional optional) {
        if (((asgn) this.b.b()).a()) {
            optional.ifPresent(new Consumer() { // from class: cmof
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    cmog.this.put(str, optional);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        } else {
            put(str, optional);
        }
    }

    @Override // defpackage.cskg
    public final void l(int i) {
        trimToSize(0);
    }
}
