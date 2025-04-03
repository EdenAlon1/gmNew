package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Binder;
import android.os.Process;
import android.os.RemoteException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkqd {
    public static final /* synthetic */ int a = 0;
    private static volatile List d;
    private static volatile List e;
    private static final enru b = enru.c("com/google/android/ims/security/SecurityUtil");
    private static final Object c = new Object();
    private static final diyy f = dizd.a(132284100);
    private static final diyy g = dizd.a(183130735);

    public static int a(Context context, String str, List list) {
        int i;
        NoSuchAlgorithmException noSuchAlgorithmException;
        PackageManager packageManager = context.getPackageManager();
        int i2 = -1;
        try {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
                Signature[] signatureArr = packageManager.getPackageInfo(str, 64).signatures;
                int length = signatureArr.length;
                if (length <= 0) {
                    try {
                        ensk i3 = b.i();
                        i3.Y(ente.a, "BugleRcsEngine");
                        ((enrr) ((enrr) i3).h("com/google/android/ims/security/SecurityUtil", "getUidIfValidSignature", 290, "SecurityUtil.java")).q("Package signed with < 1 signature.");
                        return -1;
                    } catch (NoSuchAlgorithmException e2) {
                        noSuchAlgorithmException = e2;
                        i = -1;
                        ensk i4 = b.i();
                        i4.Y(ente.a, "BugleRcsEngine");
                        ((enrr) ((enrr) ((enrr) i4).g(noSuchAlgorithmException)).h("com/google/android/ims/security/SecurityUtil", "getUidIfValidSignature", (char) 317, "SecurityUtil.java")).q("checkForValidSignature caught");
                        return i;
                    }
                }
                ensk e3 = b.e();
                e3.Y(ente.a, "BugleRcsEngine");
                ((enrr) ((enrr) e3).h("com/google/android/ims/security/SecurityUtil", "getUidIfValidSignature", 294, "SecurityUtil.java")).t("SecurityUtil>getUidIfValidSignature: whiteListedSignatures: %s", list);
                int i5 = 0;
                while (i5 < length) {
                    byte[] digest = messageDigest.digest(signatureArr[i5].toByteArray());
                    char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
                    i = i2;
                    try {
                        int length2 = digest.length;
                        StringBuilder sb = new StringBuilder(length2 + length2);
                        int i6 = 0;
                        while (i6 < length2) {
                            int i7 = length2;
                            byte b2 = digest[i6];
                            sb.append(cArr[(b2 & 240) >>> 4]);
                            sb.append(cArr[b2 & 15]);
                            i6++;
                            length2 = i7;
                            messageDigest = messageDigest;
                        }
                        MessageDigest messageDigest2 = messageDigest;
                        String sb2 = sb.toString();
                        enru enruVar = b;
                        ensk e4 = enruVar.e();
                        e4.Y(ente.a, "BugleRcsEngine");
                        ((enrr) ((enrr) e4).h("com/google/android/ims/security/SecurityUtil", "getUidIfValidSignature", 302, "SecurityUtil.java")).D("SecurityUtil>getUidIfValidSignature: packageName: %s, hexSignatureSha1: %s", str, sb2);
                        if (!list.contains(sb2)) {
                            ensk i8 = enruVar.i();
                            i8.Y(ente.a, "BugleRcsEngine");
                            ((enrr) ((enrr) i8).h("com/google/android/ims/security/SecurityUtil", "getUidIfValidSignature", 308, "SecurityUtil.java")).D("Invalid signature found for %s: %s", str, sb2);
                            return i;
                        }
                        i5++;
                        i2 = i;
                        messageDigest = messageDigest2;
                    } catch (PackageManager.NameNotFoundException unused) {
                        return i;
                    } catch (NoSuchAlgorithmException e5) {
                        e = e5;
                        noSuchAlgorithmException = e;
                        ensk i42 = b.i();
                        i42.Y(ente.a, "BugleRcsEngine");
                        ((enrr) ((enrr) ((enrr) i42).g(noSuchAlgorithmException)).h("com/google/android/ims/security/SecurityUtil", "getUidIfValidSignature", (char) 317, "SecurityUtil.java")).q("checkForValidSignature caught");
                        return i;
                    }
                }
                dkty.o("All signatures are whitelisted. Allowing %s", str);
                return packageManager.getApplicationInfo(str, 0).uid;
            } catch (NoSuchAlgorithmException e6) {
                e = e6;
                i = i2;
            }
        } catch (PackageManager.NameNotFoundException unused2) {
            return -1;
        }
    }

    public static String b() {
        return ((Boolean) dizg.o().a.aB.a()).booleanValue() ? (String) dizg.o().a.aC.a() : (String) dint.c.a();
    }

    public static void c(Context context, Intent intent) {
        intent.putExtra("pending_intent", ((Boolean) g.a()).booleanValue() ? PendingIntent.getBroadcast(context, 0, intent, ctie.a(1073741824)) : PendingIntent.getBroadcast(context, 0, intent, 0));
    }

    public static void d(Context context, int i) {
        boolean contains;
        if (i == Process.myUid()) {
            return;
        }
        Object obj = c;
        synchronized (obj) {
            diyy diyyVar = f;
            if (((Boolean) diyyVar.a()).booleanValue()) {
                contains = g(context).contains(Integer.valueOf(i));
            } else {
                if (d == null) {
                    if (((Boolean) diyyVar.a()).booleanValue()) {
                        ensk g2 = b.g();
                        g2.Y(ente.a, "BugleRcsEngine");
                        ((enrr) ((enrr) g2).h("com/google/android/ims/security/SecurityUtil", "updateWhitelists", 136, "SecurityUtil.java")).q("Skipping UID allowlist cache update");
                    } else {
                        d = g(context);
                        synchronized (obj) {
                            ArrayList arrayList = new ArrayList();
                            Iterator it = dkvx.b((String) dint.b.a()).iterator();
                            while (it.hasNext()) {
                                int f2 = f(context, (String) it.next(), (String) dint.d.a());
                                if (f2 != -1) {
                                    arrayList.add(Integer.valueOf(f2));
                                }
                            }
                            e = arrayList;
                            dkrz.a.e(b());
                            dkrz.c.e((String) dint.a.a());
                            dkrz.b.e((String) dint.d.a());
                            dkrz.d.e((String) dint.b.a());
                        }
                    }
                }
                List list = d;
                list.getClass();
                contains = list.contains(Integer.valueOf(i));
            }
        }
        if (!contains) {
            throw new RemoteException("Operation not allowed: Package not white listed.");
        }
    }

    public static boolean e(Context context, Intent intent) {
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
        if (pendingIntent == null) {
            dkty.k("Missing pending intent.", new Object[0]);
            return false;
        }
        if (Binder.getCallingPid() != Process.myPid()) {
            return "com.google.android.ims".equals(pendingIntent.getCreatorPackage()) && dkuy.l(context);
        }
        return true;
    }

    private static int f(Context context, String str, String str2) {
        return a(context, str, dkvx.b(str2));
    }

    private static List g(Context context) {
        ArrayList arrayList;
        synchronized (c) {
            arrayList = new ArrayList();
            Iterator it = dkvx.b((String) dint.a.a()).iterator();
            while (it.hasNext()) {
                int f2 = f(context, (String) it.next(), b());
                if (f2 != -1) {
                    arrayList.add(Integer.valueOf(f2));
                }
            }
        }
        return arrayList;
    }
}
