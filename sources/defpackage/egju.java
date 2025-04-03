package defpackage;

import com.google.android.libraries.user.profile.photopicker.edit.EditActivity;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egju implements rif {
    final /* synthetic */ EditActivity a;

    public egju(EditActivity editActivity) {
        this.a = editActivity;
    }

    @Override // defpackage.rif
    public final boolean a(qwp qwpVar, Object obj, rix rixVar, boolean z) {
        egjw egjwVar = this.a.t;
        exfv exfvVar = (exfv) exfw.a.createBuilder();
        int i = egcy.a;
        exfx exfxVar = (exfx) exfy.a.createBuilder();
        int b = egcy.b(obj);
        exfxVar.copyOnWrite();
        exfy exfyVar = (exfy) exfxVar.instance;
        exfyVar.c = b - 1;
        exfyVar.b |= 1;
        exfy exfyVar2 = (exfy) exfxVar.build();
        exfvVar.copyOnWrite();
        exfw exfwVar = (exfw) exfvVar.instance;
        exfyVar2.getClass();
        exfwVar.d = exfyVar2;
        exfwVar.c = 9;
        exfu a = egcy.a(qwpVar);
        exfvVar.copyOnWrite();
        exfw exfwVar2 = (exfw) exfvVar.instance;
        a.getClass();
        exfwVar2.f = a;
        exfwVar2.b |= 2;
        egjwVar.b(exfvVar);
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x003c, code lost:
    
        if (r4 != 4) goto L14;
     */
    @Override // defpackage.rif
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ boolean b(java.lang.Object r3, java.lang.Object r4, defpackage.rix r5, defpackage.qsy r6, boolean r7) {
        /*
            r2 = this;
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3
            com.google.android.libraries.user.profile.photopicker.edit.EditActivity r3 = r2.a
            egjw r3 = r3.t
            exfw r5 = defpackage.exfw.a
            eyfq r5 = r5.createBuilder()
            exfv r5 = (defpackage.exfv) r5
            int r7 = defpackage.egcy.a
            exfy r7 = defpackage.exfy.a
            eyfq r7 = r7.createBuilder()
            exfx r7 = (defpackage.exfx) r7
            int r4 = defpackage.egcy.b(r4)
            r7.copyOnWrite()
            MessageType extends eyfy<MessageType, BuilderType> r0 = r7.instance
            exfy r0 = (defpackage.exfy) r0
            int r4 = r4 + (-1)
            r0.c = r4
            int r4 = r0.b
            r1 = 1
            r4 = r4 | r1
            r0.b = r4
            int r4 = r6.ordinal()
            r6 = 3
            r0 = 2
            if (r4 == 0) goto L45
            if (r4 == r1) goto L43
            if (r4 == r0) goto L41
            if (r4 == r6) goto L3f
            r6 = 4
            if (r4 == r6) goto L45
            goto L46
        L3f:
            r1 = 6
            goto L46
        L41:
            r1 = r0
            goto L46
        L43:
            r1 = 5
            goto L46
        L45:
            r1 = r6
        L46:
            r7.copyOnWrite()
            MessageType extends eyfy<MessageType, BuilderType> r4 = r7.instance
            exfy r4 = (defpackage.exfy) r4
            int r1 = r1 + (-1)
            r4.d = r1
            int r6 = r4.b
            r6 = r6 | r0
            r4.b = r6
            eyfy r4 = r7.build()
            exfy r4 = (defpackage.exfy) r4
            r5.copyOnWrite()
            MessageType extends eyfy<MessageType, BuilderType> r6 = r5.instance
            exfw r6 = (defpackage.exfw) r6
            r4.getClass()
            r6.d = r4
            r4 = 9
            r6.c = r4
            r3.b(r5)
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.egju.b(java.lang.Object, java.lang.Object, rix, qsy, boolean):boolean");
    }
}
