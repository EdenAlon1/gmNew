package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajv implements bee {
    private final boolean a;
    private final String c;
    private final int d;
    private final Map e = new HashMap();
    private final bfx f;

    public ajv(String str, bfx bfxVar) {
        int i;
        boolean z;
        this.c = str;
        try {
            i = Integer.parseInt(str);
            z = true;
        } catch (NumberFormatException unused) {
            avw.f("Camera2EncoderProfilesProvider", a.a(str, "Camera id is not an integer: ", ", unable to create Camera2EncoderProfilesProvider"));
            i = -1;
            z = false;
        }
        this.a = z;
        this.d = i;
        this.f = bfxVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:7|(7:9|(2:51|(1:53)(7:54|55|(7:57|(2:60|58)|61|62|(2:65|63)|66|67)(2:68|(7:70|(2:73|71)|74|75|(2:78|76)|79|80)(2:81|82))|(2:15|(4:17|(3:19|(1:21)(1:23)|22)|24|(4:26|(2:28|(2:29|(1:39)(2:31|(2:33|34)(1:38))))(1:(3:41|(1:(1:49)(2:43|(2:46|47)(1:45)))|48))|35|36)))|50|35|36))|11|(3:13|15|(0))|50|35|36)|85|86|(14:88|(1:90)|91|92|94|(2:96|(1:(8:99|100|101|103|(0)|50|35|36)(1:112)))(1:114)|113|100|101|103|(0)|50|35|36)|11|(0)|50|35|36) */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x019a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x019b, code lost:
    
        defpackage.avw.g("Camera2EncoderProfilesProvider", defpackage.a.h(r2, "Unable to get CamcorderProfile by quality: "), r0);
        r0 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0263  */
    @Override // defpackage.bee
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.bei a(int r24) {
        /*
            Method dump skipped, instructions count: 810
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajv.a(int):bei");
    }

    @Override // defpackage.bee
    public final boolean b(int i) {
        return this.a && a(i) != null;
    }
}
