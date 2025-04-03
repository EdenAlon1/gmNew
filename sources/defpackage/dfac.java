package defpackage;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.auth.IAuthManagerService;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import java.io.IOException;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class dfac {
    public static final String[] b = {"com.google", "com.google.work", "cn.google"};
    public static final String c = "androidPackageName";
    public static final ComponentName d = new ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");
    private static final dfxq a = new dfxq("Auth", "GoogleAuthUtil");

    private static void a(Account account) {
        if (account == null) {
            throw new IllegalArgumentException("Account cannot be null");
        }
        if (TextUtils.isEmpty(account.name)) {
            throw new IllegalArgumentException("Account name cannot be empty!");
        }
        String[] strArr = b;
        for (int i = 0; i < 3; i++) {
            if (strArr[i].equals(account.type)) {
                return;
            }
        }
        throw new IllegalArgumentException("Account type not supported");
    }

    public static TokenData b(final Context context, final Account account, final String str, Bundle bundle) {
        final Bundle bundle2;
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        final dezq a2 = dezq.a(context);
        try {
            dfwv.h("Calling this from your main thread can lead to deadlock");
            dfwv.m(str, "Scope cannot be empty or null.");
            a(account);
            g(context, 8400000);
            bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
            h(context, bundle2);
        } catch (Exception e) {
            e = e;
        }
        try {
            dfab dfabVar = new dfab() { // from class: dezy
                @Override // defpackage.dfab
                public final Object a(IBinder iBinder) {
                    TokenData tokenData;
                    String[] strArr = dfac.b;
                    Bundle tokenByAccount = IAuthManagerService.Stub.asInterface(iBinder).getTokenByAccount(account, str, bundle2);
                    if (tokenByAccount == null) {
                        throw new IOException("Service call returned null");
                    }
                    a2.b(1709, 0, elapsedRealtime, SystemClock.elapsedRealtime());
                    ClassLoader classLoader = TokenData.class.getClassLoader();
                    if (classLoader != null) {
                        tokenByAccount.setClassLoader(classLoader);
                    }
                    Bundle bundle3 = tokenByAccount.getBundle("tokenDetails");
                    if (bundle3 == null) {
                        tokenData = null;
                    } else {
                        if (classLoader != null) {
                            bundle3.setClassLoader(classLoader);
                        }
                        tokenData = (TokenData) bundle3.getParcelable("TokenData");
                    }
                    if (tokenData != null) {
                        return tokenData;
                    }
                    dfac.i(context, "getTokenWithDetails", tokenByAccount.getString("Error"), (Intent) tokenByAccount.getParcelable("userRecoveryIntent"), (PendingIntent) tokenByAccount.getParcelable("userRecoveryPendingIntent"));
                    throw new dezu("Invalid state. Shouldn't happen");
                }
            };
            a2 = a2;
            elapsedRealtime = elapsedRealtime;
            return (TokenData) j(context, d, dfabVar);
        } catch (Exception e2) {
            e = e2;
            a2 = a2;
            elapsedRealtime = elapsedRealtime;
            Exception exc = e;
            a2.b(1709, 13, elapsedRealtime, SystemClock.elapsedRealtime());
            throw exc;
        }
    }

    public static String c(Context context, String str) {
        dfwv.m(str, "accountName must be provided");
        dfwv.h("Calling this from your main thread can lead to deadlock");
        g(context, 8400000);
        return e(context, new Account(str, "com.google"), "^^_account_id_^^", new Bundle());
    }

    public static String d(Context context, Account account, String str) {
        return e(context, account, str, new Bundle());
    }

    public static String e(Context context, Account account, String str, Bundle bundle) {
        a(account);
        return b(context, account, str, bundle).b;
    }

    public static void f(Context context, String str) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        dezq a2 = dezq.a(context);
        try {
            dfwv.h("Calling this from your main thread can lead to deadlock");
            g(context, 8400000);
            Bundle bundle = new Bundle();
            h(context, bundle);
            j(context, d, new dezz(str, bundle));
            a2.b(1707, 0, elapsedRealtime, SystemClock.elapsedRealtime());
        } catch (Exception e) {
            a2.b(1707, 13, elapsedRealtime, SystemClock.elapsedRealtime());
            throw e;
        }
    }

    public static void g(Context context, int i) {
        try {
            dfqf.d(context.getApplicationContext(), i);
        } catch (GooglePlayServicesIncorrectManifestValueException | dfqc e) {
            throw new dezu(e.getMessage(), e);
        } catch (dfqd e2) {
            throw new dfaf(e2.getMessage(), e2.a());
        }
    }

    public static void h(Context context, Bundle bundle) {
        String str = context.getApplicationInfo().packageName;
        bundle.putString("clientPackageName", str);
        String str2 = c;
        if (TextUtils.isEmpty(bundle.getString(str2))) {
            bundle.putString(str2, str);
        }
        bundle.putLong("service_connection_start_time_millis", SystemClock.elapsedRealtime());
    }

    public static void i(Context context, String str, String str2, Intent intent, PendingIntent pendingIntent) {
        dfgl a2 = dfgl.a(str2);
        dfxq dfxqVar = a;
        dfxqVar.e(String.format("[GoogleAuthUtil] error status:%s with method:%s", a2, str), new Object[0]);
        if (!dfgl.BAD_AUTHENTICATION.equals(a2) && !dfgl.CAPTCHA.equals(a2) && !dfgl.NEED_PERMISSION.equals(a2) && !dfgl.NEED_REMOTE_CONSENT.equals(a2) && !dfgl.NEEDS_BROWSER.equals(a2) && !dfgl.USER_CANCEL.equals(a2) && !dfgl.DEVICE_MANAGEMENT_REQUIRED.equals(a2) && !dfgl.DM_INTERNAL_ERROR.equals(a2) && !dfgl.DM_SYNC_DISABLED.equals(a2) && !dfgl.DM_ADMIN_BLOCKED.equals(a2) && !dfgl.DM_ADMIN_PENDING_APPROVAL.equals(a2) && !dfgl.DM_STALE_SYNC_REQUIRED.equals(a2) && !dfgl.DM_DEACTIVATED.equals(a2) && !dfgl.DM_REQUIRED.equals(a2) && !dfgl.THIRD_PARTY_DEVICE_MANAGEMENT_REQUIRED.equals(a2) && !dfgl.DM_SCREENLOCK_REQUIRED.equals(a2)) {
            if (!dfgl.NETWORK_ERROR.equals(a2) && !dfgl.SERVICE_UNAVAILABLE.equals(a2) && !dfgl.INTNERNAL_ERROR.equals(a2) && !dfgl.AUTH_SECURITY_ERROR.equals(a2) && !dfgl.ACCOUNT_NOT_PRESENT.equals(a2)) {
                throw new dezu(str2);
            }
            throw new IOException(str2);
        }
        ecwj.f(context);
        if (pendingIntent != null && intent != null) {
            throw new UserRecoverableAuthException(str2, intent, dfak.AUTH_INSTANTIATION);
        }
        dfpi dfpiVar = dfpi.a;
        int a3 = dfqf.a(context);
        if (a3 >= 233800000 && pendingIntent == null) {
            dfxqVar.c(String.format("Recovery PendingIntent is missing on current Gms version: %s for method: %s. It should always be present on or above Gms version %s. This indicates a bug in Gms implementation.", Integer.valueOf(a3), str, 233800000), new Object[0]);
        }
        if (intent == null) {
            dfxqVar.c(String.format("no recovery Intent found with status=%s for method=%s. This shouldn't happen", str2, str), new Object[0]);
        }
        throw new UserRecoverableAuthException(str2, intent);
    }

    public static Object j(Context context, ComponentName componentName, dfab dfabVar) {
        dfpb dfpbVar = new dfpb();
        dfwe a2 = dfwe.a(context);
        try {
            try {
                if (!a2.b(new dfwd(componentName, dfwe.a), dfpbVar, "GoogleAuthUtil").b()) {
                    throw new IOException("Could not bind to service.");
                }
                try {
                    dfwv.h("BlockingServiceConnection.getService() called on main thread");
                    if (dfpbVar.a) {
                        throw new IllegalStateException("Cannot call get on this connection more than once");
                    }
                    dfpbVar.a = true;
                    return dfabVar.a((IBinder) dfpbVar.b.take());
                } catch (RemoteException | InterruptedException | TimeoutException e) {
                    Log.i("GoogleAuthUtil", "Error on service connection.", e);
                    throw new IOException("Error on service connection.", e);
                }
            } finally {
                a2.c(componentName, dfpbVar);
            }
        } catch (SecurityException e2) {
            Log.w("GoogleAuthUtil", String.format("SecurityException while bind to auth service: %s", e2.getMessage()));
            throw new IOException("SecurityException while binding to Auth service.", e2);
        }
    }

    public static Account[] k(Context context) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        dezq a2 = dezq.a(context);
        try {
            dfwv.l("com.google");
            try {
                int i = dfpj.c;
                dfqf.d(context, 8400000);
                a2.b(1708, 0, elapsedRealtime, SystemClock.elapsedRealtime());
                dfwv.n(context);
                ContentProviderClient acquireContentProviderClient = context.getContentResolver().acquireContentProviderClient("com.google.android.gms.auth.accounts");
                if (acquireContentProviderClient == null) {
                    throw new RemoteException("The com.google.android.gms.auth.accounts provider is not available.");
                }
                try {
                    try {
                        Bundle call = acquireContentProviderClient.call("get_accounts", "com.google", new Bundle());
                        if (call == null) {
                            throw new RemoteException("Null result from AccountChimeraContentProvider");
                        }
                        Parcelable[] parcelableArray = call.getParcelableArray("accounts");
                        if (parcelableArray == null) {
                            throw new RemoteException("Key_Accounts is Null");
                        }
                        Account[] accountArr = new Account[parcelableArray.length];
                        for (int i2 = 0; i2 < parcelableArray.length; i2++) {
                            accountArr[i2] = (Account) parcelableArray[i2];
                        }
                        return accountArr;
                    } finally {
                        acquireContentProviderClient.release();
                    }
                } catch (RemoteException e) {
                    a.d("RemoteException when fetching accounts", e, new Object[0]);
                    throw e;
                } catch (Exception e2) {
                    a.d("Exception when getting accounts", e2, new Object[0]);
                    throw new RemoteException("Accounts ContentProvider failed: " + e2.getMessage());
                }
            } catch (GooglePlayServicesIncorrectManifestValueException unused) {
                throw new dfqc(18);
            }
        } catch (Exception e3) {
            a2.b(1708, 13, elapsedRealtime, SystemClock.elapsedRealtime());
            throw e3;
        }
    }

    public static void l(Object obj) {
        if (obj != null) {
            return;
        }
        a.e("Service call returned null.", new Object[0]);
        throw new IOException("Service unavailable.");
    }
}
