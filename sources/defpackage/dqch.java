package defpackage;

import android.app.Activity;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqch extends ffhv implements ffjm {
    final /* synthetic */ dpzv a;
    final /* synthetic */ Activity b;
    final /* synthetic */ ffix c;
    final /* synthetic */ hho d;
    final /* synthetic */ hho e;
    final /* synthetic */ hho f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqch(dpzv dpzvVar, Activity activity, ffix ffixVar, hho hhoVar, hho hhoVar2, hho hhoVar3, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = dpzvVar;
        this.b = activity;
        this.c = ffixVar;
        this.d = hhoVar;
        this.e = hhoVar2;
        this.f = hhoVar3;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dqch) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        r2 = r2.getDisplay();
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r14) {
        /*
            r13 = this;
            defpackage.ffci.b(r14)
            hho r14 = r13.d
            android.os.IBinder r1 = defpackage.dqco.b(r14)
            hho r14 = r13.e
            long r2 = defpackage.dqco.a(r14)
            r4 = 0
            boolean r14 = defpackage.kaf.e(r2, r4)
            if (r14 != 0) goto Lcf
            if (r1 == 0) goto Lcf
            hho r14 = r13.f
            android.widget.photopicker.EmbeddedPhotoPickerSession r14 = defpackage.dqco.c(r14)
            if (r14 != 0) goto Lcf
            dpzv r14 = r13.a
            android.app.Activity r0 = r13.b
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 30
            if (r2 < r3) goto L2d
            r2 = r0
            goto L2e
        L2d:
            r2 = 0
        L2e:
            if (r2 == 0) goto L3b
            android.view.Display r2 = defpackage.aeb$$ExternalSyntheticApiModelOutline0.m(r2)
            if (r2 == 0) goto L3b
            int r0 = r2.getDisplayId()
            goto L43
        L3b:
            android.view.Display r0 = defpackage.dskj.d(r0)
            int r0 = r0.getDisplayId()
        L43:
            r2 = r0
            hho r0 = r13.e
            long r3 = defpackage.dqco.a(r0)
            r0 = 32
            long r3 = r3 >> r0
            hho r5 = r13.e
            long r5 = defpackage.dqco.a(r5)
            r7 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r5 = r5 & r7
            dpzv r7 = r13.a
            fgdj r7 = r7.a
            java.lang.Object r7 = r7.c()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r8 = new java.util.ArrayList
            r9 = 10
            int r10 = defpackage.ffdx.n(r7, r9)
            r8.<init>(r10)
            java.util.Iterator r7 = r7.iterator()
        L72:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto L8a
            java.lang.Object r10 = r7.next()
            drnm r10 = (defpackage.drnm) r10
            java.lang.String r10 = r10.f()
            android.net.Uri r10 = android.net.Uri.parse(r10)
            r8.add(r10)
            goto L72
        L8a:
            android.widget.photopicker.EmbeddedPhotoPickerProvider r14 = r14.c
            int r5 = (int) r5
            int r3 = (int) r3
            android.widget.photopicker.EmbeddedPhotoPickerFeatureInfo$Builder r4 = new android.widget.photopicker.EmbeddedPhotoPickerFeatureInfo$Builder
            r4.<init>()
            r6 = 0
            android.widget.photopicker.EmbeddedPhotoPickerFeatureInfo$Builder r4 = defpackage.xpi$$ExternalSyntheticApiModelOutline0.m(r4, r6)
            android.widget.photopicker.EmbeddedPhotoPickerFeatureInfo$Builder r4 = defpackage.xpi$$ExternalSyntheticApiModelOutline0.m(r4, r9)
            android.widget.photopicker.EmbeddedPhotoPickerFeatureInfo$Builder r4 = defpackage.xpi$$ExternalSyntheticApiModelOutline0.m(r4, r8)
            android.widget.photopicker.EmbeddedPhotoPickerFeatureInfo$Builder r0 = defpackage.xpi$$ExternalSyntheticApiModelOutline0.m$1(r4, r0)
            android.widget.photopicker.EmbeddedPhotoPickerFeatureInfo r0 = defpackage.xpi$$ExternalSyntheticApiModelOutline0.m(r0)
            r0.getClass()
            dpzv r4 = r13.a
            hho r6 = r13.f
            dqce r8 = new dqce
            r8.<init>()
            dqcf r10 = new dqcf
            r10.<init>()
            dqcg r11 = new dqcg
            r11.<init>()
            ffix r12 = r13.c
            ffji r9 = r4.g
            dqcn r7 = new dqcn
            r7.<init>(r8, r9, r10, r11, r12)
            java.util.concurrent.Executor r6 = r4.d
            r4 = r5
            r5 = r0
            r0 = r14
            defpackage.xpi$$ExternalSyntheticApiModelOutline0.m(r0, r1, r2, r3, r4, r5, r6, r7)
        Lcf:
            ffcu r14 = defpackage.ffcu.a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqch.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dqch(this.a, this.b, this.c, this.d, this.e, this.f, ffguVar);
    }
}
