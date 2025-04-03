package defpackage;

import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyfk {
    public final efbm a;
    private final Executor b;

    public dyfk(Executor executor, efbm efbmVar) {
        this.b = executor;
        this.a = efbmVar;
    }

    public final ListenableFuture a(dyfe dyfeVar, int i) {
        final Uri parse = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? Uri.parse(dyfeVar.g) : Uri.parse(dyfeVar.f) : Uri.parse(dyfeVar.e) : Uri.parse(dyfeVar.d) : Uri.parse(dyfeVar.c) : Uri.parse(dyfeVar.b);
        return erqt.n(new erog() { // from class: dyfj
            @Override // defpackage.erog
            public final ListenableFuture a() {
                return erqt.i((InputStream) dyfk.this.a.c(parse, new efdy()));
            }
        }, this.b);
    }
}
