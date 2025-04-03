package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Base64;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eaic implements eaht {
    public static final entd a = entd.c("GnpSdk");
    private static final Set d = enip.s(1, 2, 3);
    public final ffbr b;
    public final ffbr c;
    private final ffbr e;
    private final ffbr f;
    private final ffbr g;
    private final ffbr h;
    private final ffbr i;
    private final ffbr j;
    private final String k;
    private final ffbr l;
    private final ffbr m;
    private final ffbr n;

    public eaic(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, Context context, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9, ffbr ffbrVar10, ffbr ffbrVar11) {
        this.e = ffbrVar;
        this.f = ffbrVar2;
        this.g = ffbrVar3;
        this.h = ffbrVar4;
        this.i = ffbrVar5;
        this.j = ffbrVar6;
        this.k = context.getPackageName();
        this.l = ffbrVar7;
        this.m = ffbrVar8;
        this.b = ffbrVar9;
        this.c = ffbrVar10;
        this.n = ffbrVar11;
    }

    private final emxc d(byte[] bArr, boolean z, eahr eahrVar) {
        long epochMilli = ((dlpw) this.h.b()).f().toEpochMilli();
        eafl a2 = ((eakb) this.j.b()).a(bArr);
        ((efky) ((ears) this.l.b()).e.get()).b(((dlpw) this.h.b()).f().toEpochMilli() - epochMilli, this.k, Boolean.valueOf(a2.e()));
        if (a2.g()) {
            return emxc.j((byte[]) a2.b());
        }
        ((ensz) ((ensz) ((ensz) a.j()).g(a2.d())).h("com/google/android/libraries/notifications/platform/entrypoints/push/PushIntentHandler", "decompressBytesLogOnFailure", (char) 504, "PushIntentHandler.java")).q("Payload decompression failed.");
        int i = true != z ? 62 : 61;
        eajw eajwVar = (eajw) this.f.b();
        eajx a3 = ((eajz) this.g.b()).a(i);
        a3.a(eahrVar.k());
        eajwVar.a(a3);
        return emux.a;
    }

    private final void e() {
        emxc emxcVar = (emxc) ((fbbb) this.m).a;
        if (emxcVar.g()) {
            ((eahs) emxcVar.c()).a();
        }
    }

    private static final emxc f(eahr eahrVar, final boolean z) {
        entd entdVar = eahu.a;
        String str = ((eahn) eahrVar).a;
        exwl exwlVar = null;
        byte[] bArr = null;
        if (str != null) {
            try {
                bArr = Base64.decode(str, 1);
            } catch (IllegalArgumentException e) {
                ((ensz) ((ensz) eahu.a.i()).g(e)).q("Failed to decode payload string into bytes.");
            }
            exwlVar = eahu.b(bArr);
        }
        return emxc.i(exwlVar).b(new emwl() { // from class: eahv
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                entd entdVar2 = eaic.a;
                eaho eahoVar = new eaho();
                eahoVar.b((exwl) obj);
                eahoVar.a = true == z ? 3 : 1;
                return eahoVar.a();
            }
        });
    }

    @Override // defpackage.eaha
    public final void a(Intent intent, eafp eafpVar, long j) {
        c(eahr.j(intent), j);
    }

    @Override // defpackage.eaha
    public final boolean b(Intent intent) {
        if (!"com.google.android.c2dm.intent.RECEIVE".equals(intent.getAction())) {
            return false;
        }
        ensz enszVar = (ensz) a.o().h("com/google/android/libraries/notifications/platform/entrypoints/push/PushIntentHandler", "validate", 112, "PushIntentHandler.java");
        String action = intent.getAction();
        Bundle extras = intent.getExtras();
        StringBuilder sb = new StringBuilder("Extras: [\n");
        if (extras != null) {
            for (String str : extras.keySet()) {
                sb.append(str);
                sb.append(" : ");
                sb.append(extras.get(str));
                sb.append("\n");
            }
        }
        sb.append("]");
        enszVar.D("onReceive: %s \n %s", action, sb.toString());
        eahr j = eahr.j(intent);
        int i = ((eahn) j).d - 1;
        return (i == 0 || i == 1) ? j.l() : i == 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0366, code lost:
    
        if (r5.d.isEmpty() == false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0372, code lost:
    
        r3 = ((defpackage.eajz) r26.g.b()).a(10);
        r5 = r0.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0382, code lost:
    
        if (r5 != null) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0384, code lost:
    
        r5 = defpackage.exxk.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0386, code lost:
    
        r3.c(r5);
        r3.a(r27.k());
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0394, code lost:
    
        if (defpackage.fdod.b() == false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0396, code lost:
    
        r2 = (defpackage.eajw) r26.f.b();
        r0 = r0.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x03a0, code lost:
    
        if (r0 != null) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x03a2, code lost:
    
        r0 = defpackage.exyb.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x03a4, code lost:
    
        r0 = r0.d;
        r0.getClass();
        ((defpackage.eaka) r3).l = r0;
        r2.a(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x03c7, code lost:
    
        e();
        ((defpackage.ensz) ((defpackage.ensz) defpackage.eaic.a.j()).h("com/google/android/libraries/notifications/platform/entrypoints/push/PushIntentHandler", "handleDownstream", 206, "PushIntentHandler.java")).q("Recipient was not found on the device for this user targeted notification.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x03df, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x03b2, code lost:
    
        r2 = (defpackage.eajw) r26.f.b();
        r0 = r0.c;
        r0.getClass();
        ((defpackage.eaka) r3).f = r0;
        r2.a(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x036f, code lost:
    
        if (r0.c.isEmpty() != false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0466, code lost:
    
        if (r8 != false) goto L156;
     */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0566  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01bc  */
    @Override // defpackage.eaht
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(final defpackage.eahr r27, long r28) {
        /*
            Method dump skipped, instructions count: 1383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eaic.c(eahr, long):void");
    }
}
