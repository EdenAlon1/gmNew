package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyje implements fdxp {
    public static final febj a;
    public final emyl b;

    static {
        febf febfVar = febo.c;
        int i = febj.d;
        a = new febe("X-Goog-Api-Key", febfVar);
        new febe("X-Android-Cert", febo.c);
        new febe("X-Android-Package", febo.c);
    }

    public dyje(final Context context) {
        this.b = emys.a(new emyl() { // from class: dyjb
            @Override // defpackage.emyl
            public final Object get() {
                febj febjVar = dyje.a;
                return context.getPackageName();
            }
        });
        emys.a(new emyl() { // from class: dyjc
            /* JADX WARN: Removed duplicated region for block: B:12:0x0039 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:14:0x003a A[Catch: NameNotFoundException -> 0x0066, TryCatch #0 {NameNotFoundException -> 0x0066, blocks: (B:3:0x0005, B:5:0x001c, B:7:0x0022, B:10:0x0029, B:14:0x003a, B:16:0x0046, B:18:0x0061), top: B:2:0x0005 }] */
            @Override // defpackage.emyl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object get() {
                /*
                    r7 = this;
                    dyje r0 = defpackage.dyje.this
                    android.content.Context r1 = r2
                    r2 = 0
                    emyl r0 = r0.b     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L66
                    java.lang.Object r0 = r0.get()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L66
                    java.lang.String r0 = (java.lang.String) r0     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L66
                    android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L66
                    r3 = 64
                    android.content.pm.PackageInfo r0 = r1.getPackageInfo(r0, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L66
                    android.content.pm.Signature[] r1 = r0.signatures     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L66
                    r3 = 0
                    if (r1 == 0) goto L36
                    android.content.pm.Signature[] r1 = r0.signatures     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L66
                    int r1 = r1.length     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L66
                    r4 = 1
                    if (r1 != r4) goto L36
                    java.security.MessageDigest r1 = defpackage.dyja.a()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L66
                    if (r1 != 0) goto L29
                    goto L36
                L29:
                    android.content.pm.Signature[] r0 = r0.signatures     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L66
                    r0 = r0[r3]     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L66
                    byte[] r0 = r0.toByteArray()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L66
                    byte[] r0 = r1.digest(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L66
                    goto L37
                L36:
                    r0 = r2
                L37:
                    if (r0 != 0) goto L3a
                    return r2
                L3a:
                    char[] r1 = defpackage.dyjn.a     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L66
                    int r1 = r0.length     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L66
                    java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L66
                    int r5 = r1 + r1
                    r4.<init>(r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L66
                L44:
                    if (r3 >= r1) goto L61
                    char[] r5 = defpackage.dyjn.a     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L66
                    r6 = r0[r3]     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L66
                    r6 = r6 & 240(0xf0, float:3.36E-43)
                    int r6 = r6 >>> 4
                    char r5 = r5[r6]     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L66
                    r4.append(r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L66
                    char[] r5 = defpackage.dyjn.a     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L66
                    r6 = r0[r3]     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L66
                    r6 = r6 & 15
                    char r5 = r5[r6]     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L66
                    r4.append(r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L66
                    int r3 = r3 + 1
                    goto L44
                L61:
                    java.lang.String r0 = r4.toString()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L66
                    return r0
                L66:
                    return r2
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.dyjc.get():java.lang.Object");
            }
        });
    }

    @Override // defpackage.fdxp
    public final fdxo a(febs febsVar, fdxj fdxjVar, fdxk fdxkVar) {
        return new dyjd(fdxkVar.a(febsVar, fdxjVar));
    }
}
