package defpackage;

import android.net.Uri;
import android.webkit.MimeTypeMap;
import j$.util.Optional;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dozh {
    private static final enru a = enru.c("com/google/android/libraries/compose/attachments/resolver/AttachmentResolver");
    private final dpaa b;
    private final ernh c;
    private final fazb d;
    private final fazb e;
    private final ffbr f;
    private final ffbz g;

    public dozh(dpaa dpaaVar, ernh ernhVar, fazb fazbVar, fazb fazbVar2, ffbr ffbrVar, final ffbr ffbrVar2) {
        dpaaVar.getClass();
        ernhVar.getClass();
        fazbVar.getClass();
        fazbVar2.getClass();
        ffbrVar2.getClass();
        this.b = dpaaVar;
        this.c = ernhVar;
        this.d = fazbVar;
        this.e = fazbVar2;
        this.f = ffbrVar;
        this.g = ffca.a(new ffix() { // from class: dozc
            @Override // defpackage.ffix
            public final Object invoke() {
                Object b = ffbr.this.b();
                b.getClass();
                Optional optional = (Optional) b;
                return (dozj) (optional.isPresent() ? optional.get() : new dozj(null));
            }
        });
    }

    private final dozj d() {
        return (dozj) this.g.a();
    }

    private final dozo e(drlx drlxVar) {
        if (ffkj.e(drlxVar.b, drlr.a) && !d().c) {
            return null;
        }
        dozo dozoVar = (dozo) ((Map) this.d.b()).get(drlxVar);
        return dozoVar == null ? (dozo) ((Map) this.e.b()).get(drlxVar.b) : dozoVar;
    }

    private static final drlx f(Uri uri, String str, ffix ffixVar) {
        drlx a2;
        if (str != null && (a2 = drlo.a(str)) != null) {
            return a2;
        }
        drlx drlxVar = (drlx) ffixVar.invoke();
        if (drlxVar != null) {
            return drlxVar;
        }
        String uri2 = uri.toString();
        uri2.getClass();
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(uri2);
        if (fileExtensionFromUrl == null) {
            return null;
        }
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        String lowerCase = fileExtensionFromUrl.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        String mimeTypeFromExtension = singleton.getMimeTypeFromExtension(lowerCase);
        if (mimeTypeFromExtension != null) {
            return drlo.a(mimeTypeFromExtension);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.dozs r15, android.net.Uri r16, defpackage.doxr r17, boolean r18, defpackage.ffix r19, defpackage.ffgu r20) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dozh.a(dozs, android.net.Uri, doxr, boolean, ffix, ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x009c, code lost:
    
        if (r3 != r5) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(android.net.Uri r18, defpackage.doxr r19, defpackage.ffix r20, defpackage.ffgu r21) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dozh.b(android.net.Uri, doxr, ffix, ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x009f, code lost:
    
        if (r15 == null) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00f1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r11v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(android.net.Uri r11, defpackage.doxr r12, boolean r13, defpackage.ffix r14, defpackage.ffgu r15) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dozh.c(android.net.Uri, doxr, boolean, ffix, ffgu):java.lang.Object");
    }
}
