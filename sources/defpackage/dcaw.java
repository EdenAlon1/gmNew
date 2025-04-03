package defpackage;

import com.google.android.apps.messaging.ui.mediapicker.c2o.ContentGridView;
import com.google.android.apps.messaging.ui.mediapicker.c2o.content.AttachmentQueueState;
import com.google.android.apps.messaging.ui.mediapicker.c2o.customization.CustomizationModel;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcaw {
    public dcaf a;
    public dbxy b;
    public ContentGridView c;
    private final ea d;
    private final czgx e;
    private final AttachmentQueueState f;
    private final czgy g;
    private final dcbb h;
    private final bcpw i;
    private final Boolean j;
    private final enhk k;
    private final ctyx l;

    public dcaw(enhk enhkVar, ctyx ctyxVar, ea eaVar, Boolean bool, bcpw bcpwVar, czgx czgxVar, AttachmentQueueState attachmentQueueState, ContentGridView contentGridView, czgy czgyVar, dcaf dcafVar, dcbb dcbbVar, dbxy dbxyVar) {
        this.k = enhkVar;
        this.d = eaVar;
        this.e = czgxVar;
        this.f = attachmentQueueState;
        this.c = contentGridView;
        this.g = czgyVar;
        this.i = bcpwVar;
        this.j = bool;
        this.a = dcafVar;
        this.h = dcbbVar;
        this.b = dbxyVar;
        this.l = ctyxVar;
    }

    private static void d(Map map, eymn eymnVar) {
        if (map != null && map.containsKey(eymnVar)) {
            ((dcae) map.get(eymnVar)).h();
        }
    }

    public final dcae a(eymn eymnVar, int i) {
        dcaz dcazVar = (dcaz) this.k.get(eymnVar);
        dcazVar.getClass();
        ContentGridView contentGridView = this.c;
        dbxy dbxyVar = this.b;
        dcaf dcafVar = this.a;
        return dcazVar.a(new dcav(this.d, this.f, this.e, contentGridView, dbxyVar, this.i, this.h, dcafVar, this.g, i));
    }

    public final List b(CustomizationModel customizationModel, boolean z) {
        return c(customizationModel, null, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List c(com.google.android.apps.messaging.ui.mediapicker.c2o.customization.CustomizationModel r10, java.util.Map r11, boolean r12) {
        /*
            r9 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            r2 = r1
            r3 = r2
        L8:
            int r4 = r10.a()
            if (r2 >= r4) goto L7b
            eymp r4 = r10.b(r2)
            int r5 = r4.b
            eymn r5 = defpackage.eymn.b(r5)
            if (r5 != 0) goto L1c
            eymn r5 = defpackage.eymn.UNRECOGNIZED
        L1c:
            int r6 = r4.c
            eymq r6 = defpackage.eymq.b(r6)
            if (r6 != 0) goto L26
            eymq r6 = defpackage.eymq.UNRECOGNIZED
        L26:
            ctyx r7 = r9.l
            java.lang.Boolean r8 = r9.j
            boolean r7 = com.google.android.apps.messaging.ui.mediapicker.c2o.customization.CustomizationModel.e(r7, r5, r8, r12)
            r10.d(r2, r7)
            if (r7 != 0) goto L37
            d(r11, r5)
            goto L78
        L37:
            eymq r7 = defpackage.eymq.INVISIBLE
            if (r6 != r7) goto L3f
            d(r11, r5)
            goto L78
        L3f:
            if (r11 == 0) goto L65
            int r6 = r4.b
            eymn r6 = defpackage.eymn.b(r6)
            if (r6 != 0) goto L4b
            eymn r6 = defpackage.eymn.UNRECOGNIZED
        L4b:
            boolean r6 = r11.containsKey(r6)
            if (r6 == 0) goto L65
            int r4 = r4.b
            eymn r4 = defpackage.eymn.b(r4)
            if (r4 != 0) goto L5b
            eymn r4 = defpackage.eymn.UNRECOGNIZED
        L5b:
            java.lang.Object r4 = r11.get(r4)
            dcae r4 = (defpackage.dcae) r4
            r4.w(r3)
            goto L69
        L65:
            dcae r4 = r9.a(r5, r3)
        L69:
            if (r4 == 0) goto L75
            r5 = 1
            r10.d(r2, r5)
            r0.add(r4)
            int r3 = r3 + 1
            goto L78
        L75:
            r10.d(r2, r1)
        L78:
            int r2 = r2 + 1
            goto L8
        L7b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dcaw.c(com.google.android.apps.messaging.ui.mediapicker.c2o.customization.CustomizationModel, java.util.Map, boolean):java.util.List");
    }
}
