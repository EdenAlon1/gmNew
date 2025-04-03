package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aefi implements aefc {
    public static final enru b = enru.c("com/google/android/apps/messaging/home/banner/HomeBannerDataServiceImpl");
    public final ejvb c;
    public final fazb d;
    public final Set e;
    public final AtomicBoolean f = new AtomicBoolean(false);
    public final ejvp g;
    public final ffbr h;
    private final errl i;

    public aefi(errl errlVar, ejvb ejvbVar, fazb fazbVar, Set set, ejvp ejvpVar, ffbr ffbrVar) {
        this.i = errlVar;
        this.c = ejvbVar;
        this.d = fazbVar;
        this.e = set;
        this.g = ejvpVar;
        this.h = ffbrVar;
    }

    public final elfl a(final engw engwVar, final int i) {
        return i >= engwVar.size() ? elfo.e(aefb.m()) : ((aeev) engwVar.get(i)).b().i(new eroh() { // from class: aefd
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                engw engwVar2 = engwVar;
                int i2 = i;
                return booleanValue ? ((aeev) engwVar2.get(i2)).a() : aefi.this.a(engwVar2, i2 + 1);
            }
        }, this.i);
    }
}
