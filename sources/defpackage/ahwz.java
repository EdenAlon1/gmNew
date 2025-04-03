package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahwz implements ahwj {
    public static final enru a = enru.c("com/google/android/apps/messaging/multishare/editmessage/bottomcontent/composerow/attachments/DraftAttachmentUiAdapterImpl");
    public static final dmmk b = new dmmk(ffel.a, new ffji() { // from class: ahwl
        @Override // defpackage.ffji
        public final Object invoke(Object obj) {
            ((Integer) obj).intValue();
            return ffcu.a;
        }
    }, new ffji() { // from class: ahwm
        @Override // defpackage.ffji
        public final Object invoke(Object obj) {
            ((Integer) obj).intValue();
            return ffcu.a;
        }
    }, new ffji() { // from class: ahwn
        @Override // defpackage.ffji
        public final Object invoke(Object obj) {
            ((Integer) obj).intValue();
            return ffcu.a;
        }
    });
    public final ffsk c;
    public final ydb d;
    public final xvy e;
    public final Map f;
    private final fgdj g;

    public ahwz(ffsk ffskVar, ydb ydbVar, xvy xvyVar, xuw xuwVar) {
        ffskVar.getClass();
        ydbVar.getClass();
        xuwVar.getClass();
        this.c = ffskVar;
        this.d = ydbVar;
        this.e = xvyVar;
        this.f = new LinkedHashMap();
        ahwt ahwtVar = new ahwt(xuwVar.j, this);
        ahwq ahwqVar = new ahwq(null, this);
        int i = fgau.a;
        fgen fgenVar = new fgen(ahwqVar, ahwtVar);
        int i2 = fgcz.a;
        this.g = fgbn.b(fgenVar, ffskVar, fgcy.b, b);
    }

    @Override // defpackage.ahwj
    public final fgdj a() {
        return this.g;
    }
}
