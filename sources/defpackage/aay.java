package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aay extends adn {
    final /* synthetic */ abe a;

    public aay(abe abeVar) {
        this.a = abeVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.adn
    public final void a(final int i, adu aduVar, Object obj, kli kliVar) {
        Bundle a;
        final int i2;
        abe abeVar = this.a;
        final adt c = aduVar.c(abeVar, obj);
        if (c != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: aaw
                @Override // java.lang.Runnable
                public final void run() {
                    aay aayVar = aay.this;
                    String str = (String) aayVar.b.get(Integer.valueOf(i));
                    if (str == null) {
                        return;
                    }
                    adi adiVar = (adi) aayVar.e.get(str);
                    adf adfVar = adiVar != null ? adiVar.a : null;
                    Object obj2 = c.a;
                    if (adfVar == null) {
                        aayVar.g.remove(str);
                        aayVar.f.put(str, obj2);
                    } else {
                        adf adfVar2 = adiVar.a;
                        if (aayVar.d.remove(str)) {
                            adfVar2.a(obj2);
                        }
                    }
                }
            });
            return;
        }
        Intent a2 = aduVar.a(abeVar, obj);
        if (a2.getExtras() != null) {
            Bundle extras = a2.getExtras();
            extras.getClass();
            if (extras.getClassLoader() == null) {
                a2.setExtrasClassLoader(abeVar.getClassLoader());
            }
        }
        if (a2.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            a = a2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            a2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        } else {
            a = kliVar != null ? kliVar.a() : null;
        }
        Bundle bundle = a;
        if (ffkj.e("androidx.activity.result.contract.action.REQUEST_PERMISSIONS", a2.getAction())) {
            String[] stringArrayExtra = a2.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            HashSet hashSet = new HashSet();
            int i3 = 0;
            while (true) {
                int length = stringArrayExtra.length;
                if (i3 >= length) {
                    int size = hashSet.size();
                    String[] strArr = size > 0 ? new String[length - size] : stringArrayExtra;
                    if (size > 0) {
                        if (size == length) {
                            return;
                        }
                        int i4 = 0;
                        for (int i5 = 0; i5 < stringArrayExtra.length; i5++) {
                            if (!hashSet.contains(Integer.valueOf(i5))) {
                                strArr[i4] = stringArrayExtra[i5];
                                i4++;
                            }
                        }
                    }
                    if (abeVar instanceof klf) {
                    }
                    abeVar.requestPermissions(stringArrayExtra, i);
                    return;
                }
                if (TextUtils.isEmpty(stringArrayExtra[i3])) {
                    throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(stringArrayExtra) + " must not contain null or empty values");
                }
                if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(stringArrayExtra[i3], "android.permission.POST_NOTIFICATIONS")) {
                    hashSet.add(Integer.valueOf(i3));
                }
                i3++;
            }
        } else {
            if (!ffkj.e("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST", a2.getAction())) {
                abeVar.startActivityForResult(a2, i, bundle);
                return;
            }
            adq adqVar = (adq) a2.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                adqVar.getClass();
                i2 = i;
                try {
                    abeVar.startIntentSenderForResult(adqVar.a, i2, adqVar.b, adqVar.c, adqVar.d, 0, bundle);
                } catch (IntentSender.SendIntentException e) {
                    e = e;
                    final IntentSender.SendIntentException sendIntentException = e;
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: aax
                        @Override // java.lang.Runnable
                        public final void run() {
                            aay.this.f(i2, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", sendIntentException));
                        }
                    });
                }
            } catch (IntentSender.SendIntentException e2) {
                e = e2;
                i2 = i;
            }
        }
    }
}
