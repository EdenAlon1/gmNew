package defpackage;

import android.content.Context;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejzp implements edyz {
    public final Context a;
    public final ffbr b;
    private final errl c;
    private final ejjz d;

    public ejzp(Context context, errl errlVar, ejjz ejjzVar, ffbr ffbrVar) {
        this.a = context;
        this.c = errlVar;
        this.d = ejjzVar;
        this.b = ffbrVar;
    }

    @Override // defpackage.edyz
    public final void a() {
        this.d.e(this.c.submit(eldl.l(new Runnable() { // from class: ejzo
            @Override // java.lang.Runnable
            public final void run() {
                ejzp ejzpVar = ejzp.this;
                eewv d = eeww.d();
                if (d != null) {
                    d.a(ejzpVar.a);
                }
                eeww.e((eewt) ejzpVar.b.b());
                eeww.e(new eexe(ejzpVar.a));
            }
        })), 30L, TimeUnit.SECONDS);
    }
}
