package defpackage;

import io.grpc.Status;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class feee extends fdxg {
    public static final Logger a = Logger.getLogger(feee.class.getName());
    private static final feec g;
    private static final Class h;
    private static final Class i;
    public final boolean b;
    public final embk c;
    public febo d;
    public Map e;
    public final boolean f;

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(2:2|3)|(2:5|6)|7|8|9|10|11|12|13|14|15|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
    
        defpackage.feee.a.logp(java.util.logging.Level.FINE, "io.grpc.auth.GoogleAuthLibraryCallCredentials", "loadAppEngineCredentials", "AppEngineCredentials not available in classloader", (java.lang.Throwable) r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0040, code lost:
    
        defpackage.feee.a.logp(java.util.logging.Level.FINE, "io.grpc.auth.GoogleAuthLibraryCallCredentials", "loadGoogleCredentialsClass", "Failed to load GoogleCredentials", (java.lang.Throwable) r0);
        r0 = null;
     */
    static {
        /*
            java.lang.Class<feee> r0 = defpackage.feee.class
            java.lang.String r1 = r0.getName()
            java.util.logging.Logger r1 = java.util.logging.Logger.getLogger(r1)
            defpackage.feee.a = r1
            java.lang.ClassLoader r0 = r0.getClassLoader()
            r1 = 0
            java.lang.String r2 = "embz"
            r3 = 0
            java.lang.Class r2 = java.lang.Class.forName(r2, r3, r0)     // Catch: java.lang.ClassNotFoundException -> L2f
            feec r3 = new feec     // Catch: java.lang.NoSuchMethodException -> L1e java.lang.ClassNotFoundException -> L20
            r3.<init>(r2, r0)     // Catch: java.lang.NoSuchMethodException -> L1e java.lang.ClassNotFoundException -> L20
            goto L30
        L1e:
            r0 = move-exception
            goto L21
        L20:
            r0 = move-exception
        L21:
            r7 = r0
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
            java.lang.String r6 = "Failed to create JWT helper. This is unexpected"
            java.util.logging.Logger r2 = defpackage.feee.a
            java.lang.String r4 = "io.grpc.auth.GoogleAuthLibraryCallCredentials"
            java.lang.String r5 = "createJwtHelperOrNull"
            r2.logp(r3, r4, r5, r6, r7)
        L2f:
            r3 = r1
        L30:
            defpackage.feee.g = r3
            java.lang.String r0 = "embp"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> L3f
            java.lang.Class<embk> r2 = defpackage.embk.class
            java.lang.Class r0 = r0.asSubclass(r2)
            goto L4f
        L3f:
            r0 = move-exception
            r7 = r0
            java.util.logging.Level r3 = java.util.logging.Level.FINE
            java.lang.String r6 = "Failed to load GoogleCredentials"
            java.util.logging.Logger r2 = defpackage.feee.a
            java.lang.String r4 = "io.grpc.auth.GoogleAuthLibraryCallCredentials"
            java.lang.String r5 = "loadGoogleCredentialsClass"
            r2.logp(r3, r4, r5, r6, r7)
            r0 = r1
        L4f:
            defpackage.feee.h = r0
            java.lang.String r0 = "com.google.auth.appengine.AppEngineCredentials"
            java.lang.Class r1 = java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> L58
            goto L67
        L58:
            r0 = move-exception
            r7 = r0
            java.util.logging.Level r3 = java.util.logging.Level.FINE
            java.lang.String r6 = "AppEngineCredentials not available in classloader"
            java.util.logging.Logger r2 = defpackage.feee.a
            java.lang.String r4 = "io.grpc.auth.GoogleAuthLibraryCallCredentials"
            java.lang.String r5 = "loadAppEngineCredentials"
            r2.logp(r3, r4, r5, r6, r7)
        L67:
            defpackage.feee.i = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.feee.<clinit>():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public feee(defpackage.embk r11) {
        /*
            r10 = this;
            feec r0 = defpackage.feee.g
            r10.<init>()
            java.lang.Class r1 = defpackage.feee.h
            r2 = 0
            if (r1 == 0) goto Lf
            boolean r1 = r1.isInstance(r11)
            goto L10
        Lf:
            r1 = r2
        L10:
            if (r0 == 0) goto L88
            java.lang.Class r3 = r0.a
            boolean r3 = r3.isInstance(r11)
            if (r3 != 0) goto L1c
            goto L88
        L1c:
            java.lang.Class r3 = r0.a     // Catch: java.lang.reflect.InvocationTargetException -> L73 java.lang.IllegalAccessException -> L76
            java.lang.Object r3 = r3.cast(r11)     // Catch: java.lang.reflect.InvocationTargetException -> L73 java.lang.IllegalAccessException -> L76
            embk r3 = (defpackage.embk) r3     // Catch: java.lang.reflect.InvocationTargetException -> L73 java.lang.IllegalAccessException -> L76
            java.lang.reflect.Method r11 = r0.d     // Catch: java.lang.IllegalAccessException -> L62 java.lang.reflect.InvocationTargetException -> L71
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch: java.lang.IllegalAccessException -> L62 java.lang.reflect.InvocationTargetException -> L71
            java.lang.Object r11 = r11.invoke(r3, r4)     // Catch: java.lang.IllegalAccessException -> L62 java.lang.reflect.InvocationTargetException -> L71
            java.util.Collection r11 = (java.util.Collection) r11     // Catch: java.lang.IllegalAccessException -> L62 java.lang.reflect.InvocationTargetException -> L71
            int r11 = r11.size()     // Catch: java.lang.IllegalAccessException -> L62 java.lang.reflect.InvocationTargetException -> L71
            if (r11 != 0) goto L6f
            java.lang.reflect.Method r11 = r0.b     // Catch: java.lang.IllegalAccessException -> L62 java.lang.reflect.InvocationTargetException -> L71
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch: java.lang.IllegalAccessException -> L62 java.lang.reflect.InvocationTargetException -> L71
            r5 = 0
            java.lang.Object r11 = r11.invoke(r5, r4)     // Catch: java.lang.IllegalAccessException -> L62 java.lang.reflect.InvocationTargetException -> L71
            java.util.List r4 = r0.e     // Catch: java.lang.IllegalAccessException -> L62 java.lang.reflect.InvocationTargetException -> L71
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.IllegalAccessException -> L62 java.lang.reflect.InvocationTargetException -> L71
        L43:
            boolean r5 = r4.hasNext()     // Catch: java.lang.IllegalAccessException -> L62 java.lang.reflect.InvocationTargetException -> L71
            if (r5 == 0) goto L64
            java.lang.Object r5 = r4.next()     // Catch: java.lang.IllegalAccessException -> L62 java.lang.reflect.InvocationTargetException -> L71
            feed r5 = (defpackage.feed) r5     // Catch: java.lang.IllegalAccessException -> L62 java.lang.reflect.InvocationTargetException -> L71
            java.lang.reflect.Method r6 = r5.b     // Catch: java.lang.IllegalAccessException -> L62 java.lang.reflect.InvocationTargetException -> L71
            java.lang.reflect.Method r5 = r5.a     // Catch: java.lang.IllegalAccessException -> L62 java.lang.reflect.InvocationTargetException -> L71
            java.lang.Object[] r7 = new java.lang.Object[r2]     // Catch: java.lang.IllegalAccessException -> L62 java.lang.reflect.InvocationTargetException -> L71
            java.lang.Object r5 = r5.invoke(r3, r7)     // Catch: java.lang.IllegalAccessException -> L62 java.lang.reflect.InvocationTargetException -> L71
            r7 = 1
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch: java.lang.IllegalAccessException -> L62 java.lang.reflect.InvocationTargetException -> L71
            r7[r2] = r5     // Catch: java.lang.IllegalAccessException -> L62 java.lang.reflect.InvocationTargetException -> L71
            r6.invoke(r11, r7)     // Catch: java.lang.IllegalAccessException -> L62 java.lang.reflect.InvocationTargetException -> L71
            goto L43
        L62:
            r0 = move-exception
            goto L78
        L64:
            java.lang.reflect.Method r0 = r0.c     // Catch: java.lang.IllegalAccessException -> L62 java.lang.reflect.InvocationTargetException -> L71
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch: java.lang.IllegalAccessException -> L62 java.lang.reflect.InvocationTargetException -> L71
            java.lang.Object r11 = r0.invoke(r11, r4)     // Catch: java.lang.IllegalAccessException -> L62 java.lang.reflect.InvocationTargetException -> L71
            embk r11 = (defpackage.embk) r11     // Catch: java.lang.IllegalAccessException -> L62 java.lang.reflect.InvocationTargetException -> L71
            goto L88
        L6f:
            r11 = r3
            goto L88
        L71:
            r0 = move-exception
            goto L78
        L73:
            r0 = move-exception
            r9 = r0
            goto L7b
        L76:
            r0 = move-exception
            r3 = r11
        L78:
            r11 = r0
            r9 = r11
            r11 = r3
        L7b:
            java.util.logging.Logger r4 = defpackage.feee.a
            java.util.logging.Level r5 = java.util.logging.Level.WARNING
            java.lang.String r7 = "tryServiceAccountToJwt"
            java.lang.String r8 = "Failed converting service account credential to JWT. This is unexpected"
            java.lang.String r6 = "io.grpc.auth.GoogleAuthLibraryCallCredentials$JwtHelper"
            r4.logp(r5, r6, r7, r8, r9)
        L88:
            r10.b = r1
            r10.c = r11
            java.lang.Class r0 = defpackage.feee.i
            if (r0 != 0) goto L93
            r10.f = r2
            return
        L93:
            boolean r11 = r0.isInstance(r11)
            r10.f = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.feee.<init>(embk):void");
    }

    public static void a(String str, febs febsVar) {
        try {
            URI uri = new URI("https", str, "/".concat(String.valueOf(febsVar.c)), null, null);
            if (uri.getPort() == 443) {
                b(uri);
            }
        } catch (URISyntaxException e) {
            throw Status.j.withDescription("Unable to construct service URI for auth").d(e).asException();
        }
    }

    private static void b(URI uri) {
        try {
            new URI(uri.getScheme(), uri.getUserInfo(), uri.getHost(), -1, uri.getPath(), uri.getQuery(), uri.getFragment());
        } catch (URISyntaxException e) {
            throw Status.j.withDescription("Unable to construct service URI after removing port").d(e).asException();
        }
    }
}
