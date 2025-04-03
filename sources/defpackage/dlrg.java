package defpackage;

import android.content.Context;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlrg {
    public static final enru a = enru.c("com/google/android/libraries/communications/mobileconfiguration/rpc/RpcManager");
    public final long b;
    public final Context c;
    public final errl d;
    public final errl e;
    public final fazb f;
    public final List g;
    public final Optional h;
    public final Optional i;
    protected final AtomicReference j = new AtomicReference(new HashSet());
    public final cgtm k;

    public dlrg(Context context, Optional optional, long j, Optional optional2, errl errlVar, errl errlVar2, cgtm cgtmVar, fazb fazbVar, List list) {
        this.b = j;
        this.c = context;
        this.h = optional.map(new Function() { // from class: dlqw
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return new AtomicReference((ewhj) ewhj.h(new ewhi(), (feau) obj));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        this.i = optional2;
        this.d = errlVar;
        this.e = errlVar2;
        this.k = cgtmVar;
        this.f = fazbVar;
        this.g = list;
    }
}
