package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvgj {
    public final akvz a;
    private final avbn b;
    private final ffsk c;
    private final akyb d;

    public cvgj(avbn avbnVar, ffsk ffskVar, akvz akvzVar, akyb akybVar) {
        ffskVar.getClass();
        akvzVar.getClass();
        akybVar.getClass();
        this.b = avbnVar;
        this.c = ffskVar;
        this.a = akvzVar;
        this.d = akybVar;
    }

    public final void a(Supplier supplier) {
        ListenableFuture b;
        if (this.b.a()) {
            akyb akybVar = this.d;
            ffsk ffskVar = this.c;
            akxn a = akybVar.a();
            b = fgfz.b(ffskVar, ffhe.a, ffsm.a, new cvgi(supplier, null));
            a.i(b, alal.LOG_SPEC_VIDEO_CALLING_EVENT);
        }
    }
}
