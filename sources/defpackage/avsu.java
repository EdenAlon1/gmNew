package defpackage;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avsu implements avrk {
    public final avrk a;
    private final avrk b;
    private final ScheduledExecutorService c;
    private final avlg d;

    public avsu(avrk avrkVar, avrk avrkVar2, avlg avlgVar, ScheduledExecutorService scheduledExecutorService) {
        this.b = avrkVar;
        this.a = avrkVar2;
        this.d = avlgVar;
        this.c = scheduledExecutorService;
    }

    @Override // defpackage.avrk
    public final elfl a(final Iterable iterable) {
        return csvs.b(this.b.a(iterable), new emyl() { // from class: avst
            @Override // defpackage.emyl
            public final Object get() {
                return avsu.this.a.a(iterable);
            }
        }, this.c, this.d.a());
    }

    @Override // defpackage.avrk
    public final elfl b(final awui awuiVar) {
        return csvs.b(this.b.b(awuiVar), new emyl() { // from class: avss
            @Override // defpackage.emyl
            public final Object get() {
                return avsu.this.a.b(awuiVar);
            }
        }, this.c, this.d.a());
    }
}
