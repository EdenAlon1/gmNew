package defpackage;

import android.support.v7.widget.GridLayoutManager;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drds extends drdv {
    public static final enru a = enru.c("com/google/android/libraries/compose/gif/ui/screen/GifScreen");
    private GridLayoutManager aA;
    private List aB;
    private final dszr aC;
    public ffsk ag;
    private drdz az;
    public drea b;
    public dtdg c;
    public final AtomicBoolean d;
    public dree e;

    public drds() {
        super(new drgk(drdo.a), new drdm(false, 1023));
        this.d = new AtomicBoolean();
        this.aC = dszr.c;
    }

    public final dree a() {
        dree dreeVar = this.e;
        if (dreeVar != null) {
            return dreeVar;
        }
        ffkj.c("gifsStickersApi");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(int r6, defpackage.ffgu r7) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.drds.b(int, ffgu):java.lang.Object");
    }

    @Override // defpackage.drgb
    public final /* bridge */ /* synthetic */ void e(dren drenVar, String str) {
        drcr drcrVar = (drcr) drenVar;
        bf(new drew(drcrVar.a), str);
        ffsk ffskVar = this.ag;
        if (ffskVar == null) {
            ffkj.c("remoteIoScope");
            ffskVar = null;
        }
        ffqy.d(ffskVar, null, null, new drdq(this, drcrVar, null), 3);
    }

    @Override // defpackage.drgb
    public final void f() {
        dtal dtalVar;
        Integer num = ((drdm) bA()).a;
        if (num != null) {
            ffqy.d(bF(), null, null, new drdr(this, num.intValue(), null), 3);
            return;
        }
        dtan aT = aT();
        if (aT == null || (dtalVar = ((drgw) aT).k) == null) {
            return;
        }
        dtalVar.c("");
    }

    @Override // defpackage.dtaa
    public final dszr t() {
        return this.aC;
    }
}
