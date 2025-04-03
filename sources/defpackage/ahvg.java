package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahvg implements ahvb {
    public final Context a;
    public final ahuu b;
    private final ffsk c;
    private final fgcm d;
    private final dmvi e;

    public ahvg(Context context, ffsk ffskVar, ahuu ahuuVar) {
        context.getClass();
        ffskVar.getClass();
        ahuuVar.getClass();
        this.a = context;
        this.c = ffskVar;
        this.b = ahuuVar;
        this.d = fgdm.a(null);
        this.e = new dmvi("", ffel.a, null, null, null, null, new ffix() { // from class: ahvc
            @Override // defpackage.ffix
            public final Object invoke() {
                return ffcu.a;
            }
        }, 60);
    }

    @Override // defpackage.ahvb
    public final fgdj a() {
        fgch fgchVar = new fgch(this.d, this.b.b(), new ahvf(this, null));
        int i = fgcz.a;
        return fgbn.b(fgchVar, this.c, fgcy.a(0L, 3), this.e);
    }

    @Override // defpackage.ahvb
    public final void b(amar amarVar) {
        if (((enou) amarVar.b()).c <= 1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.d.f(amarVar);
    }

    public final void c() {
        this.d.f(null);
    }
}
